package level1.K번째수;

import java.util.Arrays;

public class Code {

    public static void main(String[] args) {
        Code code = new Code();

        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(code.solution(array, commands)));
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] newArray;
        int i = 0;

        for(int[] command : commands) {
            newArray = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(newArray);
            answer[i++] = newArray[command[2] - 1];
        }

        return answer;
    }

}
