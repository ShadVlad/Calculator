public class ToRoman {
    public String toRoman(int arabian){
        String letters[]  = { "I", "IV", "V", "IX", "X", "L", "C"};
        int numbers[]  = {1, 4, 5, 9, 10, 50, 100 };
        String roman = new String();
        int n = arabian;
        while ( n > 0 ){
            for (int i = 0; i < numbers.length; i++){
                if ( n < numbers[i] ){
                    n -= numbers[i-1];
                    roman += letters[i-1];
                    break;
                }
            }
        }
        return roman;
    }

}
