package fr.ktung.dumbtesting.tree.traversal;

import fr.ktung.dumbtesting.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class RecursivePostOrder implements PostOrder {

  @Override
  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> output = new ArrayList<>();
    if (root == null) {
      return output;
    }

    output.addAll(postorderTraversal(root.left));
    output.addAll(postorderTraversal(root.right));
    output.add(root.val);

    return output;
  }
}
