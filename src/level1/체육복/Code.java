package level1.체육복;

import java.util.Arrays;

public class Code {

    public static void main(String[] args) {
        Code code = new Code();

        int[] lost = new int[]{2,4};
        int[] reserve = new int[]{3};

        System.out.println(code.solution(5, lost, reserve));
    }

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if(reserve[j] == lost[i]) {
                    answer += 1;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
                if (reserve[j] - 1 == lost[i] || reserve[j] + 1 == lost[i]) {
                    answer += 1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }

}
