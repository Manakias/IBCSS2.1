public class MyDNode{
  
  private Object payload;
  public DLnkLoop nexts = new DLnkLoop();
  public DLnkLoop prevs = new DLnkLoop();
  
  public DNode(){}
  
  public DNode(DLnkLoop nexts, DLnkLoop prevs){
    this.nexts=nexts;
    this.prevs=prevs;}
  
  public DLnkLoop getNexts(){
    return this.nexts;}

  public DLnkLoop getPrevs(){
    return this.prevs;}
  
  public Object getPayload(){
    return this.payload;}
  
  public void setNexts(DLnkLoop newNexts){
    this.nexts=newNexts;}
  
  public void setPrevs(DLnkLoop newPrevs){
    this.prevs=newPrevs;}
  
  public void setPayload(Object newPayload){
    this.payload=newPayload;}
  
  public void addNext(DNode nextnode){
    DLnk nodlnk= new DLnk(nextnode);
    nexts.addDLnk(nodlnk);
    nextnode
.addPrev(this);}
  
  public void addPrev(DNode prevnode){
    DLnk nodlnk= new DLnk(prevnode);
    prevs.addDLnk(nodlnk);}
  
  public DNode getNextI(int i){
    return (DNode) nexts.getiLnk(i).getPayload();}

  public DNode getPrevI(int i){
    return (DNode) prevs.getiLnk(i).getPayload();}
  
  
}
  
