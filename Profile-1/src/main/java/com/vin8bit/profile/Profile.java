package com.vin8bit.profile;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profile {
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profile(long profileId, String name, String phoneNo, String email, String about) {
		super();
		this.profileId = profileId;
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.about = about;
	}
 
	@Id
	private long profileId;
	private String name;
	private String phoneNo;
	private String email;
	private String about;
	
	public long getProfileId() {
		return profileId;
	}

	public void setProfileId(long profileId) {
		this.profileId = profileId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", name=" + name + ", phoneNo=" + phoneNo + ", email=" + email
				+ ", about=" + about + "]";
	}

}
