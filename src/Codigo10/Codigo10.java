package Codigo10;

import java.util.List;
import java.util.function.Function;

public class Codigo10 {

  public static void main(String[] args) {
    List<Users> users = List.of(new Users("Maria", 21), new Users("João", 30));

    printStringValue(user -> user.name(), users);

    // lambda
    // users.forEach(user -> System.out.println(user));

  }

  private static void printStringValue(Function<Users, String> callback, List<Users> users) {
    users.forEach(u -> System.out.println(callback.apply(u)));
  }
}
