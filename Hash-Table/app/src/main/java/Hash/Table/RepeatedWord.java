package Hash.Table;
import java.util.regex.Pattern;

public class RepeatedWord {
    public static String repeatedWord(String bookText) {
        HashTable seenWordHashTable = new HashTable();
        StringBuilder word = new StringBuilder();
        Pattern pattern = Pattern.compile("\\w");
        for (int i = 0; i < bookText.length(); i++) {
            String currentCharacter = bookText.substring(i, i + 1).toLowerCase();
            if ((currentCharacter.equals(" ") || currentCharacter.equals("'")) && word.length() == 0) {
                continue;
            }
            if (pattern.matcher(currentCharacter).matches()) {
                word.append(currentCharacter);
            } else {
                if ((currentCharacter.equals("'") || (currentCharacter.equals("-"))  && word.length() > 0)) {
                    word.append(currentCharacter);
                } else if (seenWordHashTable.contain(word.toString())) {
                    return word.toString();
                } else if (word.length() == 0) {
                    continue;
                } else {
                    seenWordHashTable.add(word.toString(), 1);
                    word.delete(0, word.length());
                }
            }
        }
        return "no repeated words";
    }
}
