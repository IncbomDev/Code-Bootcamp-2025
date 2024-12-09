package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
  private static final int CAN_ID = 1;
  private final IntakeIOTalonFX intakeMotor;
  private final IntakeIOInputsAutoLogged feedMotorInputs = new IntakeIOInputsAutoLogged();

  public Intake() {
    intakeMotor = new IntakeIOTalonFX(CAN_ID); // To Do: Add Motor ID inside the ()
    this.disableIntake();
  }

  @Override
  public void periodic() {
    intakeMotor.updateInputs(feedMotorInputs);
  }

  public void startIntake() {
    intakeMotor.setSpeed(1.0);
  }

  public void reverseIntake() {
    intakeMotor.setSpeed(-5.0); // To Do: Find Better Values
  }

  public void forwardIntake() {
    intakeMotor.setSpeed(5.0);
  }

  public void disableIntake() {
    intakeMotor.setSpeed(0.0);
  }
}
