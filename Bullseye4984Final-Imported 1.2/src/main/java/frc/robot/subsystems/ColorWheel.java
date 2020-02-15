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

public class ColorWheel extends Subsystem {
  /**
   * Creates a new ColorWheel.
   */

  private TalonSRX colorWheelMotor = new TalonSRX(Constants.COLOR_WHEEL_SRX_MOTOR);
  public Object setcolorWheelMotor;
  public ColorWheel() {

  }

  public void setcolorWheelMotor(double speed){

    colorWheelMotor.set(ControlMode.PercentOutput, speed);

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
