package chineseChess;

/**
 * �����
 * 
 * @author cnlht
 */
public class ChessPoint {
	/** �������� */
	int x, y;
	
	/** ������ �Ƿ�����*/
	boolean ������;
	
	/** ����������� */
	ChessPiece piece = null;
	
	/** ������������ */
	ChessBoard board = null;
 
	public ChessPoint(int x, int y, boolean boo) {
		this.x = x;
		this.y = y;
		������ = boo;
	}
 
	public boolean isPiece() {
		return ������;
	}
 
	public void set������(boolean boo) {
		������ = boo;
	}
 
	public int getX() {
		return x;
	}
 
	public int getY() {
		return y;
	}
 
	// ���øĵ�����
	public void setPiece(ChessPiece piece, ChessBoard board) {
		this.board = board;
		this.piece = piece;
		board.add(piece);
		int w = (board.unitWidth);
		int h = (board.unitHeight);
		piece.setBounds(x - w / 2, y - h / 2, w, h);// ����λ�ã���ȣ��߶�
		������ = true;
		board.validate();
	}
 
	public ChessPiece getPiece() {
		return piece;
	}
 
	public void reMovePiece(ChessPiece piece, ChessBoard board) {
		this.board = board;
		this.piece = piece;
		board.remove(piece);
		board.validate();
		������ = false;
	}
}