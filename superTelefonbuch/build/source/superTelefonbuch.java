import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class superTelefonbuch extends PApplet {

JSONArray list;

public void setup(){



list = loadJSONArray("json/list.json");
}

public void draw(){
  background(255);

  fill(0);
  textSize(24);
  text("Telefonbuch:",20,40);

for(int i = 0; i < list.size(); i++){
  JSONObject entry = list.getJSONObject(i);
  text(entry.getString("name") + " : " + entry.getString("number"),20,80 + i*30);

  }
}

  public void mousePressed(){
    list = loadJSONArray("json/list.json");
  }
  public void settings() { 
size(400,800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "superTelefonbuch" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
