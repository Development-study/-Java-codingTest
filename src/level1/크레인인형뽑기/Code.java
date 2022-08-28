package level1.크레인인형뽑기;

import java.util.Stack;

public class Code {

    public static void main(String[] args) {
        Code code = new Code();

        int[][] board = new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = new int[]{1,5,3,5,1,2,1,4};

        System.out.println(code.solution(board, moves));
    }

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int select : moves) {
            for (int[] doll : board) {
                if (doll[select - 1] != 0) {
                    if(stack.isEmpty()) {
                        stack.push(doll[select - 1]);
                        doll[select - 1] = 0;
                        break;
                    }
                    if(doll[select - 1] == stack.peek()) {
                        answer += 2;
                        doll[select - 1] = 0;
                        stack.pop();
                        break;
                    } else
                        stack.push(doll[select - 1]);
                    doll[select - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }

}
