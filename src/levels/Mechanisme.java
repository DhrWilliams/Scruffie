/**
 * @author Youngdesign & Williamsapplicatie
 * @version 1.0.0
 * @License Opensource
 */
package levels;

import org.newdawn.*;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Mechanisme extends StateBasedGame {
		
	public static final String spelNaam = "Scruffie versie 1.0.0";
	public static final int Menu = 0;
	public static final int Level1 = 1;
	public static final int Level2 = 2;
	public static final int Level3 = 3;
	public static final int Level4 = 4;

	
	public Mechanisme(String naam) {
		super(naam);
		//this.addState(new menu.menu());
		this.addState(new levels.Level1());
		this.addState(new levels.Level2());
		this.addState(new levels.Level3());
		this.addState(new levels.Level4());

	}
	
	public void initStatesList( GameContainer gc)throws SlickException{
		//this.getState(Menu).init(gc,this);
		this.getState(Level1).init(gc,this);
		this.getState(Level2).init(gc,this);
		this.getState(Level3).init(gc,this);
		this.getState(Level4).init(gc,this);
		this.enterState(1);	
		
			}
	
	public static void main(String[] arg) throws SlickException{
		
		AppGameContainer appgc;
		try{
			
			appgc = new AppGameContainer(new Mechanisme(spelNaam));
			appgc.setDisplayMode(600,450,false);
			appgc.start();
			
		}catch(SlickException e){
			e.printStackTrace();
		}
		
	}
	
	
	
	
	

}
