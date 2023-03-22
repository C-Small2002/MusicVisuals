package ie.tudublin;

import processing.core.*;
import ddf.minim.*;
import ddf.minim.analysis.*;


public class Spiral extends Visual{
    private float angle = 0; // the angle of spin of the spiral
    private int angleIncrement = 3; // the amount the angle is incremented by

    Visual v = new Visual();// allows me to use methods from PApplet and Visual

    void render(){
        v.pushMatrix();
        for (int i = 0; i<v.getAudioBuffer().size(); i++){
            float c = v.map(i,0,v.getAudioBuffer().size(),0,255);
            v.stroke(c,255,255);
            angle = v.radians(i);
        }
    }
}
