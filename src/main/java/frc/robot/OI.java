/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import java.lang.Math;
import frc.robot.control.Buttons;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  public OI(){

  }

  /*
  * HELPER METHODS
  */
  
  public static double sCurve(double value){

    double e = 2.718;
    return (1 / (1 + Math.pow(e, value)));
  }

  /*
  * INPUT HANDELING METHODS
  */

  public static double getForward(){
    return 1.0;
  }

  public static double getTurn(){
    return 1.0;
  }


}
