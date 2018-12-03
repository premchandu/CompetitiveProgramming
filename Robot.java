/**
 * @author premchandu
 *
 */
public class Robot {
	//co-ordinates
	private int x;
	private int y;
	private Direction currentDirection;
	private char color;
	
	private Building building;
	
	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public Robot() {
		// TODO Auto-generated constructor stub
	}
	
	public Robot(int x,int y,Direction dir,char color) {
		this.x=x;
		this.y=y;
		this.currentDirection=dir;
		this.color=color;
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
	public Direction getCurrentDirection() {
		return currentDirection;
	}
	public void setCurrentDirection(Direction currentDirection) {
		this.currentDirection = currentDirection;
	}
	public char getColor() {
		return color;
	}
	public void setColor(char color) {
		this.color = color;
	}

	public void paint(String path1) {
		char[] path = path1.toCharArray();		
		for(char opt : path) {
			
			switch(opt) {
			case 'F' : {
				if (getCurrentDirection().equals(Direction.WEST))
					setX(getX()+1);
				else if (getCurrentDirection().equals(Direction.EAST))
					setX(getX()-1);
				else if (getCurrentDirection().equals(Direction.NORTH))
					setY(getY()-1);
				else if (getCurrentDirection().equals(Direction.SOUTH))
					setY(getY()+1);
				break;
			}
			case 'R' : {
				if (getCurrentDirection().equals(Direction.NORTH))
					setCurrentDirection(Direction.WEST);
				else if (getCurrentDirection().equals(Direction.SOUTH))
					setCurrentDirection(Direction.EAST);
				else if (getCurrentDirection().equals(Direction.WEST))
					setCurrentDirection(Direction.SOUTH);
				else if (getCurrentDirection().equals(Direction.EAST))
					setCurrentDirection(Direction.NORTH);
				break;
			}
			case 'L' : {
				if (getCurrentDirection().equals(Direction.NORTH))
					setCurrentDirection(Direction.EAST);
				else if (getCurrentDirection().equals(Direction.SOUTH))
					setCurrentDirection(Direction.WEST);
				else if (getCurrentDirection().equals(Direction.EAST))
					setCurrentDirection(Direction.SOUTH);
				else if (getCurrentDirection().equals(Direction.WEST))
					setCurrentDirection(Direction.NORTH);
				break;
			}
			case 'I' : {
				if (getBuilding().getCellColor(getY(),getX()) == 'R')
					getBuilding().setCellColor(getY(),getX(),'Y');
				else
					getBuilding().setCellColor(getY(),getX(),getColor());
				break;				
			}
			}

		}
	}
	
}
