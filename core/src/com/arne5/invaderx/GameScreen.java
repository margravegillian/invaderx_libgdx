package com.arne5.invaderx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;


public class GameScreen implements Screen
	{
		private InvaderX game;
		OrthographicCamera camera;
		SpriteBatch batch;
		float playerShipWidth;
		float playerShipHeight;
		float screenWidth;
		float screenHeight;
		int ANDROID_WIDTH = Gdx.graphics.getWidth();
		int ANDROID_HEIGHT = Gdx.graphics.getHeight();
		Vector3 touch;

		float playerShipSpeed;
		private Sprite playerShip;


		public GameScreen(InvaderX game)
			{

				this.game = game;

				camera = new OrthographicCamera();
				camera.setToOrtho(true,ANDROID_WIDTH,ANDROID_HEIGHT);
				// camera.setToOrtho(true, 800, 480);
				//camera.setToOrtho(true, 960, 600);
				batch = new SpriteBatch();

				screenHeight= Gdx.graphics.getHeight();
				//screenHeight = 800;
				screenWidth = Gdx.graphics.getWidth();
				//screenWidth = 480;
				playerShip = new Sprite(Assets.shipGreen);
				playerShipHeight = playerShip.getHeight();

				playerShipWidth = playerShip.getWidth();
				playerShip.setPosition(screenWidth/2-playerShipWidth/2,screenHeight-playerShipHeight);
				playerShip.scale(-1.5f);

				playerShipSpeed = 10.0f;
				//touch screen
				touch = new Vector3();



			}


		@Override
		public void render(float delta)
			{
				Gdx.gl.glClearColor(1f, 1f, 1f, 1f);
				Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

				//try to get ship width and height





				camera.update();

				//movement etc
				generalUpdate(touch,camera);

				batch.setProjectionMatrix(camera.combined);


				batch.begin();
				//rendering code
				batch.draw(Assets.spriteBackground, 0, 0);


				//draw ship
				playerShip.draw(batch);


				//test

				//draw from packed textureatlas

				//batch.draw(Assets.shipGreen,shipPosition.x ,shipPosition.y , 30, 30);


				//draw from texture sheettest
				// batch.draw(Assets.spriteRed,256,256);
				// batch.draw(Assets.spriteBlue,512,512);

				batch.end();


			}


		public void generalUpdate(Vector3 touch, OrthographicCamera camera)
			{

				//Don't go off screen
				if(playerShip.getX() < 0)
					{
						playerShip.setPosition(0,playerShip.getY());

					}
				if(playerShip.getX() > screenWidth - playerShipWidth)
					{
						playerShip.setPosition(screenWidth-playerShipWidth,playerShip.getY());
					}
				if(playerShip.getY() <screenHeight-(playerShipHeight*2))
					{
						//don't let ship go above it self more than /2
						playerShip.setPosition(playerShip.getX(),screenHeight- (playerShipHeight*2));
					}
				if(playerShip.getY() > screenHeight -playerShipHeight)
					{
						playerShip.setPosition(playerShip.getX(),screenHeight-playerShipHeight);
						//playerShip.setPosition(playerShip.getX(),screenHeight-(playerShipHeight *2));

					}
				// move ship
				if(Gdx.input.isKeyPressed(Input.Keys.LEFT) || Gdx.input.isKeyPressed(Input.Keys.A))
					{
						playerShip.translateX(-playerShipSpeed);
						//shipPosition.x -= 200 * Gdx.graphics.getDeltaTime() * playerShipSpeed;


					}
				else if(Gdx.input.isKeyPressed(Input.Keys.RIGHT) || Gdx.input.isKeyPressed(Input.Keys.D))
					{
						playerShip.translateX(playerShipSpeed);
						//shipPosition.x +=200 * Gdx.graphics.getDeltaTime() *playerShipSpeed;
					}
				if(Gdx.input.isKeyPressed(Input.Keys.UP) || Gdx.input.isKeyPressed(Input.Keys.W))
					{
						playerShip.translateY(-playerShipSpeed);
					}
				else if(Gdx.input.isKeyPressed(Input.Keys.DOWN) || Gdx.input.isKeyPressed(Input.Keys.S))
					{
						playerShip.translateY(playerShipSpeed);
					}


				//move ship touch not using this anyway need virtual buttons
				if(Gdx.input.isTouched())
					{
						//touch.set(Gdx.input.getX(),Gdx.input.getY(),0);
						//camera.unproject(touch);
						//set position works but want it to move
						//playerShip.setPosition(touch.x,touch.y);
						//playerShip.translate(touch.x,touch.y);

						//playerShip.translateX(touch.x);
						//playerShip.translateY(touch.y);



					}


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
