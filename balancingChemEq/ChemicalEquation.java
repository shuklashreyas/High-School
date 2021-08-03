import java.util.*; 
public class ChemicalEquation
{
   private ArrayList<Compound> beforeReaction;
   private ArrayList<Compound> afterReaction;

   public ChemicalEquation(ArrayList<Compound> beforeReaction, ArrayList<Compound> afterReaction)
   {
      this.beforeReaction = beforeReaction;
      this.afterReaction = afterReaction;
   }

   public void printChemicalEquation()
   {  
       Map <String,Integer> elementBeforeMap = getElementMap(beforeReaction);
       Map <String,Integer> elementAfterMap = getElementMap(afterReaction);
       
          
     for (String key : elementAfterMap.keySet()) 
     {
       System.out.println(key);
       System.out.println(elementAfterMap.get(key));
     }         
       
   }
   
   private HashMap<String,Integer> getElementMap(ArrayList<Compound> compounds)
   {
       HashMap <String,Integer> elementMap =  new HashMap<String,Integer>();
      
       for(Compound c : compounds)
       {
         HashMap<String,Integer> compoundMap = c.getCompoundMap();
         
         for(String key : compoundMap.keySet())
         {
            if(elementMap.containsKey(key))
            {
               int currentCount = elementMap.get(key);
               elementMap.replace(key, currentCount + compoundMap.get(key));
            }
            
            else
            {
               elementMap.put(key, compoundMap.get(key));
            }
         }
         
      
       }
      return elementMap;
   }
 

}
