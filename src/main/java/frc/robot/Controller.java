package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.RobotMap;


public class Controller{
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

	public Controller(){
		buttonPanel = new Joystick(RobotMap.buttonPanelPort);
		greenleft = new Joystick(RobotMap.greenleft);
		greenright = new Joystick(RobotMap.greenright);
		yellowleft = new Joystick(RobotMap.yellowleft);
		yellowright = new Joystick(RobotMap.yellowright);
		redleft = new Joystick(RobotMap.redleft);
		redright = new Joystick(RobotMap.redright);
		blueleft = new Joystick(RobotMap.blueleft);
		blueright = new Joystick(RobotMap.blueright);
		white = new Joystick(RobotMap.white);
	}
}