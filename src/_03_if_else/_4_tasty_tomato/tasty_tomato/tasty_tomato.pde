void setup() {
    size(500, 500);
}
void draw() {
   fill(#BFBBBB);
    background(200, 200, 200);
    noStroke();
    fill(#ED1313);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#05AF25);
    rect(176, 103, 12, 32);
    noStroke();
    if(mousePressed){
    fill(#BFBBBB);
    ellipse(75, 200, 25, 25);}
}
