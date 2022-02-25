package com.my.flyway;

public class FlywayChecksumTool {

    public static void main(String[] args) {

        if (args.length != 1) {
            printHelpAndExit();
        }

        if (args[0].equals("-h") || args[0].equals("--help")) {
            printHelpAndExit();
        }

        int checksum = LoadableResource.checksum(args[0]);
        System.out.printf(checksum+"");
    }

    private static void printHelpAndExit() {
        System.out.println("Usage: java -jar flyway-checksum-tool <path to file>");
        System.exit(0);
    }

}
