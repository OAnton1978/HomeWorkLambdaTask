package com.company;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
    //  int b = calc.minus.apply(1,1);    данная строка из задания. с первым параметром = 1 в 13 строке будет деление на 0 - Exception
    //  в связи с этим в строке 12 первый параметр установил =2
    //  что касается реализации тернарного оператора в переменной abs, ни я ни IDEA ошибок не увидели
        int b = calc.minus.apply(2,1);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);
    }
}
