package org.usfirst.frc.team2713.robot.commands;

import org.usfirst.frc.team2713.robot.subsystems.HookArmSubsystem;
import edu.wpi.first.wpilibj.command.Command;

public class MoveHook extends Command {

	private double polarity;
	HookArmSubsystem hookarm;
	
	public MoveHook(HookArmSubsystem hookarm, double polarity){
		this.hookarm = hookarm;
		requires(hookarm);
	}
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		hookarm.moveArm(polarity);
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
		
	} //Will Use PID and a Potentiometer

}
