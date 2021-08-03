import java.util.*;
import java.io.File;
import java.io.*; 
public class HangmanTest 
{
   public static void main (String[] args) throws Exception
   {
   
     Scanner sc = new Scanner(System.in);
     Scanner br = new Scanner( new File("test.txt"));
     String temp = "";
     int rand = (int)(Math.random() * 35); 
     int count = 0;
     
     //Scanner type = new Scanner( new File("type.txt"));
     
     
   while(br.hasNext())
   {
      if(count == rand)
      {
         temp = br.next();
         break;
      }
      else
      {
         br.nextLine();
      }
      count++;
   }
       
      String hangWord = temp;
      int lettersLeft = hangWord.length();
      int lifeCheck = hangWord.length();
      int indexWord = 0;
      
      ArrayList<String> arr = new ArrayList<String>(); 
      
      for(int a = 0; a < hangWord.length(); a++)
      {
         arr.add("_");
      }
         System.out.println(arr);
      
      
      
while(lettersLeft != 0 || lifeCheck == 0)
{
      System.out.println("guess a letter pls (no caps)?: ");
      String guess = sc.next();
     boolean isValidGuess = false; 
      for(int b = 0; b < arr.size(); b++)
      {
         String check = hangWord.substring(b,b+1);
         
         if(guess.equals(check))
         {
            arr.set(b,guess);
            lettersLeft--;
            isValidGuess = true;
         }
        
      }
      
      if(isValidGuess == false)
         {
            lifeCheck--;
         }
         
     System.out.println(arr);
     System.out.println("life: " + lifeCheck);
   
   if(lifeCheck == 0)
   {
      System.out.println("the word was: " + hangWord);
      break;
      
   }
  
     
 }  
   
   
   
   }

}
