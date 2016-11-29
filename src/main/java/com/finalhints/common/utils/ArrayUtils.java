package com.finalhints.common.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author amitbhoraniya
 */
public class ArrayUtils {

	public static <T> boolean isEmpty(T[] array) {
		return array == null || array.length == 0;
	}

	public static <T> boolean isNotEmpty(T[] array) {
		return null != array && array.length > 0;
	}

	public static <T> int getLength(T[] array) {
		if (array == null)
			return 0;
		else return array.length;
	}

	public static <T> List<T> toList(T[] array) {
		return new ArrayList<T>(Arrays.asList(array));
	}

	public static <T> boolean contains(T[] array, T element) {
		for (T value : array) {
			if (value.equals(element)) {
				return true;
			}
		}
		return false;
	}

	public static <T> boolean containsAll(T[] parentArray, T[] childArray) {
		// iterate over child array
		for (int i = 0; i < childArray.length; ++i) {
			boolean foundInBigArray = false;

			// iterate over parent array
			for (int j = 0; j < parentArray.length; ++j) {
				if (parentArray[j] == childArray[i]) {
					foundInBigArray = true;
					break;
				}
			}
			if (!foundInBigArray)
				return false;
		}
		return true;
	}

	public static <T> T[] addElement(T[] array, T elementToAdd) {
		return array;
	}

	public static <T> T[] insertElement(T[] array, int position, T elementToInsert) {
		return array;
	}

	public static <T> T[] addElements(T[] array, T[] elementsToAdd) {
		return array;
	}

	public static <T> T[] removeElement(T[] array, T elementToRemove) {
		return array;
	}

	public static <T> T[] removeElements(T[] array, T[] elementsToRemove) {
		return array;
	}

	public static <T> T[] remove(T[] array, int position) {
		return array;
	}

	public static <T> T[] subArray(T[] array, int startIndex, int endIndex) {
		return array;
	}

	public static <T> T[] reverse(T[] array) {
		if (isEmpty(array))
			return array;
		int start = 0;
		int end = array.length - 1;
		T temp;
		while (start < end) {
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			++start;
			--end;
		}
		return array;
	}
}
