/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.TankDriveCommand;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

   // ***this motor is being used for elevator
  private CANSparkMax leftDriveMotor = new CANSparkMax(RobotMap.MOTOR_LEFT_FRONT_ID, MotorType.kBrushless);
  private CANSparkMax leftDriveMotor1 = new CANSparkMax(RobotMap.MOTOR_LEFT_BACK_ID, MotorType.kBrushless);
  // ***this motor is unplugged
  private CANSparkMax rightDriveMotor = new CANSparkMax(RobotMap.MOTOR_RIGHT_FRONT_ID, MotorType.kBrushless);
  private CANSparkMax rightDriveMotor1 = new CANSparkMax(RobotMap.Motor_RIGHT_BACK_ID, MotorType.kBrushless);
public DriveTrain(){
      leftDriveMotor.setOpenLoopRampRate(0.8);
      leftDriveMotor1.setOpenLoopRampRate(0.8);
      rightDriveMotor.setOpenLoopRampRate(0.8);
      rightDriveMotor1.setOpenLoopRampRate(0.8);
      
      leftDriveMotor.setIdleMode(IdleMode.kCoast);
      leftDriveMotor1.setIdleMode(IdleMode.kCoast);
      rightDriveMotor.setIdleMode(IdleMode.kCoast);
      rightDriveMotor1.setIdleMode(IdleMode.kCoast);
      // leftDriveMotor1.follow(leftDriveMotor);
      // rightDriveMotor1.follow(rightDriveMotor);



  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new TankDriveCommand(false));
  }


  public void tankDrive(XboxController controller, boolean isSlow){
    double left = controller.getRawAxis(RobotMap.DRIVER_CONTROLLER_LEFT_STICK_Y);
    double right = controller.getRawAxis(RobotMap.DRIVER_CONTROLLER_RIGHT_STICK_Y);
    if(isSlow) {
      System.out.println("----Robot is SLOW, Please speed up----");
      left = left*.4;
      right = right*.4;
    }
    if(Math.abs(left)<0.1){
      left=0;
    }
    if(Math.abs(right)<0.1){
      right=0;
    }
    
    tankDrive(left,right);
  }
  public void tankDrive(double left, double right){
    leftDriveMotor.set(left);
    leftDriveMotor1.set(left);
    rightDriveMotor.set(-right);
    //rightDriveMotor1.set(-right);
  }
}
