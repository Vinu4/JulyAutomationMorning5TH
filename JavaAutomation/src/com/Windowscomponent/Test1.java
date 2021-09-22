package com.Windowscomponent;

public class Test1 {

	public static void main(String[] args) {
		try
		{
			Runtime obj=Runtime.getRuntime();
			obj.exec("C:\\Users\\Admin\\Desktop\\AutoIT\\test2.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}

	}

}
