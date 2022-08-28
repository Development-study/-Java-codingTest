package level1.음양더하기;

public class Code {

    public static void main(String[] args) {
        Code code = new Code();

        int[] absolutes = new int[]{4,7,12};
        boolean[] signs = new boolean[]{true,false,true};

        System.out.println(code.solution(absolutes, signs));
    }

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i = 0; i < absolutes.length; i++) {
            if(signs[i]) {
                answer += absolutes[i];
            } else {
                answer += -(absolutes[i]);
            }
        }

        return answer;
    }

}
