# webendpackage packe;

import java.util.Random;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
	int i=0;
	String x[]=new String[26];
	 Random random=new Random();
	 Scanner scanner=new Scanner(System.in);
		while(i<26){
			x[i]=random.nextInt(100)+","+random.nextInt(100);
			i++;
		}
		while(true){
			while (true) {
				String a=scanner.next();
				char b=a.charAt(0);
				if(Integer.valueOf(b)<123||Integer.valueOf(b)>97){
					System.out.println(x[Integer.valueOf(b)-97]);
					continue;
				}
				break;
			}
		}
	}
}
