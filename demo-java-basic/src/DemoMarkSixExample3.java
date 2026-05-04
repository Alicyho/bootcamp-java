//C (Method)	封裝 isDuplicate(程式碼整潔，可重用性高)
import java.util.Arrays;
import java.util.Random;

public class DemoMarkSixExample3 {
    
    // 獨立的重複檢查方法（可重用）
    public static boolean isDuplicate(int[] arr, int newNumber, int currentSize) {
        for (int i = 0; i < currentSize; i++) {
            if (arr[i] == newNumber) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] answers = new int[6];
        int idx = 0;
        
        while (idx < 6) {
            int num = new Random().nextInt(49) + 1;  // 1-49
            
            // 使用獨立的 isDuplicate 方法
            if (!isDuplicate(answers, num, idx)) {
                answers[idx++] = num;
            }
        }
        
        Arrays.sort(answers);
        System.out.println("Version C (isDuplicate Method): " + Arrays.toString(answers));
    }
}

