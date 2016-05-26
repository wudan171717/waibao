package dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.User;

@Repository("userDAO")//指定特定的BEAN ID 方便setUserDao注入
public class MySQLUserDAO implements UserDAO,Serializable{
	private JdbcDataSource dataSource;

	public MySQLUserDAO(){}
	public JdbcDataSource getDataSource() {
		return dataSource;
	}
	@Inject
	public void setDataSource(@Named("jdbcDataSource") JdbcDataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public User findByName(String username) {
		String sql="select * from geren where name=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=dataSource.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, username);
			ResultSet rs=pstmt.executeQuery();
			User user=null;
			while(rs.next()){
				user=new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPwd(rs.getString("pwd"));
				user.setActivity(rs.getString("activity"));
				user.setClasses(rs.getString("classes"));
				user.setCommunity(rs.getString("community"));
				user.setCourse(rs.getString("course"));
				user.setEmail(rs.getString("email"));
				user.setGender(rs.getString("gender"));
				user.setMajor(rs.getString("major"));
				user.setPhoto(rs.getString("photo"));
				user.setSystem(rs.getString("system"));
				user.setTeacher(rs.getString("teacher"));
				user.setUsername(rs.getString("username"));
			}
			pstmt.close();
			rs.close();
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}finally{
			dataSource.close(conn);
		}
	}
	
	public void register(String username,String pwd,String name, String gender, String classes, String major,String email)
			{
			String sql="INSERT INTO geren (name,username,pwd,gender,classes,major,email)VALUES(?,?,?,?,?,?,?);";
			Connection conn=null;
			PreparedStatement pstmt=null;
			try {
				conn=dataSource.getConnection();
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, name);
				pstmt.setString(2, username);
				pstmt.setString(3, pwd);
				pstmt.setString(4,gender);
				pstmt.setString(5,classes);
				pstmt.setString(6,major);
				pstmt.setString(7,email);
				pstmt.executeUpdate();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException();
			}finally{
				dataSource.close(conn);
		}
	}

}
