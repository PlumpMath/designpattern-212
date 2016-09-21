package com.cheaphook.abstractfactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanFactory femaleFactory = new FemaleFactory();
		HumanFactory maleFactory = new MaleFactory();
		femaleFactory.createBlackHuman();
		femaleFactory.createWhiteHuman();
		femaleFactory.createYellowHuman();
		maleFactory.createBlackHuman();
	}

}
