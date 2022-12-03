import java.util.HashMap;

public class IOU {
    private HashMap<String,Double> bank;
    
    public IOU(){
         this.bank= new HashMap<>();
    }
    public void setSum(String toWhom, double amount){
        this.bank.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        return this.bank.getOrDefault(toWhom,0.0);
    }
    public String toString(){
        String ans = "";
        for(String item : bank.keySet()){
            ans += item + "\n";
        }
        return ans;
    }
}
