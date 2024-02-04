package com.restfulApi.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.restfulApi.messenger.database.DatabaseClass;
import com.restfulApi.messenger.model.Profile;
import com.restfulApi.messenger.model.Profile;

public class ProfileService {
	private Map<String, Profile> profiles = DatabaseClass.getProfile();
	
	public ProfileService() {
		profiles.put("Touqeer", new Profile(1,"touqeer","Touqeer","Ali"));
		
	}
	
	public List<Profile> getAllProfiles(){
		return new ArrayList<Profile>(profiles.values());
		
		
	}
	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
		
	}
	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size()+1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile) {
		if(profile.getProfileName().isEmpty()) {
			return null;
		}
		profiles.put(profile.getProfileName(),profile);
		return profile;
	}
	public Profile removeMessgae(String profileName) {
		return profiles.remove(profileName);
	}
}


