package com.yasin.bouncingball;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.yasin.bouncingball.states.PlayState;
import com.yasin.bouncingball.states.StateManager;

public class BouncingBall extends ApplicationAdapter {
	public static final int WIDTH=800;
	public static final int HEIGHT=420;

	SpriteBatch sprite_batch;
	ShapeRenderer shape_renderer;
	private static StateManager state_manager;
	Texture img;
	
	@Override
	public void create () {
		state_manager=new StateManager();
		sprite_batch = new SpriteBatch();
		 shape_renderer=new ShapeRenderer();
		state_manager.push(new PlayState(state_manager));
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		state_manager.render(shape_renderer);
		state_manager.update(Gdx.graphics.getDeltaTime());

	}
	
	@Override
	public void dispose () {
		sprite_batch.dispose();
		img.dispose();
	}
}
