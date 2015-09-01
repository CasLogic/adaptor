package adaptor;

public class TeaBall implements TeaCup {  
	   LooseLeafTea looseLeafTea;
	   boolean teaBagIsSteeped;
	   
	   public void TeaBag(LooseLeafTea l) {
		   teaBagIsSteeped = false;
		   looseLeafTea = l;
		   looseLeafTea.steepTea();
		}
	   public void TeaInCup() {
	       System.out.println(looseLeafTea.flavor + " tea is in the cup");
	       teaBagIsSteeped = true;
	   }

	
	}
