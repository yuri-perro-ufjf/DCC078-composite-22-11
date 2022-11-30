public class ItemReward extends Reward {
    private int value;

    public ItemReward(String type, int value){
        super(type);
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public String getReward(){
        return "ITEM REWARD: " + this.getType() + " - value: " + this.value + "\n";
    }
}
