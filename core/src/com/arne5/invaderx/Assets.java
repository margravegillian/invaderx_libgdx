package com.arne5.invaderx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
public class Assets
{
    public static Texture texture_background;
    public static Sprite sprite_background;

    public static void Load()
    {


        //background
        texture_background = new Texture("darkPurple960600.png");
        texture_background.setFilter(TextureFilter.Linear,TextureFilter.Linear);
        sprite_background = new Sprite(texture_background);
        //to set 0 in image to bottom?
        sprite_background.flip(false,true);


    }


}
