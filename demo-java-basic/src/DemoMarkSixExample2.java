//B (While)	不確定迴圈次數 (邏輯最直覺，集滿就停)
import java.util.Arrays;
import java.util.Random;

public class DemoMarkSixExample2 {
    public static void main(String[] args) {
        int[] answers = new int[6];
        int idx = 0;
        
        // While loop: 不確定要抽幾次，直到集滿 6 個才停止
        while (idx < 6) {
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
            }
        }
        
        Arrays.sort(answers);
        System.out.println("Version B (While Loop): " + Arrays.toString(answers));
    }
}

