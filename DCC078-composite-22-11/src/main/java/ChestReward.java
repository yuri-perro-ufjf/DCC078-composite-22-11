import java.util.ArrayList;
import java.util.List;

public class ChestReward{
    private BagReward bagRewards;

    public void setBagRewards(BagReward bag){
        this.bagRewards = bag;
    }

    public String getRewards(){
        if(this.bagRewards == null){
            throw new NullPointerException("Chest without rewards");
        }
        return this.bagRewards.getReward();
    }
}
