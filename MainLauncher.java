/**
 * 
 * @author premchandu
 *
 */
public class MainLauncher {
	public static void main(String[] args) {
		
		char[][] cells = new char[5][5];
		//Filling the cells with Empty
		for(int x=0;x<cells.length;x++)
		    for(int y=0;y<cells[x].length;y++)
		    	cells[x][y] = 'E';
		
		Building building = new Building(cells);
		Robot r1 = new Robot(0,4,Direction.NORTH,'R');
		r1.setBuilding(building);
		Robot r2 = new Robot(4,4,Direction.NORTH,'G');
		r2.setBuilding(building);
		
		String path1="FFRFIFIRFIF";
		String path2="FLFFRFIRFILFLFI";
		
		r1.paint(path1);
		r2.paint(path2);

		for(int x=0;x<building.getCells().length;x++) {
		    for(int y=0;y<building.getCells()[x].length;y++)
		    	System.out.print(building.getCells()[x][y]);
		System.out.println();
		}
	}
}
