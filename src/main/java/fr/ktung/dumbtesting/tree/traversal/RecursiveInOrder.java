package fr.ktung.dumbtesting.tree.traversal;

import fr.ktung.dumbtesting.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class RecursiveInOrder implements InOrder {
  @Override
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> output = new ArrayList<>();
    if (root == null) {
      return output;
    }

    output.addAll(inorderTraversal(root.left));
    output.add(root.val);
    output.addAll(inorderTraversal(root.right));

    return output;
  }
}
