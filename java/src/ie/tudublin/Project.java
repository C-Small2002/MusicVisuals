package ie.tudublin;

public class Project extends Visual{

    private int mode;

    //Spiral s = new Spiral();
    
    public void setup()
    {
        startMinim();
        colorMode(HSB);
		  loadAudio("Bee Gees - Stayin' Alive (Official Music Video).wav");
		  startListening();
    }

    public void settings(){
		size(1024, 1000, P3D);
	}

    public void draw(){

		background(255);
		
		switch (mode) {
			case 0: 

            //s.render();
				  
		}
		
	}
}
