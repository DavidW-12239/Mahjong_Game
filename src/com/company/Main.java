package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String character11 = "character11", character12 = "character12", character13 = "character13", character14 = "character14",
                character21 = "character21", character22 = "character22", character23 = "character23", character24 = "character24",
                character31 = "character31", character32 = "character32", character33 = "character33", character34 = "character34",
                character41 = "character41", character42 = "character42", character43 = "character43", character44 = "character44",
                character51 = "character51", character52 = "character52", character53 = "character53", character54 = "character54",
                character61 = "character61", character62 = "character62", character63 = "character63", character64 = "character64",
                character71 = "character71", character72 = "character72", character73 = "character73", character74 = "character74",
                character81 = "character81", character82 = "character82", character83 = "character83", character84 = "character84",
                character91 = "character91", character92 = "character92", character93 = "character93", character94 = "character94",
                bamboo11 = "bamboo11", bamboo12 = "bamboo12", bamboo13 = "bamboo13", bamboo14 = "bamboo14",
                bamboo21 = "bamboo21", bamboo22 = "bamboo22", bamboo23 = "bamboo23", bamboo24 = "bamboo24",
                bamboo31 = "bamboo31", bamboo32 = "bamboo32", bamboo33 = "bamboo33", bamboo34 = "bamboo34",
                bamboo41 = "bamboo41", bamboo42 = "bamboo42", bamboo43 = "bamboo43", bamboo44 = "bamboo44",
                bamboo51 = "bamboo51", bamboo52 = "bamboo52", bamboo53 = "bamboo53", bamboo54 = "bamboo54",
                bamboo61 = "bamboo61", bamboo62 = "bamboo62", bamboo63 = "bamboo63", bamboo64 = "bamboo64",
                bamboo71 = "bamboo71", bamboo72 = "bamboo72", bamboo73 = "bamboo73", bamboo74 = "bamboo74",
                bamboo81 = "bamboo81", bamboo82 = "bamboo82", bamboo83 = "bamboo83", bamboo84 = "bamboo84",
                bamboo91 = "bamboo91", bamboo92 = "bamboo92", bamboo93 = "bamboo93", bamboo94 = "bamboo94",
                dot11 = "dot11", dot12 = "dot12", dot13 = "dot13", dot14 = "dot14",
                dot21 = "dot21", dot22 = "dot22", dot23 = "dot23", dot24 = "dot24",
                dot31 = "dot31", dot32 = "dot32", dot33 = "dot33", dot34 = "dot34",
                dot41 = "dot41", dot42 = "dot42", dot43 = "dot43", dot44 = "dot44",
                dot51 = "dot51", dot52 = "dot52", dot53 = "dot53", dot54 = "dot54",
                dot61 = "dot61", dot62 = "dot62", dot63 = "dot63", dot64 = "dot64",
                dot71 = "dot71", dot72 = "dot72", dot73 = "dot73", dot74 = "dot74",
                dot81 = "dot81", dot82 = "dot82", dot83 = "dot83", dot84 = "dot84",
                dot91 = "dot91", dot92 = "dot92", dot93 = "dot93", dot94 = "dot94",
                east1 = "east1", east2 = "east2", east3 = "east3", east4 = "east4",
                south1 = "south1", south2 = "south2", south3 = "south3", south4 = "south4",
                west1 = "west1", west2 = "west2", west3 = "west3", west4 = "west4",
                north1 = "north1", north2 = "north2", north3 = "north3", north4 = "north4",
                red1 = "red1", red2 = "red2", red3 = "red3", red4 = "red4",
                green1 = "green1", green2 = "green2", green3 = "green3", green4 = "green4",
                white1 = "white1", white2 = "white2", white3 = "white3", white4 = "white4";

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put(character11, 11); map.put(character12, 11); map.put(character13, 11); map.put(character14, 11);
        map.put(character21, 12); map.put(character22, 12); map.put(character23, 12); map.put(character24, 12);
        map.put(character31, 13); map.put(character32, 13); map.put(character33, 13); map.put(character34, 13);
        map.put(character41, 14); map.put(character42, 14); map.put(character43, 14); map.put(character44, 14);
        map.put(character51, 15); map.put(character52, 15); map.put(character53, 15); map.put(character54, 15);
        map.put(character61, 16); map.put(character62, 16); map.put(character63, 16); map.put(character64, 16);
        map.put(character71, 17); map.put(character72, 17); map.put(character73, 17); map.put(character74, 17);
        map.put(character81, 18); map.put(character82, 18); map.put(character83, 18); map.put(character84, 18);
        map.put(character91, 19); map.put(character92, 19); map.put(character93, 19); map.put(character94, 19);

        map.put(bamboo11, 21); map.put(bamboo12, 21); map.put(bamboo13, 21); map.put(bamboo14, 21);
        map.put(bamboo21, 22); map.put(bamboo22, 22); map.put(bamboo23, 22); map.put(bamboo24, 22);
        map.put(bamboo31, 23); map.put(bamboo32, 23); map.put(bamboo33, 23); map.put(bamboo34, 23);
        map.put(bamboo41, 24); map.put(bamboo42, 24); map.put(bamboo43, 24); map.put(bamboo44, 24);
        map.put(bamboo51, 25); map.put(bamboo52, 25); map.put(bamboo53, 25); map.put(bamboo54, 25);
        map.put(bamboo61, 26); map.put(bamboo62, 26); map.put(bamboo63, 26); map.put(bamboo64, 26);
        map.put(bamboo71, 27); map.put(bamboo72, 27); map.put(bamboo73, 27); map.put(bamboo74, 27);
        map.put(bamboo81, 28); map.put(bamboo82, 28); map.put(bamboo83, 28); map.put(bamboo84, 28);
        map.put(bamboo91, 29); map.put(bamboo92, 29); map.put(bamboo93, 29); map.put(bamboo94, 29);

        map.put(dot11, 31); map.put(dot12, 31); map.put(dot13, 31); map.put(dot14, 31);
        map.put(dot21, 32); map.put(dot22, 32); map.put(dot23, 32); map.put(dot24, 32);
        map.put(dot31, 33); map.put(dot32, 33); map.put(dot33, 33); map.put(dot34, 33);
        map.put(dot41, 34); map.put(dot42, 34); map.put(dot43, 34); map.put(dot44, 34);
        map.put(dot51, 35); map.put(dot52, 35); map.put(dot53, 35); map.put(dot54, 35);
        map.put(dot61, 36); map.put(dot62, 36); map.put(dot63, 36); map.put(dot64, 36);
        map.put(dot71, 37); map.put(dot72, 37); map.put(dot73, 37); map.put(dot74, 37);
        map.put(dot81, 38); map.put(dot82, 38); map.put(dot83, 38); map.put(dot84, 38);
        map.put(dot91, 39); map.put(dot92, 39); map.put(dot93, 39); map.put(dot94, 39);

        map.put(east1, 4); map.put(east2, 4); map.put(east3, 4); map.put(east4, 4);
        map.put(south1, 5); map.put(south2, 5); map.put(south3, 5); map.put(south4, 5);
        map.put(west1, 6); map.put(west2, 6); map.put(west3, 6); map.put(west4, 6);
        map.put(north1, 7); map.put(north2, 7); map.put(north3, 7); map.put(north4, 7);
        map.put(red1, 8); map.put(red2, 8); map.put(red3, 8); map.put(red4, 8);
        map.put(green1, 9); map.put(green2, 9); map.put(green3, 9); map.put(green4, 9);
        map.put(white1, 10); map.put(white2, 10); map.put(white3, 10); map.put(white4, 10);

        List remainCards = new ArrayList<>(Arrays.asList(
                character11, character12, character13, character14,
                character21, character22, character23, character24,
                character31, character32, character33, character34,
                character41, character42, character43, character44,
                character51, character52, character53, character54,
                character61, character62, character63, character64,
                character71, character72, character73, character74,
                character81, character82, character83, character84,
                character91, character92, character93, character94,
                bamboo11, bamboo12, bamboo13, bamboo14, bamboo21, bamboo22, bamboo23, bamboo24,
                bamboo31, bamboo32, bamboo33, bamboo34, bamboo41, bamboo42, bamboo43, bamboo44,
                bamboo51, bamboo52, bamboo53, bamboo54, bamboo61, bamboo62, bamboo63, bamboo64,
                bamboo71, bamboo72, bamboo73, bamboo74, bamboo81, bamboo82, bamboo83, bamboo84,
                bamboo91, bamboo92, bamboo93, bamboo94,
                dot11, dot12, dot13, dot14, dot21, dot22, dot23, dot24, dot31, dot32, dot33, dot34,
                dot41, dot42, dot43, dot44, dot51, dot52, dot53, dot54, dot61, dot62, dot63, dot64,
                dot71, dot72, dot73, dot74, dot81, dot82, dot83, dot84, dot91, dot92, dot93, dot94,
                east1, east2, east3, east4, south1, south2, south3, south4,
                west1, west2, west3, west4, north1, north2, north3, north4,
                red1, red2, red3, red4, green1, green2, green3, green4, white1, white2, white3, white4
        ));

        List eUserCards = new ArrayList<>();
        List sUserCards = new ArrayList<>();
        List wUserCards = new ArrayList<>();
        List nUserCards = new ArrayList<>();
        List eUserFoldCards = new ArrayList<>();
        List sUserFoldCards = new ArrayList<>();
        List wUserFoldCards = new ArrayList<>();
        List nUserFoldCards = new ArrayList<>();

        int max = 134;
        int num = 0;
        String card = "";


        for (int i=0; i<13; i++) {
            num = (int)(Math.random()*(max +1));
            card = (String) remainCards.get(num);
            remainCards.remove(card);
            eUserCards.add(card);
            max -= 1;

            num = (int)(Math.random()*(max +1));
            card = (String) remainCards.get(num);
            remainCards.remove(card);
            sUserCards.add(card);
            max -= 1;

            num = (int)(Math.random()*(max +1));
            card = (String) remainCards.get(num);
            remainCards.remove(card);
            wUserCards.add(card);
            max -= 1;

            num = (int)(Math.random()*(max +1));
            card = (String) remainCards.get(num);
            remainCards.remove(card);
            nUserCards.add(card);
            max -= 1;
        }
        System.out.println("eUserCards: " + eUserCards);
        System.out.println("sUserCards: " + sUserCards);
        System.out.println("wUserCards: " + wUserCards);
        System.out.println("nUserCards: " + nUserCards);
        System.out.println(" ");

        boolean checkWin = false;
        while (!checkWin && remainCards.size() > 0){
            num = (int)(Math.random()*(max +1));
            drawAndFold(eUserCards, eUserFoldCards, remainCards, num, map);
            max -= 1;

            num = (int)(Math.random()*(max +1));
            drawAndFold(sUserCards, sUserFoldCards, remainCards, num, map);
            max -= 1;

            num = (int)(Math.random()*(max +1));
            drawAndFold(wUserCards, wUserFoldCards, remainCards, num, map);
            max -= 1;

            num = (int)(Math.random()*(max +1));
            drawAndFold(nUserCards, nUserFoldCards, remainCards, num, map);
            max -= 1;
        }
    }

    public static void drawAndFold(List userCards, List userFoldCards, List remainCards, int num, HashMap map){
        String card = (String) remainCards.get(num);
        remainCards.remove(card);
        userCards.add(card);
        System.out.println("Your hand: " + userCards);
        if (checkWin(userCards, map) == true){
            System.out.println("Congratulations, You have won the game!");
        }
        else{
            boolean checkCard = false;
            while (!checkCard){
                System.out.println("Which card do you want to fold?");
                Scanner input = new Scanner(System.in);
                card = input.next();
                if (userCards.contains(card)){
                    checkCard = true;
                    userCards.remove(card);
                    userFoldCards.add(card);
                    System.out.println("Fold successfully!");
                    System.out.println("Your current card: " + userCards);
                }
                else{
                    System.out.println("No such card, please select again");
                }
            }
        }
    }

    public static boolean checkWin(List userCards, HashMap map){
        int[] cards = new int[14];
        int index = 0;
        for (Object card : userCards){
            int cardNum = (int) map.get(card);
            cards[index] = cardNum;
            index++;
        }
        Arrays.sort(cards);
        for(int card:cards)
            System.out.print(card + ", ");
        System.out.println();

        //Check Triplet
        int count = 0;
        for(int i=0; i<cards.length-2; i++){
            if (cards[i] == cards[i+1] && cards[i+1] == cards[i+2]){
                System.out.println("Pair!");
            }
        }
















        return false;
    }
}
