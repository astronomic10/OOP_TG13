package a5Baeume;

public class Node {
   
        public Node links;
        public Node rechts;
        public int wert;
        public Node parent;
    
        public Node(int i, Node parent)
        {
            this.wert = i;
            this.parent = parent;
         }
    
}
