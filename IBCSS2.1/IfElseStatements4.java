public class IfElseStatements4{
  
  public static void main(String[] args){
   // boolean state1 = true;
    int number = 18;
    String utter;
    
    
    if ( (number%2)==0 ){
      utter = new String(" is even");
    }
    
    else {
      utter = new String(" is odd");
    }
    
    System.out.println(number + utter);
    
  }
}