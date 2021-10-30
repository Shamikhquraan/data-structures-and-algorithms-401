package stack.and.queue;

public class DuckDuckGoose {

    public DuckDuckGoose() {
    }

    public <string> String DuckDuckGoose(String player, int k) {
        String[]arrOfStr = player.split("");
        int size = arrOfStr.length;
            while (k > size) {
                k = k -size;
            }
            return (String) arrOfStr[k];
        }
}
