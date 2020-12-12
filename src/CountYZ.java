public class CountYZ {
/*

Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy"
and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately
following it.
 */

  public static void main(String[] args) {
    String str = "DAY abc XYZ";
    System.out.printf("the string %s gives the outcome: " + countYZ(str), str);
  }

  public static int countYZ(String str) {
    int len = str.length();
    int count = 0;
    str = (str + " ").toLowerCase();

    for (int i = 0; i < len; i++) {
      if ((str.charAt(i) == 'y' || str.charAt(i) == 'z') &&
          !Character.isLetter(str.charAt(i + 1))) {
        count++;
      }
    }
    return count;
  }
}
