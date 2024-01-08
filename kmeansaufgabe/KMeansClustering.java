package kmeansaufgabe;
import java.util.*;
public class KMeansClustering {

        public static void main(String[] args) {
            int[] ooKlassenAnzahl = {9, 4, 13, 13, 10, 2, 10, 5, 9, 4, 10, 7, 8, 12, 16, 4, 10, 13, 8, 5};
            int k = 3; // Anzahl der Cluster
            Map<Integer, List<Integer>> clusters = kMeansClustering(ooKlassenAnzahl, k);
            // Ausgabe der Cluster und den zugeordneten Datensätzen
            for (Map.Entry<Integer, List<Integer>> entry : clusters.entrySet()) {
                System.out.println("Cluster " + entry.getKey() + ": " + entry.getValue());
            }
        }
        public static Map<Integer, List<Integer>> kMeansClustering(int[] data, int k) {
            // Initialisierung der Cluster-Mittelpunkte
            List<Integer> clusterCenters = initializeClusterCenters(data, k);
            Map<Integer, List<Integer>> clusters;
            do {
                clusters = new HashMap<>();
                // Datensätze den Clustern zuordnen
                for (int i = 0; i < data.length; i++) {
                    int closestCluster = findClosestCluster(data[i], clusterCenters);
                    clusters.computeIfAbsent(closestCluster, key -> new ArrayList<>()).add(i);
                }
                // Berechnung neuer Cluster-Mittelpunkte
                List<Integer> newClusterCenters = calculateNewClusterCenters(data, clusters);
                // Überprüfung, ob sich die Cluster-Mittelpunkte verändert haben
                if (!clusterCenters.equals(newClusterCenters)) {
                    clusterCenters = newClusterCenters;
                } else {
                    break; // Algorithmus abbrechen, wenn sich die Cluster-Mittelpunkte nicht ändern
                }
            } while (true);
            return clusters;
        }
        private static List<Integer> initializeClusterCenters(int[] data, int k) {
            List<Integer> centers = new ArrayList<>(k);
            Random rand = new Random();
            for (int i = 0; i < k; i++) {
                int randomIndex = rand.nextInt(data.length);
                centers.add(data[randomIndex]);
            }
            return centers;
        }
        private static int findClosestCluster(int value, List<Integer> clusterCenters) {
            int closestCluster = 0;
            int minDistance = Math.abs(value - clusterCenters.get(0));
            for (int i = 1; i < clusterCenters.size(); i++) {
                int distance = Math.abs(value - clusterCenters.get(i));
                if (distance < minDistance) {
                    minDistance = distance;
                    closestCluster = i;
                }
            }
            return closestCluster;
        }
        private static List<Integer> calculateNewClusterCenters(int[] data, Map<Integer, List<Integer>> clusters) {
            List<Integer> newCenters = new ArrayList<>();
            for (Map.Entry<Integer, List<Integer>> entry : clusters.entrySet()) {
                int clusterIndex = entry.getKey();
                List<Integer> clusterData = entry.getValue();
                // Berechnung des Mittelwerts für den neuen Cluster-Mittelpunkt
                int sum = 0;
                for (int dataIndex : clusterData) {
                    sum += data[dataIndex];
                }
                int newCenter = sum / clusterData.size();
                newCenters.add(newCenter);
            }
            return newCenters;
        }
     }