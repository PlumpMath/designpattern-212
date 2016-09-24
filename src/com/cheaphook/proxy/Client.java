package com.cheaphook.proxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject proxy = new ProxySubject(new RealSubject());
		proxy.doSomething();
	}

}
