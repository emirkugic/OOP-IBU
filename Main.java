package week5;

public class Main {
    public static void main(String[] args) {
    	//Task 1
//    	Team barcelona = new Team("FC Barcelona");
//    	System.out.println("Team: " + barcelona.getName());
    	
    	//Task 2
//    	Player brian = new Player("Brian");
//        System.out.println("Player: " + brian);
// 
//        Player pekka = new Player("Pekka", 39);
//        System.out.println("Player: " + pekka);
        
        //Task 3
//        barcelona.addPlayer(brian);
//        barcelona.addPlayer(pekka);
//        barcelona.addPlayer(new Player("Mikael", 1));
// 
//        barcelona.printPlayers();*
        
        //Task 4 
//    	 Team barcelona = new Team("FC Barcelona");
//         barcelona.setMaxSize(1);
//  
//         Player brian = new Player("Brian");
//         Player pekka = new Player("Pekka", 39);
//         barcelona.addPlayer(brian);
//         barcelona.addPlayer(pekka);
//         barcelona.addPlayer(new Player("Mikael", 1)); 
//         
//         System.out.println("Number of players: " + barcelona.size());
         
        //Task 5
    	Team barcelona = new Team("FC Barcelona");
    	 
        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); 
 
        System.out.println("Total goals: " + barcelona.goals());

    }
}