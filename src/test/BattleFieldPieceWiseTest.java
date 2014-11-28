package test;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Before;
import org.junit.Test;

import BattleField.BattleFieldLandScape;
import BattleField.BattleFieldRoad;
import BattleField.BattleFieldWater;
import Exception.UnknownelementException;

/**
 * Tests de classe BattleFieldPieceWise et les fils.
 * @author nick
 *
 */
public class BattleFieldPieceWiseTest {

	BattleFieldWater bfw = new BattleFieldWater();
	BattleFieldRoad bfr = new BattleFieldRoad();
	BattleFieldLandScape bfls = new BattleFieldLandScape();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSet() throws UnknownelementException {
		bfr.set(1, 1);
		assertEquals(bfr.get(), new Point(1,1));
	}

	@Test
	public void testGet() {
		bfr.set(1, 1);
		assertEquals(bfr.get(), new Point(1,1));
	}

	@Test
	public void testIsCompatible() throws UnknownelementException {
		assertTrue(!bfw.isCompatible(bfls));
		assertTrue(!bfw.isCompatible(bfr));
		assertTrue(bfr.isCompatible(bfls));
		assertTrue(!bfr.isCompatible(bfw));
		assertTrue(bfls.isCompatible(bfr));
		assertTrue(!bfls.isCompatible(bfw));
	}

	@Test
	public void testIsDestroyable() {
		assertTrue(bfls.isDestroyable());
		assertTrue(bfr.isDestroyable());
		assertTrue(!bfw.isDestroyable());
	}

}
