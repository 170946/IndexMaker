import java.util.ArrayList;
public class IndexEntry {
	private String word;
	private ArrayList<Integer> numsList;
	
	public IndexEntry(String word){
		this.word = word.toUpperCase();
		this.numsList = new ArrayList<>();
	}
	
	public void add(int num){
		if(!numsList.contains(num)) numsList.add(num);
	}
	
	public String getWord(){
		return this.word;
	}
	
	public String toString(){
		return this.word + numsList.toString().replace('[', ' ').replace(']', ' ');
	}
}
