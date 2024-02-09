package Java_2K23.DSA;

public class Bubblesorting {
    public static void main(String[] args){
        int[]array = {7, 8, 3, 2, 1};
        // buble sort
        for(int i=0;i<array.length-1;i++){ // 4 time loop required to perform the sorting
            for(int j=0;j<array.length-i-1;j++){ // 5-0-1 = 4. 5-1-1=3.5-2-1=2. 5-3-1=1
                if(array[j]>array[j+1]){ // 7>8 no; 8>3 yes
                    int temp = array[j]; //temp =8
                    array[j] = array[j+1];// 8=3 sp array[i] = 3
                    array[j+1] = temp; // 3=8;
                }
            }
        }
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}
