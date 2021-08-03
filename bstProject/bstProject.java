/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstproject;

/**
 *
 * @author shreyasshukla
 */
public class BSTProject {

    /**
     * @param args the command line arguments
     */
    public static BSTobject<String> tree = null;
    
    public static void main(String[] args) 
    {
//        tree = new BSTobject<String>();
//        build(tree, "1");
//        build(tree, "2");
//        build(tree, "3");
//        build(tree, "4");
//        build(tree, "5");
//        build(tree, "6");
//        build(tree, "7");
//        build(tree, "N");
        
        
       
//        System.out.println("Size: " + tree.size());
//        System.out.println("Is Empty: " + tree.isEmpty());
    }
    
    private static void build (BSTobject<String> tree, String element)
    {
     tree.add(element);
         tree.print();
         System.out.println("----------"); 
    }
    
   
    
}
