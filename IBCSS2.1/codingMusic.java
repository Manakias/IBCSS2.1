import java.io.*;
  public class codingMusic{
  public static void main(String[] args){
    PrintWriter scribe = new PrintWriter("music.txt", "UTF-8");
    scribe.write("This is some good coding music. It is some nice Electro-Swing.");
    scribe.write("One of my favorite Electro-Swing artists is Parov Stelar. A lot of his music is in this compilation.");
    scribe.write("https://www.youtube.com/watch?v=C6-TWRn0k4I");
    scribe.close();
    String fileName = "music.txt";
    FileReader literate = new FileReader(fileName);
    char[] words = new char[250];
    literate.read(words);
    for(char c : words){
        System.out.print(c);
    }
  }
  }
    