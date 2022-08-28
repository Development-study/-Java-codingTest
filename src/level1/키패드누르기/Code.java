package level1.키패드누르기;

public class Code {

    public static void main(String[] args) {

        Code code = new Code();

        int[] numbers = new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};

        System.out.println(code.solution(numbers, "left"));

    }

    public int checkSize(int i, int j) {
        if(i > j) {
            return i - j;
        } else {
            return j - i;
        }
    }

    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        String[][] keypad = new String[][]{{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}, {"*", "0", "#"}};
        String leftHand = "3,0";
        String rightHand = "3,2";

        for(int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer.append("L");
                leftHand = number == 1 ? "0,0" : number == 4 ? "1,0" : "2,0";
            } else if (number == 3 || number == 6 || number == 9) {
                answer.append("R");
                rightHand = number == 3 ? "0,2" : number == 6 ? "1,2" : "2,2";
            } else {
                for(int i = 0; i < keypad.length; i++) {
                    int left_count = 0;
                    int right_count = 0;
                    if(keypad[i][1].equals(String.valueOf(number))) {
                        left_count = Math.abs(checkSize(i, Integer.parseInt(leftHand.substring(0, leftHand.indexOf(",")))) + checkSize(1, Integer.parseInt(leftHand.substring(leftHand.indexOf(",") + 1))));
                        right_count = Math.abs(checkSize(i, Integer.parseInt(rightHand.substring(0, rightHand.indexOf(",")))) + checkSize(1, Integer.parseInt(rightHand.substring(rightHand.indexOf(",") + 1))));

                        if(left_count < right_count) {
                            answer.append("L");
                            leftHand = i + ",1";
                            break;
                        } else if(left_count > right_count) {
                            answer.append("R");
                            rightHand = i + ",1";
                            break;
                        } else {
                            if(hand.equals("right")) {
                                answer.append("R");
                                rightHand = i + ",1";
                                break;
                            } else if(hand.equals("left")) {
                                answer.append("L");
                                leftHand = i + ",1";
                                break;
                            }
                        }
                    }
                }
            }
        }

        return answer.toString();
    }

}
