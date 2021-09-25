import java.util.ArrayList;
public class AxeDeodorants {
ArrayList<DeoInfo> bestDeodorant;
public AxeDeodorants() {
	bestDeodorant= new ArrayList<DeoInfo>();

addDeo("APOLLO ALUMINUM-FREE DEODORANT FORMULA STICK", "AXE","Irresistible HD cedarwood & sage scent", "MALE", "48 hour protection",3.9, 5.48);
addDeo("DARK TEMPTATION ALUMINUM-FREE DEODORANT STICK", "AXE"," Scent of smooth dark chocolate in an HD scent", "UNISEX", "ANTI-PERSPIRANT",3.9, 6.49);
addDeo("PHOENIX DEODORANT BODY SPRAY", "AXE","Energizing high-definition scent of crushed mint & rosemary", "FEMALE", "0% ALCOHOL",4, 8.49);
addDeo("ESSENCE DEODORANT BODY SPRAY", "AXE","HD scent mix of spicy black pepper and warm cedarwood", "MALE", "ANTI-BACTERIAL",4, 7.46);

}
public void addDeo(String newName, String newBrand,String newFragrance, String newGender, String newCategory, double newQuantity,double newCost)
{
	DeoInfo deoInfo = new DeoInfo(newName, newBrand,newFragrance,newGender, newCategory, newQuantity,newCost);
	bestDeodorant.add(deoInfo);
}
public ArrayList<DeoInfo> getBestDeo(){
	return bestDeodorant;
}
}
