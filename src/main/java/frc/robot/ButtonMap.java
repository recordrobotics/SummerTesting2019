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
	private JoystickButton button;
	private static Joystick joy = new Joystick(RobotMap.buttonPanelPort);


	ButtonMap(int virtualPort){
		this.virtualPort = virtualPort;

		button = new JoystickButton(() -> joy, this.virtualPort);
	}

	public static Joystick getJoystick(){
		return joy;
	}

	public boolean getState(){
		return joy.getRawButton(virtualPort);
	}

	public boolean getPressed(){
		return true;
	}


}