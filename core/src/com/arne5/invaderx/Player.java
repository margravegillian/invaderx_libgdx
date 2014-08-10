package com.arne5.invaderx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by urvaius on 8/10/14.
 */
public class Player

	{
		public Sprite image;
		public Rectangle bounds;
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
			image = Assets.shipGreen;
			image.flip(false,true);
			//image.scale(-1.5f);
			bounds = new Rectangle(Gdx.graphics.getWidth()-image.getWidth(),Gdx.graphics.getHeight()- image.getHeight(),Assets.shipGreen.getWidth(),Assets.shipGreen.getHeight());
			 //dont think this is right


		}
	}
