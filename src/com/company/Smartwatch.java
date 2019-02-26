package com.company;

import java.sql.SQLOutput;

public class Smartwatch {
   private String name;
   private int memory;
   private int price;
   protected String color; //protected mod;

   Smartwatch(){}

   public Smartwatch(String name, int price){
      this.name = name;
      this.price = price;
   }

   Smartwatch(String name, String color, int memory, int price){
      this.name = name;
      this.color = color;
      this.memory = memory;
      this.price = price;
   }

   public void message(){
      System.out.println("Suma na vashomu rahunku nedostatnia. Bud laska popovnit rahunok!");
   }

   protected void ring(){
      System.out.println("'Hello, it's me. I was wondering if after all these years you'd like to meet...'");
   }

   public String getName() {
      return name;
   }

   public String getColor() {
      return color;
   }

   public int getMemory() {
      return memory;
   }

   public int getPrice() {
      return price;
   }

   public void setName(String name) {
      if (name != "") {this.name = name;}
      else { System.out.println("Name can't be empty! Enter valid name.");}
   }

   public void setColor(String color) {
      if (color != "") {this.color = color;}
      else {System.out.println("Color can't be empty! Enter valid color.");}
   }

   public void setMemory(int memory) {
      if (memory > 0) {this.memory = memory;}
      else {System.out.println("Memory can't be <0! Enter valid memory.");}
   }

   public void setPrice(int price) {
      if (price > 0) {this.price = price;}
      else {System.out.println("Price can't be <0! Enter valid price.");}
   }
}
