package BattleField;

import Exception.UnknownelementException;

/**
 * @author Cong Wang
 *
 */
public class BattleFieldWater extends BattleFieldPieceWise{

	/**
	 * BattleFieldWater est incompatible avec de la plaine ou une route.
	 */
	public	boolean isCompatible(BattleFieldPieceWise with) throws UnknownelementException{
		if(with instanceof BattleFieldLandScape || with instanceof BattleFieldRoad){
			return false;
		}else{
			throw new UnknownelementException();
		}
	}

	/**
	 * BattleFieldWater n’est pas destructible
	 */
	public boolean isDestroyable() {
		return false;
	}

}
