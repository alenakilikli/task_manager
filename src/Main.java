import entity.Task;
import server.Server;
import server.ServerTask;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        ServerTask serverTask = new ServerTask(socket);
    }
}