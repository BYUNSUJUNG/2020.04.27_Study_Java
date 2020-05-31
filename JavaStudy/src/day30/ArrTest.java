package day30;
/*
 * 2차원 배열
	선언
		자료형 [][] 배열명 = new 자료형 [행][열]
		자료형 [][] 배열명 = {
			{값1, 값2},
			{값3, 값4}
		}
*/
public class ArrTest {
	public static void main(String[] args) {
		int[][] arrData = new int[3][4];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				arrData[i][j] = (i+1)*(j+1);
				System.out.println((i+1)+"*"+(j+1)+"="+arrData[i][j]);
			}
		}
	}
}
