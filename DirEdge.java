package graph;

public class DirEdge extends Edge{
	public int direction;//1 si de v1 à v2, -1 si de v2 à v1

	/**
	*Create an Edge linking the two vertices
	*@param v1 the first vertex 
	*@param v2 the second vertex
	*@param g the associated graph
	*@param direction the direction of the Edge
	*/
	public DirEdge(Graph g, Vertex v1, Vertex v2, int direction){
		super(g,v1,v2);
		this.direction=direction;
	}
}