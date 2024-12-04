package frc.robot.subsystems.intake;
import org.littletonrobotics.junction.AutoLog;

public interface IntakeIO {
    @AutoLog
    public static class IntakeIOInputs {
        public double motorVelocityRotationsPerSecond = 0.0d;
        public double setPoint = 0.0d;
        public double setPointError = 0.0d;

    }

    public default void updateInputs(IntakeIOInputs inputs, double speed){}
    public default void setSpeed(double speed);
}
