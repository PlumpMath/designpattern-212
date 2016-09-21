package com.cheaphook.factorymethod;

public abstract class Creator {
	public abstract <T extends AbstractProduct> T createProduct(Class<T> c);
}
