package assignment0;

import java.awt.Color;

import support.assignment0.RobotMotionAdapter;

public class RobotInstructions  {
	
	/*
	 * Below you see a method called "act".
	 * It has one parameter, called "support.robot".
	 * For now, the way in which the code below fits into what you see on
	 * the screen will seem mysterious.  That's OK.
	 * 
	 * For now, please accept that the instructions below cause the support.robot to
	 * move forward, turn left, or turn right.
	 */	
	
	public void act(RobotMotionAdapter robot, Color color) {
		
		/**
		 * Each of the following lines of code executes in turn.  The
		 * first line causes the support.robot to move forward 60 "pixels".  A pixel is
		 * a measurement of distance on a computer screen.
		 * 
		 * The second line causes the support.robot to turn left.  Based on what you see,
		 * what does "90" represent?
		 * 
		 * Run the program as instructed in the lab write-up and observe how the support.robot
		 * moves in response to the code you see below.
		 * 
		 * You will add instructions at the end of the code to cause the support.robot to move
		 * as you desire.
		 */
		robot.forward(500);
		robot.turnRight(90);
		robot.forward(100);
		robot.turnRight(180);
		robot.forward(100);
		robot.turnLeft(90);
		robot.forward(500);
		robot.turnLeft(90);
		robot.forward(100);
		//C is done
		robot.turnLeft(180);
		robot.forward(100);
		robot.turnLeft(90);
		robot.forward(40);
		robot.turnLeft(90);
		robot.forward(200);
		robot.turnLeft(90);
		robot.forward(40);
		//Starting work on the "S"
		robot.turnRight(90);
		robot.forward(100);
		robot.turnLeft(90);
		robot.forward(250);
		robot.turnLeft(90);
		robot.forward(100);
		robot.turnRight(90);
		robot.forward(250);
		robot.turnRight(90);
		robot.forward(100);
		//S is done
		robot.turnLeft(180);
		robot.forward(100);
		robot.turnRight(90);
		robot.forward(40);
		robot.turnRight(90);
		robot.forward(200);
		robot.turnRight(90);
		robot.forward(40);
		//Starting work on the E
		robot.turnLeft(90);
		robot.forward(100);
		robot.back(100);
		robot.turnLeft(90);
		robot.forward(250);
		robot.turnLeft(90);
		robot.forward(100);
		robot.back(100);
		robot.turnLeft(90);
		robot.forward(250);
		robot.turnLeft(90);
		robot.forward(100);
		robot.back(100);
		//E is done
		robot.turnLeft(90);
		robot.forward(40);
		robot.turnLeft(90);
		robot.forward(200);
		robot.turnLeft(90);
		robot.forward(40);
		//Starting work on the first 1
		robot.forward(500);
		robot.turnLeft(135);
		robot.forward(100);
		robot.back(100);
		robot.turnLeft(45);
		//1 is done
		robot.forward(40);
		robot.turnRight(90);
		robot.forward(100);
		robot.turnRight(90);
		robot.forward(40);
		//Starting work on the 3
		robot.turnLeft(90);
		robot.forward(100);
		robot.turnRight(90);
		robot.forward(250);
		robot.turnRight(90);
		robot.forward(100);
		robot.back(100);
		robot.turnRight(90);
		robot.forward(250);
		robot.turnRight(90);
		robot.forward(100);
		robot.back(100);
		//3 is done
		robot.turnRight(90);
		robot.forward(40);
		robot.turnLeft(90);
		robot.forward(100);
		robot.turnLeft(90);
		robot.forward(40);
		//Starting work on the second 1
		robot.forward(500);
		robot.turnLeft(135);
		robot.forward(100);
		robot.back(100);
		robot.turnLeft(45);
	}

}