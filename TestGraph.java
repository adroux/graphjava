package graph;

public class TestGraph implements Graph{
	Edge[] E=new Edge[100];
	Vertex[] V = new Vertex[100];

	/**
	*Add an Edge to the graph
	*@param e the edge to add
	*/
	public void addEdge(Edge e){};

	/**
	*Add a Vertex to the graph
	*@param v the vertex to add
	*/
	public void addVertex(Vertex v){};

	/**
	*Remove an Edge from the graph
	*@param e the edge to remove
	*/
	public void removeEdge(Edge e){};

	/**
	*Remove the Vertex from the graph
	*@param v the vertex to remove
	*/
	public void removeVertex(Vertex v){};

	/**
	*Draw the graph
	*/
	public void draw(){};

	public static void main (String[] args){
		Graph g = new TestGraph();
		Object o = new Object();
		Vertex v1 = new Vertex(o,g);
		Vertex v2 = new Vertex(o,g);
		UndirEdge e = new UndirEdge(g,v1,v2);
	}
}