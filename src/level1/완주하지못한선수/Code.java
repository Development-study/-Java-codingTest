package level1.완주하지못한선수;

import java.util.Arrays;

public class Code {

    public static void main(String[] args) {
        Code code = new Code();

        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[]{"stanko", "ana", "mislav"};

        System.out.println(code.solution(participant, completion));
    }

    public String solution(String[] participant, String[] completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if(!participant[i].contains(completion[i])) {
                return participant[i];
            }
        }

        return participant[participant.length - 1];
    }

}
