/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;


//TODO: uncomment this once approprite stuff is installed 
/*
import com.ctre.phoenix.motorcontrol.*;
import com.ctre.phoenix.motorcontrol.can.*;
*/


/*
* Drive Train for Monty
*/
public class DriveMonty extends DriveTrain {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.


  //TODO: uncomment this once approprite libraries are installed
  /*
  WPI_VictorSPX frontRight = new WPI_VictorSPX(RobotMap.driveFrontRightPortMonty);
  WPI_VictorSPX backRight = new WPI_VictorSPX(RobotMap.driveBackRightPortMonty);
  WPI_VictorSPX frontLeft = new WPI_VictorSPX(RobotMap.driveFrontLeftPortMonty);
  WPI_VictorSPX backLeft = new WPI_VictorSPX(RobotMap.driveBackLeftPortMonty);

  public DriveMonty(){
    backRight.follow(frontRight);
    backLeft.follow(frontLeft);
  }

  @Override
  public boolean moveLeftWheels(double amount){
    frontLeft.set(ControlMode.PercentOutput, amount);
    return true;
  }

  @Override
  public boolean moveRightWheels(double amount){
    frontRight.set(ControlMode.PercentOutput, -amount);
    return true;
  }
  */
  

}
