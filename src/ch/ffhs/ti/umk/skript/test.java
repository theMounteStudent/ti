package ch.ffhs.ti.umk.skript;

public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String input = "2+1;";
		
		StringBuilder test = new StringBuilder();
		test.append("2+1;");
		test.append("\n");

		
		String actual = ScannerCompiler.evaluateInput(test.toString());
System.out.println(actual );
	
		
	}

}