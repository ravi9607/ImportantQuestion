package importantQuestions;

public class anagram {

	public static void main(String[] args) {
		String a= "ab##abab"; 
		String b= "ababab##2";
		int x=0;
		if (a.length()!=b.length()) {
			System.out.println("Not Anagram");
			
		}
		else {
			for(int i=0;i<a.length();i++ ) {
				x=x^a.charAt(i);
				x=x^b.charAt(i);
			}
		
		if(x==0) {
			System.out.println("Anagram");
		}
		else{
			System.out.println("Not Anagram");} 
		}
		}

	}


