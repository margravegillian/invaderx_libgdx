package com.arne5.invaderx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class GameScreen implements Screen
{
    private InvaderX game;
    OrthographicCamera camera;
    SpriteBatch batch;



    public GameScreen(InvaderX game)
    {

        this.game = game;

        camera = new OrthographicCamera();
        camera.setToOrtho(true,960,600);
        batch = new SpriteBatch();



    }


    @Override
    public void render(float delta)
    {
        Gdx.gl.glClearColor(1f,1f,1f,1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        batch.setProjectionMatrix(camera.combined);

        batch.begin();
        //rendering code
        batch.draw(Assets.spriteBackground,0,0);
        //draw from texture sheettest
       // batch.draw(Assets.spriteRed,256,256);
       // batch.draw(Assets.spriteBlue,512,512);

        batch.end();


    }

    @Override
    public void resize(int width, int height)
    {

    }

    @Override
    public void show()
    {

    }

    @Override
    public void hide()
    {

    }

    @Override
    public void pause()
    {

    }

    @Override
    public void resume()
    {

    }

    @Override
    public void dispose()
    {

    }
}
