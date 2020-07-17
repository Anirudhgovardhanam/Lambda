package Main;
import java.util.Scanner;

class Avg{
	private Scanner s = new Scanner(System.in); 
	
	Avg(){
		System.out.println("Enter size of the list of intgers:");
		int size = s.nextInt();
		double avg = calc_avg(read_array(size));
		System.out.println("The result(avg) is:"+avg);
	}
	
	int[] read_array(int size) {
		int[] array= new int[size];
		System.out.println("Enter list elements:");
		for(int i = 0;i < size;i++) {
			array[i] = s.nextInt();
		}
	    return array;	
	}
	
	double calc_avg(int[] array) {
		int sum = 0;
		int size = array.length;
		for(int i = 0;i < size;i++) {
			sum += array[i];
		}
		return sum / size;
	}
}
