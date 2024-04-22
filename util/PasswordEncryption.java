package Yumxpress.util;

import java.util.Base64;


public class PasswordEncryption {
 public static String getEncryptedPassword(String pwd){
     Base64.Encoder en=Base64.getEncoder();
     String encryptedPwd=en.encodeToString(pwd.getBytes());
     return encryptedPwd;
 } 
 public static String getDecryptedPassword(String pwd){
     Base64.Decoder dec=Base64.getDecoder();
     byte[]arr=dec.decode(pwd.getBytes());
     String decryptedPwd=new String(arr);
     return decryptedPwd;
 }
 public static void main(String[] args){
     System.out.println(getDecryptedPassword("bGVvMTIz"));
 }
}
