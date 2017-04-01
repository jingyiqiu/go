package com.go;

import javax.swing.JFrame;

public class AppFrame extends JFrame{
	private AppPane pane;
	 public AppFrame() {
		// TODO Auto-generated constructor stub
		 initui();
		 setVisible(true);
		 
		  
	}
	 
	 private void initui(){
		 setTitle("五子棋");
		 setSize(500,500);
		 setLocationRelativeTo(null);
		 setResizable(false);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		// setVisible(true);
		 
		 pane=new AppPane();//新建一个panel对象
		 add(pane); //添加面板到frame上
		 
		 
	 }

}
