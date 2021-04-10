package projeto;

// Imposts
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

// Classe principal que vai exibir os principais sintomas. Extentida da classe JFrame.
public class Sintomas extends JFrame {

    JPanel background;
    JPanel backgroundDois;
    JLabel borda;
    JLabel imageSintomas;
    JLabel voltar;

    // Método construtor.
    public Sintomas(){
        inicialize(); // Chama a função que inicializa os componentes.
        setTitle("CovidTest - Sintomas"); // Coloca um texto na nossa Janela.
        setResizable(false); // Trava o tamanho da nossa Janela.
    }

    // Método que inicializa todos os componentes.
    public void inicialize(){

        background = new JPanel();
        backgroundDois = new JPanel(); // Um segundo painel.
        borda = new JLabel(); // Borda da tela.
        imageSintomas = new JLabel();
        voltar = new JLabel();


        // Personalização
        background.setBackground(new Color(255, 255, 255));
        borda.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(Principal.IMAGECORONA))));
        backgroundDois.setBackground(new Color(255, 255, 255));

        imageSintomas.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("\\images\\sintomas.jpg"))));
        imageSintomas.setHorizontalAlignment(SwingConstants.CENTER);

        voltar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        voltar.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(Principal.SETA_ICON))));


        // Eventos
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        voltar.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                voltarMouseClick(e);
            }
        });


        // Layout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
            .addComponent(background, -1,-1,-1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
            .addComponent(background,-1,-1,-1)
        );

        // Layout background
        GroupLayout lbackground = new GroupLayout(background);
        background.setLayout(lbackground);
        // HORIZONTAL
        lbackground.setHorizontalGroup(
            lbackground.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(lbackground.createSequentialGroup()
                        .addGap(15)
                        .addComponent(voltar, -1,-1,-1)
                    )
                .addGroup(lbackground.createSequentialGroup()
                    .addGap(10)
                    .addGroup(lbackground.createParallelGroup()
                        .addComponent(backgroundDois, 780, 780,780)
                        .addGap(10)
                    )
                    .addGap(10)
                )
                .addComponent(borda, 800,800,800)
        );
        // VERTICAL
        lbackground.setVerticalGroup(
            lbackground.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(lbackground.createSequentialGroup()
                    .addGap(15)
                    .addComponent(voltar, -1, -1, -1)
                )
                .addGroup(lbackground.createSequentialGroup()
                    .addGap(10)
                    .addComponent(backgroundDois, 530,530, 530)
                    .addGap(10)
                )
                .addComponent(borda,550,550,550)
        );

        // Layout backgroundDois.
        GroupLayout limage = new GroupLayout(backgroundDois);
        backgroundDois.setLayout(limage);
        // HORIZONTAL
        limage.setHorizontalGroup(
            limage.createParallelGroup()
            .addComponent(imageSintomas, 780,780,780)
        );
        // VERTICAL
        limage.setVerticalGroup(
            limage.createParallelGroup()
            .addComponent(imageSintomas, 530,530,530)
        );


        pack();
    }

    public void voltarMouseClick(MouseEvent e){
        Point n = this.getLocation();
        Principal novaTela = new Principal();
        novaTela.setLocation(n);
        this.dispose();
        novaTela.setVisible(true);
    }

}