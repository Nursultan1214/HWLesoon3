package com.company;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] nums = {10.1, -5.6, -8.9, 11.2, 12.3, -6.6, -2.3, 5.6, 7.1, 9.1, 6.8, 8.8, -9.6, 13.4, 14.5};
        //double [] nums = {8, -2, -4, 2, 3, 6};
        boolean isNegative = false;
        double summ = 0;
        double count = 0;
        for (double i:nums) {
            if (i<0){
                isNegative = true;
            }
            if (i>0 && isNegative){
                summ = summ+i;
                count++;

            }
        }

        System.out.println("ответ " +(summ / count));

    }
}
