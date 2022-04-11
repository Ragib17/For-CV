package classes ;

import java.lang.*;


public abstract class FoodItem implements IQuantity{
	protected String fid ;
	protected String name ;
	protected int availableQuantity ;
	protected double price ;


	public void setFid(String fid){this.fid = fid ; }
	public void setName(String name){this.name = name ;}
	public void setAvailableQuantity(int availableQuantity){this.availableQuantity = availableQuantity ; }
	public void setPrice(double price){this.price = price ; }

	public String getFid(){return fid ; }
	public String getName(){return name ; }
	public int getAvailableQuantity(){return availableQuantity ;}
	public double getPrice(){return price ;}

	public abstract void showInfo() ;

	public void addQuantity(int amount){
		if(amount > 0){
			System.out.print("Available FoodItem Before : " + availableQuantity) ;
			System.out.print("Amount of Adding FoodItem : " + amount ) ;

			availableQuantity += amount ;

			System.out.print("Abailable FoodItem Now : " + availableQuantity ) ;
		}

		else{
			System.out.print("You have to Add FoodItem and so amount must be positive.");
		}
	}


	public void sellQuantity(int amount){
		if(amount > 0 && amount <= availableQuantity){
			System.out.print("Previous Amount for Sell : " + availableQuantity);
			System.out.print("Order for Sell : " + amount) ;

			availableQuantity -= amount ;

			System.out.print("Amount for Sell Now : " + availableQuantity ) ;
		}
	}
}