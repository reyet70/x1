/////// What am I trying to do???
//////// What is my name?  (CST 112; September 12, 2015)

//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( 100,200,250 );                // sky
  fill( 255,255,0 );
  ellipse( width*3/4, height/10, 100,100 );    // sun
  // Grass
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  
  /* INSERT YOUR CODE HERE! */
  
  text( "This is NOT a good tree; please fix it!", 150,horizon );
                                       // house

  fill(255,0,47);
  rect (150,65,55,55);
  fill (0,225,215);
  triangle (150,65,178,10,206,65);
  fill (0);

  text( "My name is Scrappy", 10,height-20 );   
  
  fill (105,45,10);
  rect (48,62,30,62);     //tree
  fill (100,200,100);
  triangle (30,75,58,20,86,75);
                                            
  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;
  
  //// SHOW:  display the creature at (x,y)
  
  /* INSERT YOUR CODE HERE! */
  fill(255,0,0);
  rect( x+3,y-10, 40,40 );     

  x= x+0;
  y= y-1;
  x= x+dx;
  
  text( "Violet", x,y);

}


//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -3, +3 );                  // random speed.
  dy=  random( -1, +1 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
}
