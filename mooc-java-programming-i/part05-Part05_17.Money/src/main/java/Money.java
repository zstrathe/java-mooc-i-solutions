
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros();
        int newCents = this.cents + addition.cents();
        if (newCents > 100) {
            int addEuros = newCents / 100;
            int tmpNewCents = newCents % 100;
            newEuros += addEuros;
            newCents = tmpNewCents;
        }
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } 
        
        if (this.euros > compared.euros) {
            return false;
        }
        

        if (this.cents < compared.cents) {
            return true;
        }
        
        if (this.cents > compared.cents) {
            return false;
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
        int thisCents = this.euros * 100 + this.cents;
        int decreaseCents = decreaser.euros * 100 + decreaser.cents;
        int newCents = thisCents - decreaseCents;
        if (newCents <= 0) {
            Money outVal = new Money(0,0);
            return outVal;
        } else {
            int outEuros = newCents / 100;
            int outCents = newCents % 100;
            Money outVal = new Money(outEuros, outCents);
            return outVal;
        }
    }

}
