package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str!=null;
        if(str.length()<2)
            return false;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'g') {
                //checks for left g
                if (i >0 && str.charAt(i-1) == 'g') { return true; }
                //check for right of  g
                if (i+1 < str.length() && str.charAt(i+1) == 'g') { return true; }
            }
        }
        return false;
    }
}
