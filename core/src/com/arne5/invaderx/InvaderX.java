package com.arne5.invaderx;

import com.badlogic.gdx.Game;

/**
 * Created by urvaius on 7/10/14.
 */
public class InvaderX extends Game
    {

    public GameScreen game_screen;
    @Override
    public void create()
        {
            //load all assets from assets class
            Assets.Load();
            game_screen = new GameScreen(this);
            setScreen(game_screen);


        }
    }
