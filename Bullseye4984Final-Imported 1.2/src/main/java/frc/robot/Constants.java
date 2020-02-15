/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class Constants {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  // *** define motors here
  // Drivetrain (CANSparkMax)
  public static final int MOTOR_LEFT_FRONT_ID = 1;
	public static final int MOTOR_LEFT_BACK_ID = 2;
	public static final int MOTOR_RIGHT_FRONT_ID = 3;
  public static final int Motor_RIGHT_BACK_ID = 4;

  
  // *** define controllers here
  // *** this is xbox driver controller
  public static final int DRIVER_CONTROLLER = 0;
  public static final int DRIVER_CONTROLLER_LEFT_STICK_Y = 1;
  public static final int DRIVER_CONTROLLER_RIGHT_STICK_Y = 5;


  public static final int OPERATOR_JOYSTICK = 1;
  public static final int ELBOW_Y_AXIS = 1;
  public static final int WRIST_X_AXIS = 0;

  public static final int OPERATOR_BALLINTAKE_BUTTON_LB = 5;
  public static final int OPERATOR_BALLSENDOUT_BUTTON_RB = 6;
  public static final int OPERATOR_COLOR_WHEEL_BUTTON_A = 1;
  public static final int OPERATOR_TAILGATE_BUTTON_START = 8;
  public static final int OPERATOR_WINCH_BUTTON_Y = 4;
  public static final int OPERATOR_CLIMBER_BUTTON_X = 3;



  public static final int BALL_INTAKE_SRX_MOTOR = 5;
  public static final int BALL_SENDOUT_SRX_MOTOR = 7;



  // ***
  public static final int COLOR_WHEEL_SRX_MOTOR = 7;

  //*** 
  public static final int WINCH_SRX_MOTOR = 8;

}
