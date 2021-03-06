package com.finalhints.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author amitbhoraniya
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

	public static byte[] readFileToBytes(File file) {
		try {
			FileInputStream fileStream = new FileInputStream(file);
			return readBytes(fileStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new byte[]{};
	}

	public static byte[] readBytes(InputStream inputStream) throws IOException {
		byte[] buffer = new byte[32 * 1024];
		int bufferSize = 0;
		for (;;) {
			int read = inputStream.read(buffer, bufferSize, buffer.length - bufferSize);
			if (read == -1) {
				return Arrays.copyOf(buffer, bufferSize);
			}
			bufferSize += read;
			if (bufferSize == buffer.length) {
				buffer = Arrays.copyOf(buffer, bufferSize * 2);
			}
		}
	}

	public static String readFileToString(File file) {
		if (!file.exists() || file.isDirectory())
			return null;
		StringBuffer sb = new StringBuffer();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sb.toString();
	}

	public static List<String> readLines(File file) {
		if (!file.exists() || file.isDirectory())
			return null;

		List<String> lines = new ArrayList<String>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String line = br.readLine();
			while (line != null) {
				lines.add(line);
				line = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return lines;
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
		return new File(System.getProperty("user.home"));
	}

	public static File getTempDir() {
		return new File(System.getProperty("java.io.tmpdir"));
	}
}
