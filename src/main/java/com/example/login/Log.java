package com.example.login;

import java.io.CharArrayWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Log {
    static ArrayList<String> logFile = new ArrayList<String>();


    public static void AppendToLog(String toLog) {
        logFile.add(toLog);
    }

    public static void Dump() {
        System.out.println(logFile.toString());
    }
}
