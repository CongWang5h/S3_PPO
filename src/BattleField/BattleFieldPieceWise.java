package BattleField;

import java.awt.Point;

import Exception.UnknownelementException;

/**
 * @author Cong Wang
 *
 */
public abstract class BattleFieldPieceWise {
	private Point position;
	
	public void set(int x, int y){
		 position = new Point(x, y);
	}
	
	public Point get(){
		return position;
	}
	
	abstract boolean isCompatible(BattleFieldPieceWise bf) throws UnknownelementException;
	abstract boolean isDestroyable();
}
