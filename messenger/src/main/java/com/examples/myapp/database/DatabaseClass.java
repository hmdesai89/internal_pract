/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.myapp.database;

import com.examples.myapp.model.Comment;
import com.examples.myapp.model.Message;
import com.examples.myapp.model.Product;
import com.examples.myapp.model.Profile;
import java.util.HashMap;
import java.util.Map;


public class DatabaseClass {
    
    private int x;
    
    private static Map<Long,Message> messages = new  HashMap<>();
    private static Map<String,Profile> profiles = new  HashMap<>();
    //private static Map<Long,Comment> comments = new  HashMap<>();
    private static Map<Long,Product> products = new  HashMap<>();

    
    
    public static Map<Long,Message> getMessages(){
        return messages;
    }
    
    public static Map<String,Profile> getProfiles(){
        return profiles;
    }
    
    public static Map<Long,Product> getProducts(){
        return products;
    }
    
}
