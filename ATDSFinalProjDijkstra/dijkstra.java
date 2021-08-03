/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.LinkedList;

/**
 *
 * @author shreyasshukla
 */
public class dijkstra 
{
    private static final int NO_PARENT = -1;
    private static final int MAX = 100;
    
    public LinkedList execute(int[][] graph,int sourceId,int destinationId)
    {
        int source = sourceId - 1;
        int destination = destinationId - 1;
        int n = graph[0].length;
        int[] shortestDistances = new int[n];
        boolean[] added = new boolean[n];
        for (int i = 0; i < n; i++)
        {
            shortestDistances[i] = MAX;
            added[i] = false;
        }
        
        shortestDistances[source] = 0;
        int[] parents = new int[n];
        parents[source] = NO_PARENT;
        
        for (int i = 1; i < n; i++)
        {
            int nearestNode = -1;
            int shortestDistance =MAX;
            for (int j = 0;j < n; j++)
            {
                if (!added[j] && shortestDistances[j] <shortestDistance) 
                {
                    nearestNode = j;
                    shortestDistance = shortestDistances[j];
                }
            }
            
            added[nearestNode] = true;
            
            for (int j = 0; j < n; j++) 
            {
                int edgeDistance = graph[nearestNode][j];
                  
                if (edgeDistance > 0 && ((shortestDistance + edgeDistance) < shortestDistances[j])) 
                {
                    parents[j] = nearestNode;
                    shortestDistances[j] = shortestDistance + edgeDistance;
                }
            }
        }
  
        return getPath(destination, parents);
    }
    
    private LinkedList getPath(int destination,int[] parents)
    {
        LinkedList path = new LinkedList<Integer>();
        setPath(destination,parents,path);
        return path;
        
    }
    private void setPath(int node,int[] parents,LinkedList<Integer> path)
    {
        if (node == NO_PARENT)
        {
            return;
        }
        setPath(parents[node],parents,path);
        path.add(node +1);
    }
   
    
}
