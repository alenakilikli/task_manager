package server;

import entity.Task;
import service.ITasksListMaker;
import service.impl.ITasksListMakerImpl;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    private final static int SERVER_PORT = 3000;

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(SERVER_PORT);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Task>list = new ArrayList<>();
        ITasksListMaker tl = new ITasksListMakerImpl();
        //tl.putTaskToTheList();

        while (true) {
            Socket socket = serverSocket.accept();
            Runnable serverTask = new ServerTask(socket);
            executorService.execute(serverTask);
        }


    }

}
