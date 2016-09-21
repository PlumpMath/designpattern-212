package com.cheaphook.factorymethod;

public class ConcreteCreator extends Creator {

	@Override
	public <T extends AbstractProduct> T createProduct(Class<T> c) {
		AbstractProduct product = null;
		try{
			product = (AbstractProduct)Class.forName(c.getName()).newInstance();
		}catch(Exception e)
		{
			
		}
		return (T)product;
	}

}
