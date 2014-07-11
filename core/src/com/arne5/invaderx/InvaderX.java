package com.arne5.invaderx;

import com.badlogic.gdx.Game;


public class InvaderX extends Game
    {

    public GameScreen gameScreen;
    public SplashScreen splashScreen;
    @Override
    public void create()
        {
            //load all assets from assets class
            Assets.Load();
            gameScreen = new GameScreen(this);
            splashScreen = new SplashScreen(this);
            setScreen(splashScreen);
            //setScreen(gameScreen);


        }
    }
