public class DeoInfo {

String brand,name,fragrance,gender,category;
double quantity;
double cost;

public DeoInfo(String newName, String newBrand,String newFragrance, String newGender, String newCategory, double newQuantity,double newCost)
{
	
	name = newName;
	brand = newBrand;
	fragrance = newFragrance;
	gender = newGender;
	category = newCategory;
	quantity = newQuantity;
	cost = newCost;

}
public String getName() {return name;}
public String getBrand() {return brand;}
public String getFragrance() {return fragrance;}
public String getGender() {return gender;}
public String getCategory() {return category;}
public double getQuantity() {return quantity;}
public double getCost() {return cost;}

}
