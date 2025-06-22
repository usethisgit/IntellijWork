//Reversing a String without using built-in functions

public class ReverseString  {
    public static void main(String[] args){
        String str = "Hello";
        String Result = stringReverse(str);
        System.out.println("reversed String :"+ Result);
    }

    private static String stringReverse(String str) {
      // return  new StringBuilder(str).reverse().toString();

       //method 2:
        char[] arr = str.toCharArray();
    int left = 0;
    int right = arr.length - 1;
    while (left < right){
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        //move towards the centre
        left++;
        right--;
    }
    return new String(arr);


    }
}
