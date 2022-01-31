package com.vin8bit.profile;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	private ProfileService profileService;
	
	@PostMapping("/profile")
	public Profile addProfile(@RequestBody Profile profile){
		
		return this.profileService.addProfile(profile);
	}
	
	@PutMapping("/profile")
	public Profile updateProfile(@RequestBody Profile profile){
		
		return this.profileService.updateProfile(profile);
	}
	
	@GetMapping("/profile")
	public List<Profile> getProfile() {
		return this.profileService.getProfile();
				
	}
	
	@GetMapping("/profile/{profileId}")
	public  Optional<Profile> getProfile(@PathVariable String profileId) {
		return this.profileService.getProfile(Long.parseLong(profileId));
				
	}
	
	@DeleteMapping("/profile/{profileId}")
	public ResponseEntity<HttpStatus> deleteprofile(@PathVariable String profileId){
		try {
			this.profileService.deleteProfile(Long.parseLong(profileId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e){return new ResponseEntity<>(HttpStatus.OK);}
	}
	


}