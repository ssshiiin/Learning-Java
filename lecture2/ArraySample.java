public class ArraySample {
  public static void main(String[] args) {
    int[] array1 = { 1, -2, 3, 4, -5 };
    int result = positive(array1);
    System.out.println(result);

    String[] array2 = { "Information", "Networking", "for", "Innovation", "And", "Design" };
    printOdd(array2);
  }

  public static int positive(int[] array) {
    int result = 0;
    for (int i : array) {
      if (i > 0) {
        result += i;
      } else {
        continue;
      }
    }
    return result;
  }

  public static void printOdd(String[] array) {
    int count = 1;
    for (String str : array) {
      if (count % 2 == 1) {
        System.out.println(str);
      }
      count++;
      continue;
    }
  }
}
