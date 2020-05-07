
void setup() {
    size(300, 300); fill(#E5C164);
    noStroke();
 ellipse(150, 150, 250, 250);    
fill(#EADE95);
ellipse(150, 150, 225, 225);
    
}
void draw() { 
PImage  pineapple = loadImage ("pineappling.png");
pineapple.resize(50, 50);
PImage pepperoni = loadImage ("pepperoni.png");
pepperoni.resize(50, 100);
fill(#030201);
textSize(17);
text("Only the haters don't like pineapple!", 0, 25);

image(pepperoni, 130, 190);
image(pepperoni, 140, 150);
image(pepperoni, 200, 120);
image(pepperoni, 100, 100);
image(pepperoni, 175, 75);
image(pepperoni, 60, 200);
image(pepperoni, 120, 50);
image(pepperoni, 60, 125);
image(pepperoni, 200, 175);
if(mousePressed){
image(pineapple, mouseX, mouseY );}

}
