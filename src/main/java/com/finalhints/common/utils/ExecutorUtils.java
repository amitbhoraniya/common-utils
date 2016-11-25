package com.finalhints.common.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author amitbhoraniya
 *
 */
public class ExecutorUtils {

	public static String execute(String cmd) {
		StringBuffer sb = new StringBuffer();
		try {
			Process process = Runtime.getRuntime().exec(cmd);
			InputStream is = process.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			process.waitFor();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
}
