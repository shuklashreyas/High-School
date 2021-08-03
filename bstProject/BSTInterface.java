/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstproject;
import java.util.*;
/**
 *
 * @author shreyasshukla
 */
public interface BSTinterface<T,E> extends Comparable<T>
{
    public E add(T key, E Element); //returns the object
    public boolean contains(T key);
    public E search(T key);
    public boolean isEmpty(); //
    public E delete(T key); //returns the object, not a Node&lt;E&gt;.
    public int size();
    public String toString();
    public boolean edit(T key,E newElement);
    

}
