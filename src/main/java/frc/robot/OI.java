// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package frc.robot;

import frc.robot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
public JoystickButton locateBtn;
public Joystick leftJoy;
public Joystick rightJoy;
public JoystickButton fireBtn;
public JoystickButton enableLauncherBtn;
public JoystickButton disableLauncherBtn;
public Joystick operatorLeftJoy;
public JoystickButton locateTargetBtn;
public JoystickButton toggleGeckoBtn;
public JoystickButton extendPiston;
public JoystickButton retractPiston;
public Joystick operatorRightJoy;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

operatorRightJoy = new Joystick(2);

retractPiston = new JoystickButton(operatorRightJoy, 6);
retractPiston.whileHeld(new RetractPiston());
extendPiston = new JoystickButton(operatorRightJoy, 5);
extendPiston.whileHeld(new ExtendPiston());
toggleGeckoBtn = new JoystickButton(operatorRightJoy, 2);
toggleGeckoBtn.whenPressed(new ToggleGecko());
locateTargetBtn = new JoystickButton(operatorRightJoy, 1);
locateTargetBtn.whileHeld(new LocateTarget());
operatorLeftJoy = new Joystick(3);

disableLauncherBtn = new JoystickButton(operatorLeftJoy, 12);
disableLauncherBtn.whenPressed(new DisableLauncher());
enableLauncherBtn = new JoystickButton(operatorLeftJoy, 11);
enableLauncherBtn.whenPressed(new EnableLauncher());
fireBtn = new JoystickButton(operatorLeftJoy, 1);
fireBtn.whileHeld(new Fire());
rightJoy = new Joystick(1);

leftJoy = new Joystick(0);

locateBtn = new JoystickButton(leftJoy, 1);
locateBtn.whileHeld(new LocateTarget());


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("DumbDrive", new DumbDrive());
        SmartDashboard.putData("VelocityDrive", new VelocityDrive());
        SmartDashboard.putData("LocateTarget", new LocateTarget());
        SmartDashboard.putData("BeltMove", new BeltMove());
        SmartDashboard.putData("Fire", new Fire());
        SmartDashboard.putData("ExtendPiston", new ExtendPiston());
        SmartDashboard.putData("RetractPiston", new RetractPiston());
        SmartDashboard.putData("ToggleGecko", new ToggleGecko());
        SmartDashboard.putData("SmartLauncher", new SmartLauncher());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
public Joystick getleftJoy() {
        return leftJoy;
    }

public Joystick getrightJoy() {
        return rightJoy;
    }

public Joystick getoperatorLeftJoy() {
        return operatorLeftJoy;
    }

public Joystick getoperatorRightJoy() {
        return operatorRightJoy;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

