package labWarmup0309012020;

public class DiceGame {
	int youWin = 0;
	int cpuWin = 0;
	
	int youDice = 0;
	int cpuDice = 0;
	
	for(int i = 0; i<10; ++i)
	{
		youDice = rand.nextInt(6) + 1;
		cpuDice = rand.nextInt(6) + 1;
		 if(cpuDice > youDice)
		 {
			 ++cpuWin;
		 }
		 else if(youDice > cpuDice)
		 {
			 ++youWin;
		 }
		 
		 System.out.println("CPU rolls: " + cpuDice + " You roll: " + youDice);
		 
	}
	
	if(cpuWin> youWin)
	{
		System.out.println("You lose, CPU win: " + cpuWin);
	}
	else
	{
		System.out.println("You win: " + youWin);
	}
}