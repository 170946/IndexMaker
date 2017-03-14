import java.util.ArrayList;
public class DocumentIndex extends ArrayList<IndexEntry> {
	public DocumentIndex(){
		super();
	}
	
	public DocumentIndex(int initCapacity){
		super(initCapacity);
	}
	
	public void addWord(String word, int num){
		if (word.equals("")) return;
		
		for(int i = 0; i < this.size(); i++){
			if(this.get(i).getWord().equalsIgnoreCase(word)){
				this.get(i).add(num);
				return;
			}
		}
		
		word = word.toUpperCase();
		int correctLocation = 0; //this value stores the desired insertion location of word
		
		while(correctLocation < this.size() && word.compareTo(this.get(correctLocation).getWord()) > 0){
			correctLocation++;
		}//now the value of correctLocation is correct
		
		//this.add(new IndexEntry(word).add(num)); doesn't work, apparently....
		
		IndexEntry x = new IndexEntry(word);
		x.add(num);
		
		this.add(correctLocation, x);
	}

	public void addAllWords(String str, int num){
		String[] wordArray = str.split("\\W+");
		for(String s: wordArray){
			addWord(s, num);
		}
	}
}
