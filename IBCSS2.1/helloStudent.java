public class helloStudent{
  public static void main(String[] args){
    EFStudente student1 = new EFStudente("Robert");
    student1.setID(13425);
    student1.setName("Bob");
    student1.setClassRank("Sophomore");
    student1.creds();
    EFStudente student2 = new EFStudente("Alice");
    student2.setClassRank("Freshman");
    student1.intro(student2);
    student2.intro(student1);
    
    //add a variable that gives class rank
    //add a method to EFStudente that uses variable
  }
}