package no.nibrobb;

import java.util.StringJoiner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    // scope: 0-9 a-f
    static char scope[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void main(String[] args) {
        System.out.println("This program will generate random IPv6-addresses");

        printIPv6Address(4);
    }

    public static String[] generateIPv6Address(){
        String randAddress[] = {"", "", "", "", "", "", "", ""};

        for (int i = 0; i < randAddress.length; i++) {
            for(int j = 0; j < 4; j++){
                randAddress[i] = randAddress[i] + scope[ThreadLocalRandom.current().nextInt(0, 15 + 1)];
            }
        }
        return randAddress;
    }

    /**
     * This method prints IPv6-addresses
     * @param nOfAddresses The amount of lines of IPv6-addresses to print
     */
    public static void printIPv6Address(int nOfAddresses){
        StringJoiner joiner;
        for(int j = 0; j < nOfAddresses; j++) {
            joiner = new StringJoiner(":");
            for (int i = 0; i < generateIPv6Address().length; i++) {
                joiner.add(generateIPv6Address()[i]);
            }
            System.out.println(joiner.toString());
        }
    }
}


//--------------------NOTES--------------------//
 /*
        for (int i = 0; i < mordi.length; i++) {
            IPv6Address += mordi[i];
        }*/

//print 10 new blank lines
//IntStream.range(0, 10).forEach(i -> System.out.println());



// System.out.printf("");
// Print 1234:1234:1423::::9001:dead
//"{}:{}:{}:{}:{}:{}:{}:{}"