/*Array : its an way where we can store any value of the integer or string */

// // index of the largest element array 
// // i/p={10,20,5,8}
// // o/p=1
// // effect approach
//  class largestelement{
//        int index(int[]arr,  int x){
//         for(int i=0; i<arr.length;i++){
//             if(arr[i]>arr[x]){
//                 x=i;
//                 System.out.println(x);
//             return x;
//             }
//         else{
//             System.out.println("not found");
//         }    
//         }
//         return x;
//        } 
//     }

// ----------------------------------------------------------------------------





// // index of second largest element in the array
//    /* a[j]> a[largest]: x= largest , largest =i
//     a[j]== a[largest]: ignore
//     a[j]<a[largest]{
//      x==-1: x=j
//      a[j]<=a[x]: ignore
//      a[j]>a[x] : x=i }
//     */ 
   
//    class indexofsecondlargest{
//         int second(int arr[], int x, int largest){
//            for(int j=0; j<arr.length;j++){
//             if(arr[j]>arr[largest]){
//                 x= largest;
//                 largest=j;
//             }
//             else if(arr[j]!= arr[largest]){
//                 if(x==-1|| arr[j]>arr[x]){
//                     x=j;
//                 }
//             }
//            }
//             return x;
            
//         }
// }    


// ----------------------------------------------------------------------------

/*check weither these array is sorted or not by using array 
   
    class arraysorted{
        void sorted(int[] arr){
            for(int i=0; i< arr.length; i++){
                for ( int j= 1; j < arr.length; j++) {
                    if(arr[i]<arr[j]){
                        System.out.println("sorted");
                        
                    }
                    else if(arr[i]>arr[j]){
                        System.out.println("not sorted");
                    }
                }
            }
        }
    }*/

   /*   effected solution for this check sorting 
   
    class arraysorted{
        void sorted(int[] arr){
            for(int i=0; i< arr.length; i++){

                    if(arr[i]<arr[i+1]){
                        System.out.println("sorted");
                        
                    }
                    else if(arr[i]>arr[i+1]){
                        System.out.println("not sorted");
                    }
                }
            }
        }
*/

// --------------------------------------------------------------------------------------------------------

// Remove the duplicates from a sorted array 
// i/p= arr[]={10,20,20,30,30,30,30}
// o/p= arr[]={10,20,30}
 /*class duplicate{
    int x= 1;
    void dup(int []arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[x-1]){
                arr[x-1]=arr[1];
              x++;
            }
            System.out.println(arr[x]);
        }
    }}
*/

// --------------------------------------------------------------------------------------------------------

//   left rotate at array by one 
/* 

class leftrotate{
      
        void rotate(int[] arr, int x){
        int temp = arr[0];
        for(int i=1;i < x;i++){
        arr[i-1]= arr[i];
        arr[x-1]=temp;
   }   }  }
   
   */
     
// --------------------------------------------------------------------------------------------------------

//  Maximum difference from the array  

//   class maximumdifference{
//     void max(int[] arr, int x){
//       for (int i = 0; i < arr.length; i++) {
//          for(int j=1; j < arr.length ;j++){
//             if(arr[j]>arr[i]){
//                 arr[i]= arr[j]-arr[i];
//                 if (arr[i-1]<arr[i]){
//                    arr= i;

//                 }
//             }
//          }
//       }
//     }
//   }




// --------------------------------------------------------------------------------------------------------
// find the frequency of the even question
// i/p={10,10,10,20,20,30}
// o/p={3,2,1}




class frequency{
    void freq(int []arr){
        int fq=1;
        int i = 0;
        while (i<arr.length){
           if(arr[i] == arr[i-1]){
             fq++;
             i++;
     }    System.out.println(fq);
        }
    }
}

    
public class Jarray{
    public static void main(String[] args) {
        int []arr={10,20,20,50,80};
    // arraysorted as= new arraysorted();
    // as.sorted(arr);
    // largestelement le= new largestelement();
    //    le.index(arr, 0);
    frequency ffq= new frequency();
    ffq.freq(arr);
    }
}