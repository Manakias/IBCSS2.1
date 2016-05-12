public class anImplementation implements anInterface, secondInterface{
  public void statement(){
    System.out.println("This is the statement, from an implementation of an interface.");
    System.out.println("Interface says... " + anInterface.intro);
    
    public void statement2(){
      System.out.println("The second interface replies..." + secondInterface.intro2);
    }
  }
}
