package ru.lesson.lessons;


public class Calculator {

//Результат вычеслений
     private int result;
//Суммируем аргументы

    public void add(int ... params)
    {
        for (Integer param : params ){
            this.result += param;
      }
    }
public void div(int... args ){
    if (args.length  > 0){

    }else{

    }
}

//получаем результат
    public int getResult(){
      return this.result;
    }

//очищаем рузальтат
    public void cleanRezult(){
      this.result = 0;
    }



}
