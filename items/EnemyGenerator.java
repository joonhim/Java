import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class EnemyGenerator
{
	private ArrayList<Enemy> enemyList;
	private ItemGenerator ig;

	public EnemyGenerator(ItemGenerator ig)
	{
		Scanner read = null;
		   try {
					read = new Scanner(new File("enemyList.txt"));
					while(read.hasNext()) {
						String line = read.nextLine();
						
						String name;
						int hp;
						char type;
						
						String[] tokens = line.split(",");
						name = tokens[0];//Goblin
						hp = tokens[1];//2
						type = tokens[2];//m or p 
						
						switch(type) {
						case 'p':
							Enemy enemy = new Enemy(name, hp, ig.generateItem());
							enemyList.add(enemy);
						case 'm':
							MagicalEnemy magicalEnemy = new MagicalEnemy(name, hp, ig.generateItem());
							enemyList.add(magicalEnemy);
						}
					}
		      read.close();
		   }catch(FileNotFoundException e){
		     System.out.println("File Not Found - place file in the project folder. ");
		   }
	}

	public Enemy generateEnemy(int level)//How do I use level
	{
		Random rand = new Random();
		int randNum = rand.nextInt(8);//What is the parameter? 0-7
		randNum++;
		return enemyList.get(randNum);//Confused On How to Return an Enemy
	}
}