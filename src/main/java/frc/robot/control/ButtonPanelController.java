package frc.robot.control;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.RobotMap;
import frc.robot.control.ButtonMap;



public class ButtonPanelController{
	public Joystick buttonPanel;
	

	public ButtonPanelController(){
		buttonPanel = new Joystick(RobotMap.buttonPanelPort);
	}

	private JoystickButton getButton(int button){
		return new JoystickButton(buttonPanel, button);
	}


	/*
	get states
	*/
	public boolean getState(int button){
		return getButton(button).get();
	}

	public boolean getPressed(int button){
		return buttonPanel.getRawButtonPressed(button);
	}

	public boolean getReleased(int button){
		return buttonPanel.getRawButtonReleased(button);
	}

	

	






}