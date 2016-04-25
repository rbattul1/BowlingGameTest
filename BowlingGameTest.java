import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {
	private Game g;
	
	protected void setUp() throws Exception{
		g=new Game();
	}
	private void rollMany(int n, int pins) {
    for (int i = 0; i < n; i++)
      g.roll(pins);
    }
    public void testGutterGame() throws Exception {
  	  rollMany(20,0);
      assertEquals(0,g.score());
     }
     
    public void testAllOnes() throws Exception{
  	    rollMany(20,1);
  	    assertEquals(20,g.score());
  }
  public void test_Spare() throws Exception {
  	rollSpare();//Spare
    g.roll(3);
    rollMany(17,0);
    assertEquals(16,g.score());
  }
    public void test_Strike() throws Exception {
    rollStrike();
    g.roll(10); // strike
    g.roll(3);
    g.roll(4);
    rollMany(16, 0);
    assertEquals(24, g.score());
  }
  public void testPerfectGame() throws Exception{      // perfect game means all are full of full score and each frame gives 30 so total of 300.
  	rollMany(12,10);
  	assertEquals(300,g.score());
  }
  private void rollStrike(){
  	g.roll(10);
  }
  private void rollSpare(){
  	g.roll(5);
    g.roll(5); 
  }
}
