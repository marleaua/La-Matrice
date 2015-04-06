
/**
 * Cette classe offre une serie de tests partiels - donc incomplets - pour tester
 * les methodes de la classe Matrice. Elle permet de tester 1 cas (normal) 
 * pour chaque methode de la classe Matrice. Pour tester adequatement votre 
 * classe Matrice, vous devez completer les tests pour que ceux-ci couvrent
 * tous les cas possibles pour chaque methode.
 * 
 * @author melanie lord
 * @version fevrier 2015
 */
public class TestsPartielsMatrice {
   
   //donnees pour les tests
   private static final String s1 = 
            "[     0,0     0,0     0,0     0,0     0,0  ]\n" +
            "[     0,0     0,0     0,0     0,0     0,0  ]\n" +
            "[     0,0     0,0     0,0     0,0     0,0  ]\n" +
            "[     0,0     0,0     0,0     0,0     0,0  ]";
   private static final String s2 = 
            "[     1,0     2,0     4,0     6,0  ]\n" +
            "[     4,0     4,0     5,0     6,0  ]\n" +
            "[     7,0     1,0     1,0     0,0  ]";
   private static final String s3 = 
            "[     1,0     2,0     4,0     6,0  ]\n" +
            "[     4,0     4,0     5,0     8,0  ]\n" +
            "[     7,0     1,0     1,0     0,0  ]";
   private static final String s4 = 
            "[     1,0     1,0     1,0     1,0  ]\n" +
            "[     4,0     4,0     5,0     8,0  ]\n" +
            "[     7,0     1,0     1,0     0,0  ]";
   private static final String s5 = 
            "[     1,0     9,0     1,0     1,0  ]\n" +
            "[     4,0     9,0     5,0     8,0  ]\n" +
            "[     7,0     9,0     1,0     0,0  ]";
   private static final String s6 = 
            "[     0,0     0,0     0,0     0,0  ]\n" +
            "[     1,0     9,0     1,0     1,0  ]\n" +
            "[     4,0     9,0     5,0     8,0  ]\n" +
            "[     7,0     9,0     1,0     0,0  ]";
   private static final String s7 = 
            "[     0,0     0,0     0,0     0,0     1,0  ]\n" +
            "[     1,0     9,0     1,0     1,0     2,0  ]\n" +
            "[     4,0     9,0     5,0     8,0     3,0  ]\n" +
            "[     7,0     9,0     1,0     0,0     4,0  ]";
   private static final String s8 = 
            "[     0,0     0,0     0,0     0,0     1,0  ]\n" +
            "[     1,0     9,0     1,0     1,0     2,0  ]\n" +
            "[     7,0     9,0     1,0     0,0     4,0  ]";
   private static final String s9 =                        //m1
            "[     0,0     0,0     0,0     1,0  ]\n" +
            "[     1,0     9,0     1,0     2,0  ]\n" +
            "[     7,0     9,0     1,0     4,0  ]";
   private static final String s10 =                        //m3
            "[     1,0     2,0     4,0     7,0  ]\n" +
            "[     5,0    13,0     6,0     8,0  ]\n" +
            "[    14,0    10,0     2,0     4,0  ]";
   private static final String s11 =                        //m3
            "[     0,0     0,0     0,0     2,0  ]\n" +
            "[     2,0    18,0     2,0     4,0  ]\n" +
            "[    14,0    18,0     2,0     8,0  ]";
   private static final String s12 = 
            "[     3,0     4,0  ]\n" +
            "[    61,0   128,0  ]\n" +
            "[    73,0   154,0  ]";
   
   private static final double [] tab1 = {1, 2, 4, 6, 4, 4, 5, 6, 7, 1, 1, 0};
   private static final double [] tab2 = {7, 1, 1, 0};
   private static final double [] tab3 = {4, 5, 1};
   private static final double [] tab4 = {4, 9, 5, 8, 3};
   private static final double [] tab5 = {0, 1, 0};
   private static final double [] tab6 = {1, 3, 6, 12, 0, 9, 3, 4};
   private static IMatrice m1;
   private static IMatrice m2;
   private static IMatrice m3;
   
   
   /**
    * Tests constructeurs.
    */
   public static void testsConstructeurs() {
      System.out.print("TEST CONSTRUCTEUR 1... ");
      try {
         m1 = new Matrice(4, 5, 0);
         if (m1.toString().equals(s1)) {
            ok();
         } else {
            erreur();
         }
      } catch (Exception e) {
         exception("test constructeur 1");
      }
      
      System.out.print("TEST CONSTRUCTEUR 2... ");
      try {
         m1 = new Matrice(3, 4, tab1);
         if (m1.toString().equals(s2)) {
            ok();
         } else {
            erreur();
         }
      } catch (Exception e) {
         exception("test constructeur 2");
      }
      
      System.out.print("TEST CONSTRUCTEUR 3... ");
      try {
         m2 = new Matrice((Matrice)m1);
         if (m2.toString().equals(s2)) {
            ok();
         } else {
            erreur();
         }
      } catch (Exception e) {
         exception("test constructeur 3");
      }
   }
   
   /**
    * Tests methodes d'observation.
    */
   public static void testsObservateurs () {
      try {
         System.out.print("TEST GET NUM LIGNE... ");
         if (m1.getNumLignes() == 3) {
            ok(); 
         } else { 
            erreur();
         }
         System.out.print("TEST GET NUM COL... ");
         if (m1.getNumColonnes() == 4) {
            ok(); 
         } else { 
            erreur();
         }
         System.out.print("TEST GET ELEMENT (1, 2)... ");
         if (m1.getElement(1, 2) == 5) {
            ok(); 
         } else { 
            erreur();
         }
         System.out.print("TEST GET LIGNE (2)... ");
         if (tabEgaux(m1.getLigne(2), tab2)) {
            ok(); 
         } else { 
            erreur();
         }
         System.out.print("TEST GET COL (2)... ");
         if (tabEgaux(m1.getColonne(2), tab3)) {
            ok(); 
         } else { 
            erreur();
         }
      } catch (Exception e) {
         exception("testsObservateurs");
      }
   }
   
   /**
    * Tests methodes de modification (et methode equals).
    */
   public static void testsModificateursEtEquals () {
      
      try {
         System.out.print("TEST EQUALS... ");
         if (m1.equals(m2)) {
            ok();
         } else {
            erreur();
         }
         System.out.print("TEST SET ELEM (1, 3, 8)... ");
         m1.setElement(1, 3, 8);
         if (m1.toString().equals(s3)) {
            ok();
         } else {
            erreur();
         }
         System.out.print("TEST EQUALS... ");
         if (!m1.equals(m2)) {
            ok();
         } else {
            erreur();
         }
         double [] ligne = {1, 1, 1, 1};
         System.out.print("TEST REMPLACER LIGNE (0, [1, 1, 1, 1])... ");
         m1.remplacerLigne(0, ligne);
         if (m1.toString().equals(s4)) {
            ok();
         } else {
            erreur();
         }
         double [] col = {9, 9, 9};
         System.out.print("TEST REMPLACER COL (1, [9, 9, 9])... ");
         m1.remplacerColonne(1, col);
         if (m1.toString().equals(s5)) {
            ok();
         } else {
            erreur();
         }
         double [] ligne2 = {0, 0, 0, 0};
         System.out.print("TEST AJOUTER LIGNE (0, [0, 0, 0, 0])... ");
         m1.ajouterLigne(0, ligne2);
         if (m1.toString().equals(s6)) {
            ok();
         } else {
            erreur();
         }
         double [] col2 = {1, 2, 3, 4};
         System.out.print("TEST AJOUTER COL (4, [1, 2, 3, 4])... ");
         m1.ajouterColonne(4, col2);
         if (m1.toString().equals(s7)) {
            ok();
         } else {
            erreur();
         }
         System.out.print("TEST SUPPRIMER LIGNE (2)... ");
         double[] ligne3 = m1.supprimerLigne(2);
         if (m1.toString().equals(s8)) {
            ok();
         } else {
            erreur();
         }
         System.out.print("TEST LIGNE RETOURNEE PAR SUPPRIMER LIGNE (2)... ");
         if (tabEgaux(ligne3, tab4)) {
            ok();
         } else {
            erreur();
         }
         
         System.out.print("TEST SUPPRIMER COL (3)... ");
         double[] col3 = m1.supprimerColonne(3);
         if (m1.toString().equals(s9)) {
            ok();
         } else {
            erreur();
         }
         System.out.print("TEST COL RETOURNEE PAR SUPPRIMER COL (3)... ");
         if (tabEgaux(col3, tab5)) {
            ok();
         } else {
            erreur();
         }
         
      } catch (Exception e) {
         exception("testsModificateursEtEquals");
      }
      
   }
   
   /**
    * Tests methodes d'operations sur les matrices.
    */
   public static void testsOperationsMatrices () {
      
      try {
         System.out.print("TEST SOMME... ");
         m3 = m1.somme(m2);
         if (m3.toString().equals(s10)) {
            ok();
         } else {
            erreur();
         }
         System.out.print("TEST PRODUIT PAR UN NOMBRE... ");
         m3 = m1.produit(2);
         if (m3.toString().equals(s11)) {
            ok();
         } else {
            erreur();
         }
         System.out.print("TEST PRODUIT PAR UNE MATRICE... ");
         IMatrice m4 = new Matrice(4, 2, tab6);
         m3 = m1.produit(m4);
         //System.out.println("\n" + m3);
         if (m3.toString().equals(s12)) {
            ok();
         } else {
            erreur();
         }
      } catch (Exception e) {
         exception("testsOperationsMatrices");
      }
   }
   
   
   
   /****************************
    * methodes utilitaires
    ****************************/
   
   /**
    * Affiche un message d'erreur
    */
   private static void erreur() {
      System.out.println("ERREUR");
   }
   
   /**
    * Affiche un message de confirmation
    */
   private static void ok() {
      System.out.println("OK");
   }
   
   /**
    * Affiche un message d'erreur pour une exception inatttendue levee dans une
    * methode
    * @param nomMethode le nom de la methode dans laquelle l'exception a ete 
    *        levee.
    */
   private static void exception(String nomMethode) {
      System.out.println("Exception inattendue dans " + nomMethode + "... arrêt des tests");
   }
   
   /**
    * Teste l'egalite de deux tableaux.
    * @param tab1 le tableau a comparer avec tab2
    * @param tab2 le tableau a comparer avec tab1
    * @return vrai si tab1 est egal a tab2, faux sinon.
    */
   private static boolean tabEgaux (double[] tab1, double [] tab2) {
      boolean egaux = false;
      int i = 0;
      if (tab1 == null && tab2 == null) {
         egaux = true;
      } else if (tab1 == null || tab2 == null) {
         egaux = false;
      } else if (tab1.length == tab2.length) {
         egaux = true;
         while (i < tab1.length && egaux) {
            egaux = tab1[i] == tab2[i];
            i++;
         }
      }
      return egaux;
   }
   
   
   /**
    * Execution des tests de la classe Matrice.
    * @param args - aucun
    */
   public static void main (String [] args) {
      try {
         testsConstructeurs();
         testsObservateurs();
         testsModificateursEtEquals();
         testsOperationsMatrices();
         
      } catch (Exception e) {
         System.out.println("Exception inattendue dans methode main");
      }
      
   }
   
}
