package classes;
import java.lang.*;


public class FoodCourt implements RestaurantOperations, EmployeeOperations{

	protected Restaurant restaurants[] = new Restaurant[100];
	protected Employee employees[] = new Employee[100];
	
	
	
	public void insertRestaurant(Restaurant r){

		boolean flag = false;
		
		for(int i=0; i<restaurants.length; i++){

			if(restaurants[i] == null){

				restaurants[i] = r;
				flag = true;
				break;
			}
		}
		if(flag) System.out.println("Restaurant Inserted");
		else System.out.println("Restaurant can Not be Inserted");
	}
	
	
	
	public void removeRestaurant(Restaurant r){

		boolean flag = false;

		for(int i=0; i<restaurants.length; i++){

			if(restaurants[i] == r){

				restaurants[i] = null;
				flag = true;
				break;
			}
		}
		if(flag) System.out.println("Restaurant Removed");
		else System.out.println("Restaurant can Not be Removed");
	}
	
	
	
	public Restaurant getRestaurant(String rid){
		
		Restaurant r = null;

		for(int i=0; i<restaurants.length; i++){

			if(restaurants[i] != null){

				if(restaurants[i].getRid().equals(rid)){

					r = restaurants[i];
					break;
				}
			}
		}
		return r;
	}
	
	
	
	public void showAllRestaurants(){

		for(Restaurant r : restaurants){

			if(r!= null){
				
				System.out.println("Restaurant rid: "+ r.getRid());
				System.out.println("Restaurant Name: "+ r.getName());
				r.showAllFoodItems();
				System.out.println();
			}
		}
	}
	
	
	
	public void insertEmployee(Employee e){

		boolean flag = false;
		
		for(int i=0; i<employees.length; i++){

			if(employees[i] == null){

				employees[i] = e;
				flag = true;
				break;
			}
		}
		if(flag) System.out.println("Employee Inserted");
		else System.out.println("Employee can Not be Inserted");
	}
	
	
	
	public void removeEmployee(Employee e){

		boolean flag = false;

		for(int i=0; i<employees.length; i++){

			if(employees[i] == e){

				employees[i] = null;
				flag = true;
				break;
			}
		}
		if(flag) System.out.println("Employee Removed");
		else System.out.println("Employee can Not be Removed");
	}
	
	
	public void showAllEmployees(){

		for(Employee e : employees){

			if(e!= null){

				System.out.println("Employee Name: "+ e.getName());
				System.out.println("Employee Id: "+ e.getEmpId());
				System.out.println("Salary: "+ e.getSalary());
				System.out.println();
			}
		}
	}
	
	
	
	public Employee getEmployee(String empId){

		Employee e = null;
		
		for(int i=0; i<employees.length; i++){

			if(employees[i] != null){

				if(employees[i].getEmpId().equals(empId)){
					
					e = employees[i];
					break;
				}
			}
		}
		return e;
	}
	
}
