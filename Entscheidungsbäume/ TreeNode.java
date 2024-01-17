package Entscheidungsbäume;
import java.util.HashMap;
class  TreeNode {
    String attribute;
    HashMap<String, TreeNode> children;
    String outcome;  // Nur für Blattknoten relevant

    public TreeNode(String attribute) {
        this.attribute = attribute;
        this.children = new HashMap<>();
        this.outcome = null;
    }

    public void addChild(String value, TreeNode child) {
        children.put(value, child);
    }
}
