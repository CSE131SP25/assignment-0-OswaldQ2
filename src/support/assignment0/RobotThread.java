package support.assignment0;


import java.awt.Color;

import assignment0.RobotInstructions;

public class RobotThread extends Thread {
	
	final private RobotMotionAdapter motion;
	final private RobotInstructions instr;
	private Color Color;
	public RobotThread(RobotMotionAdapter r, RobotInstructions instr) {
		this.motion = r;
		this.instr = instr;
	}
	
	public void run() {
		instr.act(motion, Color);
	}

}
