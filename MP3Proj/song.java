/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shreyasshukla
 */
public class song 
{
    
    private String name;
    private int duration;

    public song(String name, String duration) 
    {
        this.name = name;
        this.duration = Integer.parseInt(duration);
    }
// getters and setters
    public String getName()
    {
        return name;
    }

    public int getDuration() 
    {
        return duration;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setDuration(int duration) 
    {
        this.duration = duration;
    }
    
    public String getSongInfo()
    {
        return "Song Name: " + this.name + ", Duration: " + Integer.toString(this.duration);
        // Basically a to string method 
    }

    
    
}
