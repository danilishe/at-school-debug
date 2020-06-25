package org.example;

import java.util.ArrayList;
import java.util.List;

public class Debug {
  private static int billionare = 0;
  private static int poor = 0;
  private static int regular = 0;

  public static void main(String[] args) {
    List<Integer> persons = new ArrayList<>();

    for (int i = 0; i < 100; i++) {
      persons.add(getRandom());
    }

    counting(persons);

    System.out.println("poor = " + poor);
    System.out.println("regular = " + regular);
    System.out.println("billionare = " + billionare);
    System.out.println("regular + billionare + poor = " + (regular + billionare + poor));
    System.out.println();

    for (int i = 0; i < 100; i++) {
      int temp = persons.get(i);
      if (temp >= 1_000_000_000) {
        persons.remove(i);
        persons.add(i, temp - 1_000_000_000);
      } else if (temp < 0) {
        persons.remove(i);
        persons.add(i, temp + 1_000_000_000);
      }
    }

    Debug.billionare = 0;
    Debug.regular = 0;
    Debug.poor = 0;

    recounting(persons);

    System.out.println("poor = " + poor);
    System.out.println("regular = " + regular);
    System.out.println("billionare = " + billionare);
    System.out.println("regular + billionare + poor = " + (regular + billionare + poor));
  }

  private static int getRandom() {
    return (int) (Math.random() * Integer.MAX_VALUE);
  }

  public static void counting(List<Integer> persons) {
    for (Integer person : persons) {
      person += getRandom();
      if (person >= 1_000_000_000) {
        Debug.billionare++;
      } else if (person > 0) {
        Debug.regular++;
      } else {
        Debug.poor++;
      }
    }
  }

  public static void recounting(List<Integer> persons) {
    for (Integer person : persons) {
      if (person >= 1_000_000_000) {
        Debug.billionare++;
      } else if (person > 0) {
        Debug.regular++;
      } else {
        Debug.poor++;
      }
    }
  }
}
