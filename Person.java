public class Person{
  
  public enum Gender{MALE, FEMALE};
  
  private Gender gender;
  private int age;
  private String name;
  
  public Person(Gender gender, int age, String name){
    this.gender = gender;
    this.age = age;
    this.name = name;
  }
  
  public Gender getGender(){return this.gender;}
  public int getAge(){return this.age;}
  public String getName(){return this.name;}
  
  public String introduction(){return "Hello, my name is " + this.name + ". I am " + this.age + " years of age. I am a " + this.gender ".";}
  
  
  
}
  