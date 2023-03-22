package ie.tudublin;

import processing.core.*;

import javax.print.attribute.standard.PageRanges;

import ddf.minim.*;
import ddf.minim.analysis.*;


public class Spiral{ // allows me to use methods from PApplet and Visual

    //private float angle = 0; // the angle of spin of the spiral
   // private int angleIncrement = 3; // the amount the angle is incremented by

    Visual v;

    public Spiral(ProjectVisual v){
        this.v = v;
    }

    void render(){
        float rad = 2f; // the float size for the spiral
        int numPoints = 6;
        float point = PApplet.TWO_PI / (float) numPoints;
        v.strokeWeight(7);                
        float x1 = v.width / 2, y1 = v.height / 2;
        for(int i = 0 ; i < 100 ; i ++)
        {
            for (int j=0; j< 10 ; j++)
            {
            float c = PApplet.map(i, 0, 300, 0, 255) % 255.0f;
            v.stroke(c, 255, 255, 255);
            float theta = i * (point + v.getSmoothedAmplitude() * 5);
            float x = v.width / 2 + PApplet.sin(theta) * rad; // the rotation x
            float y = v.height / 2 - PApplet.cos(theta) * rad;// rotation y
            rad += 0.5f + v.getSmoothedAmplitude(); // the rotation movement
            v.line(x1, y1, x, y);// the lines mapped
            x1 = x;//declaration
            y1 = y;
            }
        }
    }
}
