package com.example.network;
import java.io.*;
import java.net.*;
public class Round24_Ex07 {

	public static void main(String[] args) {
		ServerSocket ss=null;
		Socket soc=null;
		try{
			ss=new ServerSocket(12345);
			System.out.println("Server Ready");
		}catch(IOException ee){
			System.err.println("해당 포트가 열려있습니다.");
			System.exit(-1);
		}
		try{
			soc=ss.accept();
			System.out.println("접속자 정보 : " + soc.toString());
			
			BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()));
			
			String str=in.readLine();
			System.out.println("전송된 내용 : " +str);
			soc.close();
		}catch(IOException ee){
			System.err.println("error"+ ee.toString());
		}

	}

}
