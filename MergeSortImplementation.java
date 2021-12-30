package com.great.learning.lab.session.service;



public class MergeSortImplementation {

	 void merge(int arr[], int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];
		
		for (int i = 0; i < n1; ++i)
			leftArray[i] = arr[left + i];
		for (int j = 0; j < n1; ++j)
			rightArray[j] = arr[left + j];
		
		int i = 0, j = 0;
		
		int k = left;
		while(i < n1 && j < n2) {
			if (leftArray[i] >= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		

		while(j < n2) {
			arr[k] = leftArray[j];
			j++;
			k++;
				}
		}
	 
	 
	 public void sort(int[] notes, int left, int right)  {
		 if (left < right) {
			 int mid = (left + right) / 2;
			 
			 sort(notes, left, mid);
			 sort(notes,  mid + 1, right);
			 
			 merge(notes, left, mid, right);
		 }
		 
	 }
		public static void sort(String string) {
			// TODO Auto-generated method stub
			
		}
		 
	           


                                 }
