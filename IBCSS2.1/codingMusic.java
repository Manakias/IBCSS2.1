import java.io.FileWriter;
import java.io.IOException;
  public class codingMusic{
  public static void main(String[] args){
    try{
    FileWriter writer = new FileWriter("music.txt", true);
    writer.write("This is some good coding music. It is some nice Electro-Swing. ");
    writer.write("\r\n");
    writer.write("One of my favorite Electro-Swing artists is Parov Stelar. A lot of his music is in this compilation. ");
    writer.write("\r\n");
    writer.write("https://www.youtube.com/watch?v=C6-TWRn0k4I");
    writer.close();}
      catch (IOException e) {e.printStackTrace();}
    }
  }
    