package com.cheaphook.factorymethod;

public class Client {

	public static void main(String[] args) {
Creator creator = new ConcreteCreator();
AbstractProduct product = creator.createProduct(ConcreteProduct1.class);

	}

}
