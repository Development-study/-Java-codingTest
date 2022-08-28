package level1.모의고사;

import java.util.Arrays;

public class Code {

    public static void main(String[] args) {
        Code code = new Code();

        int[] answers = new int[]{1,2,3,4,5,4,3,2,1,2,3,4,5};

        System.out.println(Arrays.toString(code.solution(answers)));
    }

    public int[] solution(int[] answers) {
        int[] result = new int[3];
        int[][] student = new int[][]{{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] score = new int[3];
        int max_score = 0;

        for (int j = 0; j < student.length; j++) {
            int k = 0;
            for (int answer : answers) {
                if (k > student[j].length - 1) {
                    k = 0;
                }
                if (answer == student[j][k]) {
                    score[j]++;
                }
                k++;
            }
            max_score = Math.max(max_score, score[j]);
        }

        for(int i = 0; i < score.length; i++) {
            if(score[i] >= max_score) {
                result[i] = i+1;
                max_score = score[i];
            }
        }

        return Arrays.stream(result).filter(i -> i != 0).toArray();
    }

}
