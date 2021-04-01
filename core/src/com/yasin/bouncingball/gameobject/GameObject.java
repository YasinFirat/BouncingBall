package com.yasin.bouncingball.gameobject;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

public abstract class GameObject {
  protected Vector2 position;
  protected Vector2 scale;
  protected Color color;

  public GameObject(){}

  public GameObject(Vector2 position, Vector2 scale, Color color){
      this.position=position;
      this.scale=scale;
      this.color=color;
  }
  public abstract void render(ShapeRenderer shape_renderer);

    /**
     *   shape_renderer.begin(ShapeRenderer.ShapeType.Filled);
     *       shape_renderer.setColor(color);
     *       shape_renderer.circle(position.x,position.y,radius,10);
     *       shape_renderer.end();
     * @param delta
     */
  public abstract void update(Float delta);
  public abstract void dispose();

    public Vector2 getPosition() {
        return position;
    }

    public GameObject setPosition(Vector2 position) {
        this.position = position;
        return this;
    }
    public GameObject setPosition(int x, int y){
        this.position.x=x;
        this.position.y=y;
        return this;
    }
    public GameObject setPositionX(int x){
        this.position.x=x;
        return this;
    }
    public GameObject setPositionY(int y){
        this.position.y=y;
        return this;
    }

    public Vector2 getScale() {
        return scale;
    }

    public GameObject setScale(Vector2 scale) {
        this.scale = scale;
        return this;
    }

    public Color getColor() {
        return color;
    }

    public GameObject setColor(Color color) {
        this.color = color;
        return this;
    }
}
