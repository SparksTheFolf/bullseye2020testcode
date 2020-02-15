/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Constants;

public class Climber extends Subsystem {
  /**
   * Creates a new Climber.
   */

  public enum ClimberDirection{kOut, kIn};

  private Solenoid ClimberSet;
  
  private TalonSRX winchSRXMotor = new TalonSRX(Constants.WINCH_SRX_MOTOR);
  public Object setWinchMotor;

  public Climber() {
    ClimberSet = new Solenoid(0, 0);
    addChild("ClimberSet", ClimberSet);
  }

  public void setWinchMotor(double speed){

    winchSRXMotor.set(ControlMode.PercentOutput, speed);

  }

  public void ClimberSolenoid(ClimberDirection direction){
    switch(direction){
      case kOut:
      ClimberSet.set(true);
        break;
      case kIn:
      ClimberSet.set(false);
        break;
    }
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
