package frc.robot;	

import frc.robot.RobotMap;
// import frc.robot.ButtonPanelController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.OI;


public enum ButtonMap {
	GREENLEFT (RobotMap.greenLeft),
	GREENRIGHT (RobotMap.greenRight),
	YELLOWLEFT (RobotMap.yellowLeft),
	YELLOWRIGHT (RobotMap.yellowRight),
	REDLEFT (RobotMap.redLeft),
	REDRIGHT (RobotMap.redRight),
	BLUELEFT (RobotMap.blueLeft),
	BLUERIGHT (RobotMap.blueRight),
	WHITE (RobotMap.white);

	private final int virtualPort;


	ButtonMap(int virtualPort){
		this.virtualPort = virtualPort;
	}

	public int getPort(){
		return this.virtualPort;
	}


}