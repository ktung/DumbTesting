package fr.ktung.dumbtesting.tree.traversal;

import fr.ktung.dumbtesting.tree.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InOrderTest {

  @ParameterizedTest
  @ValueSource(classes = { RecursiveInOrder.class })
  public void test1(Class<InOrder> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    InOrder inOrder = clazz.getConstructor().newInstance();

    TreeNode root = new TreeNode(
        1,
        null,
        new TreeNode(2, new TreeNode(3), null)
    );

    assertEquals(Arrays.asList(1, 3, 2), inOrder.inorderTraversal(root));
  }

  @ParameterizedTest
  @ValueSource(classes = { RecursiveInOrder.class })
  public void test2(Class<InOrder> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    InOrder inOrder = clazz.getConstructor().newInstance();

    assertEquals(List.of(), inOrder.inorderTraversal(null));
  }

  @ParameterizedTest
  @ValueSource(classes = { RecursiveInOrder.class })
  public void test3(Class<InOrder> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    InOrder inOrder = clazz.getConstructor().newInstance();

    TreeNode root = new TreeNode(1);

    assertEquals(List.of(1), inOrder.inorderTraversal(root));
  }
}
