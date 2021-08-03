/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.HashMap;

/**
 *
 * @author shreyasshukla
 */
public class locationDirectory 
{
   private HashMap<Integer,location> locationById;

    public locationDirectory() 
    {
        locationById = new HashMap<>();
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
    }

    public HashMap<Integer, location> getLocationById() 
    {
        return locationById;
    }

    public void setLocationById(HashMap<Integer, location> locationById) 
    {
        this.locationById = locationById;
    }
   
    
        
    
}
