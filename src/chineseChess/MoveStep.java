package chineseChess;

import java.awt.Point;

/**
 * �߲���
 * 
 * @author cnlht
 * 
 */
public class MoveStep implements java.io.Serializable {
	public Point pStart, pEnd;
 
	public MoveStep(Point p1, Point p2) {
		pStart = p1;
		pEnd = p2;
	}
}