package org.usfirst.frc.team435.robot.commands;

import org.usfirst.frc.team435.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class EjectBoulder extends Command {
	double speed;
	double time;
    public EjectBoulder(double speed, double time) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.boulder);
    	setTimeout(time);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.boulder.boulderOut(speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.boulder.intakeStay();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
