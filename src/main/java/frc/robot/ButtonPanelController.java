package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.RobotMap;


public class ButtonPanelController{
	private Joystick buttonPanel;
	
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

	public boolean getGreenLeft(){
		return buttonPanel.getRawButtonPressed(RobotMap.greenLeft);
	} 

	public boolean getGreenRight(){
		return buttonPanel.getRawButtonPressed(RobotMap.greenRight);
	}

	public boolean getYellowLeft(){
		return buttonPanel.getRawButtonPressed(RobotMap.yellowLeft);
	}

	public boolean getYellowRight(){
		return buttonPanel.getRawButtonPressed(RobotMap.yellowRight);
	}

	public boolean getRedLeft(){
		return buttonPanel.getRawButtonPressed(RobotMap.redLeft);
	}

	public boolean getRedRight(){
		return buttonPanel.getRawButtonPressed(RobotMap.redRight);
	}

	public boolean getBlueLeft(){
		return buttonPanel.getRawButtonPressed(RobotMap.blueLeft);
	}

	public boolean getBlueRight(){
		return buttonPanel.getRawButtonPressed(RobotMap.blueRight);
	}

	public boolean getWhite(){
		return buttonPanel.getRawButtonPressed(RobotMap.white);
	}



}