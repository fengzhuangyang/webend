package packe;

public class APP {
public static void main(String[] args) throws InterruptedException {
	int arr[][]={
			{11,5},
			{115,333},
			{22,33},
			{896,996}
	};
	while(true){
		Thread.sleep(1000);
		System.out.println("пепепе");
		int rad=(int)(Math.random()*10%4);
		System.out.println(arr[rad][0]+","+arr[rad][1]);
	}
}
}
