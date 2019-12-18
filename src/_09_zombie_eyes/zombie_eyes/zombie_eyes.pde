
void setup() {
PImage face = loadImage("Morinio.jpeg");
image(face, 0, 0);
size (400, 400);
face.resize (400, 400);

  
  
  
  










}
void draw() {
  if (mousePressed){
fill (0, 0, 255);
} 
  else {
 fill (255, 0 ,0); 
 }
ellipse (154, 190, 50, 50);
ellipse (220, 180, 50, 50);
fill (0, 0, 0);
ellipse (154, 190, 25, 25);
ellipse (220, 180, 25, 25);

}
