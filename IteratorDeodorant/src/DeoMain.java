
public class DeoMain {
public static void main(String args[])
{
	
	AxeDeodorants ad = new AxeDeodorants();
	SuaveDeodorants sd = new SuaveDeodorants();
	
	
	DisplayDeo allDeo = new DisplayDeo(ad,sd);
		
	allDeo.ShowDeo();
			
}
}
