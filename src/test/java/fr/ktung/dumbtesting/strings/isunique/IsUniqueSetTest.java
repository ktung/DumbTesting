package fr.ktung.dumbtesting.strings.isunique;

import fr.ktung.dumbtesting.ParallelizableTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ParallelizableTest
public class IsUniqueSetTest {

  private static final IsUnique isUnique = new IsUniqueSet();

  @ParameterizedTest
  @ValueSource(strings = {"a", "abc"})
  public void isUnique_ShouldReturnTrue(String str) {
    assertTrue(isUnique.isUnique(str));
  }

  @ParameterizedTest
  @ValueSource(strings = {"aa", "abca"})
  public void isUnique_ShouldReturnFalse(String str) {
    assertFalse(isUnique.isUnique(str));
  }
}
