/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.ManualDrive;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private long disabled_time = 0;
  private long disabled_start_time = 0;
  
  public void initDefaultCommand(){
    setDefaultCommand(new ManualDrive());
  }


  public boolean moveLeftWheels(double distance){
    return true;
  }
  public boolean moveRightWheels(double distance){
    return true;
  }
  public double getRightEncoder(){
    return 0.0;
  }
    public double getLeftEncoder(){
    return 0.0;
  }


  /*
  * disables for t millis
  */
  public boolean disabled() {
    return System.currentTimeMillis() - disabled_start_time < disabled_time; 
  }

  public void disable(long t) {
    disabled_time = t;
    disabled_start_time = System.currentTimeMillis();
  }

  public void stop() {
    moveLeftWheels(0);
    moveRightWheels(0);
  }
}
