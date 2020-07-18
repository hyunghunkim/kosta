package kosta.oop4;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends Frame implements ActionListener {
	
	public MyFrame(){
		Button b = new Button("button");
		add(b);
		b.addActionListener(this);
		
		setSize(300,200);
		setLocation(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button b = (Button)e.getSource();	//오브젝트라 자식인 버튼으로 강제 형변환
		String label = b.getLabel();
		System.out.println(label+"선택됨");
	}

}
