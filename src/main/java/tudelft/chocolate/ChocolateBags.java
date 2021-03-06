package tudelft.chocolate;

public class ChocolateBags {
//returns how many small chocolates were used// -ve 1 if n ot possible
    public int calculate(int small, int big, int total) {
        if(small<0||big<0||total<0)
            return -1;
        int maxBigBoxes = total / 5;
        int bigBoxesWeCanUse = maxBigBoxes < big ? maxBigBoxes : big;
        total -= (bigBoxesWeCanUse * 5);

        if(small < total)
            return -1;
        return total;

    }

}
