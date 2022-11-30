import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChestRewardTest {

    @Test
    void shouldBeReturnRewardsChest() {
        BagReward bag_one = new BagReward("Armor");

        BagReward bag_two = new BagReward("VEHICLE");
        ItemReward item_one = new ItemReward("CAR", 250);
        bag_two.addReward(item_one);

        BagReward bag_three = new BagReward("Guns");
        ItemReward item_two = new ItemReward("AK47", 100);
        ItemReward item_three = new ItemReward("MACHINE_GUN", 500);
        bag_three.addReward(item_two);
        bag_three.addReward(item_three);

        BagReward best_rewards = new BagReward("Best Rewards");
        best_rewards.addReward(bag_one);
        best_rewards.addReward(bag_two);
        best_rewards.addReward(bag_three);

        ChestReward chest = new ChestReward();
        chest.setBagRewards(best_rewards);


        assertEquals("BAG REWARD: Best Rewards\n" +
                "BAG REWARD: Armor\n" +
                        "BAG REWARD: VEHICLE\n" +
                        "ITEM REWARD: CAR - value: 250\n" +
                        "BAG REWARD: Guns\n" +
                        "ITEM REWARD: AK47 - value: 100\n" +
                        "ITEM REWARD: MACHINE_GUN - value: 500\n",
                chest.getRewards());
    }
}