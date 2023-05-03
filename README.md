# Music Visualiser Project

Name:Cathal Small, Fionn Seville, Lilja O'Byrne

Student Number: C21414822, C21383891, C21385033

## Instructions
- Fork this repository and use it a starter project for your assignment
- Create a new package named your student number and put all your code in this package.
- You should start by creating a subclass of ie.tudublin.Visual
- There is an example visualiser called MyVisual in the example package
- Check out the WaveForm and AudioBandsVisual for examples of how to call the Processing functions from other classes that are not subclasses of PApplet

# Description of the assignment

## CATHAL:
For my portion of the assignment, I was in charge of setting up the files with polymorphism as well as creating two visuals. The first of these visuals was Spiral.java. The circles that make up this spiral all change size based on the SmoothedAmplitude with the rotation of it being mapped to SmoothAmplitude too. The second visual I made was Bloom.java, which was done to represent a flower. The flower is made up of rectangles that scale and rotate in sync to the music. There is also a colour change occurning at the centre of the flower, which creates a pistil. This pistil is also synced to the music.

# Instructions
## KeyPressed
A KeyPressed function is used to swap between the visuals
Pressing a number between 1 and 6 will change the visual playing at that time
Pressing space will pause the song and pressing it again will resume from where you paused it.
If you want to restart the song, you can press r or R.

# How it works
## CATHAL:
### Spiral.java: 
This uses two for loops,each of which contribute a different aspect to the spiral. The outer loop sets the number of "strands" of the inner loops by rotating the whole visual by a fixed constantly increasing amount. By rasing or lowering the value of the index variable "a" in the for loop, you can increase or decrease the amount of spirals and change the pattern created by the rotations. The outer for loop also maps the angle of rotation to the SmoothedAmplitude allowing for the rotation of the spirals to sync to the music. The inner for loops are used to create the spiral itself. Each iteration will draw a circle, the diameter and colour of which is synced to the song, and rotate by the angle calculated in the outer for loop. BeatDetect is used to change the colour range of the spiral too. When a kick is detected in the song, the spiral will flash with a different range of colours.

### Bloom.java:
This visual uses one for loop to draw rectangles to the screen. These rectangles are synced to the music using the SmoothedAmplitude. These rectangles are then rotated, in sync to the music, and its this rotation that creates the flower like design seen. To make pistil at the centre of the flower, I set the hue to be the audiobuffer.get(i). This synced the colour of the centre of the flower to the music whilst creating a unifrom colour for the rest of the flower. To create the darker edges of the flower, I used map to allow for the audiobuffer size and the colour range to change 'i'. All of this was scaled and the same beat kick function used in Spiral.java was used to change the colour range.

## LILJA:
### Kalidascope:
This visual contains a series of octagons positioned in a circle. These octagons all create one single shape. This is done using TWO_PI and sin and cos.
The shape is then rotated according to the frame count.
On each beat the stroke weight increases and the entire shape beats outwards.
 
### Cubes:
This visual contains several 3D boxes converged in the centre. At first the shape is large, filling up the screen and it gradually gets smaller until it stays a specific size. Surrounding these boxes are rectangles that are being ''sucked'' into the centre, imitating a black hole. The idea was that the cube structure is pulling all the rectangles into it. There are also small circles that surround the boxes and slowing fall out from it.
This visual is done by using a timer and lerp function to set the size change of the boxes.
The position of the boxes are set on angles so that they are not piled on top of one another. 
The shape is rotated and the angle is incremented so that there is constant movement.

## FIONN:
### Cubesquared2.java
this visual uses three nested for loops setting the value of x,y,z iterating between negative off max which designates how many pixels off centre of the chosen axis it would be to its positive (negative being left and positive being right).the xo ,yo and zo variables are incremented by 50 each time to space out the cubes by 50 pixels vertically,horizontally and by depth.i rotated the entire box and also each individual box using the framecount variable as using smoothamplitude() caused it to look choppy and unnapealling and framecount gave it a smoother rotation. i also added a scale factor variable that for each iteration of the loop chooses a random float between 0.5 and 2.0 which in turn scales the individual boxes randomly. i did also have another iteration of this where fill and stroke colours changes aswell as incrementing the translate of each axis based on framecount and smoothamplitude ,but in the end decided this was better.

### SinWaves.java
this visual creates a 20 by 20 grid of what originally was supposed to be spheres but due to system constraints i was unable to use,so i settled for boxes.my main idea with this visual was to see what i could do using more complex maths mainly using sin, i was able to implement a box size variable that progressively edits the box size of each box within a certain distance along a sinusoidal wave which gives the affect  of the boxes dissapearing and reapearing in a wave, also synced this wave by incrementing the angle variable to get smooth amplitude.i also synced the overall grid size based on smoothamplitude() and current x,y,z values

# What I am most proud of in the assignment

## CATHAL:
The part of this assignment I'm most proud of would have to be setting up the files to use polymorphism. As much fun as it was creating the spiral and figuring out the maths for it and the bloom visual, I have always been quite good at trigonometry, so I don't feel I learned as much from those as I did with the polymorphism. Before this assignment, I had no exposure to polymorphism in code and had no knowledge of how to implement it. However, after plenty of trial and error as well as tons of research, I managed to implement it perfectly and ensured that it was simple to use for the other members in my group. It left me feeling satisfied as I managed to do something that I previously wouldn't have tried doing because I thought it'd be too difficult. I feel like if I needed to use polymorphism anywhere in the future, I'd be able to implement it with no hassle.

## LILJA:
I am most proud of the cubic visual. I spent awhile changing around the variables and trying different things to get to the shape I was happy with. I enjoyed playing around with 3D shapes and am quite proud how it turned out.

## Fionn:
I am most proud of the SinWaves visual it was interesting seeing the different affects the use of sin and cos can have on an otherwise basic visual,which a lot of the time was trial and error.I also feel my level of understanding of java has significantly improved throughout my many ,many attempts at different visuals.

# What I Learned:
## CATHAL:
I learned quite a lot in this assignment. As I said earlier, I learned a lot about how polymorphism works and how to implement it for a project like this, but I also learned how to use Git and GitHub to manage a project like this. I'd never used Git or GitHub before this module so I had no experience with it going in. However, I now feel quite comfortable using it and now know how to solve merge conflicts and deal with pull requests. I also learned a great deal more about processing and the ways it can be used to create art. Finally, I learned that theres a limit on how many times you can hear Stayin Alive before it gets a bit annoying.

## LILJA:
During the project I was able to see the effects of maths visualised on screen. It was interesting to see how different maths functions behaved visually and I learned a lot from it.
I also learned a lot about github and how to work on projects together through upstream and pull requests. It's definitely an invaluable skill for industry.

## Fionn:
I struggled quite a bit with understanding how to change values and to correspond with my ideas, hence why my ideas for visuals changed a lot throughout working on this project.I think my understanding of git has also improved a lot which will hopefully help me in the future.

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

