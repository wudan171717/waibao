package test;

import java.sql.SQLException;
import java.util.Properties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.HandlerMapping;

import service.NameOrPwdException;
import service.NullParamException;
import service.UserService;
import dao.JdbcDataSource;
import entity.User;

public class TestCase {
	
	@Test
public void testUserService() throws SQLException, NameOrPwdException, NullParamException{
		String cfg ="spring-mvc.xml";
		ApplicationContext ac=new ClassPathXmlApplicationContext(cfg);
		Properties obj=ac.getBean("jdbcProps", Properties.class);
		JdbcDataSource ds=ac.getBean("jdbcDataSource",JdbcDataSource.class);
		System.out.println(obj);
		System.out.println(ds);
		System.out.println(ds.getConnection());
		UserService service=ac.getBean("userService",UserService.class);
		User user=service.login("1", "1");
		System.out.println(user);
}
}
