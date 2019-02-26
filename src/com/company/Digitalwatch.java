package com.company;

public class Digitalwatch {
    private String name;
    private int price;
    protected String color; //protected mod;

    Digitalwatch(String name, String color, int price){ //default mod + constructor with parameters;

        if (name == "") { System.out.println("Name can't be empty! Enter valid name");}
        this.name = name;

        if (color == "") { System.out.println("Color can't be empty! Enter valid name");}
        else if (color == "Black" ) {System.out.println("It's too boring color :( ");}
        this.color = color;

        if (price<1) {System.out.println("Price can't be negative! Enter positive value.");}
        else if (price>50000) {{System.out.println("It's too expensive! Enter other price.");}}
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
        if (name == "") { System.out.println("Name can't be empty! Enter valid name");}
    }

    public void setColor(String color) {
        this.color = color;
        if (color == "") { System.out.println("Color can't be empty! Enter valid name");}
        else if (color == "Black" ) {System.out.println("It's too boring color :( ");}

    }

    public void setPrice(int price) {
        this.price = price;
        if (price<1) {System.out.println("Price can't be negative! Enter positive value.");}
        else if (price>50000) {{System.out.println("It's too expensive! Enter other price.");}}

    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public int getPrice() {
        return price;
    }



}
