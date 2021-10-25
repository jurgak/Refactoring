package com.company;

public class INGREDIENTS {

    String drinkType;
    Integer drinkPrice;

    public INGREDIENTS(String drinkType, Integer drinkPrice) {
        this.drinkType = drinkType;
        this.drinkPrice = drinkPrice;
    }

    public static void main (String[] args)  {
        INGREDIENTS beer = new INGREDIENTS ("beer Hansa", 74);
        INGREDIENTS cider1 = new INGREDIENTS ("cider Grans", 103);
        INGREDIENTS cider2 = new INGREDIENTS ("cider Strongbow", 110);
        INGREDIENTS rum = new INGREDIENTS ("Bacardi", 65);
        INGREDIENTS gin = new INGREDIENTS ("gin", 85);
        INGREDIENTS greenStuff = new INGREDIENTS ("lime", 10);
        INGREDIENTS limonade = new INGREDIENTS ("tonic water", 20);

    }

    public ginTonicPrice () {
        int ginTonicPrice =  ;
    }

}
