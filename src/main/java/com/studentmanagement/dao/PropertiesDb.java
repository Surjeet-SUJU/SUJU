package com.studentmanagement.dao;

public class PropertiesDb {
		private String urlString = "jdbc:mysql://localhost:3306/studentmanagement";
		private String usernameString = "root";
		private String passwordString = "ragnarock80";
		
		
		
		public String getUrlString() {
			return urlString;
		}
		public void setUrlString(String urlString) {
			this.urlString = urlString;
		}
		public String getUsernameString() {
			return usernameString;
		}
		public void setUsernameString(String usernameString) {
			this.usernameString = usernameString;
		}
		public String getPasswordString() {
			return passwordString;
		}
		public void setPasswordString(String passwordString) {
			this.passwordString = passwordString;
		}
		
		
}
