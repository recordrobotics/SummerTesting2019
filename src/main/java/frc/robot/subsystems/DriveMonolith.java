/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;
import frc.robot.RobotMap;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveMonolith extends DriveTrain {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  Spark frontRight = new Spark(RobotMap.driveFrontRightPortMonolith);
  Spark backRight = new Spark(RobotMap.driveBackRightPortMonolith);
  Spark frontLeft = new Spark(RobotMap.driveFrontLeftPortMonolith);
  Spark backLeft = new Spark(RobotMap.driveBackLeftPortMonolith);



  @Override
  public boolean moveLeftWheels(double amount){
    frontLeft.set(amount);
    backLeft.set(amount);
    return true;
  }

  @Override
  public boolean moveRightWheels(double amount){
    frontRight.set(-amount);
    backRight.set(-amount);
    return true;
  }

  


}