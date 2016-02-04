package org.usfirst.frc.team2713.robot.commands;
import org.usfirst.frc.team2713.robot.RobotMap;
import org.usfirst.frc.team2713.robot.commands.lights.Color;
import org.usfirst.frc.team2713.robot.subsystems.LightSubsystem;
import org.usfirst.frc.team2713.robot.subsystems.LoaderSubsystem;

import edu.wpi.first.wpilibj.command.Command;


public class LoadBall extends Command {

	private double polarity = 1;
	LoaderSubsystem loader;
	LightSubsystem lights;

	public LoadBall(LoaderSubsystem loader, LightSubsystem lights) {
		this.lights = lights;
		this.loader = loader;
		requires(loader);
	}
	


	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		if(loader.loadswitch.get()) {
			loader.loadBall(polarity);	
			lights.setColor(Color.YELLOW);
			try {
				Thread.sleep(RobotMap.TIME_TO_LOAD_BALL);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			loader.loadBall(0);
		}
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		loader.loadBall(0);		
	}

	@Override
	protected void interrupted() {
		loader.loadBall(0);		
	}



}
