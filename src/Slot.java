/**
 * Created by Willem Sherwood on 10/5/2016.
 */

import java.util.Stack;

public class Slot {
    private static enum sItem {                         //The static identifier is redundant but explicit
        Seven,
        Bar,
        SingleCherry,
        DoubleCherry,
        TripleCherry,
        Pineapple,
        SadFace;
    }

    private sItem[] slotReel;

    public Slot(final java.util.Random randomGenerator) { //Want to ensure that the generator isn't messed with

        // Just to make this a little clearer
        int enumLength = sItem.values().length;
        slotReel = sItem.values().clone();
        int selector = 0;

        // For each value of our previously defined enum we assign it a position arbitrarily in the reel Array
        for (int j = enumLength - 1; j >= 0; j--) {
            selector = randomGenerator.nextInt(enumLength);
            swap(slotReel, selector, j);
        }

        System.out.println(this.toString());
    }

    @Override
    public String toString(){
        StringBuffer sB = new StringBuffer();
        sB.append("Slot: \n");

        for (sItem item:slotReel) {
            sB.append( item.name() + " \n");
        }

        return sB.toString();
    }

    private void swap(sItem[] sArr, int i, int j) {
        sItem temp = sArr[i];
        sArr[i] = sArr[j];
        sArr[j] = temp;
    }
}
