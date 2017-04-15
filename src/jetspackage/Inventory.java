package jetspackage;

import java.util.Scanner;

public class Inventory {

	public Jet[] findLongestRange(Jet[] jets) {
		int j;
		boolean flag = true;
		Jet temp = new Jet();

		while (flag) {
			flag = false;
			for (j = 0; j < jets.length - 1; j++) {
				if (jets[j].getRange() < jets[j + 1].getRange()) {
					temp = jets[j];
					jets[j] = jets[j + 1];
					jets[j + 1] = temp;
					flag = true;
				}
			}
		}
		return jets;
	}

	public Jet[] findFastest(Jet[] jets) {
		int j;
		boolean flag = true;
		Jet temp = new Jet();

		while (flag) {
			flag = false;
			for (j = 0; j < jets.length - 1; j++) {
				if (jets[j].getSpeed() < jets[j + 1].getSpeed()) {
					temp = jets[j];
					jets[j] = jets[j + 1];
					jets[j + 1] = temp;
					flag = true;
				}
			}
		}
		return jets;
	}

	public Jet[] addNewJet(Jet[] jets, String pilot) {
		System.out.print("\n\nEnter aircraft model>> ");
		Scanner kb = new Scanner(System.in);
		String model = kb.nextLine();
		System.out.print("\n\nEnter aircraft speed in mph>> ");
		double speed = kb.nextInt();
		System.out.print("\n\nEnter aircraft range in NM>> ");
		int range = kb.nextInt();
		System.out.print("\n\nEnter aircraft price in millions, no commas but underscores are ok (e.g. 1_000_000)>> ");
		double price = kb.nextDouble();
		Jet new1 = new Jet(model, speed, range, price, pilot);
		Jet[] temp = new Jet[jets.length + 1];
		for (int i = 0; i < temp.length - 1; i++) {
			temp[i] = jets[i];
		}
		temp[temp.length - 1] = new1;
		jets = temp;
		System.out.println();
		return jets;
	}

}
