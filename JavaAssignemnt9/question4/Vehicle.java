package Polymorphism.question4;

public abstract class Vehicle {
  String name;
  String color;
  double price;
  
  public Vehicle(String name,String color,double price){
	  this.name=name;
	  this.color=color;
	  this.price=price;
  }
  abstract void start();
  abstract void stop();
  
  void getVehicleDetails() {
	  System.out.println("\nVehicle Details : \n\n Vehicle Name = "+name+" \n Color = "+color+"\n Price = "+price+"\n");
  }
}
