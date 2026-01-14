public class ArrayMethods {
    public static int getHighestNumber(int [] arr){
        int highest = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > highest){
                highest = arr[i];
            }
        }
        return highest;
    }

    public static int[] squareNumber(int [] arr){
        int [] squaredArray = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            squaredArray[i] = arr[i] * arr[i];
        }

        return squaredArray;
    }

    public static int lowestNumber(int [] arr){
        int lowest = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < lowest){
                lowest = arr[i];
            }
        }
        return lowest;
    }

    public static int sumArray(int [] arr){
        int result = 0;

        for(int i = 0; i < arr.length; i++){
            result += arr[i];
        }

        return result;
    }

     public static int secondHighest(int [] arr){
        int highest = getHighestNumber(arr);
        int secondHighest = arr[0];

        for(int i = 0; i < arr.length; i++){

            if(arr[i] != highest && arr[i] > secondHighest){
                secondHighest = arr[i];
            }
        }
        return secondHighest;
    }

    public static double averageArray(int [] arr){
        int  sum  = sumArray(arr);
        double average = sum / arr.length;

        return average;
    }

    public static void evenOdd(int [] arr){
        int  even = 0;
        int odd = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Total of even numbers: " + even);
        System.out.println("Total of odd numbers: " + odd);
        
    }

    public static void searchValue(int [] arr, int n){
        boolean found = false; 
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                IOManager.print("Number found at index: " + i+1);
                found = true;
            }
        }

        if(!found) IOManager.print("Number not founded");

        
        
    }
}
