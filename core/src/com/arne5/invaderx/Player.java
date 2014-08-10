package com.arne5.invaderx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by urvaius on 8/10/14.
 */
public class Player

	{
		public Sprite shipSprite;
		public Rectangle bounds;
		private float height;
		private float width;

		private int speed;

		public int getSpeed()
			{
				return speed;
			}

		public void setSpeed(int speed)
			{
				this.speed = speed;
			}

		public Player()
		{

			speed =10;
			//figure out
			//shipSprite = Assets.shipGreen;
			shipSprite = new Sprite(Assets.shipGreen);
			shipSprite.flip(false,true);
			width = shipSprite.getWidth();
			height = shipSprite.getHeight();


			//shipSprite.setScale(-1.5f);
			//shipSprite.setSize(64,64);
			//shipSprite.scale(-1.5f);

			//image.scale(-1.5f);
			//bounds = new Rectangle(Gdx.graphics.getWidth()-shipSprite.getWidth(),Gdx.graphics.getHeight()- shipSprite.getHeight(),Assets.shipGreen.getWidth(),Assets.shipGreen.getHeight());
			bounds = new Rectangle(Gdx.graphics.getWidth()-shipSprite.getWidth(),Gdx.graphics.getHeight()- shipSprite.getHeight(),width,height);

			   //dont think this is right


		}
	}
