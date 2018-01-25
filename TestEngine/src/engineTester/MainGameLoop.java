package engineTester;

import org.lwjgl.opengl.Display;

import renderEngine.DisplayManager;

public class MainGameLoop {
	
	public static void main(String[] args) {
		
		
		
		DisplayManager.createDisplay();//open up the dislay
		
		while(!Display.isCloseRequested()) {
			/*
			 * This is the main game loop
			 * 
			 * 
			 * 
			 */
			DisplayManager.updateDisplay(); //update the display
		}
		
		DisplayManager.closeDisplay();//close it
	}
	
}
