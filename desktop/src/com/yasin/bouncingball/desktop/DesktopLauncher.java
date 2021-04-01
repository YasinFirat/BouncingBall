package com.yasin.bouncingball.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.yasin.bouncingball.BouncingBall;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width=BouncingBall.WIDTH;
		config.height=BouncingBall.HEIGHT;
		new LwjglApplication(new BouncingBall(), config);
	}
}
