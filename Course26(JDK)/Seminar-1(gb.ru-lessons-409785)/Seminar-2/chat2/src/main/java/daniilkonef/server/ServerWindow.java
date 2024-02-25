package daniilkonef.server;

import daniilkonef.client.ClientWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ServerWindow extends JFrame {
    public static final int WIDTH =  400;
    public static final int HEIGHT =  300;
    public static final String LOG_PATH = "src/main/java/daniilkonef/server/log.txt";

    private List<ClientWindow> clientWindowList;
    private JButton buttonStart,buttonStop;
    private JTextArea logTextArea;
    private boolean serverIsWorking;

    public ServerWindow() {
        clientWindowList = new ArrayList<>();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH,HEIGHT);
        setResizable(false);
        setTitle("Chat2 - Server");
        setLocationRelativeTo(null);
        createPanel();
        
    }

    private void createPanel() {
        logTextArea = new JTextArea();
        add(logTextArea);
        add(createButtons(),BorderLayout.SOUTH);
    }

    private Component createButtons() {
        JPanel panel = new JPanel(new GridLayout(1,2));
        buttonStart = new JButton("Start");
        buttonStop = new JButton("Stop");

        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (serverIsWorking) logTextArea.append("Сервер работает уже давно"+"\n\r");
                else {
                    serverIsWorking = true;
                    logTextArea.append("Вы стартовали сервер только что");
                }

            }
        });

        buttonStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!serverIsWorking) logTextArea.append("Server is stopped already"+"\n\r");
                else {
                    serverIsWorking = false;
                    while (!clientWindowList.isEmpty()){
                        doDisconnectUser(clientWindowList.get(clientWindowList.size()-1));
                    }
                    logTextArea.append("Server stopped now successful");
                }
            }
        });
        panel.add(buttonStart);
        panel.add(buttonStop);
        return panel;
    }

    private void doDisconnectUser(ClientWindow clientWindow) {
        clientWindowList.remove(clientWindow);
        if(clientWindow!=null) clientWindow.doDisconnectFromServer();
    }

}
