/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcronald;

/**
 *
 * @author shreyasshukla
 */
  import java.util.*;

public class McRonaldsTest
  {
  private static Queue<Integer> yo = new LinkedList<Integer>();
  private static Queue<Integer> vip = new LinkedList<Integer>();
  private static int time = 1440;
  private static int lwait = 0;
  private static int[] service = {1, 1, 1};
  private static int custserv = 0;
  private static int totalwait = 0;
  private static int vwait = 0;
  private static int vcust = 0;
  private static int vlwait = 0;
  	
  
   public static void main(String[] args)
  {
	 for(int x = 1; x <= time; x++)
	 {
		if(Math.random() < .5) 
                {
		   if(yo.size() < service.length)
			  for(int k = 0; k < service.length; k++)
				 if(service[k] == 0)
				 {
					service[k] = (int)(Math.random() * 6 + 2);
					break;
				 }
		   yo.add(x);		
		}
		if(Math.random() < .05) {
		   if(vip.size() < service.length)
			  for(int k = 0; k < service.length; k++)
				 if(service[k] == 0)
				 {
					service[k] = (int)(Math.random() * 6 + 2);
					break;
				 }
		   vip.add(x);		
		}
		if(!vip.isEmpty()) {
		   vserve(vip, x);
		System.out.print("VIP Customer(s): ");
		   printQueue(vip);
		}
                
		else 
                {
		   serve(yo, x);
		System.out.print("Normal Customer(s): ");
		
		   printQueue(yo);
		}
	 }
	 System.out.println("\n" + "*****Normal Customers*****");
	 System.out.println("Total number of customers: " + custserv);
	 System.out.println("Average Wait Time: " + (double)totalwait/custserv);
	 System.out.println("Longest Wait Time: " + lwait);
	 
	 System.out.println();
	 System.out.println("*****VIP Customers*****" + "\n");
	 System.out.println("Total number of customers: " + vcust);
	 System.out.println("Average Wait Time: " + (double)vwait/vcust);
	 System.out.println("Longest Wait Time: " + vlwait);
  
  }
   public static void serve(Queue<Integer> yo, int x)
  {
	 for(int y = 0; y < service.length; y++)
	 {
		if(service[y] > 0)
		   service[y]--;
		else if(yo.size() > 3) {
		   if(x - yo.peek() > lwait)
			  lwait = x - yo.peek();
		   totalwait += x - yo.remove();
		   custserv++;
		   service[y] = (int)(Math.random() * 6 + 2);  
		}
		else if(!yo.isEmpty() ) {
		   if(x - yo.peek() > lwait)
			  lwait = x - yo.peek();
		   totalwait += x - yo.remove();
		   custserv++;
		}
	 }
  }
   public static void vserve(Queue<Integer> yo, int x)
  {
	 for(int y = 0; y < service.length; y++)
	 {
		if(service[y] > 0)
		   service[y]--;
		else if(yo.size() > 3) {
		   if(x - yo.peek() > vlwait)
			  vlwait = x - yo.peek();
		   vwait += x - yo.remove();
		   vcust++;
		   service[y] = (int)(Math.random() * 6 + 2);  
		}
		else if(!yo.isEmpty() ) {
		   if(x - yo.peek() > vlwait)
			  vlwait = x - yo.peek();
		   vwait += x - yo.remove();
		   vcust++;
		}
	 }
  }
   public static void printQueue(Queue<Integer> yo)
  {
	 System.out.println(yo.toString());
  }
   
  }
