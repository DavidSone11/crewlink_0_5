///**
// * 
// */
//package com.mathologic.projects.utility;
//
//
//
//
//
///**
// * @author Administrator
// *
// */
//
//public class KeyGenerator {
//
//    public static void main(String[] args) {
//        String userName = "Max Headroom";
//        String productKey = "ABCD";
//        String versionNumber = "4";
//
//        final String licenseKey = createLicenseKey(userName, productKey, versionNumber);
//        System.out.println("licenseKey = " + licenseKey);
//
//    }
//
//    public static String createLicenseKey(String userName, String productKey, String versionNumber) {
//        final String s = userName + "|" + productKey + "|" + versionNumber;
//        final HashFunction hashFunction = Hashing.sha1();
//        final HashCode hashCode = hashFunction.hashString(s);
//        final String upper = hashCode.toString().toUpperCase();
//        return group(upper);
//    }
//
//    private static String group(String s) {
//        String result = "";
//        for (int i=0; i < s.length(); i++) {
//            if (i%6==0 && i > 0) {
//                result += '-';
//            }
//            result += s.charAt(i);
//        }
//        return result;
//    }
//
//}