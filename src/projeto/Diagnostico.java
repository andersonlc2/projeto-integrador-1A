package projeto;

// Importações de módulos que vamos ultilizar.
import javax.swing.*;
import java.awt.*;
import java.util.Objects;


// Nossa classe é extendida da classe JFrame.
public class Diagnostico extends JFrame {

    JPanel background;
    JPanel backgroundDois;
    JLabel borda;
    Formulario formulario;
    Resultado result;
    JLabel voltar;

    // Método Construtor
    public Diagnostico(){
        inicialize(); // Chama a função que inicializa os componentes.
        setTitle("CovidTest - Diagnóstico"); // Coloca um texto na nossa Janela.
        setResizable(false); // Trava o tamanho da nossa Janela.
    }

    // Método responsável por criar nossos componentes na tela.
    private void inicialize(){

        // Componentes.
        background = new JPanel(); // Painel principal dessa tela.
        backgroundDois = new JPanel(); // Um segundo painel.
        borda = new JLabel(); // Borda da tela.
        formulario = new Formulario();
        result = new Resultado();
        voltar = new JLabel();


        // Personalização dos componentes.
        background.setBackground(new Color(255, 255, 255));
        borda.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(Principal.IMAGECORONA))));
        backgroundDois.setBackground(new Color(255, 255, 255));

        voltar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        voltar.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(Principal.SETA_ICON))));



        // Eventos.
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        formulario.enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarAction(evt);
            }
        });

        result.okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonAction(evt);
            }
        });

        voltar.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                voltarMouseClick(evt);
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
                    .addGroup(backgroundLayout.createSequentialGroup()
                            .addGap(15)
                            .addComponent(voltar, -1,-1,-1)
                    )
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(10)
                .addGroup(backgroundLayout.createParallelGroup()
                    .addComponent(formulario.parteSuperior, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
                    .addGap(10)
                    .addComponent(formulario.parteInferior, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
                )
                .addGap(10)
            )
            .addComponent(borda, 800,800,800)
        );
        // V
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                            .addGap(15)
                            .addComponent(voltar, -1,-1,-1)
                    )

            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(10)
                .addComponent(formulario.parteSuperior,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formulario.parteInferior,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10)
            )
            .addComponent(borda,550,550,550)
        );


        pack(); // Redimensiona a tela.
    }

    public void enviarAction(java.awt.event.ActionEvent evt){
        this.setEnabled(false);
        this.setFocusableWindowState(false);
        result.setLocationRelativeTo(this);

        result.setVisible(true);
        calcSintomas();
    }

    public void okButtonAction(java.awt.event.ActionEvent evt){
        result.dispose();

        Point n = this.getLocation();
        Principal novaTela = new Principal();
        novaTela.setLocation(n);
        this.dispose();
        novaTela.setVisible(true);

    }

    public void voltarMouseClick(java.awt.event.MouseEvent evt){
        Point n = this.getLocation();
        Principal novaTela = new Principal();
        novaTela.setLocation(n);
        this.dispose();
        novaTela.setVisible(true);

    }

    public void calcSintomas(){
        // Inicializa as variáveis locais.
        int covid, tuberculose, asma, rinite;
        String res = "";
        covid = 0;
        tuberculose = 0;
        asma = 0;
        rinite = 0;


        // Verifica cada JCheckbox(false ou true) e incrementa cada uma das nossas doenças.
        if (formulario.saudeSim.isSelected() || formulario.positivoSim.isSelected()) {
            covid++;
        }else {
            covid --;
        }
        if (formulario.obstNariz.isSelected()) {
            rinite++;
        }
        if (formulario.dorGarganta.isSelected()) {
            covid++;
        }
        if (formulario.tosse.isSelected()) {
            asma++;
            tuberculose++;
            covid++;
        }
        if (formulario.diarreia.isSelected()) {
            covid++;
        }
        if (formulario.faltaAr.isSelected()) {
            asma++;
            covid++;
        }
        if (formulario.chiadoPeito.isSelected()) {
            asma++;
        }
        if (formulario.febre.isSelected()) {
            tuberculose++;
            covid++;
        }
        if (formulario.tosseSangue.isSelected()) {
            tuberculose++;
        }
        if (formulario.dorCorpo.isSelected()) {
            covid++;
        }
        if (formulario.perdaPaladar.isSelected()) {
            covid++;
        }
        if (formulario.espirros.isSelected()) {
            rinite++;
        }
        if (formulario.cocNasal.isSelected()) {
            rinite++;
        }

        if (tuberculose > 1 && tuberculose >= covid && tuberculose > rinite && tuberculose > asma) {
            res = "há um indício de que possivelmente você esta com <strong>Tuberculose";
        } else if (rinite > 1 && rinite > tuberculose && rinite >= covid && rinite > asma) {
            res = "há um indício de que possivelmente você esta com <strong>Rinite";
        } else if (asma > 1 && asma > tuberculose && asma >= covid && asma > rinite) {
            res = "há um indício de que possivelmente você esta com <strong>Asma";
        } else if (covid > 1 && covid > tuberculose && covid > rinite && covid > asma) {
            res = "há um indício de que possivelmente você esta com <strong>Covid-19";
        } else {
            res = "<strong>nâo foi possível chegar a um diagnóstico";
        }

        result.txtResultado.setText("<html>" +
                "Se persistir os sintomas procure um médico para um diagnóstico e tratamento adequado. "+
                "Com sintomas informados "+res+"</strong>. " +
                "</html>");
    }

}

