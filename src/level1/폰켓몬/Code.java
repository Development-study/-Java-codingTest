package level1.폰켓몬;

import java.util.HashSet;

public class Code {

    public static void main(String[] args) {
        Code code = new Code();

        int[] nums = new int[]{3,1,2,3};

        System.out.println(code.solution(nums));
    }

    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        return Math.min(set.size(), nums.length / 2);
    }

}
