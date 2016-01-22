package org.usfirst.frc.team2713.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	public static final int LEFT_TANK = 1;
	public static final int RIGHT_TANK = 2;
	public static final int ARM_MOTOR = 3;
	public static final int WHEEL_MOTOR = 2;
	public static final int LOAD_MOTOR = 5;
	
	public static final int LOAD_LIMIT = 1;

	public static final String XBOX_NAME = "Controller (Gamepad for Xbox 360)";
	public static final String ATTACK_NAME = "Logitech Attack 3";
	public static final int LEFT_JOYSTICK_PORT = 2;
	public static final int RIGHT_JOYSICK_PORT = 3;
	
	public static final double Kp = .01;
	public static final double Ki = .003;
	public static final double Kd = .003;

	public static final boolean INIT_DRIVE = false;
	public static final boolean INIT_FLYWHEEL = true;
	public static final boolean INIT_HOOKARM = false;
	public static final boolean INIT_LOADER = false;

	public static final int DIPSWITCHCOUNT = 1;
	public static final int DIPSWITCHSTARTPORT = 10;
	
		

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;

	public static int XBoxPort = 1;
	public static int AttackPort = 2;
}
