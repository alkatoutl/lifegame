package lecture.lab1;

public class LongLiveBob {

	public static void main(String [] args) {
	BobsLife liveBob = new BobsLife("home", 0, 4, 5);
	
	for(int i=0; i<167; i++) {								//set until 167 because 6 moves in the for loop, 1000/6 = 166.66666667
		System.out.println(liveBob.toString());
		liveBob.move("work");
		liveBob.nextTime();
		System.out.println(liveBob.toString());
		liveBob.move("home");
		liveBob.nextTime();
		System.out.println(liveBob.toString());
		liveBob.move("work");
		liveBob.nextTime();
		System.out.println(liveBob.toString());
		liveBob.move("home");
		liveBob.nextTime();
		System.out.println(liveBob.toString());
		liveBob.move("gym");
		liveBob.nextTime();
		System.out.println(liveBob.toString());
		liveBob.move("home");
		liveBob.nextTime();
		System.out.println(liveBob.toString());
		}
	}
}
