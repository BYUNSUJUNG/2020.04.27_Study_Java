package day03;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Random;

import javax.swing.JFrame;

public class WindowTest6 extends JFrame implements Runnable{

	public WindowTest6() {
		this("제목 없는 윈도우");
	}
	
	public WindowTest6(String title) {
		setTitle(title);
		setSize(400,300);
		Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension dimen2 = getSize();
		
		int x = (dimen.width - dimen2.width)/2;
		int y = (dimen.height - dimen2.height)/2;
		
		setLocation(x,y);
		setBackground(new Color(new Random().nextInt(16581376)));
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setVisible(true);
		
	}

	
	public static void main(String[] args) {
		WindowTest6 window = new WindowTest6("제목 있는 윈도우");
		Thread t = new Thread(window);
		t.start();
	}
	
	@Override
	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		while(true) {
			setTitle(sdf.format(System.currentTimeMillis()));
			try {
				Thread.sleep(1);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
