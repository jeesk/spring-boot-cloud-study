package com.shanjiancaofu.designmode.设计模式相关._2工厂模式.factoryMethod;

public class BenzFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Benz();
	}

}
