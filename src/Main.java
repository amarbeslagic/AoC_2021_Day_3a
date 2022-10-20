import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {


        File file = new File("inputs//input_AoC_3a.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        List<String> listOfStrings = new ArrayList<>();


        String s;
        //put Strings in array
        while((s = br.readLine()) != null) {
            if (s.isBlank()) continue;

            listOfStrings.add(s);
        }

        int[] intArray = new int[]{ 0,0,0,0,0,0,0,0,0,0,0,0 };


        for(String str : listOfStrings)
        {
            if(str.charAt(0) == '1'){
                intArray[0] += 1;
            }
            if(str.charAt(1) == '1'){
                intArray[1] += 1;
            }
            if(str.charAt(2) == '1'){
                intArray[2] += 1;
            }
            if(str.charAt(3) == '1'){
                intArray[3] += 1;
            }
            if(str.charAt(4) == '1'){
                intArray[4] += 1;
            }
            if(str.charAt(5) == '1'){
                intArray[5] += 1;
            }
            if(str.charAt(6) == '1'){
                intArray[6] += 1;
            }
            if(str.charAt(7) == '1'){
                intArray[7] += 1;
            }
            if(str.charAt(8) == '1'){
                intArray[8] += 1;
            }
            if(str.charAt(9) == '1'){
                intArray[9] += 1;
            }
            if(str.charAt(10) == '1'){
                intArray[10] += 1;
            }
            if(str.charAt(11) == '1'){
                intArray[11] += 1;
            }
        }

        String gamma = "";
        String epsilon = "";


        for(int i=0; i<12; i++){
            //System.out.println(intArray[i]);

            if(intArray[i] >= 500)
            {
                gamma = new StringBuilder().append(gamma).append("1").toString();
                epsilon = new StringBuilder().append(epsilon).append("0").toString();
            }
            else {
                gamma = new StringBuilder().append(gamma).append("0").toString();
                epsilon = new StringBuilder().append(epsilon).append("1").toString();
            }
        }

        System.out.println("Gamma:  " + gamma);
        System.out.println("Epsilon " + epsilon);

        int gammaDecimal = Integer.parseInt(gamma, 2);
        int epsilonDecimal = Integer.parseInt(epsilon, 2);

        System.out.println("Gamma decimal: " + gammaDecimal);
        System.out.println("Epsilon decimal: " + epsilonDecimal);

        int result = gammaDecimal * epsilonDecimal;

        System.out.println(result);
    }
}