package com.go;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

//新建一个棋子类
public class Piece {
	
	 BufferedImage image;
	
     private int size=25;
	
     //画的时候需要坐标值  判断输赢时不需要
	 private int x;
	 private int y;
	
private	boolean isWhite;

 

public Piece(int x, int y, boolean isWhite) {
	super();
	this.x = x-size/2;
	this.y = y-size/2;
	this.isWhite = isWhite;
}



public int getX() {
	return x;
}



public void setX(int x) {
	this.x = x;
}



public int getY() {
	return y;
}



public void setY(int y) {
	this.y = y;
}



public boolean isWhite() {
	return isWhite;
}



public void setWhite(boolean isWhite) {
	this.isWhite = isWhite;
}



@Override
public String toString() {
	return "Piece [x=" + x + ", y=" + y + ", isWhite=" + isWhite + "]";
}

//画棋子的方法

public void draw(Graphics g) {
	// TODO Auto-generated method stub
	g.setColor(isWhite ? Color.WHITE : Color.BLACK);
	g.fillOval(x, y, size, size);
}


 
	
	 

}
