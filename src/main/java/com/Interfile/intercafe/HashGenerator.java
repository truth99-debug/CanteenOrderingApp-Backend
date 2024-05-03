package com.Interfile.intercafe;

import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

/**
 * A class dedicated to generate a hash for the provided object
 */
public class HashGenerator {
    
    /**
     * Method that generates an MD5 hash for the provided object
     * @param object The object to generate the hash for
     * @return The generated md5 hash
     */
    public static String md5(Object object) {
        StringBuilder saltedString = new StringBuilder("lisj_32;(C*2;lkc*/65aRsd21(-").append(object.toString()).append("JFo8)*&3OiG(^p2h)hfwsieH(");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(saltedString.toString().getBytes());
            saltedString = new StringBuilder();
            for (byte aByte : messageDigest.digest()) saltedString.append(Integer.toString((aByte & 0xff) + 0x100, 16).substring(1));
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
        }
        return saltedString.toString();
    }
}