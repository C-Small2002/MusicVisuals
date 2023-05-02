package ie.tudublin;
import processing.core.PApplet;

public class kalidascope extends Poly
{
    public kalidascope(ProjectVisual v) {
        super(v);
    }

    @Override
    public void render()
    {
        v.background(0);
        v.stroke(255);

        kal();
    }

    void kal()
    {
        //strokeweight starting point
        float sw = 0.7f;
        v.translate(v.width/2, v.height/2);
        int count = 0;

        for(int i = 0; i < 2000;i+=60)
        {
            float radius = 100+i;
            //rotate entire shape
            v.rotate(PApplet.radians(v.frameCount));
            //map of bluish pinkish colours
            float c = PApplet.map(count, 0, v.getAudioBuffer().size() , 200, 400);
            
            v.beginShape();
            //create multiple octogons as one shape
            //until they are in a circular pattern.
            // div twopi for how many sides in the shape, 8 = octogon
            for(float a = 0; a < v.TWO_PI; a+=v.TWO_PI/8)
            {
                float x = radius * v.cos(a);
                float y =  radius * v.sin(a);
                //changes stroke weight on beat
                if(v.beat.isHat())
                {
                    v.strokeWeight(sw);
                    sw+=0.02;
                }
                v.noFill();
                v.stroke(c, 150, 200);
                v.vertex(x*v.getSmoothedAmplitude(), y*v.getSmoothedAmplitude());
                count++;
            }
            v.endShape();
        }        
    }
}

