package level1.소수만들기;

public class Code {

    static int check = 0;
    static int answer = 0;

    public static void main(String[] args) {
        Code code = new Code();

        int[] nums = new int[]{1,2,7,6,4};

        System.out.println(code.solution(nums));

    }

    public boolean isPrime(int num) {
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return true;
            }
        }

        return false;
    }

    public void permutation(int[] nums, boolean[] visited, int start, int depth, int r) {
        if(depth == r) {
            for(int i=0; i<nums.length; i++){
                if(visited[i])  {
                    check += nums[i];
                }
            }

            if(!isPrime(check)) {
                answer++;
            }
            check = 0;
            return;
        }

        for(int i=start; i<nums.length; i++){
            if(!visited[i]){
                visited[i] = true;
                permutation(nums, visited, i+1, depth+1, r);
                visited[i] = false;
            }
        }
    }

    public int solution(int[] nums) {
        int r = 3;
        boolean[] visited = new boolean[nums.length];

        permutation(nums, visited, 0, 0, r);

        return answer;
    }

}
