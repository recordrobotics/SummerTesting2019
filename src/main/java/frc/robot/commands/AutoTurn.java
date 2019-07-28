/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;
import java.lang.Math;

public class AutoTurn extends Command {
    //declare variables
    double inputAngle; //number of degrees to turn
    double initAngle;   //angle when command is started
    double targetAngle; //angle robot is trying to be at
    double precision = 1; //how precise to make the turn

    //constructor
  public AutoTurn(double angle) {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.driveTrain);
    //assigns argument to variable
    this.inputAngle = angle; //input should be an angle from -180 to positive 180
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    initAngle = Robot.gyro.getAngle(); //is a value from 0 to 360 representing the angle the robot is at
    targetAngle = initAngle + inputAngle; //sets the target angle, there is a risk of the angle being less than 360 or greater than 0
    //make sure that angle is between 0 and 360
    while(targetAngle > 360 || targetAngle < 0){
        if (targetAngle > 360){
            targetAngle -= 360; //if the angle is more than 360, reduce it in intervals of 360 until it is in range
        } 
        if (targetAngle < 0) {
            targetAngle += 360; //if the angle is less than 360, add 360 until it is in range
        }
    }
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double increment = 0.5; //the amount that the robot will turn every second
    double leftAmount;
    double rightAmount;

    //determine which way to turn the wheels
      if (Math.abs(targetAngle) > 180){
        leftAmount = increment;
        rightAmount = -increment;
      } else {
        leftAmount = -increment;
        rightAmount = increment;
      }

      //move the robot around it's own axis
      Robot.driveTrain.moveLeftWheels(leftAmount);
      Robot.driveTrain.moveRightWheels(rightAmount);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    if (Robot.gyro.getAngle() < precision || Robot.gyro.getAngle() > -precision){
        return true;
    } else{
        return false;
    }
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
