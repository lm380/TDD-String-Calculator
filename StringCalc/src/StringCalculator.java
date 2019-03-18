
public class StringCalculator {

	public int Add(String numbers) {
		String commaRegex = "(\\d+,)+\\d";
		String newLineRegex = "(\\d+\\n)+\\d";
		
		if (numbers == "") {
			return 0;
		}
		else if(! numbers.contains(",")&&(! numbers.contains("\n"))) {
			return Integer.valueOf(numbers);
		}

		
		else if (numbers.matches(commaRegex) || numbers.matches(newLineRegex)){
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