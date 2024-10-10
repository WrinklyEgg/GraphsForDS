package GraphsForDS;


public class Main {
    public static void main(String[] args) {
        {
          
            //instantiating base graph
            int numVertices=6;
            Graph graph = new Graph(numVertices);
            
            //making vertices and storing them to graph object
            Vertex vA = new Vertex("A");
            Vertex vB = new Vertex("B");
            Vertex vC = new Vertex("C");
            Vertex vD = new Vertex("D");
            Vertex vE = new Vertex("E");
            Vertex vF = new Vertex("F");
            Vertex vG = new Vertex("G");
            graph.addVertex(vA);
            graph.addVertex(vB);
            graph.addVertex(vC);
            graph.addVertex(vD);
            graph.addVertex(vE);
            graph.addVertex(vF);
           
            //making graph with vertices (not needed)
            graph.makeGraph();

            //adding vertex
            graph.addVertex(vG);
            //updating graph to accomodate new vertex
            graph.makeGraph();

            //adding edges 
            Edge edgeAB = new Edge(vA,vB);
            Edge edgeAC = new Edge(vA,vC);
            Edge edgeBC = new Edge(vB,vC);
            Edge edgeCD = new Edge(vC,vD);
            Edge edgeEF = new Edge(vE,vF);
            Edge edgeEG = new Edge(vE,vG);
            Edge edgeFG = new Edge(vF,vG);
            Edge edgeDE = new Edge(vD,vE);
            
            graph.addEdge(edgeAB);
            graph.addEdge(edgeAC);
            graph.addEdge(edgeCD);
            graph.addEdge(edgeEF);
            graph.addEdge(edgeEG);
            graph.addEdge(edgeFG);
            graph.addEdge(edgeBC);
            graph.addEdge(edgeDE);
            //graph.addEdge(new Edge(vD,vF));


            GraphTraveller gTraveller = new GraphTraveller(graph,vA);
            //prints graph
            graph.printGraph();
            //printing list of Vertices
           // System.out.println("\n"+graph.vList.toString());
            //checks if edge is there
            //System.out.println(graph.checkEdge(vA,vC));
            //System.out.println(graph.checkEdge(vD,vA));
            System.out.println();
            //graph.printVertices();
            System.out.println("---------");
           System.out.println("List of visited vertices: "+ gTraveller.travel());
            //System.out.println(graph.getAdjVertices(vE));
            System.out.println("The path of travel: "+ gTraveller.getTravelPath());
        }
    }
}
