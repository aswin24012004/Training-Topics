package practices.streams;
import java.util.*;

 class Node{
	int data;
	Node left,right;
	
	Node(int d){
		d = data;
	}
}

public class DSAGraph {
	 public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right =new Node(15);
		System.out.println("Tree root: " + root.data);
		
		List<List<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < 3; i++)
            graph.add(new ArrayList<>());
        graph.get(0).add(1);
        graph.get(1).add(2);
        System.out.println("Graph adj of 0: " + graph.get(0));
        for (int i = 0; i < graph.size(); i++) {
            System.out.println("Node " + i + " -> " + graph.get(i));
        }

	 }
	
}
