package support.assignment0;

import java.awt.Color;

import assignment0.RobotInstructions;
import support.robot.RobotModel;
import support.robot.Robot;

/*
 * Translate robotic motions like forward and turn
 *   into actions on a RobotModel
 *   snaps to nearest 45 degree angle
 */

public class RobotMotionAdapter {
	
	private RobotModel model;

	public RobotMotionAdapter(RobotModel model) {
		this.model = model;
	}
	
	public void forward(int pixels) {
		Vector oldVelocity = model.getVelocity();
//		Vector newVelocity = oldVelocity.scale(pixels);
// BSIEVER: Updated for proper scaling
		Vector newVelocity = oldVelocity.scale(pixels/oldVelocity.magnitude());

		model.setVelocity(newVelocity);
		model.step();
	}
	
	public void back(int pixels) {
		Vector oldVelocity = model.getVelocity();
//		Vector newVelocity = oldVelocity.scale(pixels);
// BSIEVER: Updated for proper scaling
		Vector newVelocity = oldVelocity.scale(-pixels/oldVelocity.magnitude());

		model.setVelocity(newVelocity);
		model.step();
	}
	
	public void turnRight(int degrees) {
		turnLeft(-degrees);
	}

// This is me screwing around creating a new command where you can input a value. 
// Now to find a way to do this with colors
	
	public void turnLeft(int degrees) {
		Vector oldVelocity = model.getVelocity();
		double angle = oldVelocity.getAngle();
		
			
		
		Vector newVelocity = Vector.getUnitVector((int)(angle - degrees));
// BSIEVER: Removed the "snap" to increments of 90 degrees
//		model.setVelocity(newVelocity.snapTo());
		model.setVelocity(newVelocity);
	}

}
