
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PrincipalPanel extends TelaPanel {
    public PrincipalPanel(JPanel telas, JFrame janela){
        super(telas,janela);
        JLabel mensagem = new JLabel("Conteudo de Principal Panel");
        JButton botao = new JButton("Voltar");
        botao.addActionListener(this);

        this.add(botao);
        this.add(mensagem);
    }

    public void executarBotao(ActionEvent e){
        trocaTela("Tela Login");
    }
}