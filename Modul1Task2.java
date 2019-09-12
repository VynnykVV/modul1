public class Modul1Task2 {


    public static void main(String[] args) {
        //out of bounds because of start position
        System.out.println(horseMove("m1", "a1"));
        //horse doesnt not move like this
        System.out.println(horseMove("a1", "b2"));
        System.out.println(horseMove("a1", "b8"));
        //horse CAN  move like this
        System.out.println(horseMove("a1", "b3"));

    }

    public static String horseMove(String start, String finish) {
        if (start == finish) {
            return "Horse didnt move";
        }

        // only vars like "a1" are expected
        if (start.length() != 2 || finish.length() != 2) {
            return "Wrong input, plz try again";
        }


        // parse input to get numbers
        int yStart = cast(start.charAt(0));
        int yEnd = cast(finish.charAt(0));

        int xStart = Integer.valueOf(start.charAt(1) + "");
        int xEnd = Integer.valueOf(finish.charAt(1) + "");


        // check if start/finish points are inside board
        if (yStart == -1 || yEnd == -1) {
            return "Out of bounds board";
        } else if (xStart < 1 || xStart > 8 || xEnd < 1 || xEnd > 8) {
            return "Out of bounds of the board";
        }
        //check all possible variants of horse movement

        if ((xStart + 2 == xEnd && yStart + 1 == yEnd) ||
                (xStart + 1 == xEnd && yStart + 2 == yEnd) ||
                (xStart - 1 == xEnd && yStart + 2 == yEnd) ||
                (xStart - 2 == xEnd && yStart + 1 == yEnd) ||
                (xStart - 2 == xEnd && yStart - 1 == yEnd) ||
                (xStart - 1 == xEnd && yStart - 2 == yEnd) ||
                (xStart + 1 == xEnd && yStart - 2 == yEnd) ||
                (xStart + 2 == xEnd && yStart - 1 == yEnd)) {
            return "Yes, horse can move like this";

        }
        return "Horse doesnt move like this";
    }

    public static int cast(char a) {
        switch (a) {
            case 'a':
                return 1;
            case 'b':
                return 2;
            case 'c':
                return 3;
            case 'd':
                return 4;
            case 'e':
                return 5;
            case 'f':
                return 6;
            case 'g':
                return 7;
            case 'h':
                return 8;
            default:
                return -1;
        }


    }


}
