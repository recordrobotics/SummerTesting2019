package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.RobotMap;


public class ButtonPanelController{
	public Joystick buttonPanel;
	
	private JoystickButton greenLeft;
	private JoystickButton greenRight;
	private JoystickButton yellowLeft;
	private JoystickButton yellowRight;
	private JoystickButton redLeft;
	private JoystickButton redRight;
	private JoystickButton blueLeft;
	private JoystickButton blueRight;
	private JoystickButton white;

	public ButtonPanelController(){
		buttonPanel = new Joystick(RobotMap.buttonPanelPort);

		greenLeft = new JoystickButton(buttonPanel, RobotMap.greenLeft);
		greenRight = new JoystickButton(buttonPanel, RobotMap.greenRight);
		yellowLeft = new JoystickButton(buttonPanel, RobotMap.yellowLeft);
		yellowRight = new JoystickButton(buttonPanel, RobotMap.yellowRight);
		redLeft = new JoystickButton(buttonPanel, RobotMap.redLeft);
		redRight = new JoystickButton(buttonPanel, RobotMap.redRight);
		blueLeft = new JoystickButton(buttonPanel, RobotMap.blueLeft);
		blueRight = new JoystickButton(buttonPanel, RobotMap.blueRight);
		white = new JoystickButton(buttonPanel, RobotMap.white);
	}


	/*
	get states
	*/
	public boolean getGreenLeft(){
		return greenLeft.get();
	} 

	public boolean getGreenRight(){
		return greenRight.get();
	}

	public boolean getYellowLeft(){
		return yellowLeft.get();
	}

	public boolean getYellowRight(){
		return yellowRight.get();
	}

	public boolean getRedLeft(){
		return redLeft.get();
	}

	public boolean getRedRight(){
		return redRight.get();
	}

	public boolean getBlueLeft(){
		return blueLeft.get();
	}

	public boolean getBlueRight(){
		return blueRight.get();
	}

	public boolean getWhite(){
		return white.get();
	}


	/*
	* * * * * * * * * * * * * * * * * * * * *
	* get pressed since last check
	*/

	/*
	public boolean getGreenLeftPressed(){}

	public boolean getGreenRightPressed(){}

	public boolean getYellowLeftPressed(){}

	public boolean getYellowRightPressed(){}

	public boolean getRedLeftPressed(){}

	public boolean getRedRightPressed(){}

	public boolean getBlueLeftPressed(){}

	public boolean getBlueRightPressed(){}

	public boolean getWhitePressed(){}
	*/




}