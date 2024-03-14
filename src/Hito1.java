import javax.swing.*;
import java.awt.*;

public class Hito1 {
    public Hito1() {

        JFrame frame = new JFrame("Hito1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 400));

        frame.setResizable(false);
        frame.setLayout(new BorderLayout());

        //Panel norte
        JPanel panelNorte = new JPanel();
        panelNorte.setLayout(new FlowLayout());

        //Panel este
        JPanel panelEste = new JPanel();
        panelEste.setLayout(null);
        panelEste.setPreferredSize(new Dimension(250,400));


        //Panel sur
        JPanel panelSur = new JPanel();
        panelSur.setLayout(new BoxLayout(panelSur,BoxLayout.X_AXIS));

        //Panel centro
        JPanel panelCentro = new JPanel(new GridLayout(2,2));

        //Box Panel
        JCheckBox ch1 = new JCheckBox("Katniss");
        JCheckBox ch2 = new JCheckBox("Peeta");

        JPanel boxPanel = new JPanel();
        boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.X_AXIS));
        boxPanel.add(ch1);
        boxPanel.add(ch2);

        //Radio panel
        JRadioButton rd1 = new JRadioButton("OPT1");
        JRadioButton rd2 = new JRadioButton("OPT2");
        JRadioButton rd3 = new JRadioButton("OPT3");


        ButtonGroup grupoBoton = new ButtonGroup();
        grupoBoton.add(rd1);
        grupoBoton.add(rd2);
        grupoBoton.add(rd3);

        rd1.setSelected(true);

        panelEste.add(rd1);
        panelEste.add(rd2);
        panelEste.add(rd3);

        rd1.setBackground(null);
        rd2.setBackground(null);
        rd3.setBackground(null);

        rd1.setBounds(10,80,75,50);
        rd2.setBounds(10,115,75,50);
        rd3.setBounds(10,150,75,50);

        //Button panel
        JButton bt1 = new JButton("But 1");
        JButton bt2 = new JButton("But 2");

        JPanel botonPanel = new JPanel();
        botonPanel.setLayout(new BoxLayout(botonPanel,BoxLayout.X_AXIS));
        botonPanel.add(bt1);
        botonPanel.add(bt2);

        //Imagen
        ImageIcon imagen = new ImageIcon("C:\\Users\\ik012982i9\\Desktop\\dow.jpg");

        for (int i=0;i < 4;i++){
            JLabel etiqueta = new JLabel(imagen);
            panelCentro.add(etiqueta);
        }


        panelNorte.add(boxPanel);
        panelEste.add(panelCentro);
        panelSur.add(botonPanel, BorderLayout.LINE_START);
        panelSur.add(Box.createVerticalStrut(50));


        frame.add(panelNorte, BorderLayout.NORTH);
        frame.add(panelEste,BorderLayout.EAST);
        frame.add(panelSur, BorderLayout.SOUTH);
        frame.add(panelCentro, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        Hito1 h1 = new Hito1();
    }
}
