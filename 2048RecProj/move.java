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

public class Move 
{
  public void moveBoard(String dir, int[][] board, int maxRows, int maxCols)
  {
      if(dir.equals("right")) 
      {
          moveBoardRight(board, maxRows, maxCols);
      }
      if(dir.equals("left")) 
      {
          moveBoardLeft(board, maxRows);
      }
      if(dir.equals("up"))
      {
          moveBoardUp(board, maxRows, maxCols);
      }
      if(dir.equals("down"))
      {
          moveBoardDown(board, maxRows, maxCols);
      }
  }

  private void moveBoardUp(int[][] board, int maxRows, int maxCols){
    for(int c=0; c < maxCols; c++){
      int[] arr = new int[maxRows];
      for(int r=0; r < maxRows; r++){
        arr[r] = board[r][c];
      }
      shiftAndMergeBoard(arr);

      for(int r=0; r < maxRows; r++){
        board[r][c] = arr[r];
      }
    }
  }

  private void moveBoardDown(int[][] board, int maxRows, int maxCols){
    for(int c=0; c < maxCols; c++){
      int[] arr = new int[maxRows];
      int index=0;
      for(int r=maxRows-1; r >= 0; r--){
        arr[index] = board[r][c];
        index++;
      }
      shiftAndMergeBoard(arr);

      index = 0;
      for(int r=maxRows-1; r >= 0; r--){
        board[r][c] = arr[index];
        index++;
      }
    }
  }

  private void moveBoardRight(int[][] board, int maxRows, int maxCols){
    for(int r=0; r < maxRows; r++)
    {
      int[] arr = new int[maxCols];
      int index = 0;
      for(int c=maxCols-1; c >=0; c--)
      {
        arr[index] = board[r][c];
        index++;
      }
      shiftAndMergeBoard(arr);
      
      index = 0;
      for(int c=maxCols-1; c >=0; c--){
        board[r][c] = arr[index];
        index++;
      }
    }
  }

  private void moveBoardLeft(int[][] board, int maxRows){
      for(int r=0; r < maxRows; r++){
        shiftAndMergeBoard(board[r]);
      }
  }

  private void shiftAndMergeBoard(int[] arr){
      shift(arr, 0, 1);
      merge(arr, 0, 1);
      shift(arr, 0, 1);
  }
// recursive call to merge adjacent cells values if they are the same
  private void merge(int[] arr, int currentIndex, int nextIndex){ 
     // basecase when all cells are merged
      if(nextIndex >= arr.length)
      {
          return;
      }
        
      int current = arr[currentIndex];
      int next = arr[nextIndex];
      //merge two cells together if they have the same value
      if(current == next)
      {
          //We merge the values and put it in the next cell
          arr[nextIndex] = current + next;
          arr[currentIndex] = 0;
          
          int newCurrentIndex = currentIndex + 2;
         //Once two cells are merged the index will shift by 2 to continue further merges
         merge(arr, newCurrentIndex, newCurrentIndex + 1);
      }
     //if two adjacent cells are not of the same value we will shift by one to continue further merges
      else
      {
        merge(arr, nextIndex, nextIndex + 1);
      }
    }
   // recursive shift method to push all the non zero values to the start while zero values are pushed to the end
  private void shift(int[] arr, int currentIndex, int nextIndex)
  {
      // base case when there are no more cells to traverse 
      if(nextIndex >= arr.length || nextIndex <= 0)
      {
          return;
      }
      
      int current = arr[currentIndex];
      int next = arr[nextIndex];
      //the next value can move back by one space since there is an empty slot
      if(current == 0 && next != 0)
      {
          //move non zero values to empty slot
          arr[currentIndex] = next;
          arr[nextIndex] = 0;
          
          int newCurrentIndex = nextIndex - 1;
          //recurisvely move backwards to push the non zero value for all avaialable empty space
          shift(arr, newCurrentIndex, newCurrentIndex - 1);
      }
      //continue to apply the same logic to the remaining set of values in the array
      shift(arr, nextIndex, nextIndex+1);
    }
} 
