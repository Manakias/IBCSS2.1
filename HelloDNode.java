public class HelloDNode{
  public static void main(String[] args){
    DNode dnode1 = new DNode();
    DNode dnode2 = new DNode();
    DNode dnode3 = new DNode();
    DNode dnode4 = new DNode();
    DNode dnode5 = new DNode();
    dnode1.addNext(dnode2);
    dnode1.addNext(dnode3);
    dnode1.addNext(dnode4);
    dnode1.addNext(dnode5);
    dnode2.addNext(dnode4);
    dnode2.addNext(dnode5);
    dnode3.addNext(dnode2);
    dnode3.addNext(dnode1);
    dnode4.addNext(dnode4);
    dnode4.addNext(dnode5);
    dnode4.addNext(dnode1);
    dnode5.addNext(dnode3);
    dnode5.addNext(dnode2);
    
//    node1.nexts.removeHead();
//    node2.nexts.removeHead();
//    node3.nexts.removeHead();
//    node4.nexts.removeHead();
//    node5.nexts.removeHead();
    
    for(int i=0;i<dnode1.nexts.length;i++){
      System.out.println(dnode1.getNextI(i));}
    System.out.println("1");
  
    for(int i=0;i<dnode2.nexts.length;i++){
      System.out.println(dnode2.getNextI(i));}
    System.out.println("2");
    
    for(int i=0;i<dnode3.nexts.length;i++){
      System.out.println(dnode3.getNextI(i));}
    System.out.println("3");
    
    for(int i=0;i<dnode4.nexts.length;i++){
      System.out.println(dnode4.getNextI(i));}
    System.out.println("4");
    
    for(int i=0;i<dnode5.nexts.length;i++){
      System.out.println(dnode5.getNextI(i));}
    System.out.println("5");

    for(int i=0;i<dnode1.prevs.length;i++){
      System.out.println(dnode1.getPrevI(i));}
    System.out.println("1");
  
    for(int i=0;i<dnode2.prevs.length;i++){
      System.out.println(dnode2.getPrevI(i));}
    System.out.println("2");
    
    for(int i=0;i<dnode3.prevs.length;i++){
      System.out.println(dnode3.getPrevI(i));}
    System.out.println("3");
    
    for(int i=0;i<dnode4.prevs.length;i++){
      System.out.println(dnode4.getPrevI(i));}
    System.out.println("4");
    
    for(int i=0;i<dnode5.prevs.length;i++){
      System.out.println(dnode5.getPrevI(i));}
    System.out.println("5");
    
    
  }



}



