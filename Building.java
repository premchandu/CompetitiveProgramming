/**
 * 
 * @author premchandu
 *
 */
public class Building {
	private char[][] cells;
	public Building() {
		// TODO Auto-generated constructor stub
	}
	public Building(char[][] cells) {
		this.cells=cells;
	}
	public char[][] getCells() {
		return cells;
	}
	public void setCells(char[][] cells) {
		this.cells = cells;
	}
	public char getCellColor(int x,int y) {
		return cells[x][y];
	}
	public void setCellColor(int x,int y,char color) {
		cells[x][y]=color;
	}
}
