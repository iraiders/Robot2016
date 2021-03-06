package org.usfirst.frc.team2713.robot.subsystems.lights;

import org.usfirst.frc.team2713.robot.RobotMap;
import org.usfirst.frc.team2713.robot.subsystems.BaseSubsystem;

import edu.wpi.first.wpilibj.DigitalOutput;

public class LightSubsystem extends BaseSubsystem {

	public DigitalOutput red;
	public DigitalOutput green;
	public DigitalOutput blue;
	
	public LightSubsystem() {
		red = new DigitalOutput(RobotMap.RED_DIO_PORT);
		green = new DigitalOutput(RobotMap.GREEN_DIO_PORT);
		blue = new DigitalOutput(RobotMap.BLUE_DIO_PORT);
	}

	public void setColor(Color color) {
		red.set(color.getRed() > 0);
		blue.set(color.getBlue() > 0);
		green.set(color.getGreen() > 0);
	}

	@Override
	protected void initDefaultCommand() {
	}

	// Java on the RoboRIO apparently doesn't have this class in AWT.
	public static class Color {
		// I'm sorry there is a large block of fields. (I'm really not)
		public static final Color BLACK = new Color(0, 0, 0);
		public static final Color DARK_GRAY = new Color(64, 64, 64);
		public static final Color GRAY = new Color(128, 128, 128);
		public static final Color LIGHT_GRAY = new Color(192, 192, 192);
		public static final Color WHITE = new Color(255, 255, 255);
		
		public static final Color RED = new Color(255, 0, 0);
		public static final Color GREEN = new Color(0, 255, 0);
		public static final Color BLUE = new Color(0, 0, 255);
		
		public static final Color CYAN = new Color(0, 255, 255);
		public static final Color MAGENTA = new Color(255, 0, 255);
		public static final Color YELLOW = new Color(255, 255, 0);
		
		public static final Color PINK = new Color(255, 175, 175);
		public static final Color ORANGE = new Color(255, 165, 0);
		
		private int r, g, b;

		public Color(int r, int g, int b) {
			this.r = r;
			this.g = g;
			this.b = b;
		}

		public int getRed() {
			return r;
		}

		public int getGreen() {
			return g;
		}

		public int getBlue() {
			return b;
		}
	}
}
