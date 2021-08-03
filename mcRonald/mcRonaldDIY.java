/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcronald;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author shreyasshukla
 */
public class McRonaldDIY 
{ 
 public static final int TIME = 1080;  //18 hrs * 60 min
 public static final int SERVICEWINDOW = 1;
 
   public static void main(String[] args)
   {
       Queue<Customer> q = new LinkedList<>();
       int totalServiceWindows = 3;
       int totalTime = TIME;
       int totalWaitTime = 0;
       int customerId = 1;
       int longestQueue = 0;
       int longestWait = 0;
       
       ArrayList<ServiceArea> sa = new ArrayList<>();
       ArrayList<ServiceArea> onlineSA = new ArrayList<>();
       
       for(int a = 0; a < totalServiceWindows; a++)
       {
           ServiceArea temp = new ServiceArea();
           sa.add(temp);
       }
       
       for(int a = 0; a <= totalTime; a++)
       {
           updateTotalWaitTime(q);
           
           for(int b = 0; b < totalServiceWindows; b++)
           {
               sa.get(b).serveMin();
               Customer c = sa.get(b).hasServerd();
               if(c != null)
               {
                   int customerWaitTime = c.getTotalWaitTime() + c.getWaitTime();
                   
                    if(longestWait < customerWaitTime)
                    {
                        longestWait = customerWaitTime;
                    }
                    totalWaitTime += customerWaitTime;
                    
                    System.out.println("Customer#" + c.customerId + " leaves and total wait time is: " + customerWaitTime);
                   
               }
           }
           
           for(int b = 0; b < onlineSA.size(); b++)
           {
               onlineSA.get(b).serveMin();
               Customer c = onlineSA.get(b).hasServerd();
               if(c != null)
               {
                    int customerWaitTime = c.getWaitTime();
                   
                    if(longestWait < customerWaitTime)
                    {
                        longestWait = customerWaitTime;
                    }
                    totalWaitTime += customerWaitTime;
                    
                    System.out.println("Online Customer#" + c.customerId + " leaves and total wait time is: " + customerWaitTime);
                    onlineSA.remove(b);
                    b--;
               }
               
           }
           
           int random = (int)(Math.random() * 100);
            if(random <= 50)
            {
                boolean isAdded = addNewCustomer(q, customerId, a);
          
                if(isAdded)
                {
                   customerId++;
                }
                
                 
            } 
            
            else
            {
                Customer newCus = addNewOnlineCustomer(customerId, a);
          
                if(newCus != null)
                {
                   customerId++;
                   ServiceArea newOnlineSA = new ServiceArea();
                   newOnlineSA.setIsOnline(true);
                   newOnlineSA.allocate(newCus);
                   onlineSA.add(newOnlineSA);
                }
            }
           
           for(int b = 0; b < totalServiceWindows; b++)
           {
              if(!q.isEmpty() && sa.get(b).isAvailable())
              {
                  sa.get(b).allocate(q.remove());
              }
           }
          
           
           display(q,a,sa);
           int currentQSize = q.size();
           if(currentQSize > longestQueue)
           {
               longestQueue = currentQSize;
           }
       }
       
       while(!q.isEmpty())
       {
          Customer c = q.peek();
          for(int a = 0; a < c.getWaitTime(); a++)
          {
              updateTotalWaitTime(q);
              c.reduceWaitTime();
              totalTime++;
              display(q,totalTime,sa);
              
              for(int b = 0; b < onlineSA.size(); b++)
              {
                onlineSA.get(b).serveMin();
                Customer onlineC = onlineSA.get(b).hasServerd();
                if(onlineC != null)
                {
                    int customerWaitTime = onlineC.getWaitTime();

                    if(longestWait < customerWaitTime)
                    {
                        longestWait = customerWaitTime;
                    }
                    totalWaitTime += customerWaitTime;

                    System.out.println("Online Customer#" + onlineC.customerId + " leaves and total wait time is: " + customerWaitTime);
                    onlineSA.remove(b);
                    b--;
                }

            }
              
          }
          
          totalWaitTime += q.peek().getTotalWaitTime();
          q.remove();
       }
       totalTime++;
       display(q,totalTime,sa);
 
       
       System.out.println("Total Customers Served: " + (customerId - 1));
       System.out.println("Average Wait Time: " + ((double)totalWaitTime /(customerId - 1) ));
       System.out.println("Longest Queue: " + longestQueue) ;
       System.out.println("Longest Wait Time: " + longestWait) ;
      
   }
   public static void display(Queue<Customer> q, int min, ArrayList<ServiceArea> sa)   
   {
       System.out.print(Integer.toString(min) + ": ");
       for(Customer c : q)
       {
           System.out.print(c.getCustomerId()+ " ");
       }
       System.out.println();
       
       for(int a = 0; a < sa.size(); a++)
       {
           sa.get(a).print(min,a+1);
       }
       System.out.println();
   }
   
   public static void updateTotalWaitTime(Queue<Customer> q)
   {
        for(Customer c : q)
        {
            c.increaseTotalWaitTime();
        }
   }
   
   public static boolean shouldRemoveFirstInList(Queue<Customer> q)
   {
       Customer first = q.peek();
        if(first != null)
        {
            first.reduceWaitTime();
            if(first.getWaitTime() == 0)
            {
                return true;
            }
        }
        return false;
   }
   
   public static boolean addNewCustomer(Queue<Customer> q, int customerId,int currentTime)
   {
        int random = (int)(Math.random() * 100);
        if(random <= 50)
        {
            int waitTime = (int)(Math.random() * (6) + 2);
            Customer c = new Customer(customerId,waitTime);
            q.add(c);
            System.out.println("new customer min#" + currentTime);
            return true;
        }
        
        return false;
   }

   public static Customer addNewOnlineCustomer(int customerId,int currentTime)
   {
        int random = (int)(Math.random() * 100);
        if(random <= 50)
        {
            int waitTime = (int)(Math.random() * (16) + 30);
            Customer c = new Customer(customerId,waitTime);
            c.setIsOnline(true);
            System.out.println("new online customer min#" + currentTime);
            return c;
        }
        
        return null;
   }
   
   public static class Customer     
   {
      private int customerId;
      private int waitTime;
      private int totalWaitTime;
      private boolean isOnline;

        public boolean setIsOnline() 
        {
            return isOnline;
        }

        public void setIsOnline(boolean isOnline) 
        {
            this.isOnline = isOnline;
        }

      
        public Customer(int customerId, int waitTime) 
        {
            this.customerId = customerId;
            this.waitTime = waitTime;
            this.isOnline = false;
        }

        public int getCustomerId() 
        {
            return customerId;
        }

        public int getWaitTime() 
        {
            return waitTime;
        }
      
        public void reduceWaitTime()
        {
            this.waitTime--;
        }

        public int getTotalWaitTime() 
        {
            return totalWaitTime;
        }
        
        public void increaseTotalWaitTime()
        {
            this.totalWaitTime++;
        }
        
   }
   

   public static class ServiceArea     
   {
       private int customerId;
       private int waitTime;
       private Customer customer;
       private boolean isOnline;
        public ServiceArea() 
        {
            reset();
        }

        public Customer getCustomer() 
        {
            return customer;
        }

        public boolean isIsOnline() 
        {
            return isOnline;
        }

        public void setCustomer(Customer customer)
        {
            this.customer = customer;
        }

        public void setIsOnline(boolean isOnline) 
        {
            this.isOnline = isOnline;
        }
        
        public void reset()
        {
            this.customerId = -1;
            this.waitTime = -1;
        }
        
        public void setCustomerId(int customerId) 
        {
            this.customerId = customerId;
        }

        public void setWaitTime(int waitTime) 
        {
            this.waitTime = waitTime;
        }

        public int getCustomerId() 
        {
            return customerId;
        }

        public int getWaitTime() 
        {
            return waitTime;
        }
       
        public boolean isAvailable()
        {
            return waitTime == -1;
        }
        
        public void allocate(Customer c)
        {
            if(c == null)
            {
                return;
            }
            
           this.customerId = c.customerId;
           this.waitTime = c.waitTime;
           this.customer = c;
           
        }
       
        public void print(int currentMin,int serviceIndex)
        {
            if(this.isOnline)
            {
                System.out.println("Online Service Area #" + serviceIndex + " " + customerId + ":" + waitTime + " ");
            }
            else
            {
                System.out.println("Service Area #" + serviceIndex + " " + customerId + ":" + waitTime + " ");
            }
        }

        public void serveMin() 
        {
            if(this.waitTime > 0)
            {
                this.waitTime--;
                
            }
        }
        
        public Customer hasServerd()
        {
            if(this.waitTime == 0)
            {
                reset();
                return this.customer;
            }
            else
                return null;
        }
        
   }


    
}


