package classes ;

import java.lang.* ;

public class Appitizers extends FoodItem{
	String size ;

	public void setSize(String size){this.size = size ;}
	public String getSize(){return size;}

	public void showInfo(){
		System.out.print("Food Fid : " + fid);
		System.out.print("Food Name : " + name);
		System.out.print("Available Food Quantity : " + availableQuantity ) ;
		System.out.print("Price : " + price ) ;
		System.out.print("Size : " + size ) ;
	}
}