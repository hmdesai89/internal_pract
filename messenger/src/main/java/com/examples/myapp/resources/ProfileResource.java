/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.myapp.resources;

import com.examples.myapp.model.Profile;
import com.examples.myapp.service.ProfileService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author harsh
 */
@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {
    
    ProfileService profileService = new ProfileService();
    
    @GET
    public List<Profile> getMessages() {
        return profileService.getAllProfiles();
    }
    
    @POST
    public Profile addMessage(Profile profile) {
        return profileService.addProfile(profile);
        
    }
    
    @PUT
    @Path("/{profileId}")
    public Profile updateMessage(@PathParam ("profileId")long id,Profile profile) {
        profile.setId(id);
        return profileService.updateMessage(profile);
        
    }
    
    @GET
    @Path("/{profileName}")
    public Profile getMessage(@PathParam ("profileName")String profileName) {
        return profileService.getProfile(profileName);       
    }
    
        
    @DELETE
    @Path("/{profileName}")
    public void deleteMessage(@PathParam ("profileName")String profileName) {
        profileService.removeMessage(profileName);       
    }
    
    
    
}
