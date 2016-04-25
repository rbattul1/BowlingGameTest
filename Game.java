
 public class Game{
    private int rolls[] = new int [21];
    private int presentroll = 0;
        
	public void roll(int pins){
		rolls[presentroll++] = pins;
	}
	
    public int score(){
    	int score = 0;
    	int frameNo = 0;
    	for (int frame = 0;frame < 10; frame++){
    	  if(isStrike(frameNo))  
    	  {
    	  	score += 10 + rolls[frameNo+1] + rolls[frameNo+2];
    	  	frameNo ++;
    	  }
    	  else if(isSpare(frameNo))
    	  	{
    	  	score += 10 + rolls[frameNo + 2];
    	  	frameNo +=2;
    	  }
    	   else {
    	  	score += rolls[frameNo] + rolls[frameNo+1];
    		   frameNo += 2;
    	  }    
      }
    	return score ;
    }
    private boolean isStrike(int frameNo){
    	return rolls[frameNo] == 10;
    }
    private int sum_Balls_Frame(int frameNo) {
    int p = rolls[frameNo]+rolls[frameNo+1];
    return p;
  }

  private int spareBonus(int frameNo) {
  	int a = rolls[frameNo+2];
    return a;
  }

  private int strikeBonus(int frameNo) {
  	int b = rolls[frameNo+1] + rolls[frameNo+2];
    return b;
  }

  private boolean isSpare(int frameNo) {
  	
    return rolls[frameNo]+rolls[frameNo+1] == 10;
  }
  public static void main(String[] args){
}
}

