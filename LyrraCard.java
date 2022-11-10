package lab4;

public class LyrraCard {

	private double balance;
	
	public LyrraCard(double balanceAtStart) {
		this.balance = balanceAtStart;
				}

	public String toString() {
		return "The card has " + this.balance + " euros";
		}
	
	
	 public void payEconomical() {
	        if(this.balance >= 2.50) {
	        	this.balance -= 2.50;
	        	}
	        } 

    public void payGourmet() {
        if(this.balance >= 4.00) {
        	this.balance -= 4.00;
        	}
        }
    
    public void loadMoney(double amount) {
        if(amount > 0) {
        	if((this.balance + amount) > 150) {
        		this.balance = 150;
        		} else {
        			this.balance += amount;
        		}
        	}
        }
    }

