import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	
	
	public List<Frame> getFrames() {
		return frames;
	}

	private Frame bonus;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame) throws BowlingException{
		if(frames.size()<10){
			frames.add(frame);
		}else {
			throw new BowlingException();
		}
		
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	// Returns the game score
	public int score() throws BowlingException{
		int score=0;
		for(int i=0;i<getFramesNumber();i++){
		score+=this.getFrames().get(i).score();	
		}
		return score;
	}

	public int getFramesNumber(){
		return frames.size();
	}
	
	
	
	
	
	
	}

