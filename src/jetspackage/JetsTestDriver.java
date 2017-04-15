package jetspackage;

import java.util.Scanner;

public class JetsTestDriver {
	public static void main(String[] args) {
		Pilot a = new Pilot("Abigale");
		Pilot b = new Pilot("Bob");
		Pilot c = new Pilot("Christy");
		Pilot d = new Pilot("Daryl");
		Pilot e = new Pilot("Elaine");

		Pilot[] pilots = { a, b, c, d, e };

		Jet jet0 = new Jet("A320", 511.0, 3300, 98_000_000.0, a.getName());
		Jet jet1 = new Jet("B737-800", 543.0, 3115, 79_000_000.0, b.getName());
		Jet jet2 = new Jet("B777-300", 764.0, 7370, 320_000_000.0, c.getName());
		Jet jet3 = new Jet("HondaJet", 435.0, 1400, 4_500_000.0, d.getName());
		Jet jet4 = new Jet("A380-800", 646.0, 8_200, 404_000_000.0, e.getName());

		Jet[] jets = { jet0, jet1, jet2, jet3, jet4 };

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
				System.out.print("\nFastest is " + jets[0].toString());
				System.out.println("");
				break;

			case 3:
				i.findLongestRange(jets);
				System.out.print("\nBest Range is " + jets[0].toString());
				System.out.println("");
				break;

			case 4:
				Pilot p = new Pilot();
				jets = i.addNewJet(jets, p.getARandomPilot(pilots));
				break;

			case 5:
				System.out.println("\nGoodbye!");
				flag = false;
				break;
			}
		}

	}

	private static int runMenu() {

		System.out.println("\n**********************************");
		System.out.println("*     Jet Inventory Database     *");
		System.out.println("**********************************");
		System.out.println("\nEnter 1 to List Fleet");
		System.out.println("Enter 2 to View Fastest Jet");
		System.out.println("Enter 3 to View Jet With Longest Range");
		System.out.println("Enter 4 to Add New Jet To Fleet");
		System.out.println("Enter 5 to Quit");
		System.out.print(">>");

		Scanner kb = new Scanner(System.in);
		int menuChoice = kb.nextInt();
		return menuChoice;

	}

}
