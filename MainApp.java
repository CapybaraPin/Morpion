import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Morpion extends JFrame implements ActionListener {

//Déclaration des variables
private JButton[] btn;
private int tour;

public Morpion() {
    super("Le jeu du Morpion");
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout(3,3));

//Création des boutons
    btn = new JButton[9];
    tour = 0;

    for (int i = 0; i<9; i++) {
        btn[i] = new JButton();
        btn[i].addActionListener(this);
        add(btn[i]);
    }

//Affichage de la fenêtre
    setVisible(true);
}

public void actionPerformed(ActionEvent e) {

//Vérification de quel joueur joue
    if(tour %2 == 0) {
        ((JButton) e.getSource()).setText("X");
    } else {
        ((JButton) e.getSource()).setText("O");
    }

//Vérification des lignes
    if (btn[0].getText().equals(btn[1].getText()) 
    && btn[1].getText().equals(btn[2].getText())
    && !btn[0].getText().equals("")) {

        JOptionPane.showMessageDialog(null, "Le joueur " + btn[0].getText() + " a gagné !");
        System.exit(0);
    }

    if (btn[3].getText().equals(btn[4].getText()) 
    && btn[4].getText().equals(btn[5].getText())
    && !btn[3].getText().equals("")) {

        JOptionPane.showMessageDialog(null, "Le joueur " + btn[3].getText() + " a gagné !");
        System.exit(0);
    }

    if (btn[6].getText().equals(btn[7].getText()) 
    && btn[7].getText().equals(btn[8].getText())
    && !btn[6].getText().equals("")) {

        JOptionPane.showMessageDialog(null, "Le joueur " + btn[6].getText() + " a gagné !");
        System.exit(0);
    }

//Vérification des colonnes
    if (btn[0].getText().equals(btn[3].getText()) 
    && btn[3].getText().equals(btn[6].getText())
    && !btn[0].getText().equals("")) {

        JOptionPane.showMessageDialog(null, "Le joueur " + btn[0].getText() + " a gagné !");
        System.exit(0);
    }

    if (btn[1].getText().equals(btn[4].getText()) 
    && btn[4].getText().equals(btn[7].getText())
    && !btn[1].getText().equals("")) {

        JOptionPane.showMessageDialog(null, "Le joueur " + btn[1].getText() + " a gagné !");
        System.exit(0);
    }

    if (btn[2].getText().equals(btn[5].getText()) 
    && btn[5].getText().equals(btn[8].getText())
    && !btn[2].getText().equals("")) {

        JOptionPane.showMessageDialog(null, "Le joueur " + btn[2].getText() + " a gagné !");
        System.exit(0);
    }

//Vérification des diagonales
    if (btn[0].getText().equals(btn[4].getText()) 
    && btn[4].getText().equals(btn[8].getText())
    && !btn[0].getText().equals("")) {

        JOptionPane.showMessageDialog(null, "Le joueur " + btn[0].getText() + " a gagné !");
        System.exit(0);
    }

    if (btn[2].getText().equals(btn[4].getText()) 
    && btn[4].getText().equals(btn[6].getText())
    && !btn[2].getText().equals("")) {

        JOptionPane.showMessageDialog(null, "Le joueur " + btn[2].getText() + " a gagné !");
        System.exit(0);
    }

//Le tour s'incrémente
    tour++;
}

public static void main(String[] args) {
    Morpion m = new Morpion();
}

}