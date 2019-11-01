package task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestInsertAfterSubstrings {
    public static void main(String[] args) {
        final String input = "\"Hokus Pokus\"\n" +
                "\n" +
                "\"Serial slaughtering stranglers \n" +
                "Jugging Juggling juggalos \n" +
                "Folded, fat, floppy-tittied freaks \n" +
                "I C fuckin P's in the haugh\" \n" +
                "\n" +
                "[Violent J]\n" +
                "Abracadabra boom shacka dae\n" +
                "I'm Violent J, and I'm back like a vertebrae \n" +
                "And I come with a hat full of tricks \n" +
                "Trunk full of Faygo, car full of fat chicks \n" +
                "Hahahahahahahaha, fuck you \n" +
                "Wicked clowns, we'd like to say what up to \n" +
                "The Cobra's, X-men, and Counts, and everybody with clown luv \n" +
                "Even sets I've never heard of \n" +
                "Roll into town, and out with the big top \n" +
                "Four cards down, and two more still to drop \n" +
                "And when it does, I pack up and hit the road \n" +
                "Cuz I don't wanna see your head explode \n" +
                "Toss me an axe, and I'll toss you a dead chicken \n" +
                "Add a buck, you get a two-liter with em \n" +
                "And when the genie says on with the show\n" +
                "It's hokus pokus jokers, Great Milenko.\n" +
                "\n" +
                "[Chorus (1x)]\n" +
                "Once again, the psychotic carnival creatures in the haugh\n" +
                "Hokus pokus, joker's ride, come take a spin on a carnie ride\n" +
                "Southwest slithering snakes of darkness come\n" +
                "Hokus pokus, joker's ride, come take a spin on a carnie ride\n" +
                "\n" +
                "[Shaggy 2 Dope]\n" +
                "Shazam BAM, shocka locka lokey\n" +
                "Shaggy the clown back like scoliosis \n" +
                "Call me a psycho-skitso freak \n" +
                "And I'll call you by your name (dick-anus) \n" +
                "Cuz I can give two shits and a fuck \n" +
                "I bounce down Verner in a popcorn clown truck \n" +
                "I'm a circus ninja southwest voodoo wizard. \n" +
                "I grab your gizzard \n" +
                "Jump on the carpet, let's take a spin \n" +
                "Everybody's waitin for the show to begin \n" +
                "Up to the top, by the neck, and let you go \n" +
                "Try to land in a glass of Faygo \n" +
                "Uh, you suck, you missed the fuckin glass \n" +
                "Broken neck, and busted your fuckin ass \n" +
                "But the genie says on with the show \n" +
                "Hokus Pokus Jokers, Great Milenko. \n" +
                "\n" +
                "[Chorus (1x)]\n" +
                "What awaits you after death, rub the lamp and explore\n" +
                "Hokus pokus, joker's ride, come take a spin on a carnie ride\n" +
                "Enter Milenko's Fun House, walk right through the wretched hall\n" +
                "Hokus pokus, joker's ride, come take a spin on a carnie ride\n" +
                "\n" +
                "\"Fuck em all, fuck em all\n" +
                "Clown dawg, freak dawg\n" +
                "Joker dawg, Milenko dawg\"\n" +
                "\n" +
                "Fidgets of joker's cards blasting in your mother's face\n" +
                "Hokus pokus, joker's ride, come take a spin on a carnie ride\n" +
                "\n" +
                "[Violent J]\n" +
                "Rude Boy and Chucky down wit the clown \n" +
                "First time we ever went to Mexican Town \n" +
                "I remember, we couldn't pay the bill, they got hot \n" +
                "And beat us down in the fuckin parking lot \n" +
                "\n" +
                "[Shaggy 2 Dope]\n" +
                "Tall Jess, Jump Steady, and Nate the Mack \n" +
                "Tagged ICP by the train tracks \n" +
                "And it was on, the dawn of a new day \n" +
                "Magical carpets screaming down the freeway \n" +
                "\n" +
                "[Violent J]\n" +
                "Walked in a gypsy's tent with a food stamp \n" +
                "And walked out with a magical lamp, yeah \n" +
                "I met Milenko, he gave me 3 wishes \n" +
                "That night, I fucked 3 fat bitches \n" +
                "\n" +
                "[Shaggy 2 Dope]\n" +
                "Then get the fuck with it, forget it \n" +
                "I'll rip your face off, and wipe my ass with it\n" +
                "When the genie says on with the show \n" +
                "Hokus pokus, jokers, Great Milenko\n" +
                "\n" +
                "[Chorus (x)]\n" +
                "Climb aboard our magic train and join us inside\n" +
                "Hokus pokus, joker's ride, come take a spin on a carnie ride\n" +
                "Fifty-two villians, hammered town, the show must go on\n" +
                "Hokus pokus, joker's ride, come take a spin on a carnie ride\n" +
                "Giant ladies, bearded ladies, midget ladies, ladies!\n" +
                "Hokus pokus, joker's ride, come take a spin on a carnie ride\n" +
                "Clouds of darkness and underneath them comes the clown\n" +
                "Hokus pokus, joker's ride, come take a spin on a carnie ride\n" +
                "\n" +
                "\"Fuck dat!\"";
        String splitter = "us";
        String[] astrs =  input.split(splitter);
        StringBuilder result = new StringBuilder();
        String addon = " You are asshole ";
        for(String s: astrs)
        {
            result.append(s).append(splitter).append(addon);
        }
        System.out.print(result);
    }
}
