import java.util.LinkedList;

/**
 * Method to Convert Adjacency List to Adjacency Matrix
 */
public class AdjacencyListToAdjacencyMatrix{

    /* Using the graph list as the input for converting to 2d [][] graph */ 
    public int[][] convertion(GraphList gp){

        int[][] adjMatrix = new int[gp.size()][gp.size()]; // perfect 2d matrix

        // need to make a matrix of 0 and 1 for edges

        for(int i = 0; i < gp.size(); i++ ){
            LinkedList<Node> neighbors = gp.get(i);
            for (int j = 1; j < neighbors.size(); j++) {
                Node neighbor = neighbors.get(j);
                adjMatrix[i][neighbor.data] = 1;
            }
        }
        return adjMatrix;
    }

    public static void main(String[]args){
        // make a graph list and add some nodes and edges
        GraphList gp = new GraphList();
        gp.addNode(new Node((char) 0));
        gp.addNode(new Node((char)1));
        gp.addNode(new Node((char)2));
        gp.addEdge(0, 1);
        gp.addEdge(1, 2);

        // convert to adjacency matrix
        AdjacencyListToAdjacencyMatrix converter = new AdjacencyListToAdjacencyMatrix();
        int[][] adjMatrix = converter.convertion(gp);
        // print the adjacency matrix
        for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix[i].length; j++) {
                System.out.print(adjMatrix[i][j] + " ");        
    }

            System.out.println();
        }
    }   
}