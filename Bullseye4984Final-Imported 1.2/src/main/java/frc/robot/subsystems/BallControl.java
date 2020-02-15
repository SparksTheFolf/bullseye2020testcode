/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Constants;

public class BallControl extends Subsystem {
  /**
   * Creates a new BallControl.
   */
  private TalonSRX ballIntakeMotor = new TalonSRX(Constants.BALL_INTAKE_SRX_MOTOR);
  private TalonSRX ballSendoutMotor = new TalonSRX(Constants.BALL_SENDOUT_SRX_MOTOR);
  public Object setBallIntakeMotor;
  public Object setBallSendoutMotor;
  public BallControl() {

  }

  public void setIntakeMotor(double speed){

    ballIntakeMotor.set(ControlMode.PercentOutput, speed);

  }

  public void setSendoutMotor(double speed){

    ballSendoutMotor.set(ControlMode.PercentOutput, speed);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  protected void initDefaultCommand() {
    // TODO Auto-generated method stub

  }
}
