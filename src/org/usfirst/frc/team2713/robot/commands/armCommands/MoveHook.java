package org.usfirst.frc.team2713.robot.commands.armCommands;

import org.usfirst.frc.team2713.robot.RobotMap;
import org.usfirst.frc.team2713.robot.subsystems.HookArmSubsystem;

import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;
import edu.wpi.first.wpilibj.command.Command;

public class MoveHook extends Command {

	HookArmSubsystem hookarm;
	double polarity;
	
	public MoveHook(HookArmSubsystem hookarm, double polarity){
		this.hookarm = hookarm;
		this.polarity = polarity;
		requires(hookarm);
	}
	@Override
	protected void initialize() {
		hookarm.arm.changeControlMode(TalonControlMode.Speed);
	}

	@Override
	protected void execute() {
		if(hookarm.arm.get() < RobotMap.ARM_UPPER_LIMIT && hookarm.arm.get() > RobotMap.ARM_LOWER_LIMIT) {
			hookarm.setAngle(polarity);
		}	
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
