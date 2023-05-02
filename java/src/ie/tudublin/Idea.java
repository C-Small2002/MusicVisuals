package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class Idea extends Poly {

   
    float angle;
    

    public Idea(ProjectVisual v){
        super(v);
    }

    @Override
    public void render() {
        /* 
        float[] bands = v.getSmoothedBands();
        v.background(0);
        v.noFill();
        v.stroke(255);
        v.lights();
        v.stroke(PApplet.map(v.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        v.camera(0, -500, 500, 0, 0, 0, 0, 1, 0);
        //v.translate(v.width/2,v.height/2);
        for(int i = 0 ; i < bands.length ; i ++)
        {
            float theta = PApplet.map(i, 0, bands.length, 0, PApplet.TWO_PI);

            v.stroke(PApplet.map(i, 0, bands.length, 0, 255), 255, 255);
            float x = PApplet.sin(theta) * radius;
            float z = PApplet.cos(theta) * radius;
            float h = bands[i];
            v.pushMatrix();
            v.translate(x, - h / 2 , z);
            v.rotateY(theta);
            v.box(50, h, 50);
            v.popMatrix();
        }
        */
        /* 
        float gap = v.width / (float) v.getBands().length;
        v.noStroke();
        for(int i = 0 ; i < v.getBands().length ; i ++)
        {
            v.fill(PApplet.map(i, 0, v.getBands().length, 255, 0), 255, 255);
            v.rect(i * gap, v.height, gap,-v.getSmoothedBands()[i]); 
        }
        */
        
        v.background(0);
        v.noFill();
        v.camera(0, -100, 500, 0, 0, 0, 0, 1, 0);
       
        float[] bands = v.getSmoothedBands();
        //v.rotate(PApplet.radians(angle));
        for(int i = 0; i< v.getBands().length; i++){
            float h = bands[i];
            //angle = PApplet.map(i, 0, bands.length, 0, PApplet.TWO_PI);
            //v.rotate(-PApplet.radians(angle));
            v.stroke(PApplet.map(i, 0, bands.length, 0, 255), 255, 255);
            
            v.pushMatrix();
            
            for(int j = 0; j<10; j++){
                
                v.camera(0, -j, 500, 0, 0, 0, 0, 1, 0);
                
                float theta = PApplet.map(j, 0, bands.length, 0, PApplet.TWO_PI);
                v.ellipse(0,0,PApplet.radians(PApplet.sin(theta) * h *2)*50, PApplet.radians(PApplet.cos(theta) * h*2)*50);
                //v.rotate(PApplet.radians(angle));
                //v.box(h);
                
                
            }
          
            v.popMatrix();
            angle+=(PApplet.map(h, 0, 1.0f, 0, 1f));
        }
        
    }
    
}
