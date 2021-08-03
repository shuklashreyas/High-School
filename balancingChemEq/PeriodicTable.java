import java.util.*; 
public class PeriodicTable
{
   private Map <String,Element> table;
   
   public PeriodicTable()
   {
      table = new HashMap<String,Element> ();
      table.put("C",new Element("C", 4));
      table.put("H",new Element("H", 1));
      table.put("O",new Element("O", -2));
      table.put("Al", new Element("Al",3));
      table.put("Pb",new Element("Pb",1));
      table.put("N",new Element("N",-3));
      table.put("Na",new Element("Na",1));
      table.put("S", new Element("S",-2));
      table.put("Fe", new Element("Fe",3));
      
   }

   public Element getByName(String name)
   {
      return table.get(name);
   }
}
