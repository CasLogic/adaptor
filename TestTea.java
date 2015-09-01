package adaptor;

public class TestTea {
	public static void main(String[] args) {
	       TeaBall tea = new TeaBall();
	       System.out.println("Steeping tea bag");
	       LooseLeafTea teaGreen = new  LooseLeafTea("green");
	       LooseLeafTea teaPeach = new  LooseLeafTea("peach");
	       tea.TeaBag(teaGreen);
	       tea.TeaInCup();
	       tea.TeaBag(teaPeach);
	       tea.TeaInCup();

	       }
     }
