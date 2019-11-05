public class Calculator {

    public static void main(String[] args) {
        int a;
        int b;
        int res;
        String operand, resStr;
        boolean isRoman;
        InputValidation inputVal = new InputValidation();
        inputVal.inputVal();

        if (inputVal.getIsCorrect()) {
            a = inputVal.getFirst();
            b = inputVal.getSecond();
            operand = inputVal.getOperand();
            isRoman = inputVal.getIsRoman();
            res = 0;
            Calculation calc = new Calculation(a, b);

            if (operand.equals("*")) {
                res = calc.mult();
            }

            if (operand.equals("/")) {
                res = calc.div();
            }
            if (operand.equals("+")) {
                res = calc.add();

            }
            if (operand.equals("-")) {
                res = calc.subs();
            }

            if (isRoman) {
                if (res <= 0) {
                    resStr = "В римской нумерации нет соответствия результату";
                } else {
                    ToRoman toRoman = new ToRoman();
                    resStr = toRoman.toRoman(res);
                }
            } else {
                resStr = String.valueOf(res);
            }
            System.out.println(resStr);
        } else {
            System.out.println("Вы ввели некорректные данные");
        }
    }
}