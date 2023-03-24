/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {

    public static int search(int arr[], int x)
    {
        int index = 0;
        int n = arr.length;
        for(int y = 0; y < n; y++){
            if(arr[y] == x){
                index = y;
            }
        }
        // Todo 01: - complete the implementation of linear search and test your code  
        //         - prvoide asymptotic analysis of the developed solution
        return index;
    }
/*
Asymptotic Notation: Θ(n)
 */
public static void main(String[] args) {
    int a[] = {1,5,8,3,7,8,1,5,22,5,3};
    System.out.println(search(a, 22));
}
}