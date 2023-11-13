package a5Baeume;

public class Tree {
    Node root;
//erstelle einen neuen leeren baum
    public Tree()
    {
        root = null;
    }
//Füge eine neues Element mit dem angegebenen Wert in den Baum ein
    public void insert(int value)
    {
        if(root == null)
        {
            root = new Node(value);
        }
        else
        {
            insert(root, value);

        }
    }
//Füge einen neuen Knoten in den Baum ein
    private void insert(Node parent, int value) 
    {
        //Prüfe ob kleiner oder größer
        if(parent.wert >= value)
        
        {
            //Wenn der linke Kinderknoen des Elternknotens null ist, dann wird der neue Knoten als Kinderknoten des Elternknotens eingefügt
            if(parent.links == null)
            {
                parent.links = new Node(value);
            }
            else
            {
                insert(parent.links, value);
            }
        }
        else
        //Wenn der Wert des neuen Knotens größer als der wert des Elternknotens ist, dann wird der neue Knoten als rechter Kinderknoten des Elternknotens eingefügt
        {
               if(parent.rechts == null)
            {
                parent.rechts = new Node(value);
            }
            else
            {
                insert(parent.rechts, value);
            }
        }
    }
}


