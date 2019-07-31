/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDSourceType;

public class MaintainCourse extends Command {

  /*
  Everything in this class is based on a PID controller, and is not yet properly implemented
  Use at own risk, as it is improbable that this will function as inteded
  Beware of any evil spirts awoken when executing this command
  */

  //PID parameters
  double Kp;
  double Ki;
  double Kd;
  //PID declaration and constructor arguments
  PIDSource gyroSource;
  PIDOutput output;
  PIDController PID;

  double target;
  double tolerance;

  public MaintainCourse() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.driveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

    //set all the PID calibration variation, calibrate here
    Kp = 0;
    Ki = 0;
    Kd = 0;

    tolerance = 5; //Percent tolerance, 5.0 means 5%.
    target = Robot.gyro.getAngle(); //set the target to be the angle that the robot was at when the command was initialised

    gyroSource = new PIDSource(){ //set up the angle of the gyroscope as the source of the PID. Due to a quirk of the library, a double cannot be used directly
    
      @Override
      public void setPIDSourceType(PIDSourceType pidSource) {} //ignore this, but do not delete
    
      @Override
      public double pidGet() {
        return Robot.gyro.getAngle();
      }
    
      @Override
      public PIDSourceType getPIDSourceType() {
        return null;
      }
    };
    //create the PID object and set Target, Tolerance, etc.
    PID = new PIDController(Kp, Ki, Kd, gyroSource, output);
    PID.setSetpoint(Robot.gyro.getAngle());
    PID.setPercentTolerance(tolerance);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    System.out.println(PID.get());

    //turn the robot around it's own axis by the amount indicated
    double leftAmount;
    double rightAmount;

    rightAmount = PID.get();
    leftAmount = -PID.get();

    Robot.driveTrain.moveLeftWheels(leftAmount);
    Robot.driveTrain.moveRightWheels(rightAmount);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
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
