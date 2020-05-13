void setup(){
size(500, 500);

}
void draw(){
fill(#F70C0C);
 textSize(75);

int Y=50;

 for(int i = 0; i<3; i++){

  text("ice cream", 0, Y+(60*i)); // Y + ( 10 * i )

}
 text("banana", 0, 230);
}
