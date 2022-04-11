import java.lang.*;
import java.util.*;
import classes.*;
import file.*;

public class Start
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		FoodCourt fdc = new FoodCourt();
		TextFile txt = new TextFile();
		
		
		System.out.println("Food Court Management System");
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("you choose?\n");
			System.out.println("1. Employee Management");
			System.out.println("2. Restaurant Management");
			System.out.println("3. Restaurant FoodItem Management");
			System.out.println("4. FoodItem Quantity Add-Sell");
			System.out.println("5. Exit");

			System.out.print("I choose: ");
			int choice = scn.nextInt();
			
			switch(choice)
			{
				case 1:    
					System.out.println("choosen Employee Management");
					
					System.out.println("Choose any one Option from the followings\n");
					System.out.println("1. Insert New Employee");
					System.out.println("2. Search an Employee");
					System.out.println("3. Removing an Existing Employee");
					System.out.println("4. Show All Employees");
					System.out.println("5. Go Back");
					
					System.out.print("I choose: ");
					int option1 = scn.nextInt();
					
					switch(option1)
					{
						case 1:
		
							System.out.println("Insert New Employee");
							System.out.print("Enter Employee ID: ");
							String empId1 = scn.next();
							System.out.print("Enter Employee Name: ");
							String name1 = scn.next();
							System.out.print("Enter Employee Salary: ");
							double salary1 = scn.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							fdc.insertEmployee(e1);
							break;
							
						case 2:
					
							System.out.println("Search An Employee");
							System.out.print("Enter Employee ID: ");
							String empId2 = scn.next();
							
							Employee e2 = fdc.getEmployee(empId2);
							
							if(e2 !=null)
							{
								System.out.println();
								System.out.println("Employee ID: "+e2.getEmpId());
								System.out.println("Employee Name: "+e2.getName());
								System.out.println("Employee Salary: "+e2.getSalary());
								System.out.println();
							}
							break;
							
						case 3:
						
							System.out.println("Remove an Existing Employee");
							System.out.print("Enter Employee ID: ");
							String empId3 = scn.next();
							
							Employee e3 = fdc.getEmployee(empId3);
							
							if(e3 != null)
							{
								fdc.removeEmployee(e3);
							}
							break;
							
						case 4:
							System.out.println("Show All Employees");
							fdc.showAllEmployees();
							break;
							
						case 5:
							System.out.println("Going Back..");
							break;
							
						default:
							System.out.println("Invalid Option");
							break;
					}
					
					break;
					
				case 2:

					System.out.println("Choosen Restaurant Management");
					
					System.out.println("Choose any one Option from the followings\n");
					System.out.println("1. Insert New Restaurant");
					System.out.println("2. Search a Restaurant");
					System.out.println("3. Removing an Existing Restaurant");
					System.out.println("4. Show All Restaurant");
					System.out.println("5. Go Back\n");
					
					System.out.print("I choose: ");
					int option2 = scn.nextInt();
					
					switch(option2)
					{
						case 1:
							System.out.println("Insert New Restaurant");
							
							System.out.print("Enter Restaurant RID: ");
							String rid1 = scn.next();
							System.out.print("Enter Restaurant Name: ");
							String name1 = scn.next();
							
							Restaurant r1 = new Restaurant();
							r1.setRid(rid1);
							r1.setName(name1);
					        fdc.insertRestaurant(r1);
							break;
							
						case 2:
							System.out.println("Search A Restaurant");
							System.out.print("Enter Customer RID: ");
							String rid2 = scn.next();
							
							Restaurant r2 = fdc.getRestaurant(rid2);
							
							if(r2 !=null)
							{
								System.out.println();
								System.out.println("Restaurant RID: "+r2.getRid());
								System.out.println("Restaurant Name: "+r2.getName());
								r2.showAllFoodItems();
								System.out.println();
							}
							break;
							
						case 3:
							System.out.println("Remove an Existing Restaurant");
							System.out.print("Enter Customer EMPId: ");
							String rid3 = scn.next();
							
							Restaurant r3 = fdc.getRestaurant(rid3);
							
							if(r3 != null)
							{
								fdc.removeRestaurant(r3);
							}
							break;
							
						case 4:
							System.out.println("Show All Restaurants");
							fdc.showAllRestaurants();
							break;
							
						case 5:
							System.out.println("Going Back..");
							break;
							
						default:
							System.out.println("Invalid Option");
							break;
					}
					break;
					
				case 3:
					System.out.println("I choose Restaurant FoodItem Management");
					
					System.out.println("Choose any one Option from the followings\n");
					System.out.println("1. Insert New FoodItem");
					System.out.println("2. Search a FoodItem");
					System.out.println("3. Removing an Existing FoodItem");
					System.out.println("4. Show All FoodItem");
					System.out.println("5. Go Back\n");
					
					System.out.print("i choose: ");
					int option3 = scn.nextInt();
					
					switch(option3)
					{
						case 1:
							System.out.println("Insert New FoodItem for a Restaurant\n");
							
							FoodItem fi = null;
							
							System.out.println("Which type of FoodItem do you want to Create?\n");
							System.out.println("1. MainDish");
							System.out.println("2. Appetiziers");
							System.out.println("3. Go Back");
							
							System.out.print("Enter Type: ");
							int type = scn.nextInt();
							
							if(type == 1)
							{
								MainDish ma = new MainDish();
								
								System.out.print("Enter FoodItem Id: ");
								String fid1 = scn.next();
								System.out.print("Enter FoodItem Name: ");
								String fname1 = scn.next();
								System.out.print("Enter Avaiable FoodItem: ");
								int faq1 = scn.nextInt();
								System.out.print("Enter Food Price: ");
								double fp1 = scn.nextDouble();
								System.out.println("Enter MainDish Category");
								String cat = scn.next();
								
								ma.setFid(fid1);
								ma.setName(fname1);
								ma.setAvailableQuantity(faq1);
								ma.setPrice(fp1);
								ma.setCategry(cat);
								
								fi = ma;
								
							}
							else if(type == 2)
							{
								Appitizers ap = new Appitizers();
								
								System.out.print("Enter FoodItem Id: ");
								String fid2 = scn.next();
								System.out.print("Enter FoodItem Name: ");
								String fname2 = scn.next();
								System.out.print("Enter Avaiable FoodItem: ");
								int faq2 = scn.nextInt();
								System.out.print("Enter Food Price: ");
								double fp2 = scn.nextDouble();
								System.out.println("Enter Appetiziers Size");
								String si = scn.next();
								
								ap.setFid(fid2);
								ap.setName(fname2);
								ap.setAvailableQuantity(faq2);
								ap.setPrice(fp2);
								ap.setSize(si);
								
								fi = ap;
								
							}
							else if(type == 3)
							{
								System.out.println("Going Back..");
							}
							else
							{
								System.out.println("Invalid Type");
							}
							
							if(fi!= null)
							{
								System.out.print("Enter Restaurant RID: ");
								String rid11 = scn.next();
								fdc.getRestaurant(rid11).insertFoodItem(fi);
							}
							break;
							
						case 2:
							System.out.println("Get an FoodItem of a Restaurant\n");
							
							System.out.print("Enter Restaurant RID: ");
							String rid2 = scn.next();
							System.out.print("Enter Restaurant Name: ");
							String rname2 = scn.next();
							
							FoodItem fi2 = fdc.getRestaurant(rname2).getFoodItem(rid2);
							
							if(rid2 != null)
							{
								fi2.showInfo();
							}
							break;
							
						case 3:
							System.out.println("Remove an FoodItem of a Restaurant");
							
							System.out.print("Enter Restaurant RID: ");
							String rid3 = scn.next();
							System.out.print("Enter FoodItem FID: ");
							String fid3 = scn.next();
							
							fdc.getRestaurant(rid3).removeFoodItem(fdc.getRestaurant(rid3).getFoodItem(fid3));
							break;
						
						case 4: 
							System.out.println("Show All FoodItems of a Restaurant");
							
							System.out.print("Enter Restaurant RID: ");
							String rid4 = scn.next();
							
							fdc.getRestaurant(rid4).showAllFoodItems();
							break;
							
						case 5:
							System.out.println("Going Back..");
							break;
							
						default:
							System.out.println("Invalid Option");
							break;
					}
					break;
					
				case 4:
					System.out.println("choosen FoodItem Quantity Add-Sell");
					
					System.out.println("Choose any one Option from the followings\n");
					System.out.println("	1. Add FoodItem");
					System.out.println("	2. Remove FoodItem");
					System.out.println("	3. Show All FoodItem");
					System.out.println("	4. Go Back\n");
					
					System.out.print("i choose: ");
					int option4 = scn.nextInt();
					
					switch(option4)
					{
						case 1:
							System.out.println("Add FoodItem");
							System.out.print("Enter Restaurant RID: ");
							String rid1 = scn.next();
							System.out.print("Enter FoodItem Number: ");
							String fid1 = scn.next();
							System.out.print("Enter FoodItem Amount: ");
							int amount1 = scn.nextInt();
							
							if(amount1>0)
							{
								fdc.getRestaurant(rid1).getFoodItem(fid1).addQuantity(amount1);
								txt.writeInFile("$"+amount1+" has been added in FoodItem "+ fid1);
							}
							break;
							
						case 2:
							System.out.println("Remove FoodItem");
							System.out.print("Enter Restaurant RID: ");
							String rid2 = scn.next();
							System.out.print("Enter FoodItem Fid: ");
							String fid2 = scn.next();
							System.out.print("Enter remove FoodItem amount: ");
							int amount2 = scn.nextInt();
							
							if(amount2>0 && amount2<=fdc.getRestaurant(rid2).getFoodItem(fid2).getAvailableQuantity())
							{
								fdc.getRestaurant(rid2).getFoodItem(fid2).sellQuantity(amount2);
								txt.writeInFile("$"+amount2+" has been removed from FoodItem "+ fid2);
							}
							break;
						
						
						
						case 3:
							System.out.println("Show Add Sell History\n");
							txt.readFromFile();
							break;
							
						case 4:
							System.out.println("Going Back");
							break;
							
						default:
							System.out.println("Invalid Option");
							break;
						
					}
					break;
					
				case 5:
					System.out.println("choosen to Exit");
					repeat = false;
					break;
					
				default:
					System.out.println("Invalid Choice");
					break;
			} 
			
			
		}
		
		
	}
}
