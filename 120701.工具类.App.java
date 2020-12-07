package kill;

public class test2 {
void finds(int array3d[ ][ ]){
	for (int row = 0;  row< array3d.length; row++) {
		for (int column = 0; column < array3d[row].length; column++) {
			if (array3d[row][column]==0) {
				System.out.println("R_zero("+(column)+","+(row)+")");
			}
		}
	}
	
	
}

void finds2(int array3d[ ][ ]){
	for (int row = 0;  row< array3d.length; row++) {
		for (int column = 0; column < array3d[row].length; column++) {
			if (array3d[row][column]==0) {
				System.out.println("R_left("+(column-1)+","+(row)+")");
			}
		}
	}
	
	
}

void finds3(int array3d[ ][ ]){
	for (int row = 0;  row< array3d.length; row++) {
		for (int column = 0; column < array3d[row].length; column++) {
			if (array3d[row][column]==0) {
				System.out.println("R_right("+(column+1)+","+(row)+")");
			}
		}
	}
	
	
}

void finds4(int array3d[ ][ ]){
	for (int row = 0;  row< array3d.length; row++) {
		for (int column = 0; column < array3d[row].length; column++) {
			if (array3d[row][column]==0) {
				System.out.println("R_up("+(column)+","+(row-1)+")");
			}
		}
	}
	
	
}

void finds5(int array3d[ ][ ]){
	for (int row = 0;  row< array3d.length; row++) {
		for (int column = 0; column < array3d[row].length; column++) {
			if (array3d[row][column]==0) {
				System.out.println("R_down("+(column)+","+(row+1)+")");
			}
		}
	}
	
	
}
}
