package task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//replace k-th symbol to given symbol in each word.
public class ReplacerKcharInEachWord {
    public static void main(String[] args) {
        final String text = "\"Life Worth Living\"\n" +
                "\n" +
                "Put his hands on my face,\n" +
                "The kind of touch that made me chasing down\n" +
                "Like it's true love\n" +
                "Just tear me up, tear me down,\n" +
                "Ooh, like it was true\n" +
                "Every word that you're saying\n" +
                "God, the grip keep me staying\n" +
                "I'm like gold, Lord\n" +
                "Pull me in, then let me go\n" +
                "Should've known from the first time\n" +
                "Played with me like I was the devil\n" +
                "And I played with you like you were just a man\n" +
                "Wanna lay with you, but I'm never better\n" +
                "From your God, these are the days\n" +
                "\n" +
                "Take what you need, darling\n" +
                "I'm just here for you\n" +
                "Give me your love and physical affection\n" +
                "Give me the worst of you to hold\n" +
                "Didn't take me to the heavens\n" +
                "Give me the best of all the grace\n" +
                "You make life worth living\n" +
                "You make life worth living\n" +
                "\n" +
                "Even though you're not shy,\n" +
                "It's not the first you've got me high on expectations\n" +
                "You've got a thing for letting me down\n" +
                "Not always around when I want you to stay with me\n" +
                "Make me feel better,\n" +
                "It's not a day that I'm not thinking of you\n" +
                "The day you think of me, times I'm feeling better\n" +
                "It's your love, it's your game\n" +
                "\n" +
                "Take what you need, darling\n" +
                "I'm just here for you\n" +
                "Give me your love and physical affection\n" +
                "Give me the worst of you to hold\n" +
                "Didn't take me to the heavens\n" +
                "Give me the best of all the grace\n" +
                "You make life worth living\n" +
                "You make life worth living\n" +
                "\n" +
                "And my highs when you're gone\n" +
                "Give me a golden guarded soul\n" +
                "But when I'm crazy and I'm lost\n" +
                "You calm me down\n" +
                "\n" +
                "Take what you need, darling\n" +
                "I'm just here for you\n" +
                "Give me your love and physical affection\n" +
                "Give me the worst of you to hold\n" +
                "Didn't take me to the heavens\n" +
                "Give me the best of all the grace\n" +
                "You make life worth living\n" +
                "You make life worth living";

        int k = 3;
        Character c = 'X';
        Pattern pattern = Pattern.compile("((\\S{" + k +"})\\S(\\S*\\s+))|(\\S{1,"+ k +"}\\s*)");
        Matcher matcher = pattern.matcher(text);
        StringBuffer result2 = new StringBuffer(55);
        while(matcher.find())
        {
            if(matcher.group(4) != null) result2.append(matcher.group(4));
            else result2.append(matcher.group(2)).append(c).append(matcher.group(3));
        }
        System.out.println(result2);
    }
}
