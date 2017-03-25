package com.example.network;
import java.io.*;
import java.net.*;
public class Round24_Ex08 {

	public static void main(String[] args) throws IOException{
		InetAddress ia=null;
		
		Socket soc=null;
		
		try{
			ia=InetAddress.getByName("localhost");
			soc=new Socket(ia, 12345);
			
		}catch(IOException ee){
			System.err.println("접속 오류 : " + ee.toString());
			System.exit(-1);
		}
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("전송 문자열 : " );
		
		String msg=in.readLine();
		
		PrintWriter out=new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())));
		out.write(msg);
		out.flush();
		out.close();
		

	}

}
