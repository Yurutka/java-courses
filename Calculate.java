public class Calculate {
	public static void main (String[] arg){
		System.out.println("Calculate...");
		double first = Double.valueOf(arg[0]);
		double second = Double.valueOf(arg[2]);
		if(arg[1].equals("+")){
			System.out.println("sum  " +(first+second));
		}
		if(arg[1].equals("-")){
			System.out.println("substruct  " +(first-second));
		}
		if(arg[1].equals("x")){
			System.out.println("multiple  " +(first*second));
		}
		if(arg[1].equals("/")){
			System.out.println("div  " +(first/second));
		}
		if(arg[1].equals("'")){
			System.out.println("expand  " +Math.pow(first,(int)second));
		}
	}
}