package javaassigment10.question1;

import java.util.Arrays;

public class BubbleSort implements Sortable {

	@Override
	public void sort(int arr[]) {
		int len = arr.length;
		int i, j, temp;
		for (i = 0; i < len; i++) {
			for (j = i + 1; j < len; j++) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
