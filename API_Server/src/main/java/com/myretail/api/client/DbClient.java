/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myretail.api.client;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Host;
import com.datastax.driver.core.Metadata;
import com.datastax.driver.core.Session;

import static java.lang.System.out;
import javax.ws.rs.ext.Provider;

@Provider
public class DbClient
{
    
   private  Cluster cluster;
   private  String node = new String("localhost");
   private  int port = 9042;
   private  static Session session;
   private static DbClient instance;

   private DbClient()
   {
      this.cluster = Cluster.builder().addContactPoint(node).withPort(port).build();
      final Metadata metadata = cluster.getMetadata();
      out.printf("Connected to cluster: %s\n", metadata.getClusterName());
      for (final Host host : metadata.getAllHosts())
      {
         out.printf("Datacenter: %s; Host: %s; Rack: %s\n",
            host.getDatacenter(), host.getAddress(), host.getRack());
      }
      session = cluster.connect();
   }

   public static Session getSession()
   {
       if (instance == null) {
           instance  = new DbClient(); 
       }
       return session;
   }

   public  void close()
   {
      cluster.close();
   }
   
   
}
