package graph;

public abstract class Edge{
	public Graph g;
	public Vertex v1;
	public Vertex v2;

	/**
	*Create an Edge linking the two vertices
	*@param v1 the first vertex 
	*@param v2 the second vertex
	*@param g the associated graph
	*/
	
	public Edge(Graph g, Vertex v1, Vertex v2){
		this.g=g;
		this.v1=v1;
		this.v2=v2;
	}
}