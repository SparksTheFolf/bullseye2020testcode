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

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.tankDriveCommand;

public class DriveTrain extends SubsystemBase {

  private CANSparkMax motorLeft1 = new CANSparkMax(Constants.MOTOR_LEFT_SPARK_1, MotorType.kBrushless);
  private CANSparkMax motorLeft2 = new CANSparkMax(Constants.MOTOR_LEFT_SPARK_2, MotorType.kBrushless);
  private CANSparkMax motorRight3 = new CANSparkMax(Constants.MOTOR_RIGHT_SPARK_3, MotorType.kBrushless);
  private CANSparkMax motorRight4 = new CANSparkMax(Constants.MOTOR_RIGHT_SPARK_4, MotorType.kBrushless);

  /*/
   * Creates a new DriveTrain.
   * 
   * 
   */

   @Override
   public void setDefaultCommand(Command defaultCommand) {
     // TODO Auto-generated method stub
     super.setDefaultCommand(new tankDriveCommand());
   }

  public DriveTrain() {
  }

  public void setLeftMotors(double speed){
        motorLeft1.set(speed);
        motorLeft2.set(speed);
  }

  public void setRightMotors(double speed){
        motorRight3.set(speed);
        motorRight4.set(speed);
}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
