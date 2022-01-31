package com.vin8bit.profile;

import java.util.List;
import java.util.Optional;

public interface ProfileService {
	
	public List<Profile> getProfile();
	public Profile addProfile(Profile profile);
	public  Optional<Profile> getProfile(long profileId);
	public void deleteProfile(long profileId);
	public Profile updateProfile(Profile profile);

}
