package level1.성격유형검사하기;

public class Code {

    public static void main(String[] args) {
        Code code = new Code();

        String[] survey = new String[]{"TR", "RT", "TR"};
        int[] choices = new int[]{7, 1, 3};

        System.out.println(code.solution(survey, choices));
    }

    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String[][] types = new String[][]{{"R", "T"}, {"C", "F"}, {"J", "M"}, {"A", "N"}};
        int[][] scores = new int[][]{{0,0}, {0,0}, {0,0}, {0,0}};
        int[] score = new int[]{3,2,1,0,1,2,3};

        for(int i = 0; i < survey.length; i++) {
            if(choices[i] < 4) {
                checkTypeAddScore(survey[i].substring(0, 1), types, scores, score[choices[i] - 1], i, 0);
            } else if(choices[i] > 4) {
                checkTypeAddScore(survey[i].substring(1), types, scores, score[choices[i] - 1], i, 0);
            }
        }

        for(int i = 0; i < scores.length; i++) {
            if(scores[i][0] > scores[i][1]) {
                answer += types[i][0];
            } else if(scores[i][0] < scores[i][1]) {
                answer += types[i][1];
            } else if(scores[i][0] == scores[i][1]) {
                answer += types[i][0];
            }
        }

        return answer;
    }

    public void checkTypeAddScore(String survey, String[][] types, int[][] scores, int score, int i, int k) {
        for(int j = 0; j < types.length; j++) {
            if(survey.equals(types[j][k])) {
                scores[j][k] += score;
                break;
            } else if(survey.equals(types[j][k + 1])){
                scores[j][k + 1] += score;
                break;
            }
        }
    }

}
