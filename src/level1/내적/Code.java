package level1.내적;

public class Code {

    public static void main(String[] args) {
        Code code = new Code();

        int[] a = new int[]{1,2,3,4};
        int[] b = new int[]{-3,-1,0,2};

        System.out.println(code.solution(a, b));
    }

    public int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i = 0; i < a.length; i++) {
            answer += a[i]*b[i];
        }

        return answer;
    }

}
