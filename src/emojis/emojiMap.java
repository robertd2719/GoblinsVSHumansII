package emojis;

import java.util.HashMap;

public class emojiMap {
    public static void main(String[] args) {
        HashMap<Emojis, String> emojiMap;

        emojiMap = new HashMap<>();
        emojiMap.put(Emojis.SKULL,"\u2620");
        emojiMap.put(Emojis.GOBLIN,"\uD83D\uDC79");
        emojiMap.put(Emojis.HEART,"\uD83D\uDC97");
        emojiMap.put(Emojis.LOOT,"\uD83E\uDDF3");
        emojiMap.put(Emojis.SWORD,"\uD83D\uDDE1");
        emojiMap.put(Emojis.SHIELD,"\uD83D\uDEE1");
        emojiMap.put(Emojis.HUMAN,"\uD83E\uDDCD");
        emojiMap.put(Emojis.POTION,"\uD83C\uDF6F");
        emojiMap.put(Emojis.RING, "\uD83D\uDC8D");
        emojiMap.put(Emojis.TREE,"\uD83C\uDF33");
        emojiMap.put(Emojis.FLEE,"\uD83C\uDFC3");
        emojiMap.put(Emojis.WATER,"\uD83C\uDF0A");
        emojiMap.put(Emojis.BOSS,"\uD83D\uDC7A");
        emojiMap.put(Emojis.FAIRY,"\uD83E\uDDDA");
        emojiMap.put(Emojis.MOUNTAIN,"\uD83C\uDFD4");
        emojiMap.put(Emojis.SQUARE,	"\u25A0");
    }
}
