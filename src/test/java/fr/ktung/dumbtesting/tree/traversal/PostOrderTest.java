package fr.ktung.dumbtesting.tree.traversal;

import fr.ktung.dumbtesting.tree.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostOrderTest {

  @ParameterizedTest
  @ValueSource(classes = { RecursivePostOrder.class })
  public void test1(Class<PostOrder> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    PostOrder postOrder = clazz.getConstructor().newInstance();

    TreeNode root = new TreeNode(
        1,
        null,
        new TreeNode(2, new TreeNode(3), null)
    );

    assertEquals(Arrays.asList(3, 2, 1), postOrder.postorderTraversal(root));
  }

  @ParameterizedTest
  @ValueSource(classes = { RecursivePostOrder.class })
  public void test2(Class<PostOrder> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    PostOrder postOrder = clazz.getConstructor().newInstance();

    assertEquals(List.of(), postOrder.postorderTraversal(null));
  }

  @ParameterizedTest
  @ValueSource(classes = { RecursivePostOrder.class })
  public void test3(Class<PostOrder> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    PostOrder postOrder = clazz.getConstructor().newInstance();

    TreeNode root = new TreeNode(1);

    assertEquals(List.of(1), postOrder.postorderTraversal(root));
  }
}
