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

  // *** define PID settings here
  // Elevator PID
  public static final double ELEVATOR_KP = 0.04;
  public static final double ELEVATOR_KI = 0.0;
  public static final double ELEVATOR_KD = 0.3;
  public static final double ELEVATOR_KIZ = 0.0;
  public static final double ELEVATOR_KFF = 0.0;
  public static final double ELEVATOR_KMaxOutput = 1;
  public static final double ELEVATOR_KMinOutput = -1;
  public static final double ELEVATOR_PID_ABSOLUT_TOLERANCE = (0.05);

  // Shoulder PID
  public static final double SHOULDER_KP = 0.1;
  public static final double SHOULDER_KI = 0.0;
  public static final double SHOULDER_KD = 0.0;
  public static final double SHOULDER_PID_ABSOLUT_TOLERANCE = (0.05);

  // Elbow PID
  public static final double ELBOW_KP = 0.1;
  public static final double ELBOW_KI = 0.0;
  public static final double ELBOW_KD = 0.0;
  public static final double ELBOW_PID_ABSOLUT_TOLERANCE = (0.05);

  // Writs PID
  public static final double WRIST_KP = 0.1;
  public static final double WRIST_KI = 0.0;
  public static final double WRIST_KD = 0.0;
  public static final double WRIST_PID_ABSOLUT_TOLERANCE = (0.05);

  // *** define sensors here
  // Elevator sensors
  public static final int LIMIT_SWITCH_TOP = 2;
  public static final int LIMIT_SWITCH_BOTTOM = 3;
  // Shoulder sensors
  public static final int SHOULDER_POT_CHANNEL = 0;
  public static final double SHOULDER_POT_FULL_RANGE = 270;
  public static final double SHOULDER_POT_OFFSET = 0;
  // Elbow sensors
  public static final int ELBOW_POT_CHANNEL = 0;
  public static final double ELBOW_POT_FULL_RANGE = 270;
  public static final double ELBOW_POT_OFFSET = 0;
  // Wrist sensors
  public static final int WRIST_POT_CHANNEL = 0;
  public static final double WRIST_POT_FULL_RANGE = 270;
  public static final double WRIST_POT_OFFSET = 0;

  // *** define motors here
  // Drivetrain (CANSparkMax)
  public static final int MOTOR_LEFT_FRONT_ID = 1;
	public static final int MOTOR_LEFT_BACK_ID = 2;
	public static final int MOTOR_RIGHT_FRONT_ID = 3;
  public static final int Motor_RIGHT_BACK_ID = 4;
  // Elevator (CANSparkMax)
  public static final int ELEVATOR_MOTOR = 6;
  // Arm (TalonSRX)
  public static final int SHOULDER_MOTOR = 2;
  public static final int SHOULDER_MOTOR_1 = 5;
  public static final int ELBOW_MOTOR = 4; 
  public static final int WRIST_MOTOR = 3; 
  

  // climb stuff
  public static final int CLIMB_MOTOR = 10;
  public static final int CLIMB_PISTON = 1;
  public static final int CLIMBER_PIN = 2;
  public static final int CLIMBER_WHEELS = 3;
  
  // *** define controllers here
  // *** this is xbox driver controller
  public static final int DRIVER_CONTROLLER = 0;
  public static final int DRIVER_CONTROLLER_LEFT_STICK_Y = 1;
  public static final int DRIVER_CONTROLLER_RIGHT_STICK_Y = 5;

  // operator controllers 
  public static final int OPERATOR_JOYSTICK_LEFT = 3;
  public static final int ELEVATOR_Y_AXIS = 1;
  public static final int SHOULDER_X_AXIS = 0;

  public static final int OPERATOR_JOYSTICK_RIGHT = 1;
  public static final int ELBOW_Y_AXIS = 1;
  public static final int WRIST_X_AXIS = 0;

  // button board
  public static final int BUTTON_BOARD = 2; 

  public static final int ROCKET_CARGO_1_BUTTON = 3;
  public static final int RC1_ELEVATOR = 70;
  public static final int RC1_SHOULDER = -975;
  public static final int RC1_ELBOW = -630;
  public static final int RC1_WRIST = -615;

  public static final int ROCKET_CARGO_2_BUTTON = 2;
  public static final int RC2_ELEVATOR = 200;
  public static final int RC2_SHOULDER = -975;
  public static final int RC2_ELBOW = -450;
  public static final int RC2_WRIST = -400;

  public static final int ROCKET_CARGO_3_BUTTON = 1;
  public static final int RC3_ELEVATOR = 390;
  public static final int RC3_SHOULDER = -975;
  public static final int RC3_ELBOW = -200;
  public static final int RC3_Wrist = -200;

  public static final int ROCKET_HATCH_1_BUTTON = 9;
  public static final int RH1_ELEVATOR = 0;
  public static final int RH1_SHOULDER = -940;
  public static final int RH1_ELBOW = -660;
  public static final int RH1_WRIST = -565;

  public static final int ROCKET_HATCH_2_BUTTON = 10;
  public static final int RH2_ELEVATOR = 155;
  public static final int RH2_SHOULDER = -975;
  public static final int RH2_ELBOW = -520;
  public static final int RH2_WRIST = -385;

  public static final int ROCKET_HATCH_3_BUTTON = 11;
  public static final int RH3_ELEVATOR = 390;
  public static final int RH3_SHOULDER = -975;
  public static final int RH3_ELBOW = -200;
  public static final int RH3_WRIST = -200;

  public static final int SHIP_HATCH_BUTTON = 5;
  public static final int SH_ELEVATOR = 0;
  public static final int SH_SHOULDER = -920;
  public static final int SH_ELBOW = -660;
  public static final int SH_WRIST = -600;

  public static final int SHIP_CARGO_BUTTON = 4;
  public static final int SC_ELEVATOR = 210;
  public static final int SC_SHOULDER = -960;
  public static final int SC_ELBOW = -630;
  public static final int SC_WRIST = -630;

  public static final int HUMAN_HATCH_BUTTON = 8;
  public static final int HH_ELEVATOR = 10;
  public static final int HH_SHOULDER = -920;
  public static final int HH_ELBOW = -660;
  public static final int HH_WRIST = -600;

  public static final int HUMAN_CARGO_BUTTON = 7;
  public static final int HC_ELEVATOR = 240;
  public static final int HC_SHOULDER = -960;
  public static final int HC_ELBOW = -630;
  public static final int HC_WRIST = -610;

  public static final int GROUND_CARGO_BUTTON = 12;
  public static final int GC_ELEVATOR = 100;
  public static final int GC_SHOULDER = -950;
  public static final int GC_ELBOW = -625;
  public static final int GC_WRIST = -270;
  
  public static final int GROUND_HATCH_BUTTON = 6;
  public static final int GH_ELEVATOR = 10;
  public static final int GH_SHOULDER = -950;
  public static final int GH_ELBOW = -625;
  public static final int GH_WRIST = -500;

 

  // Climb position 1
  public static final int CLIMB_1_BUTTON = 7;
  public static final int ELEVATOR_CLIMB_1 = 100;
  
  // Climb position 2
  public static final int CLIMB_2_BUTTON = 6;
  public static final int ElEVATOR_CLIMB_2 = 200;

  public static final int CLIMB_WHEEL_AXIS_1 = 3;
  public static final int CLIMB_WHEEL_AXIS_2 = 2;

  
}
