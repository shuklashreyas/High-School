import java.util.*; 

public class chemistryEquation
{
     public static void main(String[] args)
     {
         PeriodicTable table = new PeriodicTable();
         Element carbon = table.getByName("C");
         Element oxygen = table.getByName("O");
         Element hydrogen = table.getByName("H");
         
         //CH4
         ArrayList<Molecule> methaneMolecule = new ArrayList<Molecule>();
         methaneMolecule.add(new Molecule(carbon,1));
         methaneMolecule.add(new Molecule(hydrogen,4));
         Compound methaneCompound = new Compound(methaneMolecule);
        
         //O2
         ArrayList<Molecule> oxygenMolecule = new ArrayList<Molecule>();
         oxygenMolecule.add(new Molecule(oxygen,2));
         Compound oxygenCompound = new Compound(oxygenMolecule);
         
         //H20
         ArrayList<Molecule> waterMolecule = new ArrayList<Molecule>();
         waterMolecule.add(new Molecule(hydrogen,2));
         waterMolecule.add(new Molecule(oxygen,1));
         Compound waterCompound = new Compound(waterMolecule);
         
         //CO2
         ArrayList<Molecule> carbonMolecule = new ArrayList<Molecule>();
         carbonMolecule.add(new Molecule(carbon,1));
         carbonMolecule.add(new Molecule(oxygen,2));
         Compound carbonCompound = new Compound(carbonMolecule);
         
         ArrayList<Compound> beforeReaction = new ArrayList<Compound>();
         beforeReaction.add(methaneCompound);
         beforeReaction.add(oxygenCompound);
         
         ArrayList<Compound> afterReaction = new ArrayList<Compound>();
         afterReaction.add(waterCompound);
         afterReaction.add(carbonCompound);
         
         ChemicalEquation equation = new ChemicalEquation(beforeReaction,afterReaction);
         equation.printChemicalEquation();
     }
     
     
}
