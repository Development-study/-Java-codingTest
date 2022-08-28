package level1.최소직사각형;

public class Code {

    public static void main(String[] args) {
        Code code = new Code();

        int[][] sizes = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        System.out.println(code.solution(sizes));
    }

    public int solution(int[][] sizes) {
        int answer = 0;

        for(int[] item : sizes) {
            if(item[0] < item[1]) {
                int temp = item[0];
                item[0] = item[1];
                item[1] = temp;
            }
        }

        int xMax = 0;
        int yMax = 0;

        for(int[] i : sizes) {
            if(i[0] > xMax) {
                xMax = i[0];
            }
            if(i[1] > yMax) {
                yMax = i[1];
            }
        }

        answer = xMax * yMax;

        return answer;
    }

}
