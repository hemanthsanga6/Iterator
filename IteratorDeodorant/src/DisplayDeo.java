import java.util.Arrays;
import java.util.ArrayList;

public class DisplayDeo{
	AxeDeodorants ad;
	SuaveDeodorants sd;
	
	public DisplayDeo(AxeDeodorants newAD, SuaveDeodorants newSD)
	{
		ad = newAD;
		sd = newSD;
				
	}
	public void ShowDeo() 
	{
		ArrayList axeDeo = ad.getBestDeo();
		System.out.println("Axe Deodorants \n");
		for(int i=0; i< axeDeo.size();i++) 
		{
			DeoInfo bestDeo= (DeoInfo)axeDeo.get(i);
			System.out.println(bestDeo.getName());
			System.out.println(bestDeo.getBrand());
			System.out.println(bestDeo.getFragrance());
			System.out.println(bestDeo.getGender());
			System.out.println(bestDeo.getCategory());
			System.out.println(bestDeo.getQuantity());
			System.out.println(bestDeo.getCost());
			
		}
		DeoInfo[] suaveDeo = sd.getBestDeo();
		System.out.println("Suave Deodorants \n");
		for(int i=0; i<suaveDeo.length;i++)
		{
			DeoInfo bestDeo = suaveDeo[i];
			System.out.println(bestDeo.getName());
			System.out.println(bestDeo.getBrand());
			System.out.println(bestDeo.getFragrance());
			System.out.println(bestDeo.getGender());
			System.out.println(bestDeo.getCategory());
			System.out.println(bestDeo.getQuantity());
			System.out.println(bestDeo.getCost());
			
		}
		
	}
	
}