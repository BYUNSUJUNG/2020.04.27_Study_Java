package day30;
/*
 * 2���� �迭
	����
		�ڷ��� [][] �迭�� = new �ڷ��� [��][��]
		�ڷ��� [][] �迭�� = {
			{��1, ��2},
			{��3, ��4}
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
