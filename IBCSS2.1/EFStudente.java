public class EFStudente{
  private String name;
  private int ID;
  private String classRank;
  public EFStudente(String studentName){
    this.name = new String ( studentName );
    this.ID = -1;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
  public void setID(int ID){
    this.ID = ID;
  }
  public int getID(){
    return this.ID;
  }
  public void creds(){
    System.out.println("Student name is " + this.getName() + ", with ID# " + this.getID());
  }
  public void intro(EFStudente other){
    System.out.println("Hello " + other.getName() + ", my name is " + this.getName() + ", and I am a " + this.getClassRank());
  }
  public void setClassRank(String classRank){
    this.classRank = classRank;
  }
  public String getClassRank(){
    return this.classRank;
  }
}

  