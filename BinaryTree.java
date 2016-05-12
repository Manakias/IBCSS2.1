public class BinaryTree{

public TNode root;
public int height;
public BinaryTree(){
root = null;}

public void addNode(TNode start, TNode newnode){
if (start==null){start = newnode;}
else if(start.left==null){
start.left = newnode;
height = height + 1;}
else if(start.right==null){
start.right = newnode;
height = height + 1;}

//overload addNode
//says how far down you can go to try to look for an empty slot
//check h=0, h=1, etc.

