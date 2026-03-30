public class App{
    public static void main(String[] args) {
        // Graph graph = new Graph(5);
        // graph.addNode(new Node('A'));
        // graph.addNode(new Node('M'));
        // graph.addNode(new Node('L'));
        // graph.addNode(new Node('P'));
        // graph.addNode(new Node('D'));

        // graph.addEdge(0,1);
        // graph.addEdge(1,2);
        // graph.print();

        // System.out.println(graph.checkEdge(0, 1));

        GraphList graph = new GraphList();
        graph.addNode(new Node('A'));
        graph.addNode(new Node('M'));
        graph.addNode(new Node('L'));
        graph.addNode(new Node('P'));
        graph.addNode(new Node('D'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(1,4);
        graph.print();

    }
}