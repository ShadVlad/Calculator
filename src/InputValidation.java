import jdk.jfr.BooleanFlag;

public class InputValidation {
    private int firstArg, secondArg;
    private String operand;
    private boolean isRoman, allCorrect;

    public void inputVal() {
        String[] arabian = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        String[] operands;
        String[] correctOperand = {"+", "-", "*", "/"};
        boolean isArabian, isCorrect;

        isArabian = false;
        isRoman = false;
        isCorrect = false;


        allCorrect = ((isArabian || isRoman) && isCorrect);

        System.out.println("Выражение дожно содержать: \nАрабские цифры");
        for (int i = 0; i < 10; i++) {
            System.out.print(arabian[i] + " ");
        }
        System.out.println("\nили римские цифры");
        for (int i = 0; i < 10; i++) {
            System.out.print(roman[i] + " ");
        }
        System.out.println("\nи знак операции");
        for (int i = 0; i < 4; i++) {
            System.out.print(correctOperand[i] + " ");
        }
        System.out.println();

//        while (!allCorrect) {
        System.out.print("\nВедите выражение >> ");
        ReadConsole readConsole = new ReadConsole();
        operands = readConsole.readNext();
//        System.out.println(operands[0]);
//        System.out.println(operands[1]);
//        System.out.println(operands[2]);

        if (java.util.Arrays.asList(arabian).contains(operands[0])) {
            if (java.util.Arrays.asList(arabian).contains(operands[2])) {
                firstArg = Integer.parseInt(operands[0]);
                secondArg = Integer.parseInt(operands[2]);
//                    System.out.println("Вы ввели арабские цифры");
                isArabian = true;
            }
        }

        if (java.util.Arrays.asList(roman).contains(operands[0])) {
            if (java.util.Arrays.asList(roman).contains(operands[2])) {
                firstArg = java.util.Arrays.asList(roman).indexOf(operands[0]) + 1;
                secondArg = java.util.Arrays.asList(roman).indexOf(operands[2]) + 1;
//                    System.out.println("Вы ввели римские цифры");
                isRoman = true;
            }
        }


        if (java.util.Arrays.asList(correctOperand).contains(operands[1])) {
            operand = operands[1];
//                System.out.println("Вы ввели знак действия");
            isCorrect = true;
        }
        allCorrect = ((isArabian || isRoman) && isCorrect);
        //int i = Integer.parseInt(operands[0]);
        //System.out.println(allCorrect);
        //System.out.println(i);


    }

    public int getFirst() {
        return firstArg;
    }

    public int getSecond() {
        return secondArg;
    }

    public String getOperand() {
        return operand;
    }

    public boolean getIsRoman() {
        return isRoman;
    }

    public boolean getIsCorrect() {
        return allCorrect;
    }

}


