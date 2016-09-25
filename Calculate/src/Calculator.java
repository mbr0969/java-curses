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


	
	public static void main(String[] args){
		System.out.println("Calcalate");
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		int summ = first + second;
		System.out.println("Summa: " + summ);
		summ = first * second;
		System.out.println("Proisved: " + summ);
		summ = first/second;	
		System.out.println("Delenie: "+ summ);

	}

}
