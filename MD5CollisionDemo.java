package com.leotest.md5collisiondemo;

import java.security.MessageDigest;

/**
 * test md5 hash collision
 * author by leo
 */
public class MD5CollisionDemo {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    public static void test1() {
        String m1 = "4dc968ff0ee35c209572d4777b721587d36fa7b21bdc56b74a3dc0783e7b9518afbfa202a8284bf36e8e4b55b35f427593d849676da0d1d55d8360fb5f07fea2";
        String m2 = "4dc968ff0ee35c209572d4777b721587d36fa7b21bdc56b74a3dc0783e7b9518afbfa200a8284bf36e8e4b55b35f427593d849676da0d1555d8360fb5f07fea2";
        md5(m1, m2);
    }

    public static void test2() {
        String m1 = "d131dd02c5e6eec4693d9a0698aff95c2fcab58712467eab4004583eb8fb7f8955ad340609f4b30283e488832571415a085125e8f7cdc99fd91dbdf280373c5bd8823e3156348f5bae6dacd436c919c6dd53e2b487da03fd02396306d248cda0e99f33420f577ee8ce54b67080a80d1ec69821bcb6a8839396f9652b6ff72a70";
        String m2 = "d131dd02c5e6eec4693d9a0698aff95c2fcab50712467eab4004583eb8fb7f8955ad340609f4b30283e4888325f1415a085125e8f7cdc99fd91dbd7280373c5bd8823e3156348f5bae6dacd436c919c6dd53e23487da03fd02396306d248cda0e99f33420f577ee8ce54b67080280d1ec69821bcb6a8839396f965ab6ff72a70";
        md5(m1, m2);
    }

    public static void test3() {
        String m1 = "0e306561559aa787d00bc6f70bbdfe3404cf03659e704f8534c00ffb659c4c8740cc942feb2da115a3f4155cbb8607497386656d7d1f34a42059d78f5a8dd1ef";
        String m2 = "0e306561559aa787d00bc6f70bbdfe3404cf03659e744f8534c00ffb659c4c8740cc942feb2da115a3f415dcbb8607497386656d7d1f34a42059d78f5a8dd1ef";
        md5(m1, m2);
    }

    public static void md5(String m1, String m2) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(hexToBytes(m1));
            byte[] result1 = digest.digest();
            String hex1 = bytesToHex(result1);
            digest.reset();

            digest.update(hexToBytes(m2));
            byte[] result2 = digest.digest();
            String hex2 = bytesToHex(result2);

            System.out.println("md5(" + m1 + ") = " + hex1);
            System.out.println("md5(" + m2 + ") = " + hex2);
            System.out.println("two md5 hashes are equal? " + hex1.equalsIgnoreCase(hex2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[] hexToBytes(String s) {
        byte[] ans = new byte[s.length() / 2];
        for (int i = 0; i < ans.length; i++) {
            int index = i * 2;

            // Using parseInt() method of Integer class
            int val = Integer.parseInt(s.substring(index, index + 2), 16);
            ans[i] = (byte) val;
        }
        return ans;
    }

    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }
}
