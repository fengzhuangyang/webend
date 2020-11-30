package bog;

public class App extends R {

public static void main(String[] args) {
	System.out.println(R.boy_filePath);
	System.out.println(R.girl_filePath);
	
	
	for (int row=0;R.array2d.length>row;row++) {
		for (int colum=0;3>colum;colum++) {
			System.out.println(R.array2d[row][colum]);
		}
	}
}
}
