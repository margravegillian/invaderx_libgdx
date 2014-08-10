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

		float screenWidth;
		float screenHeight;
		int ANDROID_WIDTH = Gdx.graphics.getWidth();
		int ANDROID_HEIGHT = Gdx.graphics.getHeight();
		Vector3 touch;


		Player player;


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







				//use player class now instead
				player = new Player();



				//player.bounds.setPosition(screenWidth/2-playerShipWidth/2,screenHeight-playerShipHeight);
				//playerShip = new Sprite(Assets.shipGreen);
				//playerShip.setPosition(screenWidth/2-playerShipWidth/2,screenHeight-playerShipHeight);
				//playerShip.scale(-1.5f);
				//playerShipSpeed = 10.0f;
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



				//player.shipSprite.draw(batch); //this is right size though?

				//draw player instead of ship now need to figure out how to make smaller
				batch.draw(player.shipSprite,player.bounds.x,player.bounds.y);






				//test

				//draw from packed textureatlas

				//batch.draw(Assets.shipGreen,shipPosition.x ,shipPosition.y , 30, 30);




				batch.end();


			}


		public void generalUpdate(Vector3 touch, OrthographicCamera camera)
			{

				//new move ship with player ship

				if(Gdx.input.isKeyPressed(Input.Keys.LEFT) || Gdx.input.isKeyPressed(Input.Keys.A))
					{
						player.bounds.x -=player.getSpeed();
						//playerShip.translateX(-playerShipSpeed);
						//shipPosition.x -= 200 * Gdx.graphics.getDeltaTime() * playerShipSpeed;


					}
				else if(Gdx.input.isKeyPressed(Input.Keys.RIGHT) || Gdx.input.isKeyPressed(Input.Keys.D))
					{
						player.bounds.x +=player.getSpeed();
						//playerShip.translateX(playerShipSpeed);
						//shipPosition.x +=200 * Gdx.graphics.getDeltaTime() *playerShipSpeed;
					}
				if(Gdx.input.isKeyPressed(Input.Keys.UP) || Gdx.input.isKeyPressed(Input.Keys.W))
					{
						player.bounds.y -=player.getSpeed();
						//playerShip.translateY(-playerShipSpeed);
					}
				else if(Gdx.input.isKeyPressed(Input.Keys.DOWN) || Gdx.input.isKeyPressed(Input.Keys.S))
					{
						player.bounds.y +=player.getSpeed();
						//playerShip.translateY(playerShipSpeed);
					}

				if(player.bounds.getX() <0)
					{
						player.bounds.x=0;
					}

				if(player.bounds.getX() >screenWidth -player.shipSprite.getWidth())
					{
						player.bounds.x= screenWidth-player.shipSprite.getWidth();
					}

				if(player.bounds.getY() <screenHeight-(player.shipSprite.getHeight()*2))
				{
					player.bounds.y = screenHeight -(player.shipSprite.getHeight()*2);
				}

				if(player.bounds.getY()> screenHeight - player.shipSprite.getHeight() )
					{
						player.bounds.y= screenHeight-player.shipSprite.getHeight();
					}


				//to make collision but not implemented yet
				//if(player.bounds.overlaps())
				//	{

				//	}



				//Don't go off screen old way with no player
				/*if(playerShip.getX() < 0)
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
*/

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
