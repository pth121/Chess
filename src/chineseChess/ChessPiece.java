package chineseChess;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
/**
 * ������
 * 
 * @author cnlht
 */
public class ChessPiece extends JLabel {
	String name; // ��������
	Color backColor = null, foreColor;// ����ɫ��ǰ��ɫ
	String ��ɫ��� = null;
	ChessBoard board = null;
	int width, height;// ��С
 
	public ChessPiece(String name, Color fc, Color bc, int width, int height,
			ChessBoard board) {// ��������
		this.name = name;
		this.board = board;
		this.width = width;
		this.height = height;
		foreColor = fc;
		backColor = bc;
		setSize(width, height);
		setBackground(bc);
		addMouseMotionListener(board);
		addMouseListener(board);
	}
 
	// ��������
	public void paint(Graphics g) {		
		g.drawImage(board.pieceImg, 2, 2, width-2, height-2, null);
		g.setColor(foreColor);
		g.setFont(new Font("����", Font.BOLD, 26));
		g.drawString(name, 7, height - 8);// �������ϻ��� ����������
		g.setColor(Color.black);
		//g.drawOval(1, 1, width - 1, height - 1);
		float lineWidth = 2.3f;
	    ((Graphics2D)g).setStroke(new BasicStroke(lineWidth));
	    ((Graphics2D)g).drawOval(2, 2, width-2, height-2);
	}
 
	public int getWidth() {
		return width;
	}
 
	public int getHeight() {
		return height;
	}
 
	public String getName() {
		return name;
	}
 
	public Color ��ȡ������ɫ() {
		return foreColor;
	}
 
	public void set�������(String ���) {
		��ɫ��� = ���;
	}
 
	public String �������() {
		return ��ɫ���;
	}
}