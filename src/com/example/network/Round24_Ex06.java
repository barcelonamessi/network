package com.example.network;
import java.io.*;
import java.net.*;
public class Round24_Ex06 {

	public static void main(String[] args) {
		InetAddress ia=null;
		Socket soc=null;
		try{
			ia=InetAddress.getByName("localhost");
			soc=new Socket(ia, 12345);
		}catch(IOException ee){
			System.err.println("���� ���� : " +ee.toString());
			System.exit(-1);
		}
		
	}

}
