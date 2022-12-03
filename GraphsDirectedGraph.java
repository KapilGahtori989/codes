import java.util.*;
public class GraphsDirectedGraph{

    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src = s;
            this.dest =d;
        }
    }
    // static void createGraph(ArrayList<Edge> graph[]){
    //     //true -- cycle
    //     for(int i=0;i<graph.length;i++){
    //         graph[i]=new ArrayList<>();
    //     }
    //     graph[0].add(new Edge(0, 2));

    //     graph[1].add(new Edge(1, 0));

    //     graph[2].add(new Edge(2, 3));

    //     graph[3].add(new Edge(3, 0));
    // }

    static void createGraph(ArrayList<Edge> graph[]){
        //no cycle --false
        for(int i=0;i<graph.length;i++){

            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 1));

        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 3));
    }

    private static boolean isCycle(ArrayList<Edge> [] graph){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(isCycleUtil(graph,i,vis,stack)){
                    return true;
                }
                
            }
        }
        return false;
    }

    private static boolean isCycleUtil(ArrayList<Edge>[] graph,int curr, boolean vis[], boolean stack[]){
        vis[curr]=true;
        stack[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){
                return true;
            }
            if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)){
                return true;
            }

        }
        stack[curr]=false;
        return false;

    }
    public static void main(String[] args) {
    
        int V=4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph= new ArrayList[V];
        createGraph(graph);
        System.out.println(isCycle(graph));
    }
}