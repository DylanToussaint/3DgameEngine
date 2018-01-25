package renderEngine;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;

public class DisplayManager {
	
	private static final int WIDTH = 1280;
	private static final int HEIGHT = 720;
	private static final int FPS_CAP = 120;
	
	public static void createDisplay() {
		
		//Setting up the attributes of our OpenGl setup
		ContextAttribs attribs = new ContextAttribs(3,2)
			  .withForwardCompatible(true)
			  .withProfileCore(true);
		
		
		//Sets the size of the display
		try {
			Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
			Display.create(new PixelFormat(), attribs);//Create the display
			Display.setTitle("1");
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		
		GL11.glViewport(0, 0, WIDTH, HEIGHT); //Setting up the area of the screen to render the game in.
		
		
	}
	
	public static void updateDisplay() {
		
		Display.sync(FPS_CAP);//Synchronise to a 120fps framerate
		Display.update();
		
	}
	
	public static void closeDisplay() {
		
		Display.destroy();
		
	}
}
