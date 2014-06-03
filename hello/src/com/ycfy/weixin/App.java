package com.ycfy.weixin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

	public static void main(String[] args) {
       System.out.println("Hello Git!");
       System.out.println("Hello World!");
       int x = (int)0b10000000;
       System.out.println(x);
       int y = 10_10_10;
       System.out.println(y);
       String s = "a";
       switch(s){
       case "a":
    	   System.out.println("aaaaaaaaa");
    	   break;
       case "b":
    	   System.out.println("bbbbbbbbb");
    	   break;
       default:
    	   System.out.println("default");
    	   break;
       }
       Map<String,List<String>> dataMap = new HashMap<>();
       
       System.out.println(dataMap);
      
	}
	public static String readFile(){
		 try(BufferedReader br = new BufferedReader(new FileReader("F:/a.txt"))){
	    	  return br.readLine();
	     } catch (NullPointerException | IOException e) {
			e.printStackTrace();
		 } 
		 return null;
	}
	public  static <T> void addToList(List<T> list,@SuppressWarnings("unchecked") T... eles){
		for(T t:eles){
			list.add(t);
		}
	}

}
