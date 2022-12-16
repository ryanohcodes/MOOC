import java.util.HashMap;

public class Abbreviations {
    
    private HashMap abbrMap;
    
    public Abbreviations(){
        this.abbrMap = new HashMap<>();
    }
    public void addAbbreviation(String abbreviation, String explanation){
        this.abbrMap.put(abbreviation, explanation);
    }
    public boolean hasAbbreviation(String abbreviation){
        if(this.abbrMap.containsKey(abbreviation)){
            return true;
        };
        return false;
    }
    public String findExplanationFor(String abbreviation){
        if(this.abbrMap.containsKey(abbreviation)){
            return this.abbrMap.get(abbreviation).toString();
        }
        return null;
    }
}