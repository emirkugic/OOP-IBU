package week4;

public class Main2 {
	    public static void main(String[] args) {
	        LyyraCard cardPekka = new LyyraCard(20);
	        LyyraCard cardBrian = new LyyraCard(30);

	        cardPekka.payGourmet();
	        cardBrian.payEconomical();
	        System.out.println(cardPekka);
	        System.out.println(cardBrian);
	        cardPekka.loadMoney(20.0);
	        cardBrian.payGourmet();
	        System.out.println("pekkas card "+cardPekka);
	        System.out.println("brians card "+cardBrian);
	        cardPekka.payEconomical();
	        cardPekka.payEconomical();
	        cardBrian.loadMoney(50);
	        System.out.println("pekkas card"+cardPekka);
	        System.out.println("brians card "+cardBrian);
	    }
	}
