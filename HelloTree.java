public class HelloTree{
public static void main(String[] args){
public static void printTree(Node root){
System.out.println(root);
if(!roots.nexts.s){
for(int i=0;i<root.nexts.length;i++){
printTree(root.getNextI(i));}}
}

Node node1 = new Node();
Node node2 = new Node();
Node node3 = new Node();
Node node4 = new Node();
Node node5 = new Node();
node1.addNext(node5);
node1.addNext(node2);
node2.addNext(node4);
node2.addNext(node3);
printTree(node1);

}
}


