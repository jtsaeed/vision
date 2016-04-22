/**
 * Vision - Created and owned by Muhammad Saeed (EddieVanHalen98)
 * 
 * RemoteListener.java
 * Handles the controls for Remote
 * 
 * File created on 22nd April 2016
 */

package com.evh98.vision.util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;

public class RemoteListener extends Listener {
	
	Robot robot;
	
	public RemoteListener() {
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	public void received(Connection connection, Object object) {
		if (object instanceof String) {
			String request = (String) object;
			
			if (request.equals("green")) {
				robot.keyPress(KeyEvent.VK_E);
				robot.keyRelease(KeyEvent.VK_E);
			}
			else if (request.equals("red")) {
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_R);
			}
			else if (request.equals("blue")) {
				robot.keyPress(KeyEvent.VK_F);
				robot.keyRelease(KeyEvent.VK_F);
			}
			else if (request.equals("yellow")) {
				robot.keyPress(KeyEvent.VK_Q);
				robot.keyRelease(KeyEvent.VK_Q);
			}
			else if (request.equals("up")) {
				robot.keyPress(KeyEvent.VK_W);
				robot.keyRelease(KeyEvent.VK_W);
			}
			else if (request.equals("down")) {
				robot.keyPress(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_S);
			}
			else if (request.equals("right")) {
				robot.keyPress(KeyEvent.VK_D);
				robot.keyRelease(KeyEvent.VK_D);
			}
			else if (request.equals("left")) {
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
			}
			else if (request.equals("search")) {
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
			}
			else if (request.equals("a")) {
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
			}
			else if (request.equals("b")) {
				robot.keyPress(KeyEvent.VK_B);
				robot.keyRelease(KeyEvent.VK_B);
			}
			else if (request.equals("c")) {
				robot.keyPress(KeyEvent.VK_C);
				robot.keyRelease(KeyEvent.VK_C);
			}
			else if (request.equals("d")) {
				robot.keyPress(KeyEvent.VK_D);
				robot.keyRelease(KeyEvent.VK_D);
			}
			else if (request.equals("e")) {
				robot.keyPress(KeyEvent.VK_E);
				robot.keyRelease(KeyEvent.VK_E);
			}
			else if (request.equals("f")) {
				robot.keyPress(KeyEvent.VK_F);
				robot.keyRelease(KeyEvent.VK_F);
			}
			else if (request.equals("g")) {
				robot.keyPress(KeyEvent.VK_G);
				robot.keyRelease(KeyEvent.VK_G);
			}
			else if (request.equals("h")) {
				robot.keyPress(KeyEvent.VK_H);
				robot.keyRelease(KeyEvent.VK_H);
			}
			else if (request.equals("i")) {
				robot.keyPress(KeyEvent.VK_I);
				robot.keyRelease(KeyEvent.VK_I);
			}
			else if (request.equals("j")) {
				robot.keyPress(KeyEvent.VK_J);
				robot.keyRelease(KeyEvent.VK_J);
			}
			else if (request.equals("k")) {
				robot.keyPress(KeyEvent.VK_K);
				robot.keyRelease(KeyEvent.VK_K);
			}
			else if (request.equals("l")) {
				robot.keyPress(KeyEvent.VK_L);
				robot.keyRelease(KeyEvent.VK_L);
			}
			else if (request.equals("m")) {
				robot.keyPress(KeyEvent.VK_M);
				robot.keyRelease(KeyEvent.VK_M);
			}
			else if (request.equals("n")) {
				robot.keyPress(KeyEvent.VK_N);
				robot.keyRelease(KeyEvent.VK_N);
			}
			else if (request.equals("o")) {
				robot.keyPress(KeyEvent.VK_O);
				robot.keyRelease(KeyEvent.VK_O);
			}
			else if (request.equals("p")) {
				robot.keyPress(KeyEvent.VK_P);
				robot.keyRelease(KeyEvent.VK_P);
			}
			else if (request.equals("q")) {
				robot.keyPress(KeyEvent.VK_Q);
				robot.keyRelease(KeyEvent.VK_Q);
			}
			else if (request.equals("r")) {
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_R);
			}
			else if (request.equals("s")) {
				robot.keyPress(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_S);
			}
			else if (request.equals("t")) {
				robot.keyPress(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_T);
			}
			else if (request.equals("u")) {
				robot.keyPress(KeyEvent.VK_U);
				robot.keyRelease(KeyEvent.VK_U);
			}
			else if (request.equals("v")) {
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_V);
			}
			else if (request.equals("w")) {
				robot.keyPress(KeyEvent.VK_W);
				robot.keyRelease(KeyEvent.VK_W);
			}
			else if (request.equals("x")) {
				robot.keyPress(KeyEvent.VK_X);
				robot.keyRelease(KeyEvent.VK_X);
			}
			else if (request.equals("y")) {
				robot.keyPress(KeyEvent.VK_Y);
				robot.keyRelease(KeyEvent.VK_Y);
			}
			else if (request.equals("z")) {
				robot.keyPress(KeyEvent.VK_Z);
				robot.keyRelease(KeyEvent.VK_Z);
			}
			else if (request.equals("space")) {
				robot.keyPress(KeyEvent.VK_SPACE);
				robot.keyRelease(KeyEvent.VK_SPACE);
			}
			else if (request.equals("backspace")) {
				robot.keyPress(KeyEvent.VK_BACK_SPACE);
				robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			}
			else if (request.equals("enter")) {
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			}
		}
	}
	
}