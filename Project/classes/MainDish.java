package classes ;

import java.lang.*;


public class MainDish extends FoodItem{
	private String category ;

	public void setCategry(String category){this.category = category ;}
	public String getCategory(){return category ;}

	public void showInfo(){
		System.out.print("Food Fid : " + fid);
		System.out.print("Food Name : " + name);
		System.out.print("Available Food Quantity : " + availableQuantity ) ;
		System.out.print("Price : " + price ) ;
		System.out.print("Category : " + category ) ;
	}
}