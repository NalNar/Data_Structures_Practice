import java.util.ArrayList;
import java.util.LinkedList;
/** 
 *  Adjacency List = An Array/ArrayList of LinkedLists.
 *          Each linked list has a unique node at the head
 *          All adjacent neighbours to that node are added to that node's LL
 *          Runtime of Adjacency List is O(V) 
 *          Space Complexity : O(V+E)
 */
public class GraphList {
    ArrayList<LinkedList<Node>> aList;

    public GraphList(){
        aList = new ArrayList<>();
    }
    public void addNode(Node node){
        // when we create add node we create new linked list with node as the head
        LinkedList<Node> current = new LinkedList<>();
        current.add(node);
        aList.add(current);
    }

    public void addEdge(int src, int dst){
        LinkedList<Node> currList = aList.get(src); // this would return linked list
        Node dstNode = aList.get(dst).get(0); // get 0 is the head of LL
        currList.add(dstNode);  // taking a node and adding it 

    }

    public boolean checkEdge(int src, int dst){
        LinkedList<Node> currList = aList.get(src); // this would return linked list
        Node dstNode = aList.get(dst).get(0); // get 0 is the head of LL
        // finding a match
        for(Node node; currList){
            if(node==dstNode){
                return true;
            }
        }
        return false;

    }

    public void print(){
        // need to iterate over all
        for(LinkedList<Node> currList: aList){
            for(Node node: currList){
                System.out.print(node.data + " -> ");
            }
        System.out.println();
        } 
    }
}
