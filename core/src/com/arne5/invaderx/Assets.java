package com.arne5.invaderx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class Assets
{
    public static Texture textureBackground;
    public static Sprite spriteBackground;
    public static Texture textureSplash;
    public static Sprite spriteSplash;
    public static Texture textureSheet;
    //load texture sprite from spritesheet.png
    public static Sprite spriteRed;
    public static Sprite spriteBlue;
    public static Sprite spriteYellow;
    public static Sprite spriteGreen;
    public static Sprite shipGreen;

    public static TextureAtlas atlas;
    public static void Load()
    {



        //use texture atlas for my images
        atlas = new TextureAtlas("pack.atlas");
        //try and load and draw from atlas
        shipGreen = atlas.createSprite("playerShip1_green");
        shipGreen.flip(false,true);



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

        //texture sheet
        textureSheet = new Texture("spritesheet.png");
        //to load load from left to right from the sheet. we can use the texture atlas later as we may need
        //this is just for learing right now. as well.
        spriteRed = new Sprite(textureSheet,0,0,16,16);
        spriteBlue = new Sprite(textureSheet,16,0,16,16);

    }


}
