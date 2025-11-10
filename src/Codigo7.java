public class Codigo7 {

  public static void main(String[] args) {

    /*
     * for (var i = 1; i <= 100; i++) {
     * 
     * // modo 1: Usando break
     * /*
     * if (i == 100) {
     * System.out.println("Fim da execução");
     * break;
     * }
     */

    // modo 2: usando continue
    /*
     * if (i % 2 == 0) {
     * continue;
     * }
     * System.out.println(i);
     * }
     */

    // modo 3: usando listas
    for (var i = 0; i < args.length; i++) {
      //System.out.println(args[i]);
      System.out.println((i + 1) + "-" + args[i]);

    }
  }
}
