package frc.robot.subsystems;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;

public class GyroADX extends ADXRS450_Gyro implements Gyro {
    public GyroADX(){
        //constructor
    }

    public double getDegrees(){
        return 0; // this is only so it compiles, I really don't see the point of this method
    }
}