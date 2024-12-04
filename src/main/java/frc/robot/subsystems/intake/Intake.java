package frc.robot.subsystems.intake;

import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class intake extends SubsystemBase {

    private final IntakeIOTalonFX intakeMotor;
    private final IntakeIOInputsAutoLogged feedMotorInputs = new IntakeIOInputsAutoLogged();

    public void setSpeed(double speed){}

    private double feedSetSpeed = 10.0;

    public Intake(){
        intakeMotor = new IntakeIOTalonFX() // To Do: Add Motor ID inside the ()
        this.disableIntake();
    }

    @Override
    public void periodic(){
        double speed = robotSpeed.vxMetersPerSecond;
        feedMotor.updateInputs(feedMotorInputs, speed);
    }

    public void startIntake(){
        intake.setSpeed(1.0);
    }

    public void reverseIntake(){
        intake.setSpeed(-5.0); // To Do: Find Better Values
    }

    public void forwardIntake(){
        intake.setSpeed(5.0);
    }

    public void disableIntake(){
        intake.setSpeed(0.0);
    }

}