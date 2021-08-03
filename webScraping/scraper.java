/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webscraping;

/**
 *
 * @author shreyasshukla
 */


import org.jsoup.*;
import org.jsoup.helper.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

import java.io.*; // Only needed if scraping a local File.

public class Scraper {

	public Scraper() {

		Document doc = null;

		try 
                {
                        doc = Jsoup.connect("https://edition.cnn.com/2021/06/07/tech/wwdc-apple-event-roundup/index.html").get();
                        //https://www.g7website.com/website-categories/html-websites.html
                        //doc = Jsoup.connect("http://www.geog.leeds.ac.uk/courses/other/programming/practicals/general/web/scraping-intro/table.html").get();
		} 
                
                catch (IOException ioe) 
                {
			ioe.printStackTrace();
		}
                
//		Element table = doc.getElementById("datatable");
                //paragraph_09E5A105-6D9E-BDD1-4705-E7751DCC700B
                Elements tables = doc.getElementsByClass("zn-body__paragraph speakable");
//                System.out.print(table);
//		Elements rows = table.getElementsByTag("p");
                
		
//		for (Element row : rows) 
//                {
//			Elements tds = row.getElementsByTag("TD");
//			for (int i = 0; i < tds.size(); i++) 
//                        {
//				if (i == 1) System.out.println(tds.get(i).text());
//			}
//		}
//              
//	
    
//    for (Element table : tables) 
//    {
//        System.out.print(table.text());
//        
//    }
//       
            
//    for(int a = 0; a < tables.size(); a++)
//    {
//       Element temp = tables.get(a);
//       String b = temp.toString();
//       System.out.print(b);
//    }

  

	}
	
	public static void main (String args[]) 
        {
		new Scraper();
	
	}
	
}
	
