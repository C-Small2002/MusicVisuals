package ie.tudublin;

import processing.core.PApplet;

public class Bloom extends Poly{

    float angle;
    float x;
    float y;


    public Bloom(ProjectVisual v){
        super(v);
    }

    @Override
    public void render() {
        v.background(0);
        //v.strokeWeight(15); //different thicknesses of rect produce different resulting flower-esque patterns
        float cRange;//colour range
        v.noStroke();
        v.translate(v.width/2, v.height/2); //draws at the centre of the screen

        v.pushMatrix();
        for(int i = 0; i < 400; i++){ //400 is number of squares on screen at any moment
            if(v.beat.isKick()){// changes the range of colours being mapped based on if there is a kick in the song
                cRange = 3000;
              }
              else{
                cRange = 5000;
              }
            //v.fill(v.getAudioBuffer().get(i)*i*i,10,255);
            //v.fill(v.getAudioBuffer().get(i)*i*i,50,100);
            //v.fill(v.getAudioBuffer().get(i)*i*i,v.getAudioBuffer().get(i)*i*i*i,v.getAudioBuffer().get(i)*i*i);
            float c2 = v.getAudioBuffer().get(i)*i*i;//allows for synced color change at centre of bloom creating a pistil-esque pattern
            float c = PApplet.map(i,0, v.getAudioBuffer().size() , 0, cRange);
            v.fill((c2/2)+50,c+50,c+30);//allows for darker edges of the flower creating an almost 3d shape
            v.scale(0.95f);//scales the shape by the percentage given
            v.rotate(PApplet.radians(angle));
        
            v.rect(0,0,v.getSmoothedAmplitude()*5000,v.getSmoothedAmplitude()*5000);
            //v.rect(0,0,700,700);
           
            
            
        }
        v.popMatrix();

        /*v.pushMatrix();
        for(int i = 0; i < 200; i++){
            v.fill(v.getAudioBuffer().get(i),50,100);
            v.scale(0.98f);
            v.rotate(PApplet.radians(angle));

            v.rect(0,0,v.getSmoothedAmplitude()*5000,v.getSmoothedAmplitude()*5000);
            
        }
        v.popMatrix();
        */
        
        angle+=(PApplet.map(v.getAmplitude(), 0, 1.0f, 0, 2f));
    }
    
}
