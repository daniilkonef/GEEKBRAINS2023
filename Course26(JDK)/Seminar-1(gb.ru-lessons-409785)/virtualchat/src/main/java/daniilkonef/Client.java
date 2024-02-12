package daniilkonef;

import javax.swing.*;
import java.awt.*;

public class Client extends JFrame{
    private static final int WIDTH =555;
    private static final int HEIGHT =555;
    private final JTextArea log = new JTextArea();
    private final JPanel panelAtTop = new JPanel(new GridLayout(2,3));
    private final JTextField IPaddress = new JTextField("127.0.0.1");
    private final JTextField IPport = new JTextField("8081");
    private final JTextField userLogin = new JTextField("DANIILKONEF");
    private final JPasswordField userPswrd = new JPasswordField("s6d5f1s56d1f");
    private final JButton buttonDoLogin = new JButton("do log in chat");


    private final JPanel panelAtBottom = new JPanel(new BorderLayout());
    private final JTextField message = new JTextField();
    private final JButton buttonDoSend = new JButton("do send message");


    public Client() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(WIDTH,HEIGHT);
        setResizable(false);
        setTitle("Client");

        panelAtTop.add(IPaddress);
        panelAtTop.add(IPport);
        panelAtTop.add(userLogin);
        panelAtTop.add(userPswrd);
        panelAtTop.add(buttonDoLogin);
        add(panelAtTop,BorderLayout.NORTH);

        panelAtBottom.add(message,BorderLayout.CENTER);
        panelAtBottom.add(buttonDoSend,BorderLayout.EAST);
        add(panelAtBottom,BorderLayout.SOUTH);

        log.setEditable(false);
        JScrollPane scrollOfLogField = new JScrollPane(log);
        add(scrollOfLogField);

        setVisible(true);
    }


}
