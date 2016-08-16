package BaseballPackage;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class BaseballAverageSluggingTool {

	public static void main(String[] args) {

		int c = 0;
		int b = 0;
		int atBats = 0;
		int totalBases = 0;
		int thisAtBatsBases = 0;
		int recordedHitOrNot = 0;
		int sumAtBatsBases = 0;
		float sluggingPercent = 0.000f;
		float battingAverage = 0.000f;

		boolean validTotalBases = false;
		String batterName = null;
		ArrayList<Integer> aLatBats = new ArrayList<Integer>();
		ArrayList<Integer> hitOrNot = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		System.out.println("***Welcome to the baseball average and slugging machine***");
		System.out.println();
		System.out.println("Please enter in the name of your batter?");
		batterName = sc.nextLine();

		System.out.println("How many at bats did " + batterName + " take?");
		String atBatsAsString = sc.nextLine();
		atBats = Integer.parseInt(atBatsAsString);

		for (int i = 0; i < atBats; i++) {

			do {
				System.out.println("What number of bases did " + batterName + " get in the at bat " + (i + 1) + "?");
				String stringOfBases = sc.nextLine();

				thisAtBatsBases = Integer.parseInt(stringOfBases);

			} while (thisAtBatsBases < 0 || thisAtBatsBases > 4);

			aLatBats.add(thisAtBatsBases);

			sumAtBatsBases += aLatBats.get(i);

			b = aLatBats.get(i);
			;
			if (b == 0) {
				c++;
			}

		}

		battingAverage = ((float) (atBats - c++)) / ((float) (atBats));
		sluggingPercent = (float) sumAtBatsBases / (float) atBats;
		DecimalFormat numberFormat = new DecimalFormat("#.000");

		System.out.println();
		System.out.println("Player Name: " + batterName);
		System.out.println("Total At Bats: " + atBats);
		System.out.println("Total Hits: " + (atBats - c++));
		System.out.println("Total Bases: " + sumAtBatsBases);
		System.out.println("Batting Avg: " + numberFormat.format(battingAverage));
		System.out.println("Slugging Pct: " + numberFormat.format(sluggingPercent));
		;

	}
}