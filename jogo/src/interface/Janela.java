package  interface;

import javax.swing.JFrame;

import javax.swing.JPanel;

import java.awt.CardLayout;

import javax.swing.JFrame;

public class Janela extends JFrame{
    public Janela(){
        this.setBounds(0,0,1920,1080);
        CardLayout controleTela = new CardLayout();
        JPanel telas = new JPanel(controleTela);
        LoginPainel LoginPainel = new LoginPainel(telas, this);
        PrincipalPainel PrincipalPainel = new PrincipalPainel
        (telas, this);

        this.add(telas);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
        this.setVisible(true);
    }
}