package jetspackage;

import java.util.Scanner;

public class JetsTestDriver {
	public static void main(String[] args) {
		
		Jet jet0 = new Jet("Airbus A320", 511.0, 3300, 98_000_000);
		Jet jet1 = new Jet("Boeing 737-800", 543.0, 3115, 79_000_000);
		Jet jet2 = new Jet("Boeing 777-300ER", 764.0, 7370, 320_000_000);
		Jet jet3 = new Jet("Honda HondaJet", 435.0, 1400, 4_500_000);
		Jet jet4 = new Jet("Airbus A380-800", 646.0, 8_200, 404_000_000);
		
		Jet[] jets = {jet0, jet1, jet2, jet3, jet4};
		
		boolean flag = true;
		while (flag) {
		
			int menuChoice = runMenu();
			
			Inventory i = new Inventory();
			
			switch (menuChoice) {
		
			case 1:	
				for (Jet jet : jets) {
					System.out.println(jet.toString());
				}
				break;
			
			case 2:
				i.findFastest(jets);
				System.out.println("\nFastest jet currently in inventory: " + jets[0].toString());
				break;
		
			case 3:
				i.findLongestRange(jets);
				System.out.println("\nJet with longest range currently in inventory: " + jets[0].toString());
				break;
		
			case 4:
				jets = i.addNewJet(jets);
				break;
			
			case 5:
				System.out.println("\nGoodbye!");
				flag = false;
				break;		
			}
		}



		
//		String [][] jets = 
//			{{"Airbus A380-800", "646", "8_200", "404_000_000.00"},
//			{"Boeing 737-800", "543", "3,115", "79_000_000.00"},
//			{"Boeing 777-300ER", "564", "7,370", "320_000_000.00",},
//			{"Honda HondaJet", "435", "1,400", "4_500_000"},
//			{"Airbus A320", "511", "3,300", "98_000_000"}};
		
//		for (int row = 0; row < jets.length; row++) {
//			for (int col = 0; col < jets[row].length; col++) {
//				System.out.print(jets[row][col].toString() + "\t\t");
//			}
//			System.out.println("");
//		}
		
		
//		String[][] temp1 = new String [jets.length + 1][4];
//		for (int i = 0; i < temp1.length - 1; i++){
//			temp1[i] = jets[i];
//		}
//		
//		String[] addnew = {"Airbus XXXX", "511", "3,300", "98_000_000"};
//		temp1[temp1.length - 1] = addnew;
//		
//		for (int row = 0; row < temp1.length; row++) {
//			for (int col = 0; col < jets.length - 1; col++) {
//				System.out.print(temp1[row][col].toString() + "\t\t");
//			}
//			System.out.println("");
//		}
	}

	private static int runMenu() {
		
		System.out.println("\n**********************************");
		System.out.println("*     Jet Inventory Database     *");
		System.out.println("**********************************");
		System.out.println("\n\tEnter 1 to List Fleet");
		System.out.println("\tEnter 2 to View Fastest Jet");
		System.out.println("\tEnter 3 to View Jet With Longest Range");
		System.out.println("\tEnter 4 to Add New Jet To Fleet");
		System.out.println("\tEnter 5 to Quit");
		System.out.print("\t>>" );
		
		Scanner kb = new Scanner(System.in);
		int menuChoice = kb.nextInt();
		return menuChoice;
		
	}

}

		

		
