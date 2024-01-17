package Entscheidungsbäume;

import java.util.HashMap;

public class DecisionTreeExample {
     public static void main(String[] args) {
        // Baum aufbauen
        TreeNode root = buildDecisionTree();

        // Beispielvorhersagen
        HashMap<String, String> example1 = new HashMap<>();
        example1.put("Alter", "25");
        example1.put("Einkommen", "50000");
        example1.put("Kredit-Score", "700");

        HashMap<String, String> example2 = new HashMap<>();
        example2.put("Alter", "35");
        example2.put("Einkommen", "80000");
        example2.put("Kredit-Score", "750");

        // Vorhersagen
        System.out.println(predict(root, example1));  // Sollte "Ja" sein
        System.out.println(predict(root, example2));  // Sollte "Nein" sein
    }

    public static TreeNode buildDecisionTree() {
        TreeNode root = new TreeNode("Alter");
        TreeNode node1 = new TreeNode("Einkommen");
        TreeNode node2 = new TreeNode("Einkommen");
        TreeNode leaf1 = new TreeNode("Ja");
        TreeNode leaf2 = new TreeNode("Nein");
        TreeNode leaf3 = new TreeNode("Ja");

        root.addChild("<=30", node1);
        node1.addChild("<=60000", leaf1);
        node1.addChild(">60000", leaf2);

        root.addChild(">30", node2);
        node2.addChild("<=720", leaf3);
        node2.addChild(">720", leaf2);

        return root;
    }

    public static String predict(TreeNode node, HashMap<String, String> example) {
        if (node.outcome != null) {
            return node.outcome;  // Blattknoten: Rückgabe des vorhergesagten Ergebnisses
        }

        String attributeValue = example.get(node.attribute);
        TreeNode nextNode = node.children.get(attributeValue);

        if (nextNode == null) {
            return "Unbekannt";  // Beispiel weist einen Wert auf, der im Baum nicht vorhanden ist
        }

        return predict(nextNode, example);  // Rekursiver Aufruf für den nächsten Entscheidungsknoten
    }
}

