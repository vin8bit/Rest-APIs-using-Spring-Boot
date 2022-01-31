package com.vin8bit.profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProfileImpl implements ProfileService {
	@Autowired
	private ProfileDAO profileDao;
	
	
	public ProfileImpl() {
		super();
}


	
	public Profile addProfile(Profile profile) {
		profileDao.save(profile);
		return profile;
	}
	
	@Override
	public List<Profile> getProfile() {
		
		return profileDao.findAll();
	}


	@Override
	public Optional<Profile> getProfile(long profileId) {
		
		return profileDao.findById(profileId);
		
		
	}



	@Override
	public void deleteProfile(long profileId) {
		
		profileDao.deleteById(profileId);
	}



	@Override
	public Profile updateProfile(Profile profile) {
		
		return this.profileDao.save(profile);
	}

}
