public class helloStudent{
  public static void main(String[] args){
    EFStudente student1 = new EFStudente("Robert");
    student1.setID(13425);
    student1.setName("Bob");
    student1.setClassRank("Sophomore");
    student1.creds();
    EFStudente student2 = new EFStudente("Alice");
    student2.setClassRank("Freshman");
    student2.setID(13426);
    student1.intro(student2);
    student2.intro(student1);
    EFStudente[] cs17 = new EFStudente[11];
    for (int i=0; i<cs17.length; i++){
      cs17[i] = new EFStudente(1000 + i);}
    //for (int i=0; i<cs17.length; i++){
      //cs17[i].intro(cs17[((i+1)%cs17.length)]);
    //}
    for (int i=0; i<cs17.length; i++){
      for (int j=0; j<cs17.length; j++){
        if (i==j){}
        else{
          cs17[i].intro(cs17[j]);
        }
      }
    }
        
      
    
    //add a variable that gives class rank
    //add a method to EFStudente that uses variable
    //AES student data? Unlock with password?
  }
}