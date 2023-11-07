package boardgame;

public class Position {
	
	private int row;
	private int column;
	
	public Position(int row, int colomn) {
		this.row = row;
		this.column = colomn;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int colomn) {
		this.column = colomn;
	}

	@Override 
	public String toString() {
		return row + ", " + column;
	}
}
