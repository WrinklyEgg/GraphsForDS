package GraphsForDS;

public class Edge {
    
    Vertex initial;
    Vertex end;

    
    public Edge(Vertex initial, Vertex end)
    {
        this.initial=initial;
        this.end=end;
    }

    public Vertex getInitial()
    {
        return initial;
    }

    public Vertex getEnd()
    {
        return end;
    }

    @Override
    public String toString()
    {
        return end.toString();
    }

   
}
