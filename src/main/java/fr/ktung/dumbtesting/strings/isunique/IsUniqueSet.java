package fr.ktung.dumbtesting.strings.isunique;

import java.util.HashSet;
import java.util.Set;

public class IsUniqueSet implements IsUnique {

  @Override
  public boolean isUnique(String str) {
    Set<Character> characters = new HashSet<>();

    for (char c : str.toCharArray()) {
      if (characters.contains(c)) {
        return false;
      }

      characters.add(c);
    }

    return true;
  }
}
