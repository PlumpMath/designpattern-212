package com.cheaphook.proxy;

public class ProxySubject extends Subject {

	private Subject subject = null;
	
	public ProxySubject(Subject subject)
	{
		this.subject = subject;
	}
	
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		this.subject.doSomething();
	}

}
