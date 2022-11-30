package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean isExtraCheeseAdded;
    boolean isExtraToppingsAdded;
    boolean isTakeawayAdded;

    public Pizza(Boolean isVeg){
        isExtraCheeseAdded=false;
        isExtraToppingsAdded=false;
        isTakeawayAdded=false;
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true){
            this.price=300;
            //this.bill="Base Price Of The Pizza: 300\n";
        } else {
            this.price = 400;
            //this.bill = "Base Price Of The Pizza: 400\n";
        }
        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isExtraCheeseAdded==false) {
            this.price += 80;
            this.bill += "Extra Cheese Added: 80\n";
            isExtraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isExtraToppingsAdded==false) {
            if (this.isVeg == true) {
                this.price += 70;
                this.bill += "Extra Toppings Added: 70\n";
            } else {
                this.price += 120;
                this.bill += "Extra Toppings Added: 120\n";
            }
            isExtraToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeawayAdded==false) {
            this.price += 20;
            this.bill += "Paperbag Added: 20\n";
            isTakeawayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill+="Total Price: "+this.price+"\n";
        return this.bill;
    }
}
