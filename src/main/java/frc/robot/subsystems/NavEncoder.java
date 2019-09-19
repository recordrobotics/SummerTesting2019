/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.*;
import frc.robot.commands.CoordNav;

/**
 * Add your docs here.
 */
public class NavEncoder extends Subsystem {
  // Put methods for controlling this subsystem
  public double circumference; //the circumference of the wheel in METERS

  private int prevCount = 0;
  public boolean countHasChanged(){
    if(Robot.encoderL.get() > prevCount){
        prevCount = Robot.encoderL.get();
        return true;
    } else {
        return false;
    }
  }

  public static double avgerageDistance()
  {
      return ((Robot.encoderL.getDistance() + Robot.encoderL.getDistance()) / 2);
  }

  @Override
  public void initDefaultCommand() {
      setDefaultCommand(new CoordNav());
  }

}
