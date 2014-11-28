package BattleField;

import Exception.UnknownelementException;

/**
 * @author Cong Wang
 *
 */
public class BattleFieldLandScape extends BattleFieldPieceWise{

	/**
	 * BattleFieldLandScape
	 * est incompatible est une pièce d’eau
	 * est compatible avec une route
	 */
	public boolean isCompatible(BattleFieldPieceWise bf) throws UnknownelementException{
		if(bf instanceof BattleFieldWater){
			return false;
		}else if (bf instanceof BattleFieldRoad) {
			return true;
		}else{
			throw new UnknownelementException();
		}
	}

	/**
	 * BattleFieldLandScape est destructible
	 */
	public boolean isDestroyable() {
		return true;
	}

}
