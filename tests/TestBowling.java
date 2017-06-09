import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	
	@Test(expected=BowlingException.class)
	public void testIfFrameOutOfLimit() throws BowlingException{
		BowlingGame game=new BowlingGame();
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
	}
	
	
	@Test
	public void testIfFrameSpareWorks() throws BowlingException{
		BowlingGame game=new BowlingGame();
		game.addFrame(new Frame(5,5));
		String check=Boolean.toString(game.getFrames().get(0).isSpare());
		assertEquals("Greska",check);
		
		
	}
	
}
