public class Main {
    public static void main(String[] args){
         int [] testArray = {19,21,23,44,55,2,4,5};

         //Ejercicio 1 prueba
         System.out.println("Highest number: "+ ArrayMethods.getHighestNumber(testArray));

         //Ejercicio 2 prueba
         int [] squaredArray = ArrayMethods.squareNumber(testArray);
         
         for(int i = 0; i < testArray.length; i++){
            System.out.println("Squared value of "+ testArray[i] + " is: "+ squaredArray[i]);
         }

         //Ejercicio 3 prueba
         System.out.println("Lowest number: "+ ArrayMethods.lowestNumber(testArray));
          

         //Ejercicio 4 prueba
         System.out.println("Sum of all elements in the array: "+ ArrayMethods.sumArray(testArray));

         //Ejercicio 5 prueba
         System.out.println("Second highest number: "+ ArrayMethods.secondHighest(testArray));

         //Ejercicio 6 prueba
            System.out.println("Average of the array: "+ ArrayMethods.averageArray(testArray));

        //Ejercicio 7 prueba
        ArrayMethods.evenOdd(testArray);

        //Ejercicio 8 prueba 
        IOManager.print("Provide the number wanna search");
        int value = IOManager.readInt();
        ArrayMethods.searchValue(testArray, value);
    }

   
}
