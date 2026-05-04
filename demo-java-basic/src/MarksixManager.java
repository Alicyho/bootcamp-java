import java.util.Arrays;
import java.util.Random;

// Owner, Helper, Manager, Expert
public class MarksixManager {
  public static void main(String[] args) {
    int[] arr = new MarksixManager().random();
    System.out.println(Arrays.toString(arr));
  }

  public static boolean isDuplicated(int[] arr, int newNumber) { // input
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == newNumber) {
        return true;
      }
    }
    return false;
  }

  public int[] random() {
    int[] answers = new int[6];
    int idx = 0;
    while (idx <= 5) {
      int num = new Random().nextInt(49) + 1;
      if (isDuplicated(answers, num)) {
        continue;
      } else {
        answers[idx++] = num; // 0-5
      }
    }
    return answers;
  }
}