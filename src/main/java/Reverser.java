public class Reverser {
    /*

    start with a blank string we can add to
    start with an iterator/cursor that helps us find the end of the string
        int i = string.length()-1
    start loop
    look at the targeted letter - look at string.charAt(i) where i starts at the last character
    write that letter - concatenate the letter into the new string
    loop until i < 0, we do want i = 0 included because that is the first character in the original string

     */
    public String reverse(String str) {
        String newString = "";
        for(int i = str.length()-1; i < 0 ; i--) {
            newString += str.charAt(i);
        }

        return newString;

    }
}
