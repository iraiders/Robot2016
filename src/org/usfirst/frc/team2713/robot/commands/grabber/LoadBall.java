package org.usfirst.frc.team2713.robot.commands.grabber;

import org.usfirst.frc.team2713.robot.Robot;
import org.usfirst.frc.team2713.robot.RobotMap;
import org.usfirst.frc.team2713.robot.subsystems.LoaderSubsystem;
import org.usfirst.frc.team2713.robot.subsystems.lights.LightManager;

import edu.wpi.first.wpilibj.command.Command;


public class LoadBall extends Command {

	private double polarity = 1;
	LoaderSubsystem loader;
	LightManager lights;
	Robot robot;
	
	public LoadBall(LoaderSubsystem loader, LightManager lights, Robot robot) {
		this.lights = lights;
		this.loader = loader;
		this.robot = robot;
		requires(loader);
	}
	


	@Override
	protected void initialize() {
		//loader.moveLoader.set(50);
	}

	@Override
	protected void execute() {
		System.out.println(loader.moveLoader.getPosition());
		if(loader.loadswitch.get()) {
			if(lights != null) {
				lights.grabBall();
			}
			loader.loadBall(polarity);	
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
		if(robot.interuptAllLoaderMover || robot.interuptUpperLevelLoaderMover || robot.interuptLoaderWheels) {
			return true;
		}
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
