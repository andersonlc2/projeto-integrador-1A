package projeto;

// Importações de módulos que vamos ultilizar.
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

// Nossa classe principal que é extendida da classe JFrame.
public class Principal extends JFrame {

    JPanel background;
    JPanel localImage;
    JLabel image;
    JLabel nome;
    JPanel botoes;
    JButton diagnostico;
    JButton princSintomas;
    JButton prevensao;
    JSeparator linha;
    JLabel info;

    // Variaveis e contantes auxliares.
    public static String IMAGECORONA = "\\images\\coronavirus.png";
    public static String SETA_ICON = "\\images\\homeIcon.jpg";
    public static Color PRIMARIA = new Color(74, 95, 127);

    // Método construtor
    public Principal(){
        inicialize(); // Chama a função que inicializa os componentes.
        setLocationRelativeTo(null); // Nossa janela é aberta no centro da tela.
        setVisible(true); // Deixa a janela visivel.
        setTitle("CovidTest"); // Coloca um texto na nossa Janela.
        setResizable(false); // Trava o tamanho da nossa Janela.
    }

    // Método responsável por criar nossos componentes na tela.
    private void inicialize(){

        // Componentes.
        background = new JPanel(); // Painel principal.
        localImage = new JPanel(); // Painel principal superior (imagem).
        image = new JLabel(); // Imagem background.
        nome = new JLabel(); // Nome do aplicativo.
        botoes = new JPanel(); // Container para todos os botões.
        diagnostico = new JButton(); // Leva para tela de diagnóstico.
        princSintomas = new JButton(); // Leva para tela de principáis sintomas.
        prevensao = new JButton(); // Leva para tela de prevensao.
        linha = new JSeparator(); // Linha do fim da tela.
        info = new JLabel(); // Informações no final da tela.


        // Personalização dos componentes.
        background.setBackground(new Color(255,255,255));

        image.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(IMAGECORONA))));

        nome.setText("<html>TEST<small>©</small>19</html>");
        nome.setFont(new Font("Ebrima",1,56));

        botoes.setBackground(new Color(255,255,255));

        diagnostico.setText("DIAGNOSTICO");
        diagnostico.setFont(new Font("Roboto",0, 14));
        diagnostico.setForeground(PRIMARIA);
        diagnostico.setBackground(new Color(255,255,255));
        diagnostico.setBorder(BorderFactory.createEmptyBorder());
        diagnostico.setFocusable(false);
        diagnostico.setCursor(new Cursor(Cursor.HAND_CURSOR));

        princSintomas.setText("SINTOMAS");
        princSintomas.setFont(new Font("Roboto",0, 14));
        princSintomas.setForeground(PRIMARIA);
        princSintomas.setBackground(new Color(255,255,255));
        princSintomas.setBorder(BorderFactory.createEmptyBorder());
        princSintomas.setFocusable(false);
        princSintomas.setCursor(new Cursor(Cursor.HAND_CURSOR));

        prevensao.setText("PREVENCAO");
        prevensao.setFont(new Font("Roboto",0, 14));
        prevensao.setForeground(PRIMARIA);
        prevensao.setBackground(new Color(255,255,255));
        prevensao.setBorder(BorderFactory.createEmptyBorder());
        prevensao.setFocusable(false);
        prevensao.setCursor(new Cursor(Cursor.HAND_CURSOR));

        info.setText("PUC Goias - ADS - Anderson Correia");
        info.setForeground(PRIMARIA);
        info.setFont(new Font("Roboto",0,10));
        info.setHorizontalAlignment(SwingConstants.CENTER);


        // Eventos.
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        diagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnosticoAction(evt);
            }
        });
        princSintomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sintomasAction(evt);
            }
        });
        prevensao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevensaoAction(evt);
            }
        });

        // Layouts.
        // Janela principal.
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

        // Background.
        GroupLayout backgroundLayout = new GroupLayout(background);
        background.setLayout(backgroundLayout);
        // H
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(localImage, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createSequentialGroup()
                    .addGap(30,30,30)
                    .addComponent(botoes, 250,250, 250)
                )
                .addComponent(linha, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                .addComponent(info, GroupLayout.PREFERRED_SIZE, 780, Short.MAX_VALUE)
        );

        // V
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(backgroundLayout.createSequentialGroup()
                    .addComponent(localImage, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                    .addGap(0,100,100)
                    .addComponent(botoes, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                    .addGap(0,55,55)
                    .addComponent(linha, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                    .addGap(5)
                    .addComponent(info, GroupLayout.PREFERRED_SIZE, 10, Short.MAX_VALUE)
                    .addGap(5)
                )
        );

        // Superior (image).
        GroupLayout localImageLayout = new GroupLayout(localImage);
        localImage.setLayout(localImageLayout);
        // H
        localImageLayout.setHorizontalGroup(
            localImageLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(localImageLayout.createSequentialGroup()
                    .addGap(500,500,500)
                    .addComponent(nome, GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
                )
                .addComponent(image, GroupLayout.PREFERRED_SIZE, 800, Short.MAX_VALUE)
        );
        // V
        localImageLayout.setVerticalGroup(
            localImageLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(nome, GroupLayout.PREFERRED_SIZE, 100, Short.MAX_VALUE)
                .addComponent(image, GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)

        );

        // Layout botoes.
        GroupLayout botoesLayout = new GroupLayout(botoes);
        botoes.setLayout(botoesLayout);
        // H
        botoesLayout.setHorizontalGroup(
            botoesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(diagnostico, 250,250,250)
                .addComponent(princSintomas, 250,250, 250)
                .addComponent(prevensao, 250,250, 250)
        );
        // V
        botoesLayout.setVerticalGroup(
            botoesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(botoesLayout.createSequentialGroup()
                    .addComponent(diagnostico, 50,50,50)
                    .addGap(10,10,10)
                    .addComponent(princSintomas, 50,50,50)
                    .addGap(10,10,10)
                    .addComponent(prevensao, 50,50,50)
                )
        );


        pack(); // Redimensiona a tela.
    }

    private void diagnosticoAction(java.awt.event.ActionEvent evt){
        Point n = this.getLocation(); // Localiza a posição da janela na tela.
        Diagnostico diag = new Diagnostico(); // Chama nossa classe Diagnostico.
        diag.setLocation(n); // Define que ela sera aberta exatamente onde a tela inicial foi fechada.
        diag.setVisible(true); // Deixa ela visível.
        this.dispose(); // Fecha a janela atual.
    }
    private void sintomasAction(java.awt.event.ActionEvent evt){
        Point n = this.getLocation(); // Localiza a posição da janela na tela.
        Sintomas sint = new Sintomas(); // Chama nossa classe Sintomas.
        sint.setLocation(n); // Define que ela sera aberta exatamente onde a tela inicial foi fechada.
        sint.setVisible(true); // Deixa ela visível.
        this.dispose(); // Fecha a janela atual.
    }
    private void prevensaoAction(java.awt.event.ActionEvent evt){
        Point n = this.getLocation(); // Localiza a posição da janela na tela.
        Prevencao prev = new Prevencao(); // Chama nossa classe Sintomas.
        prev.setLocation(n); // Define que ela sera aberta exatamente onde a tela inicial foi fechada.
        prev.setVisible(true); // Deixa ela visível.
        this.dispose(); // Fecha a janela atual.
    }

    // Método inicial ao rodar nosso programa.
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal();
            }
        });
    }
}
