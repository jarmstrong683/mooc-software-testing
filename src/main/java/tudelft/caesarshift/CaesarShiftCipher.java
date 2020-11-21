package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String CreateCaesarShiftCipher(String message, int shift){
        StringBuilder sb = new StringBuilder();
        char currentChar;
        int length = message.length();
        if(length<1)
            return "invalid";
        shift = shift%26;

        for(int i = 0; i < length; i++){
            currentChar = message.charAt(i);
            if(currentChar==' ') {
                sb.append( (currentChar));
                continue;
            }
            //sb.append(currentChar);
            if (currentChar > 'z' || currentChar < 'a') {
                return "invalid";
            } else if ((char) (currentChar + shift) > 'z') {
                currentChar = (char) (currentChar - 26);
            } else if ((char) (currentChar + shift) < 'a'){
                currentChar = (char) (currentChar + 26);
            }
            sb.append((char) (currentChar + shift));
            //sb.charAt()
        }

        return sb.toString();
    }
}
