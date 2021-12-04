package com.api.networking;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Arrays;

public class NetworkingDemo {
    public static void main(String[] args) throws Exception {
        String url = "www.google.com";
        InetAddress inetAddress = Inet4Address.getByName(url);
        System.out.println("Address : " + Arrays.toString(inetAddress.getAddress()));

        System.out.println("Host Address : " + inetAddress.getHostAddress());

        System.out.println("Is any local Address : " + inetAddress.isAnyLocalAddress());

        System.out.println("Is link local Address : " + inetAddress.isLinkLocalAddress());

        System.out.println("Is loopback Address : " + inetAddress.isLoopbackAddress());

        System.out.println("Is site local Address : " + inetAddress.isSiteLocalAddress());

        System.out.println("hash code : " + inetAddress.hashCode());



    }
}
