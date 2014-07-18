package com.arne5.invaderx.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.arne5.invaderx.InvaderX;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;

public class DesktopLauncher {
	public static void main (String[] arg) {
    //add packing the textures when desktop runs
    TexturePacker.Settings settings = new TexturePacker.Settings();
    TexturePacker.process(settings, "C:/Development/github/invaderx_libgdx/invaderximages","C:/Development/github/invaderx_libgdx/android/assets","pack");
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new InvaderX(), config);
        config.title = "InvaderX";
        //config.width=960;
       // config.height=600;
		config.width=800;
		config.height=480;

	}
}
