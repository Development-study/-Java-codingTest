package level1.체육복;

public class Code {

    public static void main(String[] args) {
        Code code = new Code();

        int[] lost = new int[]{2,4};
        int[] reserve = new int[]{3};

        System.out.println(code.solution(5, lost, reserve));
    }

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        for(int lo : lost) {
            for(int re : reserve) {
                if((lo + 1 == re) || (lo - 1 == re) || (lo == re)) {
                    answer += 1;
                    break;
                }
            }
        }

        return answer;
    }

}
