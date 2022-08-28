package level1.없는숫자더하기;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Code {

    public static void main(String[] args) {

        Code code = new Code();

        int[] numbers = new int[]{1,2,3,4,6,7,8,0};

        System.out.println(code.solution(numbers));
    }

    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        for(int i = 0; i < 10; i++) {
            int finalI = i;
            if(IntStream.of(numbers).anyMatch(x -> x == finalI)) {
                continue;
            } else {
                answer += finalI;
            }
        }

        return answer;
    }

}
