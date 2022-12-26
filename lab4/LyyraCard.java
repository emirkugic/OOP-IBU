package week4;

public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return("the card has " + this.balance+" euros");
    }
        
    public void payEconomical() {

    	if(this.balance >= 2.5) {
    		this.balance -= 2.50;
    	}
    }
    public void payGourmet() {
    	
    	if(this.balance >= 4) {
    		this.balance -= 4.0;
    	}
	
    }
	public void loadMoney(double amount) {
		
	    if (this.balance>0) {
	    	if (this.balance + amount>150) {
	    		this.balance = 150.00;
	    	}else { 
	    		this.balance += amount;
	    	}
	    	
	    }
	    
	}
	
}
