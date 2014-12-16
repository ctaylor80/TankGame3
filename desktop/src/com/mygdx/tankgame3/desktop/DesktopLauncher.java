package com.mygdx.tankgame3.desktop;

import com.mygdx.tankgame3.Setup;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.tankgame3.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
                //new LwjglApplication(new Setup(), config);
                new LwjglApplication(new MyGdxGame(), config);
	}
}
