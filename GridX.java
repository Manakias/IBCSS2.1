public class GridX{
  
  static int D = 10000;
  static int[][] grid = new int[D][D];
  static int[][] gridB = new int[D][D];
  static boolean[][] gridC = new boolean[D][D];
  static int total=0;
  
  public static void fill(double P){
    for(int i=0; i<D;i++){
      for(int j=0; j<D; j++){
        if(Math.random()<P){grid[i][j]=1;}
        else {grid[i][j]=0;}
      }}}
  
  public static void connect(int a, int b){
     if((a>D-1 | a<0) | (b>D-1 | b<0)){}
     else if(gridC[a][b]){}
     else if(grid[a][b]==0){gridC[a][b]=true;}
     //Now the party starts.
     else{
       gridB[a][b]=1;
       gridC[a][b]=true;
       total = total+1;
       connect(a+1,b);
       connect(a-1,b);
       connect(a,b+1);
       connect(a,b-1);
       }
}
  public static void print( int[][] arr){
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr.length; j++){
        System.out.print( arr[i][j] + " ");
      }
      System.out.print("\n");}}  
  //connect()
  // if (a,b) is outside of grid, do nothing.
  // if gridC[a][b] == true, do nothing.
  // if grid[a][b] == 0, do nothing.
  // else, gridB[a][b] == 1, add to total, and set its gridC[a][b] == true
  // use connect(), on (a+1,b),(a-1,b),(a,b-1),(a,b+1)

    
  
  public static void main(String[] args){
    fill(0.5);
    grid[0][1]=1;
    print(grid);
    connect(0,1);
    System.out.println("-----------------");
    print(gridB);
    System.out.println("\n");
    System.out.println(total + " bits connected.");
   
  
}
}
