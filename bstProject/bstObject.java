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
public class BSTobject <T extends Comparable<T>,E> implements BSTinterface<T,E>
{
    // T = type for postal code (String)
    // E = type for address (String)

    private class Node<T,E>
    {
        private T key;
        private E value;
        private Node left;
        private Node right;
        private int height; 
        
        public Node(T key,E value) 
        {
            this.key = key;
            this.height = 1;
            this.value = value;
        }

        public Node(T key,E value, Node left, Node right) 
        {
            this.key = key;
            this.left = left;
            this.right = right;
            this.height = 1;
            this.value = value;
        }

        public int getHeight() 
        {
            return height;
        }

        public void setHeight(int height) 
        {
            this.height = height;
        }
    }
    
    private Node<T,E> root;
    private Node<T,E> current;
    private int count;
    
     static final int spaceCount = 10;
     // spaces to print
     
    public E add(T key, E element)
    {
         root = insertRec(root, key,element);
         return element;
    }
    // A utility function to get the height of the tree
    int height(Node N) 
    {
        if (N == null)
            return 0;
 
        return N.getHeight();
    }
 
    // A utility function to get maximum of two integers
    int max(int a, int b) 
    {
        return (a > b) ? a : b;
    }
    
    Node rightRotate(Node node) 
    {
        Node a = node.left;
        Node b = a.right;
 
        // Perform rotation
        a.right = node;
        node.left = b;
 
        // Update heights
        node.height = max(height(node.left), height(node.right)) + 1;
        a.height = max(height(a.left), height(a.right)) + 1;
 
        // Return new root
        return b;
    }
    
    Node leftRotate(Node node) 
    {
        Node a = node.right;
        Node b = a.left;
 
        // Perform rotation
        b.left = a;
        a.right = b;
 
        //  Update heights
        a.height = max(height(a.left), height(a.right)) + 1;
        b.height = max(height(b.left), height(b.right)) + 1;
 
        // Return new root
        return b;
    }
    
     int getBalance(Node N) 
     {
        if (N == null)
        {
            return 0;
        }
        return height(N.left) - height(N.right);
    }
    
    Node insertRec(Node node, T key, E element)
    {
 

        if (node == null)
        {
            node = new Node(key,element);
            return node;
        }
        
        current = node;
 
        // recurisve method
        if (key.compareTo((T)node.key) < 0)
        {
            node.left = insertRec(node.left,key, element);
        }
        else if (key.compareTo((T)node.key) >= 0)
        {
            node.right = insertRec(node.right, key, element);
        }
        node.height = 1 + max(height(node.left), height(node.right));
 
        // check if unbalanced
        int balance = getBalance(node);
 
        // If this node becomes unbalanced, then there
     
        if (balance > 1 && key.compareTo((T) node.left.key) < 0)
            return rightRotate(node);
 
        // Right Right Case
        if (balance < -1 && key.compareTo((T) node.right.key) > 0)
            return leftRotate(node);
 
        // Left Right Case
        if (balance > 1 && key.compareTo((T) node.left.key) >= 0) 
        {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
 
        // Right Left Case
        if (balance < -1 && key.compareTo((T) node.right.key) <= 0) 
        {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        current = null;
        return node;
    }

    
     @Override
    public int compareTo(T o) 
    {
        // compares the variables 
         return ((Comparable) current.key).compareTo(o);
    }
    
    @Override
    public boolean contains(T key) 
    {
        Node result = searchRec(root,key);
        if(result == null)
           return false;
       else
           return true;
    }
    
     @Override
    public E search(T key) 
    {
        Node result = searchRec(root,key);
        if(result == null)
        {
           return null;
        }
       else
        {
           return (E)result.value;
        }
    }
    
    public Node searchRec(Node node,T key)
    {
        if(node == null)
        {
            return null;
        }
        int comp = key.compareTo((T)node.key);
        
        if(comp  == 0) 
        {
            return node;
        }
        else 
        {
            Node foundNode = searchRec(node.left,key);
            if(foundNode == null) 
            {
                foundNode = searchRec(node.right,key);
            }
            return foundNode;
         }
    } 
    @Override
    public boolean isEmpty() 
    {
        return count == 0;
    }

    @Override
    public E delete(T key) 
    {
        root = deleteNode(root,key);
        return null;
    }
    
    Node minValueNode(Node node) 
    { 
        Node current = node; 
  
    // find left leaf
        while (current.left != null) 
        current = current.left; 
  
        return current; 
    } 
  
    Node deleteNode(Node node,T key)
    {
        // delete
        if (node == null) 
            return null; 
  
       // in left subtree
        if (key.compareTo((T)node.key) < 0) 
            node.left = deleteNode(node.left,key); 
  
        // right subtree
        else if (key.compareTo((T)node.key) > 0) 
            node.right = deleteNode(node.right,key); 
  
        else
        { 
  
            // node with only one child or no child 
            if ((node.left == null) || (node.right == null)) 
            { 
                Node temp = null; 
                if (temp == node.left) 
                    temp = node.right; 
                else
                    temp = node.left; 
  
                // No child case 
                if (temp == null) 
                { 
                    temp = node; 
                    node = null; 
                } 
                else // One child case 
                    node = temp; 
                               
            } 
            else
            { 
                Node temp = minValueNode(node.right); 
                node.key = temp.key; 
                node.right = deleteNode(node.right, (T)node.key); 
            } 
        } 
  
       
        if (node == null) 
            return null; 
  
        // update height
        root.height = max(height(node.left), height(node.right)) + 1; 
  
        // get balance to see if unbalanced
        int balance = getBalance(node); 
        if (balance > 1 && getBalance(node.left) >= 0) 
            return rightRotate(node); 
  
        if (balance > 1 && getBalance(node.left) < 0) 
        { 
            root.left = leftRotate(node.left); 
            return rightRotate(node); 
        } 
  
        if (balance < -1 && getBalance(node.right) <= 0) 
            return leftRotate(node); 

        if (balance < -1 && getBalance(node.right) > 0) 
        { 
            node.right = rightRotate(node.right); 
            return leftRotate(node); 
        } 
  
        return node; 
        
        
        
    }

    @Override
    public int size() 
    {
       return count;
    }

    @Override
    public boolean edit(T key, E newElement) 
    {
//        delete(key);
//        add(key,newElement);
        Node node = searchRec(root,key);
        if(node == null)
        {
            return false;
        }
        node.value = newElement;
        return true;
    }

    private String printTree(Node node, int space)
    {
                // Base case 
            if (node == null) 
                return ""; 

            // Increase distance between levels 
            space += spaceCount; 

            
           String result = printTree(node.right, space);  
           result += "\n"; 
           for (int i = spaceCount; i < space; i++) 
                result += " "; 
            
           result += node.key + "\n";

            // Process left child 
            result += printTree(node.left, space); 
            
            return result;
        } 
    
    @Override
    public String toString() 
    {
     return printTree(root,10);
    }

    
}
    
