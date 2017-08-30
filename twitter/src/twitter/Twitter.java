/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author harsh
 */
public class Twitter {
    
    HashMap<Integer,User> users; 
    
    class Tweet {
        int userId;
        int tweetId;
    }
    
    class User {
        ArrayList<Tweet> feed = new ArrayList<Tweet>();
        ArrayList<User> follower = new ArrayList<User>();
        int size = 0;
        //LinkedList<tweet>;
        int userId;
    }
    

    /** Initialize your data structure here. */
    public Twitter() {
        users = new HashMap<Integer,User>();
        
    }
    
    public void updateTweet(User user, Tweet tweet) {
        
        for(User u : user.follower) {
            
            u.feed.add(tweet);
            u.size++;
        }

    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        User user ;
        if (users.containsKey(userId)){
            user = users.get(userId);    
        } else {
            user = this.addUser(userId);
        }
        Tweet tweet = new Tweet();
        tweet.tweetId = tweetId;
        tweet.userId = userId;
        updateTweet(user, tweet);
    }
    
   public List<Integer> getFeed(User user) {
       ArrayList<Integer> smallFeed = new ArrayList<Integer>();
       for (int i =0; (user.size-i) > 0 && i< 10; i++) {
           smallFeed.add(user.feed.get(user.size-i-1).tweetId);
           System.out.print(user.feed.get(user.size-i-1).tweetId+" ");
           //(user.feed[size-i-1].tweetId);
       }
       System.out.println();
       return smallFeed;
    
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        User u = users.get(userId);
        return getFeed(u);
        
        
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        User user;
        if (users.containsKey(followerId)){
            user = users.get(followerId);
            user.follower.add(users.get(followeeId));
        }
     
    }
    
    public void getfollower(int userId){
        User user;
        if (users.containsKey(userId)){
            user = users.get(userId);
            for (User follower : user.follower) {
                System.out.println("Follower -->"+follower.userId);
            }
        }
        
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        User user;
        if (users.containsKey(followerId)){
            user = users.get(followerId);
            user.follower.remove(users.get(followeeId));
        }

    }
    
    
    public User addUser(int userId){
        User u = new User();
        u.userId = userId;
        users.put(userId, u);
        u.follower.add(u);
        return u;
    }
}



/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
