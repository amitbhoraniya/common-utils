package com.finalhints.common.utils;

import java.io.File;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;

/**
 * @author amitbhoraniya
 *
 */
public class FileUtils {

	private FileUtils() {
	}

	public static void deleteRecursive(File fileOrDir) {
		File[] files = fileOrDir.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				deleteRecursive(file);
				file.delete();
			} else {
				file.delete();
			}
		}
		fileOrDir.delete();
	}

	public static byte[] readFileToBytes(File fileOrDir) {
		return null;
	}

	public static String readFileToString(File fileOrDir) {
		return null;
	}

	public static List<String> readLines(File fileOrDir) {
		return null;
	}

	public static void writeToFile(InputStream source, File destination) {
	}

	public static void writeToFile(File fileOrDir, String data, Charset encoding) {
	}

	public static void writeToFile(File fileOrDir, byte[] data) {
	}

	public static void writeLines(File fileOrDir, List<String> lines, Charset encoding) {
	}

	public static File getUserDir() {
		return null;
	}

	public static File getTempDir() {
		return null;
	}
}
