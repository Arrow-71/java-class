
package coffeesalescalculator;


public class Calculator {
    
    final double pricePerPound = 5.99;
    final double taxRate = .0725;
    int numberOfBags;
    double weightPerBag;
    double totalPrice;
    double totalPriceWithTax;
    
    
    public  Calculator(){
        numberOfBags = 1;
        weightPerBag = 1;
    }
    
    public Calculator(int numBags, double weightOfBags){
        numberOfBags = numBags;
        weightPerBag = weightOfBags;
    }
    
    public double getSale(){
        totalPrice = weightPerBag * pricePerPound * numberOfBags;
        return Math.round(totalPrice * 100.0) / 100.0;
        
    }
    
    public double getSaleTax(){
        return Math.round((totalPrice * taxRate) * 100.0) / 100.0;
    }
    
    public double getTotalPrice(){
        totalPriceWithTax = (taxRate * totalPrice) 
                + totalPrice; 
        return Math.round(totalPriceWithTax * 100.0) / 100.0;
    }
    
    public double getPrice(){
        return pricePerPound;
    }
    
    public double getTaxRate(){
        return Math.round((100 * taxRate) * 100.0) / 100.0;
    }
}
