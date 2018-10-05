package tech.bts.javaexamples.simpleprogram;

public class Assigment1 {

    public static void main(String[] args) {

        System.out.println(repeatString ("go", 3));

    }




        static String repeatString  (String s, int n) {
            String result = "";

            for (int i = 1; i <= n; i++) {
                result += s;

            }

            return result;


        }

}
