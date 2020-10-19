import acm.program.*;
import java.util.*;
public class NameCounts extends ConsoleProgram {
	 public void run() {
		 Map<String,Integer> map = new HashMap<String,Integer>();
		 String name = readLine("Enter name: ");
		 while (!(name.equals(""))) {
			 int count = 1;
			 if(map.containsKey(name)) {
				 count = map.get(name);
				 count++;
			 }
			 map.put(name, count);
			 name = readLine("Enter name: ");
		 }
		
		 for(String uName : map.keySet()) {
			 println("Entry ["+uName+"] has count "+map.get(uName));
		 }
	 }
} 
