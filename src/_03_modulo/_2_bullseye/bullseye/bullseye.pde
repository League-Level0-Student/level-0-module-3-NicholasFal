
void setup() {
 size(500,500);
  // set the size of your sketch
  
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
    for(int circles = 9; circles > 0; circles--) {
    if(circles % 2 == 0) { 
      fill(0, 0, 0);
    } else {
         fill(255, 0,0);
    }
  
  
    ellipse(250,250,circles * 50, circles * 50); 
    
  //Use an if statement and modulo to alternate the color of your rings.
  
    }
}
