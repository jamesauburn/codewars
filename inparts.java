public class InParts {
    public static String splitInParts(String s, int partLength) {
      String regex = "(?<=\\G.{" + partLength + "})";
      return String.join(" ", s.split(regex));
    }
}
