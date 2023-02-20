
// import java.util.Scanner;

class power {
    int pow(int e) {

        if (e == 0) {
            return 1;
        }
        int begin = (int) (Math.pow(2, e - 1));
        int level = 2 * begin;
        System.out.println("the value of power:" + level);
        System.out.println("=====");
        return level;
    }
}

// recursion is the nothing but the returning value in direct or in direct way
// factorial code
class factor {

    int fac(int n) {
        System.out.println("--------------------");
        if (n == 0) {
            return 1;
        }

        int small = fac(n - 1);
        int end = n * small;
        System.out.println("this is the value:" + end);

        return end;

    }
}

// now for the recurison in binary search we have to find what if the array is
// sorted or not?
class issorted {
    boolean sort(int[] array, int size) {

        if (size == 0 || size == 1) {
            return true;
        }
        if (array[size - 1] > array[size]) {
            System.out.println("not sorted");
        } else {
            System.out.println("sorted");
        }
        boolean ret = sort(array, size - 1);

        return ret;

    }}

    // home work question just need to try to add all the interger in the array


    // class sumHOMEWORK {
    // int sum(int[] array , int size) {
    // if (size == 0) {
    // return 0;
    // }
    // if(size == 1){
    // return array[0];
    // }
    // int add= sum(array+1,size-1);
    // int i=array[0]+add;
    // System.out.println(i);
    // return i;

    // }




    // Now the topic of string in the recursion here I explain the string with an example
    // of palindrome
    //  what is palindrome ?
    // palindrome is way where the string is same from the end and from beginning
    // example : naman , naan , 


    // class palindrome{
    //      boolean pal( String str[],int start, int end ){
    //         if(start > end){
    //             return false;
    //         }
    //         if (str[start] != str[end]){
    //             System.out.println("not found");
    //             return false;
    //         }
    //         else {

    //             System.out.println("value of palindrome:");
    //             System.out.println(pal(str, start++,end--));
    //             return pal(str, start++,end--);
                
    //         }
    //     }}

        //  now a unique question by Calculating Power using Recursion
        // example :line 4^9 so in loop our loop will run for 9 time but in this method it will take
    //     in loop our loop will work form
        //  ass =1
        //  for (int i=0 ; i==b;i++)
        //  but in recursion we need to go till b but in different way
        // or even :- total a^b = a^(b/2)*a^(b/2)
        // or in odd :- total a^b = a*a^(b/2)*a^(b/2), now lets start the task 

        class power2{
        int pw(int a, int b){
         if (b==0){
            return 1;
         }
         if (b==1){
            return a;
         }
         int pwer= (int)(Math.pow(a, b/2));
         if(b%2==0){
            System.out.println("it is even "+pwer*pwer);
            return pwer*pwer;
         }
         else{ System.out.println("it is odd "+a*pwer*pwer);
         return a*pwer*pwer;}
        
        }

        
         public static void main(String[] args) {
        String str[] ={"naam"};
        int[] array = { 1, 2, 3, 4 };
        int size = 4;
        factor f = new factor();
        f.fac(5);
        power p = new power();
        p.pow(5);
        issorted sor = new issorted();
        sor.sort(new int[] { 1, 2, 7, 4, 5 }, size);
        // sumHOMEWORK hw= new sumHOMEWORK();
        // hw.sum(array, size);
        // palindrome pa= new palindrome();
        // pa.pal(str, 0, str.length-1);
        power2 pww = new power2();
        pww.pw(4, 11);

    }
 }




   