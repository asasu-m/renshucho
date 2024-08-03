package sukkirijavaoyo;

import java.util.Objects;

public class Hero implements Cloneable{
	private String name;
	private int hp,mp;
	Sword sword;
	
	@Override
	public Hero clone()
	{
		Hero result = new Hero();
		result.name = this.name;
		result.hp = this.hp;
		result.sword = this.sword.clone();
		return result;
	}
	
	
	@Override
	public String toString() {
		return "勇者（名前="+this.name
				+ "/HP="+this.hp+"/MP="+this.mp+")";
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(this.name,this.hp);
	}
}
