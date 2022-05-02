import processing.core.PApplet;

public class Sketch extends PApplet {

  // Local Variables
  int MouseX;
  int MouseY;
  boolean keyPressed;
  boolean mousePressed;
  int mouseClicked;
  int mouseDragged;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(156, 154, 145);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

// House Bricks
fill(194, 162, 138);
rect(width/4, (float) (height/2.58), width/2, height/2);

// Front Door
fill(0, 0, 0);
rect((float) (width/2.29), (float) (height/1.43), width/8, (float) (height/5.33));

// Front House Window 1
fill(255, 21, 0);
rect((float) (width/3.57), (float) (height/1.43), width/8, height/8);

// House Window Strip 1
fill(51, 0, 0);
rect((float) (width/3.74), (float) (height/1.43), (float) (width/6.66), height/80);

// Front House Window 2
fill(255, 21, 0);
rect((float) (width/1.68), (float) (height/1.43), width/8, height/8);

// House Window Strip 2
fill(51, 0, 0);
rect((float) (width/1.72), (float) (height/1.43), (float) (width/6.66), height/80);

// Front House Window 3
fill(255, 21, 0);
rect((float) (width/3.57), height/2, (float) (width/5.33), height/8);

// House Window Strip 3
fill(51, 0, 0);
rect((float) (width/3.74), height/2, (float) (width/4.70), height/80);

// Front House Window 4
fill(255, 21, 0);
rect((float) (width/1.88), height/2, (float) (width/5.33), height/8);

// Window Strip 4
fill(51, 0, 0);
rect((float) (width/1.92), height/2, (float) (width/4.71), height/80);

// Door Handle
fill(255, 204, 0);
ellipse((float) (width/1.86), (float) (height/1.27), width/40, height/40);

// House Roof
fill(0, 0, 0);
triangle(width/2, (float) (height/5.33), (float) (width/1.23), (float) (height/2.29), (float) (width/5.33), (float) (height/2.29));
}

public void mousePressed() {
  fill(0, 255, 255);
    ellipse(mouseX, mouseY, 25, 25);
}

public void mouseClicked() {
  fill(0, 255, 0);
  ellipse(mouseX, mouseY, 50, 50);
}
  
public void keyPressed () {
  if(keyPressed){
    background(171, 245, 247);
  }
  else{
    background(252, 244, 242);
      }
    } 
}
  


      


