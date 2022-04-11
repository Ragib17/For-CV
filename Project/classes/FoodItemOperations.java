package classes ;

import java.lang.*;

public interface FoodItemOperations{
	void insertFoodItem(FoodItem f) ;
	void removeFoodItem(FoodItem f) ;
	FoodItem getFoodItem(String fid) ;
	void showAllFoodItems() ;
}