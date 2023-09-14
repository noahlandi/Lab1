package additionClosure;

import java.util.List;

public class AdditionClosure {

    public static boolean isClosed(List<Integer> intList, Integer n) {

        int check = 1;
        int number ;
        int numberK;
        int i;
        int j;
        int k;

        for (j=0; j < intList.size(); j++) {

            for (i=0; i < intList.size(); i++) {

                if (i == j) {
                    continue;
                }

                number = intList.get(i) + intList.get(j);

                if (!intList.contains(number % n)) {
                    check = 0;
                }

                for (k=0 ; k<number ;k++) {
                    numberK = number%n + k*n;
                    if (intList.contains(numberK)) {
                        check = 1;
                    }
                }
                
                if (check == 0) {
                    return false;
                }
            }
        }
            return true;
    }

}