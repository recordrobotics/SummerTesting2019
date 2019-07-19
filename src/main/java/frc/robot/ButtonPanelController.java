package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.RobotMap;


public class ButtonPanelController{
	public Joystick buttonPanel;
	
	public JoystickButton greenleft;
	public JoystickButton greenright;
	public JoystickButton yellowleft;
	public JoystickButton yellowright;
	public JoystickButton redleft;
	public JoystickButton redright;
	public JoystickButton blueleft;
	public JoystickButton blueright;
	public JoystickButton white;

	public ButtonPanelController(){
		buttonPanel = new Joystick(RobotMap.buttonPanelPort);

		greenleft = new JoystickButton(buttonPanel, RobotMap.greenleft);
		greenright = new JoystickButton(buttonPanel, RobotMap.greenright);
		yellowleft = new JoystickButton(buttonPanel, RobotMap.yellowleft);
		yellowright = new JoystickButton(buttonPanel, RobotMap.yellowright);
		redleft = new JoystickButton(buttonPanel, RobotMap.redleft);
		redright = new JoystickButton(buttonPanel, RobotMap.redright);
		blueleft = new JoystickButton(buttonPanel, RobotMap.blueleft);
		blueright = new JoystickButton(buttonPanel, RobotMap.blueright);
		white = new JoystickButton(buttonPanel, RobotMap.white);
	}


}