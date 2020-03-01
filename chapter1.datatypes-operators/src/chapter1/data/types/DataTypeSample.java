package chapter1.data.types;

import java.util.ArrayList;
import java.util.List;

public class DataTypeSample {

	public static void main(String[] args) {
		
		boolean printerEnabled = false;
		
		short humanAge = (short)32;
		
		byte age = 32;
		
		long galaxyCountInSpace = 51992212222l;
		
		float freezeRatio = 3.23f;
		
		char letter = 'A';
		char choice = 'B';
		
		String name = "Kodluyoruz \"Java101\" ";
		System.out.println(name);
		
		
		Boolean printerEnb = new Boolean(false);
		Short humAge = new Short((short)5);
		Byte tmpByte = new Byte((byte)5);
		Long galaxyCount = new Long(5L);
		Float freeRat = new Float(5.0f);
		Double freeRat2 = new Double(5.0);
		
		Character singleLetter = new Character('T');
		
		
		List<Integer> salaries = new ArrayList<Integer>();
		
		Integer number = null;
	
		printNumber(number);
	}
	
	public static void printNumber(int number) {
		System.out.println(number);
	}

}
