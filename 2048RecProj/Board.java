
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048v2;

/**
 *
 * @author shreyasshukla
 */
import java.util.*;

public class Board 
{ 
    private static int maxRows = 4;
    private static int maxCols = 4;
    private int board[][];
    private Move move;
    private ArrayList<Integer> zeroIndex;
    
    public Board() 
    {
        this.board = new int [maxRows][maxCols];
        this.zeroIndex = new ArrayList<Integer>();
        this.move = new Move();
        for(int r = 0; r < maxRows; r++)
        {
            for(int c = 0; c< maxCols; c++)
            {
                this.board[r][c] = 0;
                zeroIndex.add(convertToHash(r,c));
            }
        }
        spawn();
        spawn();
    }

    public int [][] getBoard()
    {
        return board;
    }
    
    public int getTotalScore()
    {
        int totalScore = 0;
        
        for(int r = 0; r < maxRows; r++)
        {
            for(int c = 0; c< maxCols; c++)
            {
                totalScore += board[r][c];
              
            }
        }
        
        return totalScore;
    }
    
    private int getSpawnVal()
    {
        int rand = (int)(Math.random() * 10);
        if(rand > 6)
        {
            return 4;
        }
        
        return 2;
    }

    public Board(int[][] board, Move move, ArrayList<Integer> zeroIndex) 
    {
        this.board = board;
        this.move = move;
        this.zeroIndex = zeroIndex;
    }
    
    
    
    public void spawn()
    {
        int spawnVal = getSpawnVal();
        int hashIndex = (int)(Math.random() * zeroIndex.size());
        int spawnHash = zeroIndex.get(hashIndex);
        
        int spawnRow = getRowFromHash(spawnHash);
        int spawnCol = getColFromHash(spawnHash);
        
        this.board[spawnRow][spawnCol] = spawnVal;
        zeroIndex.remove(hashIndex);
    }
    
    public void printBoard()
    {
        for(int r = 0; r < maxRows; r++)
        {
            for(int c = 0; c< maxCols; c++)
            {
                System.out.print(this.board[r][c]);
                System.out.print("\t");
            }
            System.out.println();
        }
       
    }
    
    public int convertToHash(int row, int col)
    {
        return row*10 + col;
    }
    
    public int getRowFromHash(int hash)
    {
       return (hash/10) % 10;
    }
    
    public int getColFromHash(int hash)
    {
       return(hash%10);
    }
    
    public void moveBoard(String dir)
    {
        move.moveBoard(dir, board, maxRows, maxCols);
        updateZeroIndexes();
    }
    
    

    private void updateZeroIndexes(){
        zeroIndex = new ArrayList<Integer>();
        for(int r = 0; r < maxRows; r++)
        {
            for(int c = 0; c< maxCols; c++)
            {
              if(board[r][c] == 0){
                zeroIndex.add(convertToHash(r,c));
              }
            }
        }
    }
    
}
