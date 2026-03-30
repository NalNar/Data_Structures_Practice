import java.util.ArrayList;

/** 
 * A simple graph class for representation of theory of graphs  
 * Adjacency matrix = A 2d Array to represent the edges
 *              # Number of rows = number of unique nodes
 *              # Number of columns = number of unqiue edges
 *              RunTime -> O(1) , Space-> O(V^2)
*/
public class Graph{
    /* Keeping the representation of graphs */
    int[][] matrix; 
    /* Array list of Nodes for keeping the node */
    ArrayList<Node> nodes;
   
    /**
     * The constructor 
     * @param integer size 
     * 
    */
    public Graph(int size){
        matrix = new int[size][size];
        nodes = new ArrayList<>();
    }

    /** 
     * adds the node of the graph
     * @param Node node for the graph
     */
    public void addNode(Node node){
        nodes.add(node);
    }

    /** 
     * Adds the edge in the graph
     * @param integer source coordinate and integer destination coordinate
     */
    public void addEdge(int src, int dst){
        matrix[src][dst] = 1;
    }
    /**
     * Checks the whether there is an edge or not
     * @param src
     * @param dst
     * @return boolean 
     */
    public boolean checkEdge(int src, int dst){
        return matrix[src][dst] == 1;
    }
    /**
     * Prints the data in a matrix form
     */
    public void print(){
        System.out.print("  "); // Line for better visual 

        for(Node node: nodes){
            System.out.print(node.data + " ");
        }
        System.out.println();

        for(int i = 0; i<matrix.length; i++){
            System.out.print(nodes.get(i).data + " ");
            for(int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}