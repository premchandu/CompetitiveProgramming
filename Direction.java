
public enum Direction {
	NORTH('N'),
	SOUTH('S'),
	EAST('E'),
	WEST('W');
	
	char value;
	private Direction(char dir) {
		this.value=dir;
	}
}
