package fr.ktung.dumbtesting.tree.traversal;

import fr.ktung.dumbtesting.tree.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreOrderTest {

  @ParameterizedTest
  @ValueSource(classes = { RecursivePreOrder.class })
  public void test1(Class<PreOrder> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    PreOrder preOrder = clazz.getConstructor().newInstance();

    TreeNode root = new TreeNode(
        1,
        null,
        new TreeNode(2, new TreeNode(3), null)
    );

    assertEquals(Arrays.asList(1, 2, 3), preOrder.preorderTraversal(root));
  }

  @ParameterizedTest
  @ValueSource(classes = { RecursivePreOrder.class })
  public void test2(Class<PreOrder> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    PreOrder preOrder = clazz.getConstructor().newInstance();

    assertEquals(List.of(), preOrder.preorderTraversal(null));
  }

  @ParameterizedTest
  @ValueSource(classes = { RecursivePreOrder.class })
  public void test3(Class<PreOrder> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    PreOrder preOrder = clazz.getConstructor().newInstance();

    TreeNode root = new TreeNode(1);

    assertEquals(List.of(1), preOrder.preorderTraversal(root));
  }
}
