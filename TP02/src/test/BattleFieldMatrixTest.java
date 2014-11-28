package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import BattleField.BattleFieldMatrix;
import BattleField.BattleFieldPieceWise;
import BattleField.BattleFieldRoad;
import BattleField.BattleFieldWater;
import Exception.OutofBoundException;

/**
 * Tests des fonctions de la classe BattleFieldMatrix
 * @author nick
 *
 */
public class BattleFieldMatrixTest {

	BattleFieldMatrix<BattleFieldPieceWise> bf = new BattleFieldMatrix<BattleFieldPieceWise>(10, 10);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBattleFieldMatrix() throws OutofBoundException {
		BattleFieldMatrix<BattleFieldPieceWise> bf2 = new BattleFieldMatrix<BattleFieldPieceWise>(10, 10);
		assertTrue(bf2.existe(10, 10));
	}

	@Test
	public void testSet() throws OutofBoundException {
		bf.set(9, 9, new BattleFieldWater());
		assertTrue(bf.get(9, 9)instanceof BattleFieldWater);
	}

	@Test
	public void testGet() throws OutofBoundException {
		bf.set(1, 1, new BattleFieldRoad());
		assertTrue(bf.get(1, 1)instanceof BattleFieldRoad);
	}

	@Test
	public void testExiste() throws OutofBoundException{
		assertTrue(bf.existe(10, 10));
	}

}
