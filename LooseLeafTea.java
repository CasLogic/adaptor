package adaptor;

public class LooseLeafTea {  
	   boolean teaIsSteeped; 
	   String flavor;
	   public LooseLeafTea(String f) {
	       teaIsSteeped = false;
	       flavor = f;
	   }
	   public boolean steepTea() {
	       teaIsSteeped = true;
	       System.out.println(flavor + "tea is steeping");
	       return true;
	   }
	}
