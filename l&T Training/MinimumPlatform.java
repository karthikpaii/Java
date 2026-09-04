package com.activity;

import java.util.Arrays;

public class MinimumPlatform {
          public static int findPlatform(int[] arrival, int[] departure) {
        	 Arrays.sort(arrival);
        	 Arrays.sort(departure);
        	  
        	 int i=0;
        	 int j=0;
        	 int platform=0;
        	 int maxPlatforms=0;
        	 
        	 while(i<arrival.length  && j<departure.length)
        	 {
        		 if(arrival[i]<=departure[j]) {
        			 platform++;
        			 i++;
        			 maxPlatforms= Math.max(maxPlatforms,platform);
        		 } else {
        			 platform--;
        			 j++;
        		 }
        	 }
        	  return maxPlatforms;
          }
          

public static void main(String[] args) {
        	int[] arr= {11,14,10,15,18,15};
        	
        	int[] dept= {12,141,6,17,19,19};

        	 int result=findPlatform(arr,dept);
        	 System.out.println("Maximum Platoform: "+result);
        	 
        	
        }
    }
