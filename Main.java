package week12;

import java.util.List;

public class Main {
    public static void main(String[] args) {
    	
//    	Task1 part a
//        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
//        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
//        System.out.println(pekka);
//        System.out.println(esko);
        
//      Task 1 part b
//        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
//        System.out.println(olli);
//        System.out.println("credits " + olli.credits());
//        olli.study();
//        System.out.println("credits "+ olli.credits());
        
//      Task 1 part c
//        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
//        System.out.println(olli);
//        olli.study();
//        System.out.println(olli);
        
//      Task 1 part d
//        Teacher pekka = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
//        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
//        System.out.println(pekka);
//        System.out.println(esko);
// 
//        Student olli = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
//        for (int i = 0; i < 25; i++) {
//            olli.study();
//        }
//        System.out.println(olli); 
       
//    	Task 1 part e
//    	List<Person> people = new ArrayList<Person>();
//        people.add(new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200));
//        people.add(new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki"));
//
//        printDepartment(people);
    	
    	
    	
//    	Task 2 part a
//    	BulkTank tank = new BulkTank();
//    	tank.getFromTank(100);
//    	tank.addToTank(25);
//    	tank.getFromTank(5);
//    	System.out.println(tank);
//
//    	tank = new BulkTank(50);
//    	tank.addToTank(100);
//    	System.out.println(tank);

//		Task 2 part b
//    	Cow cow = new Cow();
//    	System.out.println(cow);
//    	 
//    	Alive livingCow = cow;
//    	livingCow.liveHour();
//    	livingCow.liveHour();
//    	livingCow.liveHour();
//    	livingCow.liveHour();
//    	 
//    	System.out.println(cow);
//    	 
//    	Milkable milkingCow = cow;
//    	milkingCow.milk();
//    	 
//    	System.out.println(cow);
//    	System.out.println("");
//    	 
//    	cow = new Cow("Ammu");
//    	System.out.println(cow);
//    	cow.liveHour();
//    	cow.liveHour();
//    	System.out.println(cow);
//    	cow.milk();
//    	System.out.println(cow);


    	
//    	Task 2 part c
//	  MilkingRobot milkingRobot = new MilkingRobot();
//	  Cow cow = new Cow();
//	  System.out.println("");
//
//	  BulkTank tank = new BulkTank();
//	  milkingRobot.setBulkTank(tank);
//	  System.out.println("Bulk tank: " + tank);
//
//	  for(int i = 0; i < 2; i++) {
//	      System.out.println(cow);
//	      System.out.println("Living..");
//	      for(int j = 0; j < 5; j++) {
//	          cow.liveHour();
//	      }
//	      System.out.println(cow);
//
//	      System.out.println("Milking...");
//	      milkingRobot.milk(cow);
//	      System.out.println("Bulk tank: " + tank);
//	      System.out.println("");
//	      }
    	
    	
    	
//    	Problem2 part d
//    	 Barn barn = new Barn(new BulkTank());
//    	 System.out.println("Barn: " + barn);
//    	 MilkingRobot robot = new MilkingRobot();
//    	 barn.installMilkingRobot(robot);
//    	 
//    	 Cow ammu = new Cow();
//    	 
//    	 ammu.liveHour();
//    	 ammu.liveHour();
//    	 barn.takeCareOf(ammu);
//    	 
//    	 System.out.println("Barn: " + barn);
//    	 LinkedList<Cow> cowList = new LinkedList<Cow>();
//    	 
//    	 cowList.add(ammu);
//    	 cowList.add(new Cow());
//    	 
//    	 for (Cow cow: cowList) {
//    		 cow.liveHour();
//   	      	cow.liveHour();
//   	  }
//    	 
//   	  barn.takeCareOf(cowList);
//    	  System.out.println("Barn: " + barn);
    	
    	
    	
    	
//    	Task 2 part e
//    	  Farm farm = new Farm("Esko", new Barn(new BulkTank()));
//    	  System.out.print(farm);
//    	  System.out.println(farm.getOwner() + " is a tough guy!");
//    	  System.out.println();
//    	
//    	  farm.addCow(new Cow());
//    	  farm.addCow(new Cow());
//    	  farm.addCow(new Cow());
//    	  System.out.println(farm);
//    	  System.out.println();
//
//   
//    	  farm.liveHour();
//    	  farm.liveHour();
//    	  System.out.println(farm);
    	
    	
//    	Task 4 part b
//    	MaxWeightBox coffeeBox = new MaxWeightBox(10); 
//    	coffeeBox.add(new Thing ("Saludo", 5));
//    	coffeeBox.add(new Thing("Pirkka", 5));
//    	coffeeBox.add(new Thing ("Kopi Luwak", 5));
//
//    	System.out.println(coffeeBox.isInTheBox (new Thing("Saludo")));
//    	System.out.println(coffeeBox.isInTheBox (new Thing("Pirkka")));
//    	System.out.println(coffeeBox.isInTheBox (new Thing("Kopi Luwak")));

    	
    	
    	
//    	Task 4 part c
    	OneThingBox box = new OneThingBox();
    	box.add(new Thing ("Saludo", 5)); box.add(new Thing ("Pirkka", 5));
    	System.out.println (box.isInTheBox (new Thing ("Saludo"))); System.out.println(box.isInTheBox (new Thing("Pirkka")));
    	
    	
    	BlackHoleBox box1 = new BlackHoleBox(); 
    	box1.add(new Thing("Saludo", 5)); 
    	box1.add(new Thing("Pirkka", 5));
    	System.out.println(box1.isInTheBox(new Thing("Saludo"))); 
    	System.out.println(box1.isInTheBox (new Thing ("Pirkka")));
    	
    }
    
    public static void printDepartment(List<Person> people) {
    	for (Person person : people) {
    	    System.out.println(person);
    	}

    }

}
