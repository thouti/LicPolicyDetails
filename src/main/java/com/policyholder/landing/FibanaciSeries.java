package com.policyholder.landing;

import java.util.HashMap;
import java.util.Set;

public class FibanaciSeries {

	public static void main(String[] args) {
	int n=0;int n1=1;int n2=0;
	//0, 1, 1, 2, 3, 5, 8, 
	System.out.print(n+" "+n1);
	String str="srinu";
	for (int i = 2; i <10; i++) 
	{
		n1=n+n1;
		n=n1-n;
		System.out.print(" "+n1);
	}
	System.out.println(" ");
	for (int i = str.length()-1; i >=0; i--) 
	{
		System.out.println(str.charAt(i));
	}
	String str1="aabccabdd";
	int count=0;
	HashMap<Character, Integer> countstr=new HashMap<>();
	for (int i = 0; i < str1.length(); i++)
	{
	if(countstr.containsKey(str1.charAt(i)))
	{
		count=count+1;
		countstr.put(str1.charAt(i),count);
	}
	else
	{
		//count=count+1;
	 countstr.put(str1.charAt(i),1);
	}	
	}
	Set<Character> keys = countstr.keySet();
    for(Character ch:keys){
        if(countstr.get(ch) > 1){
            System.out.println(ch+"--->"+countstr.get(ch));
        }
    }
	}

}
