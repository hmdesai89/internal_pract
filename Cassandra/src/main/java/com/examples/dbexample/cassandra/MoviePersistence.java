/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.dbexample.cassandra;


import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;

import java.util.Optional;

import static java.lang.System.out;

/**
 * Handles movie persistence access.
 */
public class MoviePersistence
{
   private final CassandraConnector client = new CassandraConnector();

   public MoviePersistence(final String newHost, final int newPort)
   {
      out.println("Connecting to IP Address " + newHost + ":" + newPort + "...");
      client.connect(newHost, newPort);
   }

   /**
    * Close my underlying Cassandra connection.
    */
   public void close()
   {
      client.close();
   }
   
   
   public void persistMovie(
    String title, final int year, final String description,
   final String mmpaRating, final String dustinRating)
    {
        client.getSession().execute(
            "INSERT INTO movies_keyspace.movies (title, year, description, mmpa_rating, dustin_rating) VALUES (?, ?, ?, ?, ?)",
            title, year, description, mmpaRating, dustinRating);
        
        
    }
   
   
   
    public Optional<Movie> queryMovieByTitleAndYear(final String title, final int year)
    {
        final ResultSet movieResults = client.getSession().execute(
            "SELECT * from price_keyspace.prices" );//WHERE title = ? AND year = ?", title, year);
        final Row movieRow = movieResults.one();
        final Optional<Movie> movie =
            movieRow != null
            ? Optional.of(new Movie(
                movieRow.getString("title"),
                movieRow.getInt("year"),
                movieRow.getString("description"),
                movieRow.getString("mmpa_rating"),
                movieRow.getString("dustin_rating")))
            : Optional.empty();
        return movie;
    }
    
    
    
    public void deleteMovieWithTitleAndYear(final String title, final int year)
    {
        final String deleteString = "DELETE FROM movies_keyspace.movies WHERE title = ? and year = ?";
        client.getSession().execute(deleteString, title, year);
    }
}