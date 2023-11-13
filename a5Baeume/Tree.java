package a5Baeume;

public class Tree {
    Node root;

    public Tree()
    {
        root = null;
    }

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

    private void insert(Node parent, int value) 
    {
        if(parent.wert >= value)
        {
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


