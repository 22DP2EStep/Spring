package rvt;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        

        return euros + "." + zero + cents + "e";
    }
    public Money plus(Money addition) {
        
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents); // create a new Money object that has the correct worth
    
        // return the new Money object
        return newMoney;
    }
    public Money minus(Money decreaser) {
        
        Money newMoney = new Money(this.euros - decreaser.euros, this.cents - decreaser.cents); // create a new Money object that has the correct worth
    
        // return the new Money object
        return newMoney;
    }
    public boolean lessThan(Money compared) {
        
        // create a new Money object that has the correct worth
        if (this.euros + this.cents < compared.euros + compared.cents){
            return true;
        } else {
            return false;
        }

        }
    


}
