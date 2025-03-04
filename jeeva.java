import java.util.*;
class jeevajava {
    public static void main(String[] args) {
     //  Scanner sc =new Scanner(System.in);
     float arr[]={1.0,2.0,3,4,5,6,7,8,9,10};
     int s=0,e=(arr.length-1),t=0;
         
         for(int i=0;i<arr.length;i++){
            if(s<e){
              t=arr[s];
             arr[s]=arr[e];
             arr[e]=t;
               s++;
               e--;
            }
            else{
               break;
            }

         }
         System.out.print(Arrays.toString(arr));
    }
}

    
