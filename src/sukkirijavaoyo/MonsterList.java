package sukkirijavaoyo;

import java.util.ArrayList;

public class MonsterList {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Monster> monsterList = new ArrayList<Monster>();
		Monster monster1 = new Monster("お化けキノコ",10,false);
		Monster monster2 = new Monster("ゴブリン",25,false);
		Monster monster3 = new Monster("ドラゴン",120,true);
		monsterList.add(monster1);
		monsterList.add(monster2);
		monsterList.add(monster3);
		for(Monster m : monsterList)
		{
			System.out.println("name:"+m.name()+" hp:"+m.hp()+" isBoss:"+m.isBoss());
		}
	}

}
