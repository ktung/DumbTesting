package fr.ktung.dumbtesting.tree.traversal;

import fr.ktung.dumbtesting.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class RecursivePreOrder implements PreOrder {
  @Override
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> output = new ArrayList<>();
    if (root == null) {
      return output;
    }

    output.add(root.val);
    output.addAll(preorderTraversal(root.left));
    output.addAll(preorderTraversal(root.right));

    return output;
  }
}
