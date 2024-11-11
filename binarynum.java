 import java.util.*;

    public class binarynum {
        public static void main(String[] args) {
            // az arraylist estefade mikonim
            ArrayList<String> list = new ArrayList<>();
            //vurudi ra az karbar migirim
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                int bit_num = function_bit(i);
                String binary = function_binary(i, bit_num);
                // be list ezafe mikonim
                list.add(binary);
            }
            // az yek halghe baraye print kardan estefade mikonim
            for (int j = 0; j < n; j++) {
                System.out.print(list.get(j) + " ");

            }
        }

        private static String function_binary(int n, int bit_num) {
            int num_temp = 0;
            String answer = "";

            for (int i = bit_num; i >= 0; i--) {
                num_temp = n >> i;
                if ((num_temp & 1) == 1) {

                    answer += "1";

                } else {

                    answer += "0";

                }
            }
            return answer;
        }

        private static int function_bit(int n) {
            int num = 2;
            int bit_num = 0;
            while (num <= n) {
                bit_num = bit_num + 1;
                num = num * 2;
            }
            return bit_num;
        }
    }