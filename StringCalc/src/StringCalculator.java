
public class StringCalculator {

	public int Add(String numbers) {
	
		
		if (numbers == "") {
			return 0;
		}
		else if(! numbers.contains(",")&&(! numbers.contains("\n"))) {
			return Integer.valueOf(numbers);
		}
		//TODO else if statement to make sure only one delimiter between numbers
		
		else if (numbers.matches("(\\d,)+\\d")){
			int total = 0;
			String[] number = numbers.split(",|\n");
			for (int i=0; i<number.length; i++) {
				total += Integer.parseInt(number[i]);
			}
			return total;
		}
		else return 0;
			
	}
	
	
}
