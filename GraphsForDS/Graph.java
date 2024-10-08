package GraphsForDS;
import java.util.ArrayList;
import java.util.HashMap;

public class Graph{

    int[][] graph;
    //vertexList is not needed but i don't want to rewrite the code that it's in
    ArrayList<Vertex> vertexList;
    HashMap<Vertex, Integer> vList;
    ArrayList<Edge> edgeList;

    public Graph(int numVertices)
    {
        graph = new int[numVertices][numVertices];
        vertexList=new ArrayList<>();
        vList=new HashMap<>();
        edgeList= new ArrayList<>();
    }

    public void printGraph()
    {
        System.out.print("  ");
        for(Vertex v:vertexList)
        {
            System.out.print(v+" ");
        }
        for(int i =0;i<graph.length;i++)
        {
            System.out.println();
            System.out.print(vertexList.get(i)+" ");
            for(int j=0;j<graph.length;j++)
            {
                System.out.print(graph[i][j]+" ");
            }
        }
    }
    
    public void addVertex(Vertex v)
    {
        vertexList.add(v);
        vList.put(v, vList.size());
    }

    public void makeGraph()
    {
        int[][] newGraph = new int[vList.size()][vList.size()];
        graph=newGraph;
       for(HashMap.Entry<Vertex, Integer> list :vList.entrySet())
        {
            graph[list.getValue()][list.getValue()]=1;
        }
    }
    
    public void addEdge(Edge edge)
    {
        edgeList.add(edge);
        graph[vList.get(edge.getInitial())][vList.get(edge.getEnd())]=1;
        graph[vList.get(edge.getInitial())][vList.get(edge.getEnd())]=1;
        graph[vList.get(edge.getEnd())][vList.get(edge.getInitial())]=1;
        graph[vList.get(edge.getEnd())][vList.get(edge.getInitial())]=1;
    }


    public boolean checkEdge(Vertex initial, Vertex end)
    {
        if(graph[vList.get(initial)][vList.get(end)]==1||graph[vList.get(end)][vList.get(initial)]==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void printVertices()
    {
        
    }
}