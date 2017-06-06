String name01 = "Adams Apfel";
String name02 = "Bernd Birne";
String name03 = "Christoph Ce";

String number01 = "0190 666666";
String number02 = "0171 12345678";
String number03 = "0800 CHRISTOPH";
void setup(){
size(400,800);

}

void draw(){
  background(255);

  fill(0);
  textSize(24);
  text("Telefonbuch:",20,40);

  textSize(14);
  text(name01 + ": " + number01, 20, 80);
  text(name02 + ": " + number02, 20, 110);
  text(name03 + ": " + number03, 20, 140);


}
