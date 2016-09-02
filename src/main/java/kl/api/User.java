package kl.api;

import javax.xml.bind.annotation.XmlRootElement;

public class User {
	private String userId;
	private String userName;
	private String userIDNO;
	private String userPhone;
	public User() {
		
	}
	
	public User(String userId, String userName, String userIDNO,String userPhone){
		this.userId = userId;
		this.userName = userName;
		this.userIDNO = userIDNO;
		this.userPhone = userPhone;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserIDNO() {
		return userIDNO;
	}
	public void setUserIDNO(String userIDNO) {
		this.userIDNO = userIDNO;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	
	
}
