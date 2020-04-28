package day02;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class WindowTest {
	public static void main(String[] args) {
		Color c = new Color(3);
		Frame window = new Frame("제목");
		window.setTitle("제목이 변경된 윈도우");
		window.setBounds(1200,200,400,300);
		// window.setBackground(Color.ORANGE);
		// 색상은 0~255 3개로 표현한다. 그러므로 모든 경우의 수를 곱한 값을 랜덤으로 적는다.
		window.setBackground(new Color(new Random().nextInt(16_581_376)));
		window.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				window.dispose();
			}
		});
		window.setVisible(true);
		
		
	}
}
