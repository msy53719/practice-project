package com.practice.project.four;

public class TestMain {
	/*
	 * 抽象类和接口
	 * 抽象类可以有默认实现方法，接口完全是抽象方法
	 * 抽象类通过extends提供继承，接口通过implements来实现，必须实现所有方法，
	 * 抽象类只支持单一继承，接口可以多重继承，一个类可以实现多个接口
	 * 抽象类可以有构造器，接口没用构造器
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {

		DoThings p = new Person();
		p.eating();
		p.wroking();
		p.sleeping();

		DoThings pig = new Pig();
		pig.eating();
		pig.sleeping();
		DoThings rob = new Robot();
		rob.wroking();
		rob.eating();

		DoSomeThing playerOne = new Player("运动员", "篮球");
		playerOne.studyEnglish();
		DoSomeThing playerTwo = new Player("运动员", "乒乓球");
		playerTwo.studyEnglish();
		DoSomeThing trainerOne = new Trainer("教练", "篮球");
		trainerOne.studyEnglish();
		DoSomeThing traineTwo = new Trainer("教练", "乒乓球");
		traineTwo.studyEnglish();
	}

}
