package kmeansaufgabe;
import java.util.ArrayList;
import java.util.List;
public class KMeansClustering {
   public static void main(String[] args) {
       // Daten vorbereiten
       List<DataPoint> dataPoints = new ArrayList<>();
       dataPoints.add(new DataPoint(9, 11));
       dataPoints.add(new DataPoint(4, 12));
       dataPoints.add(new DataPoint(13, 13));
       dataPoints.add(new DataPoint(13, 14));
       dataPoints.add(new DataPoint(10, 15));
       dataPoints.add(new DataPoint(2, 16));
       dataPoints.add(new DataPoint(10, 17));
       dataPoints.add(new DataPoint(5, 18));
       dataPoints.add(new DataPoint(4, 19));
       dataPoints.add(new DataPoint(7, 20));
       // K festlegen
       int k = 3;
       // Initiale Cluster-Zentren auswählen
       List<DataPoint> centroids = new ArrayList<>();
       centroids.add(dataPoints.get(0));
       centroids.add(dataPoints.get(10));
       centroids.add(dataPoints.get(5));
       // Clustering durchführen
       boolean converged = false;
       while (!converged) {
           // Zuordnung der Datenpunkte zu den Clustern
           List<List<DataPoint>> clusters = new ArrayList<>();
           for (int i = 0; i < k; i++) {
               clusters.add(new ArrayList<>());
           }
           for (DataPoint dataPoint : dataPoints) {
               int closestCluster = 0;
               double minDistance = Double.POSITIVE_INFINITY;
               for (int i = 0; i < k; i++) {
                   double distance = dataPoint.distanceTo(centroids.get(i));
                   if (distance < minDistance) {
                       minDistance = distance;
                       closestCluster = i;
                   }
               }
               clusters.get(closestCluster).add(dataPoint);
           }
           // Neue Cluster-Zentren berechnen
           centroids = new ArrayList<>();
           for (List<DataPoint> cluster : clusters) {
               if (cluster.size() > 0) {
                   double[] sum = new double[cluster.get(0).getDimension()];
                   for (DataPoint dataPoint : cluster) {
                       for (int i = 0; i < sum.length; i++) {
                           sum[i] += dataPoint.getCoordinate(i);
                       }
                   }
                   centroids.add(new DataPoint(sum));
               }
           }
           // Konvergenz prüfen
           converged = true;
           for (int i = 0; i < k - 1; i++) {
               if (!centroids.get(i).equals(centroids.get(i + 1))) {
                   converged = false;
                   break;
               }
           }
       }
       // Cluster-Ergebnisse ausgeben
       System.out.println("Cluster-Ergebnisse:");
       for (int i = 0; i < k; i++) {
           System.out.println("Cluster " + i + ": " + clusters.get(i));
       }
   }
   private static class DataPoint {
       private final double[] coordinates;
       public DataPoint(double x, double y) {
           this.coordinates = new double[]{x, y};
       }
       public DataPoint(double[] sum) {
    }
    public int getDimension() {
           return coordinates.length;
       }
       public double getCoordinate(int i) {
           return coordinates[i];
       }
       public double distanceTo(DataPoint other) {
           double sum = 0;
           for (int i = 0; i < coordinates.length; i++) {
               double difference = coordinates[i] - other.getCoordinate(i);
               sum += difference * difference;
           }
           return Math.sqrt(sum);
       }
   }
}
