package com.finalhints.common.utils;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

/**
 * @author amitbhoraniya
 */
public class InetAddressUtils {

	public static Set<String> getAllLocalHostNames() {
		Set<String> localNames = new HashSet<String>();
		Enumeration<NetworkInterface> e = null;
		try {
			e = NetworkInterface.getNetworkInterfaces();
		} catch (SocketException exception) {
			throw new RuntimeException(exception);
		}
		while (e.hasMoreElements()) {
			for (Enumeration<InetAddress> ee = e.nextElement().getInetAddresses(); ee
					.hasMoreElements();) {
				InetAddress ia = ee.nextElement();
				if (ia != null) {
					if (ia.getHostName() != null) {
						localNames.add(ia.getCanonicalHostName());
					}
					if (ia.getHostAddress() != null) {
						localNames.add(ia.getHostAddress());
					}
				}
			}
		}
		final String localhost = "localhost";
		if (!localNames.contains(localhost)) {
			localNames.add(localhost);
		}
		final String localhostLocaldomain = "localhost.localdomain";
		if (!localNames.contains(localhostLocaldomain)) {
			localNames.add(localhostLocaldomain);
		}
		return localNames;
	}
}
