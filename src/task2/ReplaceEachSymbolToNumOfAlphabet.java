package task2;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Formatter;

public class ReplaceEachSymbolToNumOfAlphabet {
    public static void main(String[] args) {
        final String input = "[Shaggy 2 Dope]\n" +
                "Fuck. Fuck this shit.\n" +
                "Fuck givin it to me.\n" +
                "\n" +
                "[Chorus:]\n" +
                "If I only could I'd set the world on fire\n" +
                "If I only could I'd set the world on fire\n" +
                "If I only could I'd set the world on fire\n" +
                "Sya fuck the world! (Fuck the world!)\n" +
                "If I only could I'd set the world on fire\n" +
                "Fuck em all! (Fuck em all!)\n" +
                "\n" +
                "[Shaggy 2 Dope]\n" +
                "Fuck you, fuck me, fuck us\n" +
                "Fuck Tom, fuck Mary, fuck Gus\n" +
                "Fuck Darius\n" +
                "Fuck the west coast, and fuck everybody on the east\n" +
                "Eat shit and die, or fuck off at least\n" +
                "Fuck pre-schoolers, fuck rumors\n" +
                "Kings and Queens and gold jewelers\n" +
                "Fuck wine coolers\n" +
                "Fuck chickens, fuck ducks\n" +
                "Everybody in your crew sucks, punk mother fucks\n" +
                "Fuck critics, fuck your review\n" +
                "Even if you like me, fuck you\n" +
                "Fuck your mom, fuck your mom's momma\n" +
                "Fuck the Beastie Boys and the Dali Llama\n" +
                "Fuck the rain forest, fuck a Forrest Gump\n" +
                "You probably like it in the rump\n" +
                "Fuck a shoe pump, fuck the real deal and fuck all the fakes\n" +
                "Fuck all fifty two states! Oooo, and fuck you\n" +
                "\n" +
                "[Chorus] X 2\n" +
                "\n" +
                "[Shaggy 2 Dope]\n" +
                "Fuck Oprah, fuck opera, fuck a soap opera\n" +
                "Fuck a pop locker and a cock blocker\n" +
                "\n" +
                "Fuck your girlfriend, I probably did her already\n" +
                "Fuck Kyle and his brother Tom Petty, Jump Steady\n" +
                "My homie, fuck him, what are you gonna do?\n" +
                "(Fuck that bitch, fuck you!) Yeah well fuck you too\n" +
                "Don't bother tryin to analyze these rhymes\n" +
                "In this song I say fuck ninety three times\n" +
                "Fuck the president, fuck your welfare\n" +
                "Fuck your government and fuck Fred Bear\n" +
                "Fuck Nugent, like anybody gives a fuck\n" +
                "You like to hunt a lot, so fuckin what?!\n" +
                "Fuck disco, Count of Monte Crisco\n" +
                "Fuck Cisco, and Jack and Jerry Brisco\n" +
                "And fuck everyone who went down with the Titanic, in a panic\n" +
                "I'm like fuck you, AHHHHH!!!!\n" +
                "\n" +
                "[Chorus] X 2\n" +
                "\n" +
                "[Shaggy 2 Dope]\n" +
                "Fuck Celine Dion and fuck Dionne Warwick\n" +
                "You both make me sick, suck my dick\n" +
                "Fuck the Berlin Wall, both sides of it\n" +
                "And fuck Lyle Lovett, whoever the fuck that is\n" +
                "Fuck everybody in the hemisphere\n" +
                "Fuck them across the world, and fuck them right here\n" +
                "You know the guy that operates the Rouge River draw bridge in Delray on\n" +
                "Jefferson? FUCK HIM!\n" +
                "Fuck your idea, fuck your gonnoreha\n" +
                "Fuck your diarrhea, Rocky Maivia\n" +
                "Fuck your wife, your homie did, he's fuckin you\n" +
                "Fuck the police and the 5-0 too\n" +
                "Fuck Spin, Rolling Stone, and fuck Vibe\n" +
                "Fuck everybody inside\n" +
                "Whoever's on the cover, fuck his mother\n" +
                "Fuck your little brother's homie from around the way\n" +
                "And fuck Violent J!";

        String strs[] = input.split("\n");

        for (String s : strs
        ) {
            for (int i = 0; i < s.length(); i++) {
                Formatter f = new Formatter();
                f.format("%3c", s.charAt(i));
                System.out.print(f);
            }
            System.out.println();
            for (int i = 0; i < s.length(); i++) {
                if ((int) ((s.charAt(i) + "").toLowerCase().charAt(0)) - 96 > 0) {
                    Formatter f = new Formatter();
                    f.format("%3d", (int) ((s.charAt(i) + "").toLowerCase().charAt(0)) - 96);
                    System.out.print(f);
                }
                else
                {
                    Formatter f = new Formatter();
                    f.format("%3c",  s.charAt(i));
                    System.out.print(f);
                }
            }
            System.out.println();
        }
    }
}
