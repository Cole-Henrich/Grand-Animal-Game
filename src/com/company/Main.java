package com.company;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.lang.Object.*;


public class Main {

        public static void main(String[] args) throws IOException, InterruptedException {
            int a = 0;
            while (a < 2) {
                Random random = new Random();
                String[] animals = {
                        "Aardvark", "Aardwolf", "African Elephant", "African Tree Pangolin", "Alligator", "Alpaca", "Anteater", "Antelope", "Ape(s)", "Arabian Horse", "Armadillo", "Arthropod(s)", "Asian Elephant", "Aye-Aye", "Baboon", "Badger", "Bandicoot", "Bat(s)", "Bearded Dragon", "Beaver", "Beluga Whale", "Bengal Tiger", "Big-Horned Sheep", "Billy Goat", "Bird(s)", "Bison", "Black Bear", "Black Footed Rhino", "Black Howler Monkey", "Black Rhino", "Blacktip Reef Shark", "Blue Shark", "Blue Whale", "Boar", "Bob-Cat", "Bonobo", "Bottlenose Dolphin", "Bottlenose Whale", "Brown Bear", "Buffalo", "Bull", "Bull frog", "Caiman Lizard", "Camel", "Capuchin Monkey", "Capybara", "Caribou", "Cat(s)", "Cattle", "Cheetah", "Chimpanzee", "Chinchilla", "Chipmunk", "Common Dolphin", "Common Seal", "Coral(s) and Anemone(s)", "Cougar", "Cow(s)", "Coyote", "Crocodile", "Crustacean(s)", "Dart Frog", "Deer", "Degus", "Dik-Dik", "Dingo", "Dog(s)", "Dogfish Shark", "Dolphin", "Donkey", "Door Mouse", "Dormouse", "Draft Horse", "Duckbill Platypus", "Dugong", "Dusky Shark", "Elephant", "Elephant Seal", "Elk", "Ermine", "Eurasian Lynx", "Ferret", "Fish(es)", "Florida Panther", "Flying Fox", "Fox", "Fresh Water Crocodile", "Frog", "Fur Seal", "Galapagos Land Iguana", "Galapagos Shark", "Galapagos Tortoise", "Gazelle", "Gecko", "Giant Anteater", "Giant Panda", "Gibbon", "Giraffe", "Goat", "Gopher", "Gorilla", "Gray Fox", "Gray Nurse Shark", "Gray Reef Shark", "Gray Whale", "Great White Shark", "Green Poison Dart Frog", "Green Sea Turtle", "Grizzly Bear", "Groundhog", "Guinea Pig", "Hairy-Nosed Wombat", "Hammerhead Shark", "Harbor Porpoise", "Harbor Seal", "Hare", "Harp Seal", "Hawaiian Monk Seal", "Hedgehog", "Hippopotamus", "Horn Shark", "Horse(s)", "Howler Monkey", "Humpback Whale", "Hyena", "Hyrax", "Iguana", "Iguanodon", "Impala", "Insect(s)", "Irrawaddy Dolphin", "Jackal", "Jackrabbit", "Jaguar", "Jellyfish", "Kangaroo", "Kermode Bear", "Killer Whale", "Koala", "Komodo Dragon", "Kookaburra", "Lama", "Lamb", "Lancelet", "Least Weasel", "Leatherback Sea Turtle", "Lemming", "Lemon Shark", "Lemur", "Leopard", "Leopard Gecko", "Leopard Seal", "Leopard Shark", "Lion", "Llama", "Loggerhead Turtles", "Lynx", "Mako Shark", "Manatee", "Manta Ray", "Mantis", "Marbled Salamander", "Marmot", "Marsupial(s)", "Meerkat", "Megamouth Shark", "Melon-Headed Whale", "Miniature Donkey", "Mink", "Minke Whale", "Mole", "Mole Salamander", "Mollusk(s)", "Mongoose", "Monitor Lizard", "Monk Seal", "Monkey", "Moose", "Mountain Lion", "Mouse", "Mule", "Muskox", "Muskrat", "Naked Mole Rat", "Narwhal", "Nautilus", "Newt", "Northern Right Whale", "Nurse Shark", "Nutria", "Nyala", "Ocelot", "Octopus", "Okapi", "Opossum", "Orangutan", "Orca", "Otter", "Ox", "Panda", "Panther", "Pig", "Pilot Whale", "Pine Marten", "Platypus", "Polar Bear", "Porcupine", "Porpoise", "Possum", "Potbellied Pig", "Potto", "Prairie Dog", "Proboscis Monkey", "Przewalski's Wild horse", "Puma", "Pygmy Hippopotamus", "Pygmy Right Whale", "Pygmy Sperm Whale", "Quokkas", "Quolls", "Rabbit", "Raccoon", "Rat", "Ray", "Red Fox", "Red Kangaroo", "Red Panda", "Red-Eyed Tree Frog", "Reef Shark", "Reindeer", "Rhino", "Rhinoceros", "Right Whale", "Ringed Seal", "Risso's Dolphin", "River Dolphin", "Salamander", "Sandbar Shark", "Scalloped Hammerhead Shark", "Sea Lion", "Sea Turtles", "Seal", "Sei Whale", "Shark", "Sheep", "Shortfin Mako Shark", "Siberian Tiger", "Silky Shark", "Skink", "Skunk", "Slender Loris", "Sloth", "Sloth Bear", "Snake(s)", "Snow Fox", "Snow Hare", "Snow Leopard", "Snow Monkey", "Somali Wild Ass", "Spectacled Bear", "Sperm Whale", "Spider Monkey", "Spiny Dogfish Shark", "Spotted Dolphin", "Squirrel", "Star-Nosed Mole", "Stellar Sea Lion", "Striped Dolphin", "Sun Bear", "Takin", "Tamarin", "Tapir", "Tasmanian Devil", "Tasmanian Tiger", "Terrapin", "Thresher Shark", "Tiger", "Tiger Salamander", "Tiger Shark", "Topi", "Tortoise", "Tree Frog", "Turtle", "Uakari", "Vampire Bat", "Vancouver Island Marmot", "Vervet Monkey", "Vicuna", "Vole", "Wallaby", "Walrus", "Warthog", "Water Buffalo", "Weasel", "Whale Shark", "Whale(s)", "White Rhino", "White Tailed Deer", "White-Beaked Dolphin", "Whitetip Reef Shark", "Wildcat", "Wildebeest", "Wobbegong Shark", "Wolf", "Wolverine", "Wombat", "Woodchuck", "Yak", "Yellow-Bellied Marmot", "Zebra", "Zebu", "Zorilla"
                };
                ArrayList<String> alphanimals = new ArrayList<String>(animals.length);
                p("Enter your name: ");
                Scanner s = new Scanner(System.in);
                String userInput;
                userInput = s.next();
                if (!(userInput.equalsIgnoreCase("winnie") || userInput.contains("pig"))) {
                    getNameArt(userInput);
                    Thread.sleep(2000);
                }
                else {
                    getNameArt(userInput);
                    Thread.sleep(3000);
                }

                getTitle();
                Thread.sleep(10000);
                getRocket();
                Thread.sleep(1000);
                p("enter one character, capital please.");
                char c = (char) System.in.read();
                for (int i = 0; i < animals.length; i++) {
                    if (animals[i].charAt(0) == c) {
                        alphanimals.add(animals[i]);
                    }
                }
                String userInput2;
                p("There are " + alphanimals.size() + " animals available whose names start with " + c +
                        ". Do you want to pick select a specific animal number (for example, animal 7 might be giraffe), or do you want a random animal? Type select or random. ");

                userInput2 = s.next();
                int userInput3;
                String youranimal;
                if (userInput2.contains("sel")) {
                    p("Ok! You can choose a number greater than or equal to 0 and less than or equal to " + (alphanimals.size() - 1) + ". Ready? Type your number: ");
                    userInput3 = Integer.parseInt(s.next());
                    youranimal = alphanimals.get(userInput3);
                    p("Hooray! Your animal is the fascinating " + youranimal + "! Do you want to play again?");
                    String userInput4;
                    userInput4 = s.next();
                    if (userInput4.contains("" + 'y')) {
                        p("Great! have fun!");
                        a -= 1;
                    }
                }
                if (userInput2.contains("ran")) {
                    int rand = random.nextInt(alphanimals.size());
                    p("your random number is: " + rand);
                    p("ready for the grand unveiling????? (YESSSS!)");
                    String userInput5 = s.next();
                    if (userInput5.contains("" + 'y')) {
                        youranimal = alphanimals.get(rand);
                        p("Hooray! Your animal is the fascinating " + youranimal + "! Do you want to play again?");
                        String userInput4;
                        userInput4 = s.next();
                        if (userInput4.contains("" + 'y')) {
                            p("Great! have fun!");
                            a -= 1;
                        }
                        else {
                            getCitations();
                            ThankYou();
                            break;
                        }
                    }
                }
            }
        }
    public static void p(Object object_to_print){
        System.out.println(object_to_print);
    }

    /**
     * calls the rocket methods
     */
    public static void getRocket() {
        /* Initialise our StringBuilder. */
        StringBuilder builder = new StringBuilder();

        /* Append the first triangle to the top, with a height of 5, middle column width of 2 and a side-padding of 1. */
        builder.append(makeACenteredTriangle(5, 2, 1));

        /* Append the first divider, with a width of 14 having a total middle column width of 2, and 1 '+' at each end. */
        builder.append(makeADivider(14, 2, 1)).append('\n');

    /*
        Append the first section of the main body of the art. This is done by going
        through row 1 to 6 of a diamond with side-lengths of 3.  The end characters are
        appended for each row. In conclusion the diamond - parts generated are that of one
        with a side-length of 3, and having 2 of them.
    */
        for (int i = 1; i <= 6; i++)
            builder.append('|').append(makeADiamondsStrip(3, 2, i)).append('|').append('\n');

        /* Append another divider, the same as the last. */
        builder.append(makeADivider(14, 2, 1)).append('\n');

        /* Create the next section of the body, this time with the bottom half then the top half of the diamonds; in that order. */
        for (int i = 4; i <= 6; i++)
            builder.append('|').append(makeADiamondsStrip(3, 2, i)).append('|').append('\n');
        for (int i = 1; i <= 3; i++)
            builder.append('|').append(makeADiamondsStrip(3, 2, i)).append('|').append('\n');

        /* Append the last divider. */
        builder.append(makeADivider(14, 2, 1)).append('\n');

        /* Append another triangle, this one being the same as the first. */
        builder.append(makeACenteredTriangle(5, 2, 1));

        /* Print out the final ASCII art. */
        p(builder.toString());
    }

    /**
     * Created by Thomas on 08/10/2014 at 4:53 PM.
     * @author Thomas
     * @since X.X.X
     */
        /**
         * Makes a triangle with astrix's along the center, and slashes on the sides.
         *
         * @param height          The height of the triangle, total width is determined off this.
         * @param middleWidth     The width of the characters in the middle of the triangle.
         * @param sideBufferExtra How much buffering to put on each side of the triangle, this is used
         *                        (in the OP's example) for the extra spacing required to be flush with
         *                        the rest of the piece.
         * @return The triangle with the passed parameters.
         */
        public static String makeACenteredTriangle(int height, int middleWidth, int sideBufferExtra) {
            StringBuilder builder = new StringBuilder();
            for (int row = 1; row <= height; row++) {

                //Left buffer
                for (int b = 1; b <= height - row + sideBufferExtra; b++)
                    builder.append(' ');

                //Left slashes
                for (int slash = 1; slash <= row; slash++)
                    builder.append('/');

                //Middle column
                for (int mid = 1; mid <= middleWidth; mid++)
                    builder.append('*');

                //Right slashes
                for (int slash = 1; slash <= row; slash++)
                    builder.append('\\');

                //Right buffer
                for (int b = 1; b <= height - row + sideBufferExtra; b++)
                    builder.append(' ');

                builder.append('\n');
            }
            return builder.toString();
        }

        /**
         * Creates a strip of a diamond ascii art - piece.
         *
         * @param sideLength     Length of each side of the diamonds.
         * @param numberDiamonds Number of diamonds to append to the line.
         * @param rowNumber      Which row of the diamond to be generated. Starting at row index 1 and
         *                       going up to sideLength * 2
         * @return The row of the diamond
         */
        public static String makeADiamondsStrip(int sideLength, int numberDiamonds, int rowNumber) {
            StringBuilder builder = new StringBuilder();

            //For the number of diamonds
            for (int number = 1; number <= numberDiamonds; number++) {

                //Left buffering
                if (rowNumber <= sideLength)
                    for (int b = 1; b <= sideLength - rowNumber; b++) builder.append('.');
                else
                    for (int b = 1; b <= rowNumber - sideLength - 1; b++) builder.append('.');

                //Slashes
                if (rowNumber <= sideLength)
                    for (int s = 1; s <= rowNumber; s++)
                        builder.append("/\\");
                else
                    for (int s = 1; s <= rowNumber - 2 * (rowNumber - sideLength) + 1; s++)
                        builder.append("\\/");

                //Right buffering
                if (rowNumber <= sideLength)
                    for (int b = 1; b <= sideLength - rowNumber; b++) builder.append('.');
                else
                    for (int b = 1; b <= rowNumber - sideLength - 1; b++) builder.append('.');
            }
            return builder.toString();
        }

        /**
         * Not working the best, though gets the basic job done.
         *
         * @param totalWidth  Total width of the divider, must be an even number as of now.
         * @param middleWidth Width of the middle characters in the divider, as of now must be an even
         *                    number.
         * @param sideWidth   Width of the '+' characters on each side of the divider.
         * @return The divider.
         */
        public static String makeADivider(int totalWidth, int middleWidth, int sideWidth) {
            StringBuilder builder = new StringBuilder();

            int remainingEachSide = (totalWidth - middleWidth - 2 * sideWidth) / 2;

            for (int i = 0; i < sideWidth; i++) builder.append('+');

            //Left
            for (int left = 1; left <= remainingEachSide; left++)
                builder.append(left % 2 == 1 ? '=' : '*');
            //Middle
            for (int middle = 1; middle <= middleWidth; middle++) builder.append('*');

            //Right
            for (int right = 1; right <= remainingEachSide; right++)
                builder.append(right % 2 == 1 ? '=' : '*');

            for (int i = 0; i < sideWidth; i++) builder.append('+');


            return builder.toString();
        }

    /**
     * prints premade ascii titles. It is hidden in a method to declutter the code.
     */
    public static void getTitle() {

            System.out.println("                                                                                                                                \n" +
                    "     ***** *    **   ***              ***                                                           ****           *            \n" +
                    "  ******  *  *****    ***              ***                                                         *  *************             \n" +
                    " **   *  *     *****   ***              **                                                        *     *********               \n" +
                    "*    *  **     * **      **             **                                                        *     *  *                    \n" +
                    "    *  ***     *         **             **                  ****                                   **  *  **            ****    \n" +
                    "   **   **     *         **    ***      **       ****      * ***  * *** **** ****       ***           *  ***           * ***  * \n" +
                    "   **   **     *         **   * ***     **      * ***  *  *   ****   *** **** ***  *   * ***         **   **          *   ****  \n" +
                    "   **   **     *         **  *   ***    **     *   ****  **    **     **  **** ****   *   ***        **   **         **    **   \n" +
                    "   **   **     *         ** **    ***   **    **         **    **     **   **   **   **    ***       **   **         **    **   \n" +
                    "   **   **     *         ** ********    **    **         **    **     **   **   **   ********        **   **         **    **   \n" +
                    "    **  **     *         ** *******     **    **         **    **     **   **   **   *******          **  **         **    **   \n" +
                    "     ** *      *         *  **          **    **         **    **     **   **   **   **                ** *      *   **    **   \n" +
                    "      ***      ***      *   ****    *   **    ***     *   ******      **   **   **   ****    *          ***     *     ******    \n" +
                    "       ******** ********     *******    *** *  *******     ****       ***  ***  ***   *******            *******       ****     \n" +
                    "         ****     ****        *****      ***    *****                  ***  ***  ***   *****               ***                  \n" +
                    "                                                                                                                                \n" +
                    "                                                                                                                                \n" +
                    "                                                                                                                                \n" +
                    "                                                                                                                                \n" +
                    "                                                                                                                                ");
            System.out.println(" .----------------.  .----------------.  .----------------.   .----------------.  .----------------.  .----------------.  .-----------------. .----------------.   .----------------.  .-----------------. .----------------.  .----------------.  .----------------.  .----------------.   .----------------.  .----------------.  .----------------.  .----------------.  .----------------.   \n" +
                    "| .--------------. || .--------------. || .--------------. | | .--------------. || .--------------. || .--------------. || .--------------. || .--------------. | | .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. | | .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |  \n" +
                    "| |  _________   | || |  ____  ____  | || |  _________   | | | |    ______    | || |  _______     | || |      __      | || | ____  _____  | || |  ________    | | | |      __      | || | ____  _____  | || |     _____    | || | ____    ____ | || |      __      | || |   _____      | | | |    ______    | || |      __      | || | ____    ____ | || |  _________   | || |              | |  \n" +
                    "| | |  _   _  |  | || | |_   ||   _| | || | |_   ___  |  | | | |  .' ___  |   | || | |_   __ \\    | || |     /  \\     | || ||_   \\|_   _| | || | |_   ___ `.  | | | |     /  \\     | || ||_   \\|_   _| | || |    |_   _|   | || ||_   \\  /   _|| || |     /  \\     | || |  |_   _|     | | | |  .' ___  |   | || |     /  \\     | || ||_   \\  /   _|| || | |_   ___  |  | || |      _       | |  \n" +
                    "| | |_/ | | \\_|  | || |   | |__| |   | || |   | |_  \\_|  | | | | / .'   \\_|   | || |   | |__) |   | || |    / /\\ \\    | || |  |   \\ | |   | || |   | |   `. \\ | | | |    / /\\ \\    | || |  |   \\ | |   | || |      | |     | || |  |   \\/   |  | || |    / /\\ \\    | || |    | |       | | | | / .'   \\_|   | || |    / /\\ \\    | || |  |   \\/   |  | || |   | |_  \\_|  | || |     | |      | |  \n" +
                    "| |     | |      | || |   |  __  |   | || |   |  _|  _   | | | | | |    ____  | || |   |  __ /    | || |   / ____ \\   | || |  | |\\ \\| |   | || |   | |    | | | | | |   / ____ \\   | || |  | |\\ \\| |   | || |      | |     | || |  | |\\  /| |  | || |   / ____ \\   | || |    | |   _   | | | | | |    ____  | || |   / ____ \\   | || |  | |\\  /| |  | || |   |  _|  _   | || |     | |      | |  \n" +
                    "| |    _| |_     | || |  _| |  | |_  | || |  _| |___/ |  | | | | \\ `.___]  _| | || |  _| |  \\ \\_  | || | _/ /    \\ \\_ | || | _| |_\\   |_  | || |  _| |___.' / | | | | _/ /    \\ \\_ | || | _| |_\\   |_  | || |     _| |_    | || | _| |_\\/_| |_ | || | _/ /    \\ \\_ | || |   _| |__/ |  | | | | \\ `.___]  _| | || | _/ /    \\ \\_ | || | _| |_\\/_| |_ | || |  _| |___/ |  | || |     | |      | |  \n" +
                    "| |   |_____|    | || | |____||____| | || | |_________|  | | | |  `._____.'   | || | |____| |___| | || ||____|  |____|| || ||_____|\\____| | || | |________.'  | | | ||____|  |____|| || ||_____|\\____| | || |    |_____|   | || ||_____||_____|| || ||____|  |____|| || |  |________|  | | | |  `._____.'   | || ||____|  |____|| || ||_____||_____|| || | |_________|  | || |     |_|      | |  \n" +
                    "| |              | || |              | || |              | | | |              | || |              | || |              | || |              | || |              | | | |              | || |              | || |              | || |              | || |              | || |              | | | |              | || |              | || |              | || |              | || |     (_)      | |  \n" +
                    "| '--------------' || '--------------' || '--------------' | | '--------------' || '--------------' || '--------------' || '--------------' || '--------------' | | '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' | | '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |  \n" +
                    " '----------------'  '----------------'  '----------------'   '----------------'  '----------------'  '----------------'  '----------------'  '----------------'   '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'   '----------------'  '----------------'  '----------------'  '----------------'  '----------------'   ");


        }
        public static void getNameArt(String username) throws InterruptedException {
        p(" ,ggg,        gg                                     \n" +
                "dP\"\"Y8b       88           ,dPYb, ,dPYb,             \n" +
                "Yb, `88       88           IP'`Yb IP'`Yb             \n" +
                " `\"  88       88           I8  8I I8  8I             \n" +
                "     88aaaaaaa88           I8  8' I8  8'             \n" +
                "     88\"\"\"\"\"\"\"88   ,ggg,   I8 dP  I8 dP    ,ggggg,   \n" +
                "     88       88  i8\" \"8i  I8dP   I8dP    dP\"  \"Y8ggg\n" +
                "     88       88  I8, ,8I  I8P    I8P    i8'    ,8I  \n" +
                "     88       Y8, `YbadP' ,d8b,_ ,d8b,_ ,d8,   ,d8'  \n" +
                "     88       `Y8888P\"Y8888P'\"Y888P'\"Y88P\"Y8888P\"    \n" +
                "                                                     \n" +
                "                                                     \n" +
                "                                                     \n" +
                "                                                     \n" +
                "                                                     \n" +
                "                                                     ");

            if(username.equalsIgnoreCase("lucy")) {
                p("       ,gggg,                                   \n" +
                        "      d8\" \"8I                                   \n" +
                        "      88  ,dP                                   \n" +
                        "   8888888P\"                                    \n" +
                        "      88                                        \n" +
                        "      88        gg      gg    ,gggg,  gg     gg \n" +
                        " ,aa,_88        I8      8I   dP\"  \"Yb I8     8I \n" +
                        "dP\" \"88P        I8,    ,8I  i8'       I8,   ,8I \n" +
                        "Yb,_,d88b,,_   ,d8b,  ,d8b,,d8,_    _,d8b, ,d8I \n" +
                        " \"Y8P\"  \"Y888888P'\"Y88P\"`Y8P\"\"Y8888PPP\"\"Y88P\"888\n" +
                        "                                           ,d8I'\n" +
                        "                                         ,dP'8I \n" +
                        "                                        ,8\"  8I \n" +
                        "                                        I8   8I \n" +
                        "                                        `8, ,8I \n" +
                        "                                         `Y8P\"  ");
            }
            if(username.equalsIgnoreCase("emily")) {
                p("   ,ggggggg,                                           \n" +
                        " ,dP\"\"\"\"\"\"Y8b                         ,dPYb,           \n" +
                        " d8'    a  Y8                         IP'`Yb           \n" +
                        " 88     \"Y8P'                    gg   I8  8I           \n" +
                        " `8baaaa                         \"\"   I8  8'           \n" +
                        ",d8P\"\"\"\"      ,ggg,,ggg,,ggg,    gg   I8 dP  gg     gg \n" +
                        "d8\"          ,8\" \"8P\" \"8P\" \"8,   88   I8dP   I8     8I \n" +
                        "Y8,          I8   8I   8I   8I   88   I8P    I8,   ,8I \n" +
                        "`Yba,,_____,,dP   8I   8I   Yb,_,88,_,d8b,_ ,d8b, ,d8I \n" +
                        "  `\"Y88888888P'   8I   8I   `Y88P\"\"Y88P'\"Y88P\"\"Y88P\"888\n" +
                        "                                                  ,d8I'\n" +
                        "                                                ,dP'8I \n" +
                        "                                               ,8\"  8I \n" +
                        "                                               I8   8I \n" +
                        "                                               `8, ,8I \n" +
                        "                                                `Y8P\"  ");
            }
            if(username.contains("ed") || username.equalsIgnoreCase("dad")) {
                p("   ,ggggggg,                                                              \n" +
                        " ,dP\"\"\"\"\"\"Y8b        8I                                                8I \n" +
                        " d8'    a  Y8        8I                                                8I \n" +
                        " 88     \"Y8P'        8I                                                8I \n" +
                        " `8baaaa             8I                                                8I \n" +
                        ",d8P\"\"\"\"       ,gggg,8I  gg    gg    gg   ,gggg,gg   ,gggggg,    ,gggg,8I \n" +
                        "d8\"           dP\"  \"Y8I  I8    I8    88bgdP\"  \"Y8I   dP\"\"\"\"8I   dP\"  \"Y8I \n" +
                        "Y8,          i8'    ,8I  I8    I8    8I i8'    ,8I  ,8'    8I  i8'    ,8I \n" +
                        "`Yba,,_____,,d8,   ,d8b,,d8,  ,d8,  ,8I,d8,   ,d8b,,dP     Y8,,d8,   ,d8b,\n" +
                        "  `\"Y8888888P\"Y8888P\"`Y8P\"\"Y88P\"\"Y88P\" P\"Y8888P\"`Y88P      `Y8P\"Y8888P\"`Y8\n" +
                        "                                                                          \n" +
                        "                                                                          \n" +
                        "                                                                          \n" +
                        "                                                                          \n" +
                        "                                                                          \n" +
                        "                                                                          ");
            }
            if(username.contains("nat") || username.equalsIgnoreCase("mom")) {
                p(" ,ggg, ,ggggggg,                                                      \n" +
                        "dP\"\"Y8,8P\"\"\"\"\"Y8b               I8               ,dPYb,               \n" +
                        "Yb, `8dP'     `88               I8               IP'`Yb               \n" +
                        " `\"  88'       88            88888888            I8  8I  gg           \n" +
                        "     88        88               I8               I8  8'  \"\"           \n" +
                        "     88        88    ,gggg,gg   I8     ,gggg,gg  I8 dP   gg    ,ggg,  \n" +
                        "     88        88   dP\"  \"Y8I   I8    dP\"  \"Y8I  I8dP    88   i8\" \"8i \n" +
                        "     88        88  i8'    ,8I  ,I8,  i8'    ,8I  I8P     88   I8, ,8I \n" +
                        "     88        Y8,,d8,   ,d8b,,d88b,,d8,   ,d8b,,d8b,_ _,88,_ `YbadP' \n" +
                        "     88        `Y8P\"Y8888P\"`Y88P\"\"Y8P\"Y8888P\"`Y88P'\"Y888P\"\"Y8888P\"Y888\n" +
                        "                                                                      \n" +
                        "                                                                      \n" +
                        "                                                                      \n" +
                        "                                                                      \n" +
                        "                                                                      \n" +
                        "                                                                      ");
            }
            if(username.equalsIgnoreCase("winnie") || username.contains("pig")) {
                p("are you really winnie? We need to do a dog-check. What is your favorite dog's name?" );
                Scanner dogcheck = new Scanner(System.in);
                String dogInput = dogcheck.next();
                if (dogInput.equalsIgnoreCase("sam") || dogInput.contains("ie") || dogInput.contains("y")) {
                    p("what color is your preffered bed?");
                    String color = dogcheck.next();
                    if (color.equalsIgnoreCase("tan")|| color.equalsIgnoreCase("beige") ||color.equalsIgnoreCase("light brown")) {
                        p("how many hours a day do you sleep?");
                        String sleepHours = dogcheck.next();
                        if (Integer.parseInt(sleepHours) > 10 && Integer.parseInt(sleepHours) < 20) {
                            p("verifying your answer against our databases...");
                            Thread.sleep(2000);
                            p("ok, it appears you may be a dog...or at least a good impostor!!!!!");
                            p(" ,ggg,      gg      ,gg                                              \n" +
                                    "dP\"\"Y8a     88     ,8P                                               \n" +
                                    "Yb, `88     88     d8'                                               \n" +
                                    " `\"  88     88     88 gg                                gg           \n" +
                                    "     88     88     88 \"\"                                \"\"           \n" +
                                    "     88     88     88 gg    ,ggg,,ggg,    ,ggg,,ggg,    gg    ,ggg,  \n" +
                                    "     88     88     88 88   ,8\" \"8P\" \"8,  ,8\" \"8P\" \"8,   88   i8\" \"8i \n" +
                                    "     Y8    ,88,    8P 88   I8   8I   8I  I8   8I   8I   88   I8, ,8I \n" +
                                    "      Yb,,d8\"\"8b,,dP_,88,_,dP   8I   Yb,,dP   8I   Yb,_,88,_ `YbadP' \n" +
                                    "       \"88\"    \"88\" 8P\"\"Y88P'   8I   `Y88P'   8I   `Y88P\"\"Y8888P\"Y888\n" +
                                    "                                                                     \n" +
                                    "                                                                     \n" +
                                    "                                                                     \n" +
                                    "                                                                     \n" +
                                    "                                                                     \n" +
                                    "                                                                     ");
                        }
                        else {
                            p("sorry, you don't seem to be winnie. Try playing again!");
                        }
                    }
                    else {
                        p("sorry, you don't seem to be winnie. Try playing again!");
                    }
                }
                else {
                    p("sorry, you don't seem to be winnie. Try playing again!");
                }
            }
        }
        public static void ThankYou() {
        p("  _____ _                 _                           __              ____  _             _             _ \n" +
                " |_   _| |__   __ _ _ __ | | __  _   _  ___  _   _   / _| ___  _ __  |  _ \\| | __ _ _   _(_)_ __   __ _| |\n" +
                "   | | | '_ \\ / _` | '_ \\| |/ / | | | |/ _ \\| | | | | |_ / _ \\| '__| | |_) | |/ _` | | | | | '_ \\ / _` | |\n" +
                "   | | | | | | (_| | | | |   <  | |_| | (_) | |_| | |  _| (_) | |    |  __/| | (_| | |_| | | | | | (_| |_|\n" +
                "   |_| |_| |_|\\__,_|_| |_|_|\\_\\  \\__, |\\___/ \\__,_| |_|  \\___/|_|    |_|   |_|\\__,_|\\__, |_|_| |_|\\__, (_)\n" +
                "                                 |___/                                              |___/         |___/   ");
        }
        public static void getCitations() {
            System.out.println(" ██████╗ ██████╗  ██████╗ ██╗          █████╗ ███████╗ ██████╗██╗██╗     █████╗ ██████╗ ████████╗                                                                                                                                                                                                                                                             \n" +
                    "██╔════╝██╔═══██╗██╔═══██╗██║         ██╔══██╗██╔════╝██╔════╝██║██║    ██╔══██╗██╔══██╗╚══██╔══╝                                                                                                                                                                                                                                                             \n" +
                    "██║     ██║   ██║██║   ██║██║         ███████║███████╗██║     ██║██║    ███████║██████╔╝   ██║                                                                                                                                                                                                                                                                \n" +
                    "██║     ██║   ██║██║   ██║██║         ██╔══██║╚════██║██║     ██║██║    ██╔══██║██╔══██╗   ██║                                                                                                                                                                                                                                                                \n" +
                    "╚██████╗╚██████╔╝╚██████╔╝███████╗    ██║  ██║███████║╚██████╗██║██║    ██║  ██║██║  ██║   ██║                                                                                                                                                                                                                                                                \n" +
                    " ╚═════╝ ╚═════╝  ╚═════╝ ╚══════╝    ╚═╝  ╚═╝╚══════╝ ╚═════╝╚═╝╚═╝    ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝                                                                                                                                                                                                                                                                \n" +
                    "                                                                                                                                                                                                                                                                                                                                                              \n" +
                    "                                                                                                                                                                                                                                                                                                                                                              \n" +
                    "                                                                                                                                                                                                                                                                                                                                                              \n" +
                    "                                                                                                                                                                                                                                                                                                                                                              \n" +
                    "██████╗  ██████╗  ██████╗██╗  ██╗███████╗████████╗     █████╗ ██████╗ ████████╗     ██████╗██████╗ ███████╗██████╗ ██╗████████╗       ███████╗██╗    ██╗ ██████╗ ██╗  ██╗██╗  ██╗██╗   ██╗ ██████╗ ███████╗     ██████╗ ███╗   ██╗    ███████╗████████╗ █████╗  ██████╗██╗  ██╗ ██████╗ ██╗   ██╗███████╗██████╗ ███████╗██╗      ██████╗ ██╗    ██╗          \n" +
                    "██╔══██╗██╔═══██╗██╔════╝██║ ██╔╝██╔════╝╚══██╔══╝    ██╔══██╗██╔══██╗╚══██╔══╝    ██╔════╝██╔══██╗██╔════╝██╔══██╗██║╚══██╔══╝██╗    ██╔════╝██║    ██║██╔═══██╗██║ ██╔╝██║  ██║██║   ██║██╔════╝ ╚══███╔╝    ██╔═══██╗████╗  ██║    ██╔════╝╚══██╔══╝██╔══██╗██╔════╝██║ ██╔╝██╔═══██╗██║   ██║██╔════╝██╔══██╗██╔════╝██║     ██╔═══██╗██║    ██║          \n" +
                    "██████╔╝██║   ██║██║     █████╔╝ █████╗     ██║       ███████║██████╔╝   ██║       ██║     ██████╔╝█████╗  ██║  ██║██║   ██║   ╚═╝    █████╗  ██║ █╗ ██║██║   ██║█████╔╝ ███████║██║   ██║██║  ███╗  ███╔╝     ██║   ██║██╔██╗ ██║    ███████╗   ██║   ███████║██║     █████╔╝ ██║   ██║██║   ██║█████╗  ██████╔╝█████╗  ██║     ██║   ██║██║ █╗ ██║          \n" +
                    "██╔══██╗██║   ██║██║     ██╔═██╗ ██╔══╝     ██║       ██╔══██║██╔══██╗   ██║       ██║     ██╔══██╗██╔══╝  ██║  ██║██║   ██║   ██╗    ██╔══╝  ██║███╗██║██║   ██║██╔═██╗ ██╔══██║██║   ██║██║   ██║ ███╔╝      ██║   ██║██║╚██╗██║    ╚════██║   ██║   ██╔══██║██║     ██╔═██╗ ██║   ██║╚██╗ ██╔╝██╔══╝  ██╔══██╗██╔══╝  ██║     ██║   ██║██║███╗██║          \n" +
                    "██║  ██║╚██████╔╝╚██████╗██║  ██╗███████╗   ██║       ██║  ██║██║  ██║   ██║       ╚██████╗██║  ██║███████╗██████╔╝██║   ██║   ╚═╝    ███████╗╚███╔███╔╝╚██████╔╝██║  ██╗██║  ██║╚██████╔╝╚██████╔╝███████╗    ╚██████╔╝██║ ╚████║    ███████║   ██║   ██║  ██║╚██████╗██║  ██╗╚██████╔╝ ╚████╔╝ ███████╗██║  ██║██║     ███████╗╚██████╔╝╚███╔███╔╝          \n" +
                    "╚═╝  ╚═╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝╚══════╝   ╚═╝       ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝        ╚═════╝╚═╝  ╚═╝╚══════╝╚═════╝ ╚═╝   ╚═╝          ╚══════╝ ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚══════╝     ╚═════╝ ╚═╝  ╚═══╝    ╚══════╝   ╚═╝   ╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝ ╚═════╝   ╚═══╝  ╚══════╝╚═╝  ╚═╝╚═╝     ╚══════╝ ╚═════╝  ╚══╝╚══╝           \n" +
                    "                                                                                                                                                                                                                                                                                                                                                              \n" +
                    "                                                                                                                                                                                                                                                                                                                                                              \n" +
                    "                                                                                                                                                                                                                                                                                                                                                              \n" +
                    "                                                                                                                                                                                                                                                                                                                                                              \n" +
                    "                                                                                                                                                                                                                                                                                                                                                              \n" +
                    "                                                                                                                                                                                                                                                                                                                                                              \n" +
                    "                                                                                                                                                                                                                                                                                                                                                              \n" +
                    "                                                                                                                                                                                                                                                                                                                                                              \n" +
                    "██████╗  ██████╗  ██████╗██╗  ██╗███████╗████████╗     █████╗ ██████╗ ████████╗     ██████╗ ██████╗ ██████╗ ███████╗       ████████╗██╗  ██╗ ██████╗ ███╗   ███╗ █████╗ ███████╗    ███████╗ ██████╗ ██╗    ██╗██╗                                                                                                                                            \n" +
                    "██╔══██╗██╔═══██╗██╔════╝██║ ██╔╝██╔════╝╚══██╔══╝    ██╔══██╗██╔══██╗╚══██╔══╝    ██╔════╝██╔═══██╗██╔══██╗██╔════╝██╗    ╚══██╔══╝██║  ██║██╔═══██╗████╗ ████║██╔══██╗██╔════╝    ██╔════╝██╔═══██╗██║    ██║██║                                                                                                                                            \n" +
                    "██████╔╝██║   ██║██║     █████╔╝ █████╗     ██║       ███████║██████╔╝   ██║       ██║     ██║   ██║██║  ██║█████╗  ╚═╝       ██║   ███████║██║   ██║██╔████╔██║███████║███████╗    █████╗  ██║   ██║██║ █╗ ██║██║                                                                                                                                            \n" +
                    "██╔══██╗██║   ██║██║     ██╔═██╗ ██╔══╝     ██║       ██╔══██║██╔══██╗   ██║       ██║     ██║   ██║██║  ██║██╔══╝  ██╗       ██║   ██╔══██║██║   ██║██║╚██╔╝██║██╔══██║╚════██║    ██╔══╝  ██║   ██║██║███╗██║██║                                                                                                                                            \n" +
                    "██║  ██║╚██████╔╝╚██████╗██║  ██╗███████╗   ██║       ██║  ██║██║  ██║   ██║       ╚██████╗╚██████╔╝██████╔╝███████╗╚═╝       ██║   ██║  ██║╚██████╔╝██║ ╚═╝ ██║██║  ██║███████║    ██║     ╚██████╔╝╚███╔███╔╝███████╗                                                                                                                                       \n" +
                    "╚═╝  ╚═╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝╚══════╝   ╚═╝       ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝        ╚═════╝ ╚═════╝ ╚═════╝ ╚══════╝          ╚═╝   ╚═╝  ╚═╝ ╚═════╝ ╚═╝     ╚═╝╚═╝  ╚═╝╚══════╝    ╚═╝      ╚═════╝  ╚══╝╚══╝ ╚══════╝                                                                                                                                       \n" +
                    "                                                                                                                                                                                                                                                                                                                                                              \n" +
                    "                                                                                                                                                                                                                                                                                                                                                              \n" +
                    "                                                                                                                                                                                                                                                                                                                                                              \n" +
                    "                                                                                                                                                                                                                                                                                                                                                              \n" +
                    "                                                                                                                                                                                                                                                                                                                                                              \n" +
                    "                                                                                                                                                                                                                                                                                                                                                              \n" +
                    "                                                                                                                                                                                                                                                                                                                                                              \n" +
                    "                                                                                                                                                                                                                                                                                                                                                              \n" +
                    " █████╗ ███████╗ ██████╗██╗██╗    ██████╗  █████╗ ███╗   ██╗███╗   ██╗███████╗██████╗ ███████╗       ███████╗██╗ ██████╗ ██╗     ███████╗████████╗                                                                                                                                                                                                            \n" +
                    "██╔══██╗██╔════╝██╔════╝██║██║    ██╔══██╗██╔══██╗████╗  ██║████╗  ██║██╔════╝██╔══██╗██╔════╝██╗    ██╔════╝██║██╔════╝ ██║     ██╔════╝╚══██╔══╝                                                                                                                                                                                                            \n" +
                    "███████║███████╗██║     ██║██║    ██████╔╝███████║██╔██╗ ██║██╔██╗ ██║█████╗  ██████╔╝███████╗╚═╝    █████╗  ██║██║  ███╗██║     █████╗     ██║                                                                                                                                                                                                               \n" +
                    "██╔══██║╚════██║██║     ██║██║    ██╔══██╗██╔══██║██║╚██╗██║██║╚██╗██║██╔══╝  ██╔══██╗╚════██║██╗    ██╔══╝  ██║██║   ██║██║     ██╔══╝     ██║                                                                                                                                                                                                               \n" +
                    "██║  ██║███████║╚██████╗██║██║    ██████╔╝██║  ██║██║ ╚████║██║ ╚████║███████╗██║  ██║███████║╚═╝    ██║     ██║╚██████╔╝███████╗███████╗   ██║                                                                                                                                                                                                               \n" +
                    "╚═╝  ╚═╝╚══════╝ ╚═════╝╚═╝╚═╝    ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═══╝╚══════╝╚═╝  ╚═╝╚══════╝       ╚═╝     ╚═╝ ╚═════╝ ╚══════╝╚══════╝   ╚═╝      http://www.figlet.org/figlet-man.html");
        }

}
