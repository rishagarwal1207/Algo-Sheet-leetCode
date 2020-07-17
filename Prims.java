import java.util.*;
 class Main{
     public static void main(String args[]){
         int V=5;
           int[][] G = { { 0, 9, 75, 0, 0 }, { 9, 0, 95, 19, 42 }, { 75, 95, 0, 51, 66 }, { 0, 19, 51, 0, 31 },
        { 0, 42, 66, 31, 0 } };
        Main obj=new Main();
        obj.PrimsMSt(G,V);
     }
     void PrimsMSt(int[][] G, int V ){
         int distance[]=new int[V];
         boolean visit[]=new boolean[V];
        int noe=0;
        
        visit[0]=true;
        while(noe<V-1){
        int min=Integer.MAX_VALUE;
        int x=0,y=0;
         for(int i=0;i<V;i++){
                if(visit[i]==true){
                    for(int j=0;j<V;j++){
                        if(!visit[j] && G[i][j]!=0){//75 
                        //System.out.println(j);
                            if(G[i][j]<min){
                                min=G[i][j];
                                x=i;
                                y=j;
                            }
                        }
                    }
                }
         }
         System.out.println(x+" - "+y+" : "+ G[x][y]);
         visit[y]=true;
        noe++;
     }
     }
 }