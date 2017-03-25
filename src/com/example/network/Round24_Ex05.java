package com.example.network;
import java.io.*;
import java.net.*;
public class Round24_Ex05 {

	public static void main(String[] args) {
		ServerSocket ss=null;
		Socket soc=null;
		try{
			ss=new ServerSocket(12345);
			System.out.println("server ready");
			
		}catch(IOException ee){
			System.err.println("already opened");
			System.exit(-1);
		}
		try{
			soc=ss.accept(); //waiting for information from client side
			System.out.println("접속자 정보" +soc.toString());
		}catch(IOException ee){}

	}

}
