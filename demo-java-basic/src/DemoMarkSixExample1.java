//A (For)	固定嘗試次數 + break ( 適合知道上限的場景)
import java.util.Arrays;
import java.util.Random;

public class DemoMarkSixExample1 {
    
    public static void main(String[] args) {
        int[] answers = new int[6];
        int idx = 0;
        
        // For loop: 固定嘗試 1,000,000 次，但 idx 滿了就 break
        for (int i = 0; i < 1_000_000; i++) {
            int num = new Random().nextInt(49) + 1;  // 1-49
            
            // 檢查重複
            boolean found = false;
            for (int j = 0; j < idx; j++) {
                if (answers[j] == num) {
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                answers[idx++] = num;
                if (idx == 6) {
                    break;  // 集滿 6 個數字，離開迴圈
                }
            }
        }
        
        Arrays.sort(answers);
        System.out.println("Version A (For Loop): " + Arrays.toString(answers));
    }
}