package GraphsForDS;
import ArrayIndexOutOfBoundsException;
import java.util.ArrayList;

public class GraphTraveller
{
    Graph graph;
    Vertex start;
    ArrayList<Vertex> queue;
    ArrayList<Vertex> visitedList;
    public GraphTraveller(Graph graph, Vertex start)
    {
        this.graph = graph;
        this.start = start;
        queue = new ArrayList<>();
        visitedList= new ArrayList<>();
    }
    
    public String travel()
    {

        queue.add(start);
        //visitedList.add(start);
        System.out.println(queue);
       
        while(visitedList.size()!=graph.vList.size())
        {
            //queue.remove(start);
            for(int i =0;i<graph.getAdjVertices(start).size();i++)
            {
                if(!(visitedList.contains(graph.getAdjVertices(start).get(i)))&&!(queue.contains(graph.getAdjVertices(start).get(i))))
                {
                    queue.add(graph.getAdjVertices(start).get(i));
                    
                }
            }
            System.out.println("queue: "+queue);
            if(!visitedList.contains(start))
            {
                visitedList.add(start);
            }
            
           // System.out.println("Visited List: "+ visitedList.toString());
            queue.remove(start);
            try
            {
                start=queue.get(0);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                break;
            }            
            //System.out.println(queue);
        }
        return visitedList.toString();
        
       
    }
   




    


}