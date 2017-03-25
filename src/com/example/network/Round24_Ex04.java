package com.example.network;
import java.io.*;
import java.net.*;
public class Round24_Ex04 {

	public static void main(String[] args) {
		ServerSocket ss=null;
		for(int i=1; i<65535; i++){
			try{
				ss=new ServerSocket(i);
				ss.close();
			}catch(IOException ee){
				System.out.println(i+ "번 포트는 이미 열려 있습니다.");
			}
		}

	}

}
