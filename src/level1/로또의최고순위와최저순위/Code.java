package level1.로또의최고순위와최저순위;

public class Code {

    public static void main(String[] args) {
        Code code = new Code();

        int[] lottos = new int[]{44, 1, 0, 0, 31, 25};
        int[] win = new int[]{31, 10, 45, 1, 6, 19};

        for(int i : code.solution(lottos, win)) {
            System.out.println(i);
        }
    }

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int top_check = 0;
        int low_check = 0;

        for(int lotto : lottos) {
            if (lotto == 0) {
                top_check++;
            }
            for (int win : win_nums) {
                if(lotto == win) {
                    top_check++;
                    low_check++;
                }
            }
        }
        answer[0] = top_check == 6 ? 1 : top_check == 5 ? 2 : top_check == 4 ? 3 : top_check == 3 ? 4 : top_check == 2 ? 5 : 6;
        answer[1] = low_check == 6 ? 1 : low_check == 5 ? 2 : low_check == 4 ? 3 : low_check == 3 ? 4 : low_check == 2 ? 5 : 6;

        return answer;
    }

}
