/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import java.lang.Math;
import frc.robot.control.ButtonPanelController;
import frc.robot.control.ButtonMap;
import frc.robot.control.HotasController;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  private static ButtonPanelController buttonPanel = new ButtonPanelController();
  private static HotasController hotas = new HotasController();
  public OI(){
    // buttonPanel
  }

  /*
  * HELPER METHODS
  */
  
  public static double sCurve(double value){

    double e = 2.718;
    return (1 / (1 + Math.pow(e, value))) * 2 - 1;
  }


  /*
  * INPUT HANDELING METHODS
  */

  private static double currentSpeed = 0;
  public static double getForward(){
    /*
    if(buttonPanel.getPressed(6)){
      currentSpeed = 0.5;
    } 
    if(buttonPanel.getReleased(6)){
      currentSpeed = 0;
    }

    //TODO - make this time based;
    currentSpeed *= 1.05;

    // System.out.println(currentSpeed);
    return currentSpeed;
    */

    return hotas.getY();

    // return 1;
  }

  public static double getTurn(){
    // return //sCurve(0);
    return hotas.getRotation();
  }

  public static int getLiftMotion(){
    int out = 0;
    out += (1);
    return out;
  }


}
