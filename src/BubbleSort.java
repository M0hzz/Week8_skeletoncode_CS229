/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                //ToDo 3: complete this algorithm, test it, provide its time complexity
                if(a[inner] > a[outer]){
                    temp = a[inner];
                    a[inner] = a[outer];
                    a[outer] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {10,6,3,2,1};
        int size = a.length;
        bubbleSort(a, size);
        for(int x = 0; x < size; x++){
            System.out.println(a[x]);
        }



    }

}