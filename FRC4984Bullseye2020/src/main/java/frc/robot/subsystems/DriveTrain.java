/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.tankDriveCommand;

public class DriveTrain extends SubsystemBase {
  CANSparkMax motorLeft1 = new CANSparkMax(Constants.MOTOR_LEFT_SPARK_1, MotorType.kBrushless);
  CANSparkMax motorLeft2 = new CANSparkMax(Constants.MOTOR_LEFT_SPARK_2, MotorType.kBrushless);
  CANSparkMax motorRight1 = new CANSparkMax(Constants.MOTOR_RIGHT_SPARK_1, MotorType.kBrushless);
  CANSparkMax motorRight2 = new CANSparkMax(Constants.MOTOR_RIGHT_SPARK_2, MotorType.kBrushless);


  /**
   * Creates a new DriveTrain.
   */
  public DriveTrain() {
    setDefaultCommand(new tankDriveCommand());
  }

  public void setLeftMotors(double speed){
    motorLeft1.set(-speed);
    motorLeft2.set(-speed);

  }
  public void setRightMotors(double speed){
    motorRight1.set(speed);
    motorRight2.set(speed);

  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
