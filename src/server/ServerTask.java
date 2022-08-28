package server;

import java.io.*;
import java.net.Socket;

import static service.impl.ITaskFileCreatorImpl.*;

public class ServerTask implements Runnable {

    public static final String BASE_FOLDER = "tasksList";
    public static final String PATH = BASE_FOLDER + File.separator+ "tasks"+ File.separator+"listOfTasks.tasks";
    private final Socket socket;


    public ServerTask(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            PrintStream dataOut = new PrintStream(socket.getOutputStream());
            BufferedReader dataIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String line;
            while ((line = dataIn.readLine()) != null) {
                dataOut.println(line);
                writeToFile(line,PATH);
                writeToFile(line, createFileWithTask(convertToTask(line)));
                System.out.println("done");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

