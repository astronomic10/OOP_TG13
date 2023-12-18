package a8kmeans;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class KMeans {
    private List<Double[]> data;
    private List<Double[]> centroids;
    private int k;
    private double epsilon;
    private Random random;

    public KMeans(List<Double[]> data, int k, double epsilon) {
        this.data = data;
        this.k = k;
        this.epsilon = epsilon;
        this.random = new Random();
    }

    public void run() {
        // Step 1: Initialize centroids randomly
        centroids = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            Double[] centroid = data.get(random.nextInt(data.size()));
            centroids.add(centroid);
        }

        // Step 2: Repeat until convergence
        boolean converged = false;
        while (!converged) {
            // Assign each data point to the closest centroid
            List<List<Double[]>> clusters = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                clusters.add(new ArrayList<>());
            }
            for (Double[] point : data) {
                int closestCentroidIndex = getClosestCentroidIndex(point);
                clusters.get(closestCentroidIndex).add(point);
            }

            // Recalculate centroids
            converged = true;
            for (int i = 0; i < k; i++) {
                Double[] newCentroid = calculateCentroid(clusters.get(i));
                if (euclideanDistance(newCentroid, centroids.get(i)) > epsilon) {
                    converged = false;
                }
                centroids.set(i, newCentroid);
            }
        }
    }

    private int getClosestCentroidIndex(Double[] point) {
        double minDistance = Double.MAX_VALUE;
        int closestCentroidIndex = 0;
        for (int i = 0; i < centroids.size(); i++) {
            double distance = euclideanDistance(point, centroids.get(i));
            if (distance < minDistance) {
                minDistance = distance;
                closestCentroidIndex = i;
            }
        }
        return closestCentroidIndex;
    }

    private Double[] calculateCentroid(List<Double[]> points) {
        int dimension = points.get(0).length;
        Double[] centroid = new Double[dimension];
        for (int i = 0; i < dimension; i++) {
            centroid[i] = 0.0;
            for (Double[] point : points) {
                centroid[i] += point[i];
            }
            centroid[i] /= points.size();
        }
        return centroid;
    }

    private double euclideanDistance(Double[] point1, Double[] point2) {
        double sum = 0;
        for (int i = 0; i < point1.length; i++) {
            sum += Math.pow(point1[i] - point2[i], 2);
        }
        return Math.sqrt(sum);
    }

    public List<Double[]> getCentroids() {
        return centroids;
    }
}