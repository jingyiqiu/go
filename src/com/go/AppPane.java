package com.go;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class AppPane extends JPanel {
	private boolean isWhite;

	// panel里面有绘制方法可以画图片 带缓冲的BufferedImage
	private BufferedImage image;

	// 用一个ArrayList集合存放棋子 类型为Piece棋子类
	private List<Piece> pieceList = new ArrayList<>();

	// 构造方法
	public AppPane() {

		// 在面板的构造函数中做初始化
		try {
			// 读取一个图片文件 用imageIO读入一张图片
			image = ImageIO.read(new File("res/go.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 注册一个监听器 监听相关的是事件
		addMouseListener(new PaneListener());

	}

	@Override
	public void paint(Graphics g) {// 继承panel类 重写paint方法
		// TODO Auto-generated method stub
		super.paint(g);

		// 画一张图片 获得宽高以保证图片的按原图尺寸放到面板里面
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);

		// 画棋子
		for (Piece piece : pieceList) {
			// g.fillOval(piece.getX(), piece.getY(), 30, 30);
			piece.draw(g);

		}

	}

	// 面板中鼠标事件的监听 借助适配器 适配器模式 做转接 只实现需要的方法
	class PaneListener extends MouseAdapter {
		boolean isWhite = true;
		//棋子颜色的定义应该放在方法外  一开始是白色  执行一次方法后 棋子颜色发生改变

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

			super.mouseClicked(e);
			e.getX();
			e.getY();
			System.out.printf("(%d,%d)\n", e.getX(), e.getY());

			// 新建一个棋子
			Piece piece = new Piece(e.getX(), e.getY(), isWhite);

			System.out.println(piece);

			// 将棋子添加到集合中
			pieceList.add(piece);

			// 一次黑 一次白
			isWhite = !isWhite;

			// 重新绘制
			repaint();
		}

	}

}
