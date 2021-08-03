/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author shreyasshukla
 */
public class FinalProject {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        int n = 20;
        int max = 100;
        HashMap<Integer,location> locationById = new HashMap<>();
        locationById.put(1, new location(1,"Preserved Catchment Forest"));
        locationById.put(2, new location(2,"Baseball Field"));
        locationById.put(3, new location(3,"Elementary School Field"));
        locationById.put(4, new location(4,"25m pool"));
        locationById.put(5, new location(5,"New Elementary School"));
        locationById.put(6, new location(6,"Track And Field"));
        locationById.put(7, new location(7,"Pool"));
        locationById.put(8, new location(8,"APEX Gym"));
        locationById.put(9, new location(9,"High School"));
        locationById.put(10, new location(10,"Performing Arts Gymnasiums"));
        locationById.put(11, new location(11,"STEM Center"));
        locationById.put(12, new location(12,"Campus Square"));
        locationById.put(13, new location(13,"Welcome Center"));
        locationById.put(14, new location(14,"Arrival Plaza"));
        locationById.put(15, new location(15,"New Middle School"));
        locationById.put(16, new location(16,"Tennis Courts"));
        locationById.put(17, new location(17,"Football Field"));
        locationById.put(18, new location(18,"Multipurpose Field"));
        locationById.put(19, new location(19,"50m pool"));
        locationById.put(20, new location(20,"Bus Stop"));
        
        int[][] graph = new int[n][n];
        
        String row;
        int rowIndex = 0;
        BufferedReader csvReader = new BufferedReader(new FileReader("vertices.csv"));
        while ((row = csvReader.readLine()) != null) 
        {
          String[] data = row.split(",");
          for(int i=0; i<data.length; i++){
              int value = max;
              if(!data[i].equals("*")){
                  value = Integer.parseInt(data[i]);
              }
              graph[rowIndex][i] = value;
          }
          rowIndex++;
        }
        
        csvReader.close();
       
//        for(int i = 0; i < n; i++)
//        {
//            for(int j = 0; j < n; j++)
//            {
//                System.out.print(graph[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
        
        
        dijkstra shortestPath = new dijkstra();
        LinkedList<Integer> path = shortestPath.execute(graph,17,10);
        while(!path.isEmpty())
        {
            int node = path.pop();
            System.out.println(locationById.get(node).getName());
        }
    }
    
    
    
    
}
