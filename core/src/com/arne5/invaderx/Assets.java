package com.arne5.invaderx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
public class Assets
{
    public static Texture textureBackground;
    public static Sprite spriteBackground;
    public static Texture textureSplash;
    public static Sprite spriteSplash;

    public static void Load()
    {


        //background
        textureBackground = new Texture("darkPurple960600.png");
        textureBackground.setFilter(TextureFilter.Linear,TextureFilter.Linear);
        spriteBackground = new Sprite(textureBackground);
        //to set 0 in image to bottom?
        spriteBackground.flip(false,true);

        //splash screen
        textureSplash = new Texture("splash.png");
        textureSplash.setFilter(TextureFilter.Linear,TextureFilter.Linear);
        spriteSplash = new Sprite(textureSplash);
        spriteSplash.flip(false,true);

    }


}
