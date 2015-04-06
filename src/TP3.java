/**
 * Cette classe est le développement d'une interface permettant de manipuler des 
 * objets de type Matrice et les méthodes que cette classe contient.
 * Des opérations de type binaires (addition et multiplication) peuvent être faites 
 * sur la sélection de 2 matrices.
 * Différentes manipulations sont possibles tels que:
 *      -Ajout d'une ligne/colonne
 *      -Suppression d'une ligne/colonne
 *      -Modification d'une ligne/colonne
 *      -Faire la transposée d'une matrice
 * Le résultat de ces manipulations seront affichées et pourront être sauvegardées.
 * 
 * Cette classe a été contruire pour le TP3 dans le cadre du cours INF2120, hiver 2015.
 * 
 * @author Nicolas Duceppe et Alexandre Marleau
 * @version hiver 2015
 */

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;



public class TP3 extends WindowAdapter implements ActionListener {
   
   /************************************
    * CONSTANTES DE CLASSE
    ************************************/
   //largeur et hauteur de l'ecran de l'ordinateur
   public final static int LARG_ECRAN = 
           Toolkit.getDefaultToolkit().getScreenSize().width;
   public final static int HAUT_ECRAN = 
           Toolkit.getDefaultToolkit().getScreenSize().height;
   //largeur et hauteur de la fenetre principale
   public final static int LARG_FENETRE = 1000;
   public final static int HAUT_FENETRE = 630;
   
   //fichier d'enregistrement des matrices (à la racine du projet)
   public final static String FIC_MATRICES = "matrices.txt";
   
   //titre de la fenêtre principale
   public final static String TITRE_FENETRE = "CALCULATEUR MATRICES";
   
   
   //...
   
   
   /************************************
    * VARIABLES D'INSTANCE
    ************************************/
   //...
  
   
   
   /************************************
    * COMPOSANTS GRAPHIQUES
    ************************************/
   //fenetre principale
   private JFrame fenetre;
   
   //...
   

   /**
    * Constructeur qui initialise l'application.
    */
   public TP3() {
      init(); 
   }
   
   /**
    * Initialisation des composants graphiques.
    */
   private void init() {
      
      //FENETRE JFRAME
      fenetre = new JFrame(TITRE_FENETRE);
      fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      fenetre.setResizable(false);
      //centrer la fenetre principale dans l'écran
      fenetre.setBounds(LARG_ECRAN / 2 - LARG_FENETRE / 2, 
              HAUT_ECRAN / 2 - HAUT_FENETRE / 2, 
              LARG_FENETRE, HAUT_FENETRE);
      
      
      //...
      
      
      
      //Laisser cette instruction à la fin de l'initialisation des composants
      //graphiques.
      fenetre.setVisible(true);
      
      
      /*************************
       * ÉCOUTEURS
       *************************/
      //ajout d'un ecouteur sur la fenetre
      fenetre.addWindowListener(this); //voir redef methode windowClosing

   }  
   
   @Override
   public void actionPerformed (ActionEvent e) {
      
      //TODO...
      
   }
   
   /**
    * A la fermeture de la fenetre, enregistrement des toutes les matrices
    * dans le fichier FIC_MATRICES.
    * @param e l'evenement de fermeture de fenetre.
    */
   @Override
   public void windowClosing(WindowEvent e) {
      //TODO...
   }
   
   
   public static void main (String [] args) {
      new TP3();
   }
   
}

