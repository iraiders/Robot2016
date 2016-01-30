package org.usfirst.frc.team2713.robot.commands;

import org.usfirst.frc.team2713.robot.input.XBoxController;
import org.usfirst.frc.team2713.robot.subsystems.DriveSubsystem;

import edu.wpi.first.wpilibj.command.Command;

public class TankDrive extends Command {
	
	DriveSubsystem drive;
	XBoxController xbox;
	
	public TankDrive(DriveSubsystem drive, XBoxController xbox){
		this.drive = drive;
		this.xbox = xbox;
		requires(drive);
	}
	
	double scaler;
	double deadband;
	double polarity;

	protected void execute() {
		scaler =1.0;
		deadband = 0.1;
		polarity = -1;

		DriveSubsystem.TankDrive(xbox.getLeftY()*scaler*polarity, xbox.getRightY()*scaler*polarity, deadband);
		
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
