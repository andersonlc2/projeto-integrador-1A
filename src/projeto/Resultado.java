package projeto;

// Importações de módulos que vamos ultilizar.
import javax.swing.*;
import java.awt.*;

// Classe que vai gerar o painel com o resultado, extendida da classe JFrame.
public class Resultado extends JFrame{

    JPanel background;
    JButton okButton;
    JLabel txtResultado;

    // Método construtor.
    public Resultado(){
        this.setResizable(false);

        inicialize();
    }

    // Classe que inicializa os componentes.
    private void inicialize(){

        // Inicialização dos componentes.
        background = new JPanel();
        okButton = new JButton();
        txtResultado = new JLabel();

        // Eventos.
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        // Personalização dos componentes.
        background.setBackground(new Color(255,255,255));

        txtResultado.setText("<html>" +
                "Os sintomas informados são um indício de que possívelmente você esta com <strong>tal doença</strong>. " +
                "Se persistir os sintomas procure um médico para um diagnóstico e tratamento adequado." +
                "</html>");
        txtResultado.setFont(new Font("Roboto", 0, 12));
        txtResultado.setForeground(Principal.PRIMARIA);

        okButton.setText("OK");
        okButton.setFont(new Font("Roboto",0, 12));
        okButton.setForeground(Principal.PRIMARIA);
        okButton.setBackground(new Color(194, 215, 255));
        okButton.setFocusable(false);
        okButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Laytout inicial
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(background, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(background, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

        );

        // Layout background
        GroupLayout lbackground = new GroupLayout(background);
        background.setLayout(lbackground);
        // HORIZONTAL
        lbackground.setHorizontalGroup(
            lbackground.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(lbackground.createSequentialGroup()
                        .addGap(40)
                        .addComponent(txtResultado, 260, 260, 260)
                        .addGap(40)
                )
                .addGroup(lbackground.createSequentialGroup()
                    .addGap(140)
                    .addComponent(okButton, 60, 60, 60)
                    .addGap(140)
                )
        );
        // VERTICAL
        lbackground.setVerticalGroup(
            lbackground.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(lbackground.createSequentialGroup()
                    .addGap(20)
                    .addComponent(txtResultado, 55, 55,55)
                    .addGap(20)
                    .addComponent(okButton, 20, 20, 20)
                    .addGap(20)
                )
        );

        pack();
    }
}
