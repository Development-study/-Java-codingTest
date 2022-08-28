package level1.신고결과받기;

public class Code {

    public static void main(String[] args) {
        Code result = new Code();

        String[] id_list = new String[]{"muzi", "frodo", "apeach", "neo"};
        String[] report = new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};

        for (int i : result.solution(id_list, report, 2)) {
            System.out.println(i);
        }
    }

    public int[] solution(String[] id_list, String[] report_list, int k) {
        int[] answer = new int[id_list.length];

        for(String report : report_list) {

        }


        return answer;
    }

}
