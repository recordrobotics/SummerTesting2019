package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.RobotMap;
import frc.robot.ButtonMap;


public class ButtonPanelController{
	public Joystick buttonPanel;
	

	public ButtonPanelController(){
		buttonPanel = new Joystick(RobotMap.buttonPanelPort);
	}

	private JoystickButton getButton(ButtonMap button){
		return new JoystickButton(buttonPanel, button.getPort());
	}


	/*
	get states
	*/
	public boolean getState(ButtonMap button){
		return getButton(button).get();
	}

	public boolean getPressed(ButtonMap button){
		return buttonPanel.getRawButtonPressed(button.getPort());
	}






}