package ru.lesson.lessons;


public class Calculator {

    //Результат вычеслений
    private int result;
//Суммируем аргументы

    public void add(int... params) {
        for (Integer param : params) {
            this.result += param;
        }
    }

    public int div(int first, int second) {
          if (second != 0) {
                return this.result = first / second;
              } else {
                System.out.println("Division by zero");
            }
        return 1;
        }



    //получаем результат
    public int getResult() {
        return this.result;
    }

    //очищаем рузальтат
    public void cleanRezult() {
        this.result = 0;
    }


}
