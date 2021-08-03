public class Molecule 
{
   private Element element;
   private int count;
   
   public Molecule(Element element, int count)
   {
      this.element = element;
      this.count = count;
   }
   
   public int getCount()
   {
      return count;
   }
   
   public String getName()
   {
      return element.getName();
   }
}
