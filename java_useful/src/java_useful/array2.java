package java_useful;

public class array2 {
	public static void main(String args[]) {
		int[][] mynum = {{1,2,3,4},{5,6,7,8}};
		for(int i =0; i < mynum.length; i++) {
			for(int j=0; j< mynum[i].length; j++) {
				System.out.println(mynum[i][j]);
			}
		}
	}
}
