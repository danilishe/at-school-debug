package org.example;

import java.util.ArrayList;
import java.util.List;

public class Debug {
  public static void main(String[] args) {
    List<Integer> persons = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      persons.add(getRandom());
    }
    int billionare = 0;
    int defaults = 0;
    int regular = 0;
    for (Integer person : persons) {
      person += getRandom();
      if (person > 1_000_000_000) {
        billionare++;
      } else if (person > 0) {
        regular++;
      } else {
        defaults++;
      }
    }

    System.err.println("defaults = " + defaults);
    System.err.println("regular = " + regular);
    System.err.println("billionare = " + billionare);
    System.err.println("regular + billionare + defaults = " + (regular + billionare + defaults));
  }

  private static int getRandom() {
    return (int) (Math.random() * Integer.MAX_VALUE);
  }
}
