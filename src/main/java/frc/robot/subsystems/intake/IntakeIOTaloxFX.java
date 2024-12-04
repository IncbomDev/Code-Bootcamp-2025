package frc.robot.subsystems.intake;
import com.ctre.phoenix6.BaseStatusSignal;
import com.ctre.phoenix6.StatusSignal;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.VelocityVoltage;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.InvertedValue;
import com.ctre.phoenix6.signals.NeutralModeValue;

public class IntakeIOTaloxFX implements IntakeIO {
    private final TalonFX motor;
    private double robotSpeed;
    private final StatusSignal<double> motorVelocity;
    private final StatusSignal<Double> setPointError;
    private double setpoint = 0.0d;
    private final double m_gearRatio = (4.0 / 1.0); 
    private static VelocityVoltage velocityVoltageCommand = new VelocityVoltage(0.0).withSlot(0);

    public IntakeIOTalonFX(int canID); // enter canID number later
    config.slot0.kP= 0.0;
    config.Slot0.kI = 0.0;
    config.Slot0.kD = 0.0;
    config.Slot0.kV = 0.0;
    config.Slot0.kS = 0.05;
    motor.getConfigurator().apply(config);

    motorVelocity = motor.getVelocity;



    @Override
    public void updateInputs(IntakeIOInputs inputs, double robotSpeed){
        this.robotSpeed = robotSpeed;
        BaseStatusSignal.refreshAll;
    }



    @Override
    public void setSpeed(double speed) {
    velocityVoltageCommand.withVelocity(speed).withSlot(0); // Convert to motor rotations per second
    motor.setControl(velocityVoltageCommand);

}
