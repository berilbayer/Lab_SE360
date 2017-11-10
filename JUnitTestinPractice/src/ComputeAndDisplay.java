import java.util.Random;
public class ComputeAndDisplay {
	public static void print(Student s){
		System.out.println("midterm grade: ");
		System.out.println(s.getMidterm());
		System.out.println("final grade: ");
		System.out.println(s.getFinal());

	}
public static void main(String [] args){
	Student[] stdArr = new Student[5];
	Random rand = new Random();
	Instructor _ins = new Instructor();
	
	int num1;
	int num2;
	for(int i=0; i<5;i++){
		stdArr[i] = new Student(); 
	}
	for(int i=0; i<5; i++){
		num1 = rand.nextInt(101);
		stdArr[i].setMidterm(num1);
		num2 = rand.nextInt(101);
		stdArr[i].setFinal(num2);
	}
	_ins.ComputeAvg(stdArr[0]);
	print(stdArr[0]);
}
}
