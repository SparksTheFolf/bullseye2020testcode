/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

// import org.json.simple.JSONObject;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.cscore.VideoSink;
import edu.wpi.cscore.VideoSource;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.interfaces.Gyro;


// 4984 added below
import edu.wpi.cscore.UsbCamera;
import edu.wpi.cscore.VideoSink;
import edu.wpi.cscore.VideoSource;
import edu.wpi.first.cameraserver.CameraServer;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  public static DriveTrain driveTrain = new DriveTrain();

  // public static Solenoids solenoids = new Solenoids();
  // public static Motors motor = new Motors();
  public static OI m_oi;

  public static UsbCamera usbCamera1 = null;
  public class CameraThread extends Thread {
      final int CAMERA1 = 0;
      private int currentCamera = CAMERA1;

      VideoSink server;
      
      public void run(){
          System.out.println("CameraThread running");
         // currentCamera = CAMERA1;
       }

       // Method for setting a lower camera resolution = lower bandwidth
       // As low we can go before to little pixels
       public void setResolutionLow(){
          System.out.println("CameraThread rsetResolutionLow running");
          usbCamera1.setResolution(150, 150);
      }

      // Method for setting Camera Resoltuion
      //   This seems to be as high as we can go without exceeding bandwidth is 225
      public void setResolutionHigh(){
          System.out.println("CameraThread rsetResolutionHigh running");
          usbCamera1.setResolution(200, 200);
          usbCamera1.setFPS(10);
      }

      // Method for setting the camera being displayed
      //   Because bandwidth limits don't allow both
      public void setCameraSource(){
          System.out.println("CameraThread setCameraSource running");
          server.setSource(usbCamera1);
      }

      // Method for getting camera settings
      public void getCameraConfig(){
          System.out.println("CameraThread getPrintCameraConfig running");
          String cameraConfig; 
          cameraConfig = usbCamera1.getConfigJson();
          if (cameraConfig.isEmpty() == false) {
              System.out.println("-----------------------CameraConfig is OPERATIONAL-----------------------");
              System.out.println(cameraConfig.toString()); //print to console
          }
      }

      // Method for setting camera settings; adjust as needed
      public void setCameraConfig(){
          System.out.println("CameraThread setPrintCameraConfig running");

          /*
          JSONObject cameraConfiguration = new JSONObject();
          cameraConfiguration.put("fps", "3");
          cameraConfiguration.put("raw_brightness", "133");
          cameraConfiguration.put("brightness", "95");
          cameraConfiguration.put("raw_contrast", "5");
          cameraConfiguration.put("contrast", "50");
          String cameraConfigString = cameraConfiguration.toString(); */
          //usbCamera1.setConfigJson(cameraConfigString);
          usbCamera1.setFPS(30);
          usbCamera1.setBrightness(45);  // this works
          usbCamera1.setExposureAuto();  // this works
          //usbCamera1.setExposureManual(50);  // this works
          //usbCamera1.setResolution(500, 500);

          //double currFPS = usbCamera1.getActualFPS();
          //System.out.println("FPS = " + currFPS);
      }
  }
  public static CameraThread myCameraThread;
    

//   public static CameraThread myCameraThread;



  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {
    m_oi = new OI();

    myCameraThread = new CameraThread();
    usbCamera1 = CameraServer.getInstance().startAutomaticCapture(myCameraThread.CAMERA1);
    myCameraThread.server = CameraServer.getInstance().getServer();

    usbCamera1.setConnectionStrategy(VideoSource.ConnectionStrategy.kKeepOpen);

    // Test: Get/Set Camera Configuration

    myCameraThread.setCameraConfig();
   
    myCameraThread.start();
    //myCameraThread.setCameraSource();
    myCameraThread.setResolutionHigh();
    myCameraThread.getCameraConfig();

  }

  /**
   * This function is called every robot packet, no matter the mode. Use
   * this for items like diagnostics that you want ran during disabled,
   * autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
  }

  /**
   * This function is called once each time the robot enters Disabled mode.
   * You can use it to reset any subsystem information you want to clear when
   * the robot is disabled.
   */
  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different autonomous modes using the dashboard. The sendable
   * chooser code works with the Java SmartDashboard. If you prefer the
   * LabVIEW Dashboard, remove all of the chooser code and uncomment the
   * getString code to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional commands to the
   * chooser code above (like the commented example) or additional comparisons
   * to the switch structure below with additional strings & commands.
   */
  @Override
  public void autonomousInit() {

  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.
    // if (m_autonomousCommand != null) {
    //   m_autonomousCommand.cancel();
    // }
  }

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
  }
}
