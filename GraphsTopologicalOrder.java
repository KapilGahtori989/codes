import java.util.ArrayList;
import java.util.Stack;

public class GraphsTopologicalOrder {
    
    static class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src = src;
            this.dest =dest;
        }
    }

    private static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[2].add(new Edge(2, 03));
        
        graph[3].add(new Edge(3, 1));
        
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 01));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

    private static void topologicalSort(ArrayList<Edge>[] graph){
        //T.C O(V+E)
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topSortUtil(graph,i,vis,s); //mod dfs
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }

    }

    private static void topSortUtil(ArrayList<Edge>[] graph,int curr,boolean vis[], Stack<Integer> s){

        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e  =graph[curr].get(i);
            if(!vis[e.dest]){
                topSortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public static void main(String[] args) {
        int V = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        topologicalSort(graph);
    }
}
