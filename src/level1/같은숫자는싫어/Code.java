package level1.같은숫자는싫어;

public class Code {

    public static void main(String[] args) {
        Code code = new Code();

        int[] arr = new int[]{1,1,3,3,0,1,1};

        for (int number : code.solution(arr)) {
            System.out.println(number);
        }
    }

    public int[] solution(int []arr) {
        int count = 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i - 1]) {
                count++;
            }
        }

        int[] answer = new int[count];
        count = 1;

        answer[0] = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i - 1]) {
                answer[count++] = arr[i];
            }
        }

        return answer;
    }

}
