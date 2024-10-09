// // class Solution {
// //     public boolean canArrange(int[] arr, int k)
// //      {
// //         int n = (arr.length);
// //         for( int i = 0 ; i < n/2; i++ ){
// //             if((arr[i]+arr[n - i - 1])%k!=0){
// //                 return false;
// //             }

// //         }
// //            return true;
 
// //     }
// // }



// // class Solution {
// //     public boolean canArrange(int[] arr, int k)
// //     //  {
// //     //     int n = (arr.length);
// //     //     int pair =0;
// //     //     for( int i = 0 ; i < n; i++ ){
// //     //         for( int j = 1;j<n;j++){
// //     //             if(arr[i]+arr[j] % k == 0){
// //     //                 pair++;
// //     //             }
// //     //         }
// //     //     }
// //     //        return pair == n/2;

// //     }
// // }
// class Solution {
//     public boolean canArrange(int[] arr, int k)
//      {
//         int n = (arr.length);
//           for (int i = 0; i < n; i++) {
//             arr[i] = Math.abs(arr[i]);
//         }
//         for( int i = 0 ; i < n/2; i++ ){
//             if((arr[i]+arr[(n-i)-1])%k!=0){
//                 return false;
//             }

//         }
//            return true;
 
//     }
// }
class Solution{
    public static boolean canArrange(int[] arr, int k) {
        int[] remainderCount = new int[k];
        

        for (int num : arr) {
            int remainder = ((num % k) + k) % k;  // Handle negative numbers correctly
            remainderCount[remainder]++;
        }

        for (int i = 1; i < k; i++) {
            if (remainderCount[i] != remainderCount[k - i]) {
                return false;
            }
        }

        return remainderCount[0] % 2 == 0;
    }
    }