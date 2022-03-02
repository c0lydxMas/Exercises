package Tripi;

import java.util.*;

public class mergeArrays{  

    public static int[] merge(int a[], int b[]){

        int la = a.length, lb = b.length;
        int c[] = new int[la+lb];

        int i = 0, j = 0, k = 0;
        while(i < la && j < lb){
            if(a[i] < b[j]){
                c[k] = a[i];
                i++;
            }else{
                c[k] = b[j];
                j++;
            }
            k++;
        }

        while(i < la){
            c[k] = a[i];
            i++;
            k++;
        }

        while(j < lb){
            c[k] = b[j];
            j++;
            k++;
        }

        return c;
    }


    public static void main(String[] args){
        int[] a = {1,2,5,8,12};
        int[] b = {1,3,5,6,7,13,24};
        int[] c = merge(a, b);
        for(int auto : c){
            System.out.print(auto + " ");
        }
    }
}  
