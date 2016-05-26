package entity;

import java.io.Serializable;

public class User implements Serializable {
	private int id;
	private String name;
	private String pwd;
	private String username;
	private String course;
	private String activity;
	private String system;
	private String gender;
	private String classes;
	private String major;
	private String photo;
	private String email;
	private String grade;
	private String community;
	private String teacher;
	

	
	public User(String name, String pwd, String username, String course,
			String activity, String system, String gender, String classes,
			String major, String photo, String email, String grade,
			String community, String teacher) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.username = username;
		this.course = course;
		this.activity = activity;
		this.system = system;
		this.gender = gender;
		this.classes = classes;
		this.major = major;
		this.photo = photo;
		this.email = email;
		this.grade = grade;
		this.community = community;
		this.teacher = teacher;
	}

	public User(int id, String name, String pwd, String username,
			String course, String activity, String system, String gender,
			String classes, String major, String photo, String email,
			String grade, String community, String teacher) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.username = username;
		this.course = course;
		this.activity = activity;
		this.system = system;
		this.gender = gender;
		this.classes = classes;
		this.major = major;
		this.photo = photo;
		this.email = email;
		this.grade = grade;
		this.community = community;
		this.teacher = teacher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public User() {
	}
	
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof User){
		    User o = (User) obj;
			return this.id==o.id;
			}
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pwd=" + pwd
				+ ", username=" + username + ", course=" + course
				+ ", activity=" + activity + ", system=" + system + ", gender="
				+ gender + ", classes=" + classes + ", major=" + major
				+ ", photo=" + photo + ", email=" + email + ", grade=" + grade
				+ ", community=" + community + ", teacher=" + teacher + "]";
	}




	
}
