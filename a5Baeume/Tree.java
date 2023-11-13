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
            root = new Node(value, null);
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
                parent.links = new Node(value, parent);
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
                parent.rechts = new Node(value, parent);
            }
            else
            {
                insert(parent.rechts, value);
            }
        }
    }

    public int hoehe()
    {
        //Initialisiee Lokale variablen
        int l = 0;
        int r = 0;

        //Fall in dem der Wurzelknoten null ist
        if(root.links != null)
        {
            l = hoehe(root.links) +1;
        }
        //Fall bei dem dem nicht null ist
         if(root.rechts != null)
        {
            r = hoehe(root.rechts) +1;
        }
        //Höhe des Baums zurückgeben
        return Math.max(l, r);
    }


  private int hoehe(Node parent) {
    int l = 0;
    int r = 0;
         if(parent.links != null)
        {
            l = hoehe(parent.links) +1;
        }
         if(parent.rechts != null)
        {
            r = hoehe(parent.rechts) +1;
        }
        return Math.max(l, r);
    }


public int anzahl()
  {
    if(root == null)
    {
        return 0;
    }
    else
    {
        return 1 + anzahl(root.links) + anzahl(root.rechts);
    }
  }
private int anzahl(Node parent) {
    if(parent == null)
    {
        return 0;
    }
    else
    {
        return 1 + anzahl(parent.links) + anzahl(parent.rechts);
    }
}
    
}