package Exercism;

import java.util.Scanner;

public class AnnalynsInfiltration {
	public static boolean canFastAttack(boolean knightIsAwake) {
		return (!knightIsAwake);
	}
	public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
		return (knightIsAwake||archerIsAwake||prisonerIsAwake);
	}

	public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
		return (prisonerIsAwake &&!archerIsAwake);
	}

	public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
		return (!knightIsAwake && !archerIsAwake && prisonerIsAwake)||(!archerIsAwake&&petDogIsPresent);
	}
	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		boolean knightIsAwake,archerIsAwake,prisonerIsAwake,petDogIsPresent;
		System.out.println("Enter the boolean input for knightIsAwake,archerIsAwake,prisonerIsAwake,petDogIsPresent");
		knightIsAwake=in.nextBoolean();
		archerIsAwake=in.nextBoolean();
		prisonerIsAwake=in.nextBoolean();
		petDogIsPresent=in.nextBoolean();
		System.out.println(canFastAttack(false));
		System.out.println(canSpy(true,false,true));
		System.out.println(canSignalPrisoner(false,true));
		System.out.println(canFreePrisoner(true,false,false,true));
	}
}
