/**
 * @author Youngdesign & Williamsapplicatie
 * @version 1.0.0
 * @License Opensource
 */

package levels;

import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Level1 extends BasicGameState {
	

	private Image level1Achtergrond;
	Animation scruffie, links, rechts;// animatie van scruffie 
	int [] duration = {2000,2000,2000,2000};// animatie duur van de afbeeldingen van scruffie
	

	 float scruffieXpositie = 0;
	 float scruffieYpositie = 275;
	
	
	@Override
	public void init(GameContainer gc, StateBasedGame sbg)throws SlickException {
		// TODO Auto-generated method stub
		
		level1Achtergrond = new Image("afbeeldingen/gamelevels/level1/level1Achtergrond.png");
		
		
		Image[] loopNaarLinks = {
		new Image("afbeeldingen/karakters/scruffie/scruffiestillinks.png"),
		new Image("afbeeldingen/karakters/scruffie/scruffieloop1links.png"),
		new Image("afbeeldingen/karakters/scruffie/scruffiestillinks.png"),
		new Image("afbeeldingen/karakters/scruffie/scruffieloop2links.png")};
		
		Image[] loopNaarRechts = {
		new Image("afbeeldingen/karakters/scruffie/scruffiestilrechts.png"),
		new Image("afbeeldingen/karakters/scruffie/scruffieloop1rechts.png"),
		new Image("afbeeldingen/karakters/scruffie/scruffiestilrechts.png"),
		new Image("afbeeldingen/karakters/scruffie/scruffieloop2rechts.png")};

		links = new Animation(loopNaarLinks,duration,false);
		rechts = new Animation(loopNaarRechts,duration,false);
		scruffie = rechts;	
		
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)throws SlickException {		
		// level1achtergrond afbeelding
		level1Achtergrond.draw(0,0);
		
		//scruffieStilRechts.draw(scruffieXpositie,scruffieYpositie);
		scruffie.draw(scruffieXpositie,scruffieYpositie);
		
		
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)throws SlickException {
		
		Input input = gc.getInput();
		
		//loopt naar links
		if(input.isKeyDown(Input.KEY_LEFT)){
			links.update(10);
			scruffie = links;
			scruffieXpositie -=  0.30f;
			links.update(10);


			
		}
		
		if(input.isKeyDown(Input.KEY_RIGHT)){
			rechts.update(10);
			scruffie = rechts;
			scruffieXpositie += 0.30f;
			rechts.update(10);

		}
		
		
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 1;
	}


}
