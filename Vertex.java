package graph;

public class Vertex{
	public Object o;
	public Graph g;

	/**
	*Create a Vertex
	*@param o the object contain in the vertex 
	*@param g the associated graph
	*/
	public Vertex(Object o, Graph g){
		this.o=o;
		this.g=g;
	}
}