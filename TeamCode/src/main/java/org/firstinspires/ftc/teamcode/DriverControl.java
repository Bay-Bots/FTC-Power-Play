package org.firstinspires.ftc.teamcode;
import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.navigation.Acceleration;
import org.firstinspires.ftc.robotcore.external.navigation.Orientation;
import org.firstinspires.ftc.teamcode.Base.RobotStructure;

@TeleOp(name="DriverControl")
public class DriverControl extends RobotStructure {
    public void loop() {
    setArmSpeed(-armSpeed);
    initDriver();

    while (gamepad1.dpad_down) {
    setDriverMotorPower(0.25,0.25,0.25, 0.25);

        if (!gamepad1.dpad_down){
        setDriverPowerZERO();
    }
}

while (gamepad1.dpad_up){
    setDriverMotorPower(-0.25,-0.25,-0.25,-0.25);

     if (!gamepad1.dpad_up){
        setDriverPowerZERO();
    }
}

while (gamepad1.dpad_right){
    translateRight(0.25);

     if (!gamepad1.dpad_right){
        translateRight(0);
    }
}

while (gamepad1.dpad_left){
    translateLeft(0.25);

      if (!gamepad1.dpad_left){
        translateLeft(0);
    }
}
}
}
