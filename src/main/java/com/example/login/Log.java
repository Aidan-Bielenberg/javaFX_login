package com.example.login;

import java.io.CharArrayWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Log {
    static ArrayList<String> logFile = new ArrayList<String>();


    public static void AppendToLog(String toLog) {
        try{
            logFile.add(toLog);
            PrintStream logOut = new PrintStream(new File("log.txt"));
            logOut.println(logFile);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void Dump() {
        System.out.println(logFile.toString());
    }
}
