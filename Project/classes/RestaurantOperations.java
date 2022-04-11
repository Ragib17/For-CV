package classes ;

import java.lang.*;


public interface RestaurantOperations{
	void insertRestaurant(Restaurant r) ;
	void removeRestaurant(Restaurant r) ;
	Restaurant getRestaurant(String rid) ;
	void showAllRestaurants() ;
}