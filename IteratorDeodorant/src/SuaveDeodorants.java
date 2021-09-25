import java.util.Arrays;
public class SuaveDeodorants {
DeoInfo[] bestDeodorants;
int arrayValue=0;
public SuaveDeodorants() {
	bestDeodorants = new DeoInfo[4];
addDeo("Almond & Shea Butter Formulated without Aluminum Invisible Solid", "SUAVE","100% natural almond and shea butter", "FEMALE", "48 hour protection",4.3, 6.49);
addDeo("Sweet Pea & Violet Invisible Solid", "SUAVE","bright and flowery sweet pea deodorant stick", "UNISEX", "No Marks On Clothes",3.8, 5.47);
addDeo("Fresh Invisible Solid Deodorant Stick", "SUAVE","Enjoy that fresh-out-of-the-shower feeling all day long", "MALE", "0% ALCOHOL",3.9, 8.19);
addDeo("Everlasting Sunshine", "SUAVE","Sunshine Invisible Solid deodorant", "FEMALE", "No Dark Underarms",4, 7.46);

	
}
public void addDeo(String newName, String newBrand,String newFragrance, String newGender, String newCategory, double newQuantity,double newCost)
{
	DeoInfo deoInfo= new DeoInfo(newName,newBrand,newFragrance,newGender,newCategory,newQuantity,newCost);
	bestDeodorants[arrayValue]=deoInfo;
	arrayValue++;
}
public DeoInfo[] getBestDeo() {
	return bestDeodorants;
}
}
