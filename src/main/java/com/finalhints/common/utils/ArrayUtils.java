package com.finalhints.common.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author amitbhoraniya
 *
 */
public class ArrayUtils {

	public static <T> boolean isEmpty(T[] array) {
		return false;
	}

	public static <T> boolean getLength(T[] array) {
		return false;
	}

	public static <T> List<T> toList(T[] array) {
		return new ArrayList<T>(Arrays.asList(array));
	}

	public static <T> boolean contains(T[] array, T element) {
		return false;
	}

	public static <T> boolean containsAll(T[] array1, T[] array2) {
		return false;
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
		return array;
	}
}
