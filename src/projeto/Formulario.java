package projeto;

// Importações de módulos que vamos ultilizar.
import javax.swing.*;
import java.awt.*;

// Classe que vai criar nosso formulário. Extende a classe JPanel.
public class Formulario extends JPanel {

    JPanel parteSuperior;
    JPanel parteInferior;
    JLabel tituloForm;
    JSeparator divForm;
    JLabel txtSaude;
    JLabel txtPositivo;
    JLabel infoSintomas;

    JCheckBox febre;
    JCheckBox tosse;
    JCheckBox chiadoPeito;
    JCheckBox espirros;
    JCheckBox dorGarganta;
    JCheckBox diarreia;
    JCheckBox dorCorpo;
    JCheckBox perdaPaladar;
    JCheckBox faltaAr;
    JCheckBox obstNariz;
    JCheckBox cocNasal;
    JCheckBox tosseSangue;

    ButtonGroup saude;
    JRadioButton saudeSim;
    JRadioButton saudeNao;

    ButtonGroup positivo;
    JRadioButton positivoSim;
    JRadioButton positivoNao;

    JButton enviar;

    // Método construtor.
    public Formulario() {
        inicialize();
        this.setVisible(true);
    }

    // Método responsável por criar nossos componentes na tela.
    private void inicialize(){

        parteSuperior = new JPanel();
        parteInferior = new JPanel();
        tituloForm = new JLabel();
        divForm = new JSeparator();
        txtSaude = new JLabel();
        txtPositivo = new JLabel();
        infoSintomas = new JLabel();
        febre = new JCheckBox();
        tosse = new JCheckBox();
        chiadoPeito = new JCheckBox();
        espirros = new JCheckBox();
        dorGarganta = new JCheckBox();
        diarreia = new JCheckBox();
        dorCorpo = new JCheckBox();
        perdaPaladar = new JCheckBox();
        faltaAr = new JCheckBox();
        obstNariz = new JCheckBox();
        cocNasal = new JCheckBox();
        tosseSangue = new JCheckBox();

        saude = new ButtonGroup();
        saudeSim = new JRadioButton();
        saudeNao = new JRadioButton();

        positivo = new ButtonGroup();
        positivoSim = new JRadioButton();
        positivoNao = new JRadioButton();

        enviar = new JButton();

        // Personalização dos componentes.

        parteSuperior.setBackground(new Color(255,255,255));
        parteInferior.setBackground(new Color(255,255,255));

        tituloForm.setText("Responda o questionário abaixo: ");
        tituloForm.setFont(new Font("Roboto", 0,14));
        tituloForm.setHorizontalAlignment(SwingConstants.CENTER);
        tituloForm.setForeground(Principal.PRIMARIA);

        txtSaude.setFont(new Font("Roboto",0,12));
        txtSaude.setForeground(Principal.PRIMARIA);
        txtSaude.setText("Mora com alguem que trabalha na área de saúde (médico, enfermeiro, auxiliar de enfermagem)?");

        txtPositivo.setFont(new Font("Roboto",0,12));
        txtPositivo.setForeground(Principal.PRIMARIA);
        txtPositivo.setText("Teve contato com alguem que testou positivo para Covido-19 recentemente?");

        infoSintomas.setFont(new Font("Roboto",0,12));
        infoSintomas.setForeground(Principal.PRIMARIA);
        infoSintomas.setText("Informa os sintomas abaixo: ");

        divForm.setBackground(Principal.PRIMARIA);

        febre.setText("Febre");
        febre.setForeground(Principal.PRIMARIA);
        febre.setFont(new Font("Roboto",0,12));
        febre.setFocusable(false);
        febre.setBackground(new Color(255,255,255));

        tosse.setText("Tosse seca");
        tosse.setForeground(Principal.PRIMARIA);
        tosse.setFont(new Font("Roboto",0,12));
        tosse.setFocusable(false);
        tosse.setBackground(new Color(255,255,255));

        chiadoPeito.setText("Chiado no peito");
        chiadoPeito.setForeground(Principal.PRIMARIA);
        chiadoPeito.setFont(new Font("Roboto",0,12));
        chiadoPeito.setFocusable(false);
        chiadoPeito.setBackground(new Color(255,255,255));

        espirros.setText("Espirros frequentes");
        espirros.setForeground(Principal.PRIMARIA);
        espirros.setFont(new Font("Roboto",0,12));
        espirros.setFocusable(false);
        espirros.setBackground(new Color(255,255,255));

        dorGarganta.setText("Dor de garganta");
        dorGarganta.setForeground(Principal.PRIMARIA);
        dorGarganta.setFont(new Font("Roboto",0,12));
        dorGarganta.setFocusable(false);
        dorGarganta.setBackground(new Color(255,255,255));

        diarreia.setText("Diarréia");
        diarreia.setForeground(Principal.PRIMARIA);
        diarreia.setFont(new Font("Roboto",0,12));
        diarreia.setFocusable(false);
        diarreia.setBackground(new Color(255,255,255));

        dorCorpo.setText("Dor no corpo");
        dorCorpo.setForeground(Principal.PRIMARIA);
        dorCorpo.setFont(new Font("Roboto",0,12));
        dorCorpo.setFocusable(false);
        dorCorpo.setBackground(new Color(255,255,255));

        perdaPaladar.setText("Perda do paladar");
        perdaPaladar.setForeground(Principal.PRIMARIA);
        perdaPaladar.setFont(new Font("Roboto",0,12));
        perdaPaladar.setFocusable(false);
        perdaPaladar.setBackground(new Color(255,255,255));

        faltaAr.setText("Falta de ar");
        faltaAr.setForeground(Principal.PRIMARIA);
        faltaAr.setFont(new Font("Roboto",0,12));
        faltaAr.setFocusable(false);
        faltaAr.setBackground(new Color(255,255,255));

        obstNariz.setText("Obstrução do nariz");
        obstNariz.setForeground(Principal.PRIMARIA);
        obstNariz.setFont(new Font("Roboto",0,12));
        obstNariz.setFocusable(false);
        obstNariz.setBackground(new Color(255,255,255));

        cocNasal.setText("Coceira nasal");
        cocNasal.setForeground(Principal.PRIMARIA);
        cocNasal.setFont(new Font("Roboto",0,12));
        cocNasal.setFocusable(false);
        cocNasal.setBackground(new Color(255,255,255));

        tosseSangue.setText("Tosse com sangue");
        tosseSangue.setForeground(Principal.PRIMARIA);
        tosseSangue.setFont(new Font("Roboto",0,12));
        tosseSangue.setFocusable(false);
        tosseSangue.setBackground(new Color(255,255,255));

        // Group buttons.
        saude.add(saudeSim);
        saudeSim.setText("Sim");
        saudeSim.setForeground(Principal.PRIMARIA);
        saudeSim.setFont(new Font("Roboto",0,12));
        saudeSim.setFocusable(false);
        saudeSim.setBackground(new Color(255,255,255));

        saude.add(saudeNao);
        saudeNao.setText("Não");
        saudeNao.setForeground(Principal.PRIMARIA);
        saudeNao.setFont(new Font("Roboto",0,12));
        saudeNao.setFocusable(false);
        saudeNao.setBackground(new Color(255,255,255));

        positivo.add(positivoSim);
        positivoSim.setText("Sim");
        positivoSim.setForeground(Principal.PRIMARIA);
        positivoSim.setFont(new Font("Roboto",0,12));
        positivoSim.setFocusable(false);
        positivoSim.setBackground(new Color(255,255,255));

        positivo.add(positivoNao);
        positivoNao.setText("Não");
        positivoNao.setForeground(Principal.PRIMARIA);
        positivoNao.setFont(new Font("Roboto",0,12));
        positivoNao.setFocusable(false);
        positivoNao.setBackground(new Color(255,255,255));

        enviar.setText("ENVIAR");
        enviar.setFont(new Font("Roboto",0, 12));
        enviar.setForeground(Principal.PRIMARIA);
        enviar.setBackground(new Color(194, 215, 255));
        //enviar.setBorder(BorderFactory.createLineBorder(Principal.PRIMARIA, 1, true));
        enviar.setFocusable(false);
        enviar.setCursor(new Cursor(Cursor.HAND_CURSOR));


        // Layouts.
        GroupLayout parteSuperiorLayout = new GroupLayout(parteSuperior);
        parteSuperior.setLayout(parteSuperiorLayout);
        // HORIZONTAL.
        parteSuperiorLayout.setHorizontalGroup(
            parteSuperiorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(tituloForm, GroupLayout.PREFERRED_SIZE,780,GroupLayout.PREFERRED_SIZE)
                .addGroup(parteSuperiorLayout.createSequentialGroup()
                    .addGap(10)
                    .addComponent(divForm, GroupLayout.PREFERRED_SIZE, 760, GroupLayout.PREFERRED_SIZE)
                    .addGap(10)
                )
        );
        // VERTICAL.
        parteSuperiorLayout.setVerticalGroup(
            parteSuperiorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(parteSuperiorLayout.createSequentialGroup()
                    .addGap(30)
                    .addComponent(tituloForm, GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
                    .addGap(30)
                    .addComponent(divForm, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                )
        );

        GroupLayout parteInferiorLayout = new GroupLayout(parteInferior);
        parteInferior.setLayout(parteInferiorLayout);
        // HORIZONTAL.
        parteInferiorLayout.setHorizontalGroup(
            parteInferiorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(parteInferiorLayout.createSequentialGroup()
                    .addGap(60)
                    .addComponent(txtSaude, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                )
                .addGroup(parteInferiorLayout.createSequentialGroup()
                    .addGap(60)
                    .addComponent(saudeSim, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                    .addComponent(saudeNao, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                )
                .addGroup(parteInferiorLayout.createSequentialGroup()
                    .addGap(60)
                    .addComponent(txtPositivo, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                )
                .addGroup(parteInferiorLayout.createSequentialGroup()
                        .addGap(60)
                        .addComponent(positivoSim, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                        .addComponent(positivoNao, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                )
                .addGroup(parteInferiorLayout.createSequentialGroup()
                    .addGap(60)
                    .addComponent(infoSintomas, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                )
                .addGroup(parteInferiorLayout.createSequentialGroup()
                    .addGap(100)
                    .addComponent(febre, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                    .addGap(60)
                    .addComponent(tosse, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                    .addGap(60)
                    .addComponent(chiadoPeito, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)

                )
                .addGroup(parteInferiorLayout.createSequentialGroup()
                    .addGap(100)
                    .addComponent(espirros, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                    .addGap(60)
                    .addComponent(dorGarganta, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                    .addGap(60)
                    .addComponent(diarreia, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)

                )
                .addGroup(parteInferiorLayout.createSequentialGroup()
                    .addGap(100)
                    .addComponent(dorCorpo, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                    .addGap(60)
                    .addComponent(perdaPaladar, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                    .addGap(60)
                    .addComponent(faltaAr, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)

                )
                .addGroup(parteInferiorLayout.createSequentialGroup()
                    .addGap(100)
                    .addComponent(obstNariz, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                    .addGap(60)
                    .addComponent(cocNasal, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                    .addGap(60)
                    .addComponent(tosseSangue, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)

                )
                .addGroup(parteInferiorLayout.createSequentialGroup()
                    .addGap(350)
                    .addComponent(enviar, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                )
        );
        // VERTICAL.
        parteInferiorLayout.setVerticalGroup(
            parteInferiorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(parteInferiorLayout.createSequentialGroup()
                    .addComponent(txtSaude, GroupLayout.PREFERRED_SIZE,20,GroupLayout.PREFERRED_SIZE)
                    .addGroup(parteInferiorLayout.createParallelGroup()
                        .addComponent(saudeSim, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(saudeNao, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                    )
                    .addComponent(txtPositivo, GroupLayout.PREFERRED_SIZE,20,GroupLayout.PREFERRED_SIZE)
                    .addGroup(parteInferiorLayout.createParallelGroup()
                            .addComponent(positivoSim, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(positivoNao, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                    )
                    .addGap(10)
                    .addComponent(infoSintomas, GroupLayout.PREFERRED_SIZE,40, GroupLayout.PREFERRED_SIZE)
                    .addGroup(parteInferiorLayout.createParallelGroup()
                            .addComponent(febre, GroupLayout.PREFERRED_SIZE,20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(tosse, GroupLayout.PREFERRED_SIZE,20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(chiadoPeito, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    )
                    .addGap(10)
                    .addGroup(parteInferiorLayout.createParallelGroup()
                            .addComponent(espirros, GroupLayout.PREFERRED_SIZE,20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(dorGarganta, GroupLayout.PREFERRED_SIZE,20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(diarreia, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    )
                    .addGap(10)
                    .addGroup(parteInferiorLayout.createParallelGroup()
                            .addComponent(dorCorpo, GroupLayout.PREFERRED_SIZE,20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(perdaPaladar, GroupLayout.PREFERRED_SIZE,20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(faltaAr, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    )
                    .addGap(10)
                    .addGroup(parteInferiorLayout.createParallelGroup()
                            .addComponent(obstNariz, GroupLayout.PREFERRED_SIZE,20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(cocNasal, GroupLayout.PREFERRED_SIZE,20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(tosseSangue, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    )
                    .addGap(50)
                    .addComponent(enviar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                )
        );
    }
}