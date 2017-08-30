/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harsh
 */
package twitter;

import java.util.List;

public class runTwitter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Twitter twitter = new Twitter();
        Twitter obj = new Twitter();
        obj.postTweet(1,1);
        obj.getNewsFeed(1);

        obj.addUser(2);
        obj.follow(2,1);
        obj.postTweet(2,3);
        //obj.getfollower(2);
        obj.postTweet(1,2);
        obj.unfollow(2,1);
        obj.postTweet(3,4);
        obj.postTweet(2,4);

        System.out.println("News feed of 1 -->");
        obj.getNewsFeed(1);
        //obj.unfollow(1,2);
        System.out.println("---------");
        obj.getfollower(2);
        //obj.getfollower(3);
        


    }
    
}
