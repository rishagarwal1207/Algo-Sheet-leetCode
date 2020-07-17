import java.util.*;
public class Dijikstra {

    public static void dijkstra(int[][] graph, int sourceVertex){
        int vertexCount = graph.length;
        System.out.println(vertexCount);
        boolean[] visitedVertex = new boolean[vertexCount];
        int[] distance = new int[vertexCount];
        for(int i=0;i<vertexCount;i++){
          distance[i]=Integer.MAX_VALUE;
        }
        distance[sourceVertex]=0;
        for(int c=0;c<vertexCount;c++)
        {
          int u= minDistance(distance, visitedVertex);
          visitedVertex[u]= true;
            for(int i=0; i<vertexCount;i++){
            if( !visitedVertex[i] && graph[u][i] != 0 && distance[u]+graph[u][i]< distance[i])
            {
              distance[i]= distance[u]+graph[u][i];
            }
          }
        }
        for (int i = 0; i < distance.length; i++){
            System.out.println(String.format("Distance from source vertex %s to vertex %s is %s", sourceVertex, i, distance[i]));
        }
    }

   private static int minDistance (int[] distance, boolean[] visitedVertex){
        int min=Integer.MAX_VALUE;
        int minIndex=-1;
        for(int i=0;i<distance.length;i++){
            if(distance[i]<=min && !visitedVertex[i]){
                min=distance[i];
                minIndex=i;
            }
        }
        return minIndex;
    }
        

    public static void main(String[] args) {
        int graph[][] = new int[][] { { 0, 4, 8, 0, 0 },
                { 4, 0, 2, 5, 0 },
                { 8, 2, 0, 5, 9},
                { 0, 5, 5, 0, 4 },
                { 0, 0, 9, 4, 0 } };
        Dijikstra t = new Dijikstra();
        t.dijkstra(graph, 0);
    }
}