import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//find the unique characters from a list of strings
class JavaStreamsSample{  
	public static void main(String args[]){  
		List<String> words = Arrays.asList("Java", "Streams", "Sample");
		List<String> uniqueChars = words.stream()
				.map(w -> w.split("")) //converts each word into an array of its individual letters
				.flatMap(Arrays::stream) //flattens each generated stream into a single stream
				.distinct()
				.collect(Collectors.toList());       		 
		System.out.println("words " + words); 
		System.out.println("uniqueChars " + uniqueChars); 
	}  
}  