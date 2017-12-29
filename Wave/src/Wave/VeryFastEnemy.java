package Wave;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class VeryFastEnemy extends GameObject {

	private Handler handler ; 
	
	public VeryFastEnemy(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		// TODO Auto-generated constructor stub
		velX = 12;
		velY = 12; 
		this.handler=handler ; 
	}
	public Rectangle getBounds()
	{
		return new Rectangle ((int) x ,(int)y, 16,16);
	}
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		x+=velX;
		y+= velY;
		if ( y <= 0 || y >= Game.HEIGHT - 32 ) velY *= -1 ;
		if ( x <= 0 || x >= Game.WIDTH - 32 ) velX *= -1 ;
		handler.addObject(new Trail (x ,y,ID.Trail  , Color.MAGENTA , 16,16, handler , 0.03f ));
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.MAGENTA);
		g.fillRect((int)x, (int)y, 16, 16);
		
	}
	

}
