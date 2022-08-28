package level1.신규아이디추천;

public class Code {

    public static void main(String[] args) {

        Code code = new Code();

        System.out.println(code.solution("z-+.^."));;
    }

    public String solution(String new_id) {
        String answer = "";

        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^0-9a-z-_.]", "");
        new_id = new_id.replaceAll("[.]+", ".");
        new_id = new_id.replaceAll("^[.]", "");
        new_id = new_id.replaceAll("[.]$", "");
        new_id = new_id.equals("") ? "a" : new_id;
        new_id = new_id.length() >= 16 ? new_id.substring(0, 15) : new_id;
        new_id = new_id.replaceAll("[.]$", "");
        if(new_id.length() <= 2) {
            while(new_id.length() < 3) {
                new_id = new_id + new_id.substring(new_id.length() - 1);
            }
        }
        answer = new_id;

        return answer;
    }

}
