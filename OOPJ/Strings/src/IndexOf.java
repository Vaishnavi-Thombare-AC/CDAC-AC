public class IndexOf {
	public static void main(String[] args) {

		String str = "The quick brown fox jumps over the lazy dog.";

		for (char ch = 'a'; ch <= 'j'; ch++)
		{
			System.out.print(ch +"\t" );
		}
		System.out.println();
		System.out.println("======================================================================================");

		for (char ch = 'a'; ch <= 'j'; ch++)
		{
			System.out.print(str.indexOf(ch)+"\t");
		}
		System.out.println("\n");
		for (char ch = 'k'; ch <= 't'; ch++)
		{
			System.out.print(ch +"\t" );
		}
		System.out.println();
		System.out.println("================================================================================================");
		for (char ch = 'k'; ch <= 't'; ch++)
		{
			System.out.print(str.indexOf(ch)+"\t");
		}
		System.out.println("\n");
		for (char ch = 'u'; ch <= 'z'; ch++)
		{
			System.out.print(ch +"\t" );
		}
		System.out.println();
		System.out.println("=========================================================================");
		for (char ch = 'u'; ch <= 'z'; ch++)
		{
			System.out.print(str.indexOf(ch)+"\t");
		}
	}
}