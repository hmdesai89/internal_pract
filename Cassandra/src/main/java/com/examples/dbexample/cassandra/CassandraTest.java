/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.dbexample.cassandra;

import static java.lang.System.out;

/**
 *
 * @author harsh
 */
public class CassandraTest {
    
    public static void main(final String[] args)
    {
        final String ipAddress = args.length > 0 ? args[0] : "localhost";
        final int port = args.length > 1 ? Integer.parseInt(args[1]) : 9042;
        out.println("Connecting to IP Address " + ipAddress + ":" + port + "...");
        MoviePersistence mp = new MoviePersistence(ipAddress,port);
        mp.persistMovie("Ice age", 2001 , "A movie about Ice age", "Good", "9.8");
        mp.queryMovieByTitleAndYear("Lagaan", 2001);
        mp.deleteMovieWithTitleAndYear("Lagaan", 2001);
        mp.close();
        

    }
    
}
