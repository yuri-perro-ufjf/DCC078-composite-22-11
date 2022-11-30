import java.util.ArrayList;
import java.util.List;

public class BagReward extends Reward {
    private List<Reward> rewards;

    public BagReward(String type){
        super(type);
        this.rewards = new ArrayList<Reward>();
    }

    public void addReward(Reward reward) {
        this.rewards.add(reward);
    }

    public String getReward(){
        String output = "";
        output = "BAG REWARD: " + this.getType() + "\n";
        for (Reward reward: rewards){
            output += reward.getReward();
        }
        return output;
    }


}
