package com.techelevator.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class TELog {
    public static void log(String message){
        //create file object doesn't create new file
/*        File logFile = new File("/Users/agyhern/Desktop/Merit_America/REPO/Partner_ex/module-1-pair-programming-4/exercise/logs/search.log");
        //File outForAppending = new File();
        boolean checkIfExistToAppend = logFile.exists();
        //checkIfExistToAppend = false;

        // create scanner to read logs\search.log
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(logFile,checkIfExistToAppend))){
            writer.append(getDateTimeString()+ " ");
            writer.append(message);
            writer.append("/n");

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }*/

        File logFile = new File("exercise/logs/search.log");

        // create scanner to read logs\search.log
        try(PrintWriter writer = new PrintWriter(new FileOutputStream(logFile, true))){
            String timeStamp = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aa").format(Calendar.getInstance().getTime());
            writer.write(timeStamp + " " + message + "\n");
            writer.flush();

        }catch( FileNotFoundException e){
            System.out.println("*** Unable to open log file: " + logFile.getAbsolutePath());
        }
    }
    private static String getDateTimeString() {
        //get all the time info
        return null;
    }
}

