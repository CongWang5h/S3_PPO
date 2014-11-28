package BattleField;

import Exception.UnknownelementException;

/**
 * @author Cong Wang
 *
 */
public class BattleFieldRoad extends BattleFieldPieceWise{

	/**
	 * BattleFieldRoad
	 * est incompatible est une pièce d’eau
	 * est compatible avec une plaine
	 */
	public boolean isCompatible(BattleFieldPieceWise bf) throws UnknownelementException{
		if(bf instanceof BattleFieldLandScape){
			return true;
		}else if (bf instanceof BattleFieldWater) {
			return false;
		}else{
			throw new UnknownelementException();
		}
	}

	/**
	 * BattleFieldRoad est destructible
	 */
	public boolean isDestroyable() {
		return true;
	}

}
