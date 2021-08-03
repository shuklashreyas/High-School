/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcronald;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author shreyasshukla
 */
public class McRonald1000
{
    public static final int TIME = 1080;  //18 hrs * 60 min
 public static final int SERVICEWINDOW = 1;
 
   public static void main(String[] args)
   {
       
       
       int totalWaitTime = 0;
      
       int longestQueue = 0;
       int longestWait = 0;
       int max = 0;
       int days = 1000;
       int totalCustomers = 0;
       int maxCustomers = 0;
      for(int b = 0; b < days; b++)
      {
        Queue<Customer> q = new LinkedList<>();
        int customerId = 1;
        int totalTime = TIME;
       for(int a = 0; a <= totalTime; a++)
       {
           updateTotalWaitTime(q);
           if(shouldRemoveFirstInList(q))
           {
               int currentCustomerWaitTime = q.peek().getTotalWaitTime();
               if(longestWait < currentCustomerWaitTime)
               {
                   longestWait = currentCustomerWaitTime;
               }
               
               totalWaitTime +=currentCustomerWaitTime;
               q.remove();
           }
           boolean isAdded = addNewCustomer(q, customerId);
           if(isAdded)
           {
               customerId++;
           }
//            if(b == days -1)
//                display(q,a);
            
           longestQueue = q.size();
           if(longestQueue > max)
           {
               max = longestQueue;
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
              
//              if(b == days -1)
//                display(q,totalTime);
          }
          
          totalWaitTime += q.peek().getTotalWaitTime();
          q.remove();
       }
       totalTime++;
       totalCustomers += (customerId -1);
       if(maxCustomers < (customerId -1))
       {
           maxCustomers = customerId-1;
       }
//       System.out.println(customerId);
//       if(b == days -1)
//           display(q,totalTime);
      }
       System.out.println("Total Customers Served: " + totalCustomers );
       System.out.println("Average Wait Time: " + ((double)totalWaitTime /totalCustomers ));
       System.out.println("Longest Queue: " + max) ;
       System.out.println("Longest Wait Time: " + longestWait) ;
       System.out.println("Average served per day: " + ((double)(totalCustomers)/1000)) ;
       System.out.println("Longest day: " + maxCustomers) ;
   }
   
   public static void display(Queue<Customer> q, int min)   
   {
       System.out.print(Integer.toString(min) + ": ");
       for(Customer c : q)
       {
           System.out.print(c.getCustomerId()+ " ");
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
   
   public static boolean addNewCustomer(Queue<Customer> q, int customerId)
   {
        int random = (int)(Math.random() * 100);
        if(random <= 20)
        {
            int waitTime = (int)(Math.random() * (6) + 2);
            Customer c = new Customer(customerId,waitTime);
            q.add(c);
            return true;
        }
        
        return false;
   }

   public static class Customer     
   {
      private int customerId;
      private int waitTime;
      private int totalWaitTime;

        public Customer(int customerId, int waitTime) 
        {
            this.customerId = customerId;
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
}
