package com.practice.project.four;

public class TestMain {
/*c抽象类接口
 * 
 * 
 * 
 * 
 * 
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoSomeThing playerOne=new Player("运动员", "篮球");
		playerOne.studyEnglish();
		DoSomeThing playerTwo=new Player("运动员", "乒乓球");
		playerTwo.studyEnglish();
		DoSomeThing trainerOne=new Trainer("教练", "篮球");
		trainerOne.studyEnglish();
		DoSomeThing traineTwo=new Trainer("教练", "乒乓球");
		traineTwo.studyEnglish();
	}

}
