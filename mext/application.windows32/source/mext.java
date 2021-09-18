import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import javax.swing.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class mext extends PApplet {
  public void setup() {


MainFrame frame = new MainFrame();

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 閉じるボタンで終了
frame.setBounds(1920 / 2, 1080 / 2, 1080 / 4, 1920 / 6); // X位置 Y位置 X幅 Y幅
frame.setTitle("mext"); // タイトル
frame.setVisible(true); // 可視化
    noLoop();
  }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "mext" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
