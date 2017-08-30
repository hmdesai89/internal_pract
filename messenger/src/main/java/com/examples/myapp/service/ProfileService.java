/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.myapp.service;

import com.examples.myapp.database.DatabaseClass;
import com.examples.myapp.model.Profile;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author harsh
 */
public class ProfileService {
    
    
    private Map<String, Profile> profiles = DatabaseClass.getProfiles();
    
    public List<Profile> getAllProfiles() {
        return new ArrayList(profiles.values());

    }

    public ProfileService() {
        profiles.put("hmdesai", new Profile(1l,"hmdesai", "Harsh", "Desai"));
        profiles.put("jy.jd", new Profile(2l,"jy.jd", "Jay", "Desai"));
    }


    public Profile getProfile(String profileName) {
        return profiles.get(profileName);
    }

    public Profile addProfile(Profile profile) {
        profile.setId(profiles.size() + 1);
        profiles.put(profile.getProfileName(), profile);
        return profile;
    }  
    
    
    public Profile updateMessage(Profile profile) {
        if (profile.getId() <= 0) {
            return null;
        }
        profiles.put(profile.getProfileName(), profile);
        return profile;
    }
    
    public Profile removeMessage(String profileName) {
        return profiles.remove(profileName);
    }      
    
}

