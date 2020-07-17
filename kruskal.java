import java.util.*;
class Graph{
    class Edge{     // to store the other edge and weight of edge
        int v, int w;
        public Edge(int v,int w){
            this.v=v; this.w=w;
        }
    }
    List<Edge> G;
    public Graph(int n){
        G= new LinkedList[n];
        for(int i=0;i<G.length;i++){
            G[i]=new LinkedList<>();
        }
    }
    public void addEdge(int u, int v, int w){
       G[u].add(0,new Edge(v,w));
    }
}
class kruskal{
    public static void main(String[] args) {
        Graph obj=new Graph(5);
        obj.addEdge()
        krus(G);
    }
   int findParent(int node){
        if(parent[node]!=node){
            node=parent[node];
            findParent(node);
        }
        return node;
    }
    kruskal(int[][] G){
        int noe= V;//no.of edges
        int parent[]=new int[V];
        for(int i=0;i<V;i++){
            parent[i]=i;        //nodea are their own parents
        } 
        while(noe != 1){
            int u= findParent(x);   //node1
            int v= findParent(y);   //node2
            Set<Integer> set=new HashSet<>(); //set to keep already visited nodes
            if(u==v){
                //already connected;
                set.add(u);
                set.add(v);
            }
            else{
                Res + =G[u][v];
                parent[u]=v;
                noe--;
            }
        }
    }

}