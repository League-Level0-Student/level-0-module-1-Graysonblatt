
void setup() {
size(500, 500);


}
void draw() {


 PImage zombie = loadImage("download.jpeg");
zombie.resize(width, height);
image(zombie, 0, 0);
if(mouseX>=250){
fill(#0A08FA);}
if(mouseY>=250){
 fill(#FF0A12);}
ellipse(305, 75, 50, 50);
ellipse(225, 75, 50, 50);

}
