import java.util.ArrayList;

public class Main {
    public static int k = 5;
    public static void main(String[] args){
          ArrayList<DataObject> objs = new ArrayList<DataObject>();
        objs.add(new DataObject(5, 1, 0));
        objs.add(new DataObject(6, 1, 0));
        objs.add(new DataObject(5, 2, 0));
        objs.add(new DataObject(6, 2, 0));
        objs.add(new DataObject(7, 1, 0));
        objs.add(new DataObject(0, 4, 1));
        objs.add(new DataObject(1, 4, 1));
        objs.add(new DataObject(0, 5, 1));
        objs.add(new DataObject(1, 5, 1));
        DataObject o = new DataObject(5, 2);

        System.out.println(kNN(o, objs));
   
        
    }
    public int kNN(DataObject o, ArrayList<DataObject> objs)
    {
        int[] indices = new int[k];
        int[] mins = new double[k];

        for(int i = 0; i < k; i++)
        {
            mins[i] = Double.MAX_VALUE;
            for(int j = 0; j < objs.size(); j++)
            {
                double distance = Math.sqrt(Math.pow(objs.get(j).getX() - o.getX(), 2) + Math.pow(objs.get(j).getY() - o.getY(), 2));
                if(distance < mins[i])
                {
                    for(int l = k - 1; l > i; l--)
                    {
                        mins[l] = mins[l - 1];
                        indices[l] = indices[l - 1];
                    }
                    mins[i] = distance;
                    indices[i] = j;
                }
            }
        }

        int[] classes = new int[objs.size()];
        for(int i = 0; i < indices.length; i++)
        {
            classes[i] = objs.get(indices[i]).getZ();
        }

        int[] frequencies = new int[6];
        for(int i = 0; i < classes.length; i++)
        {
            frequencies[classes[i]]++;
        }

        int max = 0;
        for(int i = 1; i < frequencies.length; i++)
        {
            if(frequencies[i] > frequencies[max])
            {
                max = i;
            }
        }

        return max;
    }
}