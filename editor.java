import java.util.*;

public class editor {

    public static void main(String[] args) {
        int p = 0 ;
        int c = 0 ;
        String answer = "";
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] array = new String[str.length()];
        ArrayList<String> results = new ArrayList<>();

        //stringi ke az karabr gereftim be komak tabei ke tarif kardim be array az type string tabdil mikonim
        convert_string_to_array(str,array);

        while ( p  < str.length()) {

            if (array[p].equals("-")) {


                if (c > 0 && results.size() > 0) {
                    results.remove(c - 1);
                    c = c - 1;
                }

            } else if (array[p].equals(">")) {
                if (results.size() > c) {
                    c = c + 1;
                }



            } else if (array[p].equals("<")) {
                if (c > 0) {
                    c = c - 1;
                }


            } else {
                results.add(c, array[p]);
                c = c + 1 ;


            }
            p++;


        }


        for (int j = 0; j < results.size(); j++)
        {
            answer += results.get(j);
        }

        if (answer.equals(" ") || answer.equals(""))
        {
            System.out.println(-1);
        }
        else {
            System.out.println(answer);
        }
    }

    public static void convert_string_to_array(String str , String[] array)
    {
        for (int i = 0; i < array.length ; i++)
        {
            array[i] = String.valueOf(str.charAt(i));
        }
    }
}
