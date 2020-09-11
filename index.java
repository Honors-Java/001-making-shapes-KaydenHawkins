// welcome! 😄🔥

void setup() {
	size(400, 400);
}

void draw() {
	background(255);
	ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //this rectangle is the start of your army tank
  //all of your programming should be after this 👍 
  rect(200, 200, 100, 50);
  rect(175, 158, 50, 30);
  rect(250, 150, 100, 10);
  ellipse(150, 230, 25, 25);
  ellipse(175, 230, 25, 25);
  ellipse(200, 230, 25, 25);
  ellipse(225, 230, 25, 25);
	ellipse(250, 230, 25, 25);
}