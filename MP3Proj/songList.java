/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shreyasshukla
 */
public class songList 
{
    
    node head;
    node tail;
    int count;
    
    public songList() 
    {
        this.head = null;
        this.tail = null;
        this.count = 0;
        // setting default values
    }
    
    public void addASong(song s)
    {
        node newNode = new node(s);
        newNode.next = null;
            
        if(isEmpty())
        {
          head = newNode;
          tail = newNode;
        } 
            
        else 
        {
          node last = head;
          
          while(last.next != null)
          {
            last = last.next;
          }
                
          last.next = newNode;	
          tail = newNode;
        }
        this.count ++;
    }
    
    public void deleteSong(String name)
     {
      
          node current = head;
          node previous = null;
         
          while(current.next != null)
          {
              if(current.data.getName().equals(name))
              {
                  
                  if(previous == null)
                  {
                      head = current.next;
                      current.next = null;
                  }
                  else
                  {
                      previous.next = current.next;
                      current.next = null;
                  }
                
                  this.count--;
                  break;
                  
              }
                 previous = current;
                 current = current.next;
          } 
                
          //This is pretty simmilar to edit duration where we find the element we want to delete
          // but when we delete an element we have to set the value to null and the next value to head
          // when a value is null it's deleted and not looked at
    }
    
    public void editDuration (String name, int newDuration)
    {
          node current = head;
        
          while(current!= null)
          {
              if(current.data.getName().equals(name))
              {
                  current.data.setDuration(newDuration);
                  break;
              }
            current = current.next;
          }
          // if the name matches with a song in the array, we check this by getting the current node
          // and comparing it to name and if it matches we edit the duration which will be promped in the gui
          // We use the set method in the songclass to set the new duration
          
    }
    
    public String getLastSong()
    {
        return tail.data.getSongInfo();
    }
    
    public String[] getSongList()
    {
        String [] songs = new String [count];
        int index = 0;
       
        node last = head;
          
          while(last != null)
          {
            songs[index] = last.data.getSongInfo();
            last = last.next;
            index++;
          }
                
       return songs;	
       
       // getting the values in the linked list by using the while loop
       // and then adding it into an array called songs with the length count
       // count represents how many times we deleted or added songs into the array
    }
    
    
    public int [] getDurationListSort()
    {
       int [] durationList = new int [count];
       
        int index = 0;
        node last = head;
          
        while(last != null)
          {
             int temp = (last.data.getDuration());
             durationList[index] = temp;
             last = last.next;
             index++;
          }
        
         //Bubble Sort
        
         int n = durationList.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (durationList[j] > durationList[j+1]) 
                { 
                    int temp = durationList[j]; 
                    durationList[j] = durationList[j+1]; 
                    durationList[j+1] = temp; 
                } 
        
        return durationList;
    
    }
    
    public void reset()
    {
        this.head = null;
        this.tail = null;
        // setting the head and tail to null will break the linked list meaning it has 
        // no values
    }
    
    public int getSize(String arr[])
    {
        return arr.length;
    }
    
    public boolean isEmpty()
    {
      return head == null;
    }
    
    
    
}
