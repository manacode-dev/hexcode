package com.manacode_dev.hexcode;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Hexcode!");
		System.out.print("\nEnter your character name: ");
		String name = scanner.nextLine();

		Discipline chosenDiscipline;

		boolean finishedClassSelection = false;

		while (finishedClassSelection == false) {

			System.out.println("\nChoose your discipline by number: ");
			System.out.println("1. Ironveil");
			System.out.println("2. Hollowshot");
			System.out.println("3. Runeweaver");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1 -> chosenDiscipline = DisciplineFactory.createIronveil();
			case 2 -> chosenDiscipline = DisciplineFactory.createHollowshot();
			case 3 -> chosenDiscipline = DisciplineFactory.createRuneweaver();
			default -> {
				System.out.println("Invalid choice!");
				continue;
			}

			}

			Player player = new Player(name, chosenDiscipline);
			player.showPlayerClass();
			player.showStats();

			System.out.println("\nAre you satisfied with your class selection? (Y/N)");
			String classChoice = scanner.nextLine();

			switch (classChoice.toLowerCase()) {
			case "y" -> finishedClassSelection = true;
			case "n" -> {
                finishedClassSelection = false;
            }
			default -> System.out.println("\nInvalid Choice. Try again.");
			}

		}

		System.out.println("\nStart game? (Y/N)");
		String start = scanner.nextLine();

		if (start.equalsIgnoreCase("Y")) {
			System.out.println("\nLet the adventure begin!");
		} else {
			System.out.println("Character creation cancelled.");
		}

		scanner.close();
	}

}
