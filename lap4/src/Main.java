import java.io.StringReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		SingleLinkedList<String> list = new SingleLinkedList<String>();
		
		//Test your program 
		String line = "";
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()){
			line = scanner.nextLine();
			Scanner i_scanner = new Scanner(new StringReader(line));
			
			String cmd = i_scanner.next();
			if(cmd.equals("insert")){
				int pos = i_scanner.nextInt();
				String item = i_scanner.next();
				list.insert(pos, item);
				System.out.println("INSERT: "+pos+" "+item);

				//fill your test code
			}else if(cmd.equals("remove")){
				int pos = i_scanner.nextInt();
				String item = list.remove(pos);
				System.out.println("REMOVE: "+pos+" "+item);

				//fill your test code
			}else if(cmd.equals("getValue")){
				int pos = i_scanner.nextInt();
				String it = list.getValue(pos);
				System.out.println("GET: "+pos+" "+it);

				//fill your test code
			}else if(cmd.equals("length")){
				System.out.println("LENGTH: "+list.length());

				//fill your test code
			}
			
			i_scanner.close();
		}
		
		scanner.close();
	}
}
