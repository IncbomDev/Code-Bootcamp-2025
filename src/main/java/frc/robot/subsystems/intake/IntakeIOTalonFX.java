package frc.robot.subsystems.intake;

import com.ctre.phoenix6.StatusSignal;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.VelocityVoltage;
import com.ctre.phoenix6.hardware.TalonFX;

public class IntakeIOTalonFX implements IntakeIO {
  private final TalonFX motor;
  private final StatusSignal<Double> motorVelocity;
  private final double m_gearRatio = (4.0 / 1.0);
  private static VelocityVoltage velocityVoltageCommand = new VelocityVoltage(0.0).withSlot(0);

  public IntakeIOTalonFX(int canID) { // enter canID number later
    this.motor = new TalonFX(canID);
    var config = new TalonFXConfiguration();
    config.Slot0.kP = 0.0;
    config.Slot0.kI = 0.0;
    config.Slot0.kD = 0.0;
    config.Slot0.kV = 0.0;
    config.Slot0.kS = 0.05;
    motor.getConfigurator().apply(config);

    this.motorVelocity = this.motor.getVelocity();
  }

  @Override
  public void updateInputs(IntakeIOInputs inputs) {
    inputs.motorVelocityRotationsPerSecond = motorVelocity.getValueAsDouble();
  }

  @Override
  public void setSpeed(double speed) {
    velocityVoltageCommand.withVelocity(speed).withSlot(0); // Convert to motor rotations per second
    motor.setControl(velocityVoltageCommand);
  }
}
