package frc.robot.control;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.GenericHID.Hand;

public class HotasController {
	public Joystick hotas;
	

	public HotasController(){
		hotas = new Joystick(RobotMap.hotasPort);
	}

	public double getRotation(){
		return hotas.getTwist();
	}

	public double getY(){
		return -hotas.getY(Hand.kRight);
	}
}