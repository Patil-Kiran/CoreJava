package com.tester;

import java.util.Arrays;
import java.util.Scanner;

import com.app.fruits.*;


public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit =false;
		System.out.println("Enter The Capacity Of Basket !!");
		Fruits[] capacity = new Fruits[sc.nextInt()];
		int counter = 0;
		
		while(!exit) {
			System.out.println("\n-------Menu----------\n1.Add Mango\n2.Add Orange\n3.Add Apple");
			System.out.println("4.Display Names\n5.Display Name,Color,Weight,Taste of all fruits");
			System.out.printf("6.Mark fruit stale\n7.Mark all fruits stale\n8.Invoke Functionality(Pulp/Juice/Jam)\n100.Exit.\n");
			
			switch (sc.nextInt()) {
			
			case  1: //Add Mango to Basket;
				if(counter<capacity.length) {
					capacity[counter++] = new Mango(sc.next(),sc.next(),sc.nextDouble());
					System.out.println("Mango Added To Basket !!");
					//System.out.println(Arrays.toString(capacity));
				}else {
					System.out.println("Basket is Full !!");
				}
				break;
				
			case 2: // Add Orange !!
				System.out.println(counter);
				if(counter<capacity.length) {
					capacity[counter++] = new Orange(sc.next(),sc.next(),sc.nextDouble());	
					System.out.println("Orange Added To Basket !!");
				}else {
					System.out.println("Basket is Full !!");
				}
				break;
				
			case 3:
				if(counter<capacity.length) {
					capacity[counter++] = new Apple(sc.next(),sc.next(),sc.nextDouble());
					System.out.println("Apple Added To Cart !!");
				}
				break;
			
			case 4:
				for(Fruits p:capacity) {
					if(p!=null) {
						System.out.println("Name Of Fruit : "+p.getName());
					}
				}
				
				break;
				
			case 5:
				for(Fruits p:capacity) {
					if(p!=null) {
						System.out.println("Name: "+p.getName()+", Color: "+p.getColor()+", Weight: "+p.getWeight()+", Taste: "+p.getTaste());
					}
				}
				
				break;
				
			case 6:
				System.out.println("Enter the index of fruit !!");
				int index = sc.nextInt() ;
				if(index<capacity.length) {
					if(capacity[index] !=null) {
						capacity[index].setFreshness(false);
						System.out.println("Fruit Marked as Stale !!");
					}
				}else{
					System.out.println("Index Out Of Bound !! -- Invalid Index");
					
				}
				break;

			case 7: // mark fruit as stale:
				System.out.println("Enter Number of Fruit Marked as Stale");
				int i=0;
				while(i<0) {
					if(capacity[i] !=null) {
						capacity[i].setFreshness(false);
						i++;
					}
				}
				
				break;
			case 8: // fruit specific functionality
				
				int indexing = sc.nextInt();
					if(indexing>=0 && indexing<capacity.length) {
						Fruits f1 = capacity[indexing];
						if(f1 instanceof Apple) {
							((Apple) f1).jam();
						}
						if(f1 instanceof Orange) {
							((Orange)f1).juice();
						}
						if(f1 instanceof Mango) {
							((Mango)f1).pulp();
						}
					}
				break;
				
			case 100:
				exit = true;
				System.out.println("-------------Good Bye---------------");
				break;

			default:
				break;
			}
		}
	}

}

/*
3.7 Create java application FruitBasket , with main method , as a tester
3.8 Prompt user for the basket size n create suitable data structure
3.9 Supply options
1. Add Mango
2. Add Orange
3. Add Apple
NOTE : You will be adding a fresh fruit in the basket , in all of above options.
4. Display names of all fruits in the basket.  ->> for each
5. Display name,color,weight , taste of all fresh fruits , in the basket. for each -->all instances 
6. Mark a fruit as stale
i/p : index 
o/p : error message (in case of invalid index) or mark it stale
7. Mark all sour fruits stale (optional)
8. Invoke fruit specific functionality (pulp / juice / jam)
i/p : index
Invoke correct functionality (pulp / juice / jam)

100. Exit 
 */
