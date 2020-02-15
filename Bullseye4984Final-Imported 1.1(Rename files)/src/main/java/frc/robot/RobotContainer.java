/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class RobotContainer {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
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

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());

  public XboxController driverController = new XboxController(Constants.DRIVER_CONTROLLER);
  private Joystick operatorJoystickLeft = new Joystick(Constants.OPERATOR_JOYSTICK_LEFT);
  private Joystick operatorJoystickRight  = new Joystick(Constants.OPERATOR_JOYSTICK_RIGHT);
  private Joystick buttonBoard = new Joystick(Constants.BUTTON_BOARD);

 

  Button rocketCargo1 = new JoystickButton(buttonBoard, Constants.ROCKET_CARGO_1_BUTTON);
  Button rocketCargo2 = new JoystickButton(buttonBoard, Constants.ROCKET_CARGO_2_BUTTON);
  Button rocketCargo3 = new JoystickButton(buttonBoard, Constants.ROCKET_CARGO_3_BUTTON);

  Button rocketHatch1 = new JoystickButton(buttonBoard, Constants.ROCKET_HATCH_1_BUTTON);
  Button rocketHatch2 = new JoystickButton(buttonBoard, Constants.ROCKET_HATCH_2_BUTTON);
  Button rocketHatch3 = new JoystickButton(buttonBoard, Constants.ROCKET_HATCH_3_BUTTON);

  Button shipCargo = new JoystickButton(buttonBoard, Constants.SHIP_CARGO_BUTTON);
  Button shipHatch = new JoystickButton(buttonBoard, Constants.SHIP_HATCH_BUTTON);

  Button humanCargo = new JoystickButton(buttonBoard, Constants.HUMAN_CARGO_BUTTON);
  Button humanHatch = new JoystickButton(buttonBoard, Constants.HUMAN_HATCH_BUTTON);

  Button groundCargo = new JoystickButton(buttonBoard, Constants.GROUND_CARGO_BUTTON);
  Button groundHatch = new JoystickButton(buttonBoard, Constants.GROUND_HATCH_BUTTON);

  Button Climb1 = new JoystickButton(operatorJoystickLeft, Constants.CLIMB_1_BUTTON);
  Button Climb2 = new JoystickButton(operatorJoystickLeft, Constants.CLIMB_2_BUTTON);

  Button manualElevator = new JoystickButton(operatorJoystickRight, 7);
  Button manualShoulder = new JoystickButton(operatorJoystickRight, 8);
  Button manualElbow = new JoystickButton(operatorJoystickRight, 11);
  Button manualWrist = new JoystickButton(operatorJoystickRight, 12);
  Button manualMode = new JoystickButton(operatorJoystickRight, 5);

  Button StraightCommand = new JoystickButton(driverController, 5);
  Button Zero = new JoystickButton(operatorJoystickLeft, 9);
  Button VamuumButtonOn = new JoystickButton(operatorJoystickLeft, 10);
  Button VamuumButtonOff = new JoystickButton(operatorJoystickLeft, 11);
  Button hatchPistons = new JoystickButton(operatorJoystickLeft, 1);
 
  Button ClimberLift = new JoystickButton(operatorJoystickLeft, 2);
  Button LiftPistons = new JoystickButton(operatorJoystickLeft, 3);
  Button ClimberWheels = new JoystickButton(driverController, 2);
  Button driveStraight = new JoystickButton(driverController, 5);
  Button moveSlow = new JoystickButton(driverController, 7);
  Button moveFast = new JoystickButton(driverController, 8);

  Button manualMovements = new JoystickButton(operatorJoystickRight, 5);
  
  Button showvalues = new JoystickButton(operatorJoystickRight, 10);






  
  public RobotContainer() {


    // SmartDashboard.putNumber("Elevator Value", 0.0);
    // SmartDashboard.putNumber("Elevator Position", 0.0);
    // SmartDashboard.putNumber("Elevator Error", 0.0);
    // SmartDashboard.putNumber("Shoulder Value", 0.0);
    // SmartDashboard.putNumber("Shoulder Error", 0.0);
    // SmartDashboard.putNumber("Elbow Value", 0.0);
    // SmartDashboard.putNumber("Elbow Error", 0.0);
    // SmartDashboard.putNumber("Wrist Value", 0.0);
    // SmartDashboard.putNumber("Wrist Error", 0.0);
    // SmartDashboard.putNumber("Joystick Value", 0.0);
    // SmartDashboard.putNumber("Shoulder Target", 0.0);

  }

  public double GetDriverRawAxis(int axis) {
    return driverController.getRawAxis(axis);
  }

  public boolean GetDriverButton(int button) {
    return driverController.getRawButton(button);
  }

  public double GetOperatorJoystickLeftRawAxis(int axis) {
    return operatorJoystickLeft.getRawAxis(axis);
  }

  public double GetOperatorJoystickRightRawAxis(int axis) {
    return operatorJoystickRight.getRawAxis(axis);
  }
  public Joystick getOperatorLeft(){
    return operatorJoystickLeft;
  }

  public Joystick getOperatorRight() {
    return operatorJoystickRight;
  }
  public XboxController getDriver(){
    return driverController;
  }

 


}
