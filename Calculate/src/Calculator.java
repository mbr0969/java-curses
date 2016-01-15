/**
 * Created by papa on 15.01.16.
 */
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

//получаем результат
    public int getResult(){
        return this.result;
    }

//очищаем рузальтат
    public void cleanRezult(){
        this.result = 0;
    }


}
