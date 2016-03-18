package com.rent.car;
import java.util.Scanner;
public class RentCar {
	public static void print1(TruckCar car){
		System.out.println("You have chosen the "+car.name);
		System.out.println("How many cars dou you want?");
		Scanner input3=new Scanner(System.in);
		int b=input3.nextInt();
		System.out.println("You have chosen "+b+" cars");
		System.out.println("The rental fee is "+car.price*b);
		System.out.println("The GoodsCapacity "+car.GoodsCapacity*b);
	}
	public static void print2(PassengerCar car){
		System.out.println("You have chosen the "+car.name);
		System.out.println("How many cars dou you want?");
		Scanner input3=new Scanner(System.in);
		int b=input3.nextInt();
		System.out.println("You have chosen "+b+" cars");
		System.out.println("The rental fee is "+car.price*b);
		System.out.println("The  PassengerCapacity is "+car.PassengerCapacity*b);
	}
	public static void print3(PickupCar car){
		System.out.println("You have chosen the "+car.name);
		System.out.println("How many cars dou you want?");
		Scanner input3=new Scanner(System.in);
		int b=input3.nextInt();
		System.out.println("You have chosen "+b+" cars");
		System.out.println("The rental fee is "+car.price*b);
		System.out.println("The GoodsCapaticy is "+car.GoodsCapacity*b);
		System.out.println("The PassengerCapacity is "+car.PassengerCapacity*b);
	}
	public static void main(String []args){
		System.out.println("Are you going to rent a car? (Enter Yes or No)");
		Scanner input1=new Scanner(System.in);
		if("Yes".equals(input1.next()))
		{
			

			System.out.println("What kind of cars do you want? Please enter the number front the car!");
			System.out.println("Carname              price       PassengerCapacity       GoodsCapacity ");
			System.out.println("1.BigTruckCar          8                  *                      1000 ");
			System.out.println("2.SmallTruckCar        4                  *                      500");
			System.out.println("3.HeavyPassengerCar    30                 6                      *");
			System.out.println("4.LightPassengerCar    15                 3                      *");
			System.out.println("5.PickupCar            30                 4                      300");
			Scanner input2=new Scanner(System.in);
			int a=input2.nextInt();
			if(a==1){
				TruckCar car =new BigTruckCar();
				print1(car);
			}
			if(a==2){
				TruckCar car=new SmallTruckCar();
				print1(car);
			}
			if(a==3){
				PassengerCar  car =new LightPassengerCar();
				print2(car);
			}
			if(a==4){
				PassengerCar car=new HeavyPassengerCar();
				print2(car);
			}
			if(a==5){
				PickupCar car =new PickupCar();
				print3(car);
			}
		
		}
		
	}
}
