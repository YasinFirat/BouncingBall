package com.yasin.bouncingball.calc;

import com.badlogic.gdx.math.Vector2;

public class Direction {

    private Vector2 point1;
    private Vector2 point2;

    public Direction(Vector2 point1,Vector2 point2){
        this.point1=point1;
        this.point2=point2;
    }

    public float scalar(){
        return point1.x*point2.x+point1.y*point2.y;
    }
    float lengthPoint1(){
        return (float)Math.sqrt(Math.pow(point1.x,2)+Math.pow(point1.y,2));
    }
    float lengthPoint2(){
        return (float)Math.sqrt(Math.pow(point2.x,2)+Math.pow(point2.y,2));
    }

    public float cos(){
        return scalar()/lengthPoint1()*lengthPoint2();
    }
    public float cos(Vector2 point1,Vector2 point2){
        this.point1=point1;
        this.point2=point2;
        return scalar()/lengthPoint1()*lengthPoint2();
    }
    public float sin(){
        return 1-scalar()/lengthPoint1()*lengthPoint2();
    }
    public float sin(Vector2 point1,Vector2 point2){
        this.point1=point1;
        this.point2=point2;
        return 1-scalar()/lengthPoint1()*lengthPoint2();
    }

}
