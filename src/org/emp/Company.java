package org.emp;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Company {
	
	private int cpyId;
	private String cpyName;
	private String email;
	private long mobile;
	public int getCpyId() {
		return cpyId;
	}
	public void setCpyId(int cpyId) {
		this.cpyId = cpyId;
	}
	public String getCpyName() {
		return cpyName;
	}
	public void setCpyName(String cpyName) {
		this.cpyName = cpyName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

}
