package com.ing.util;

import java.nio.charset.Charset;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public final class NumberGenerator {
	
	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
	public synchronized long getAccountNumber() {
		
		long leftLimit = 100000000L;
	    long rightLimit = 1000000000L;
	    return leftLimit + (long) (Math.random() * (rightLimit - leftLimit));		
	}
	
	public synchronized long getCustomerId() {
		
		long leftLimit = 100000L;
	    long rightLimit = 1000000L;
	    return leftLimit + (long) (Math.random() * (rightLimit - leftLimit));		
	}
	

	public synchronized String getPassword() {
	
		byte[] array = new byte[256]; 
        new Random().nextBytes(array); 
  
        int length = 8;
        
        String randomString 
            = new String(array, Charset.forName("UTF-8")); 
  
        StringBuffer r = new StringBuffer(); 
  
        for (int k = 0; k < randomString.length(); k++) { 
  
            char ch = randomString.charAt(k); 
  
            if (((ch >= 'a' && ch <= 'z') 
                 || (ch >= 'A' && ch <= 'Z') 
                 || (ch >= '0' && ch <= '9')) 
                && (length > 0)) { 
  
                r.append(ch); 
                length--; 
            } 
        } 
  
        return r.toString(); 
	}
}
