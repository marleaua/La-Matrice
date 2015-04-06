/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TestsComplementaires {
    
    private static final String REP1 = 
            "[     0,0     0,0     0,0     0,0     0,0    0,0  ]\n" +
            "[     0,0     0,0     0,0     0,0     0,0    0,0  ]\n" +
            "[     0,0     0,0     0,0     0,0     0,0    0,0  ]\n" +
            "[     0,0     0,0     0,0     0,0     0,0    0,0  ]";    
    private static final String REP2 = 
            "[     1,0     2,0     4,0     6,0  ]\n" +
            "[     4,0     4,0     5,0     6,0  ]\n" +
            "[     7,0     1,0     1,0     0,0  ]";
   private static final String TC3 = 
            "[    10,0  ]";
   private static final String TC12 = 
            "[    50,0  ]";
   private static final String TC13 = 
            "[    10,0     8,0     7,0     4,0     6,0    12,0  ]\n" +
            "[     1,0     2,0     4,0     6,0    11,0     1,0  ]\n" +
            "[     0,0     3,0     5,0     5,0     4,0     4,0  ]\n" +
            "[     5,0     6,0     7,0     1,0     1,0     0,0  ]";
   private static final String REP4 = 
            "[     1,0     1,0     1,0     1,0  ]\n" +
            "[     4,0     4,0     5,0     8,0  ]\n" +
            "[     7,0     1,0     1,0     0,0  ]";
   private static final String REP5 = 
            "[     1,0     9,0     1,0     1,0  ]\n" +
            "[     4,0     9,0     5,0     8,0  ]\n" +
            "[     7,0     9,0     1,0     0,0  ]";
   private static final String TC6 = 
            "[     1,0     2,0     4,0     6,0  ]\n" + 
            "[     4,0     4,0     5,0     6,0  ]\n" +
            "[     7,0     1,0     1,0     0,0  ]";
   private static final String TC10 = 
            "[     4,0     9,0     5,0     8,0     3,0  ]";
   private static final String REP8 = 
            "[     0,0     0,0     0,0     0,0     1,0  ]\n" +
            "[     1,0     9,0     1,0     1,0     2,0  ]\n" +
            "[     7,0     9,0     1,0     0,0     4,0  ]";
   private static final String REP9 =                        //m1
            "[     0,0     0,0     0,0     1,0  ]\n" +
            "[     1,0     9,0     1,0     2,0  ]\n" +
            "[     7,0     9,0     1,0     4,0  ]";
   private static final String REP10 =                        //m3
            "[     1,0     2,0     4,0     7,0  ]\n" +
            "[     5,0    13,0     6,0     8,0  ]\n" +
            "[    14,0    10,0     2,0     4,0  ]";
   private static final String REP11 =                        //m3
            "[     0,0     0,0     0,0     2,0  ]\n" +
            "[     2,0    18,0     2,0     4,0  ]\n" +
            "[    14,0    18,0     2,0     8,0  ]";
   private static final String REP12 = 
            "[     3,0     4,0  ]\n" +
            "[    61,0   128,0  ]\n" +
            "[    73,0   154,0  ]";
   private static final String TM1 = 
            "[     1,0     2,0     4,0     6,0    11,0     1,0  ]\n" +
            "[     0,0     3,0     5,0     5,0     4,0     4,0  ]\n" +
            "[     5,0     6,0     7,0     1,0     1,0     0,0  ]";
   private static final String TM2 = 
            "[     1,0     2,0     4,0     6,0    11,0  ]\n" +
            "[     0,0     3,0     5,0     5,0     4,0  ]\n" +
            "[     5,0     6,0     7,0     1,0     1,0  ]";
   private static final String TT1 = 
            "[     1,0     0,0     5,0  ]\n" +
            "[     2,0     3,0     6,0  ]\n" +
            "[     4,0     5,0     7,0  ]\n" +
            "[     6,0     5,0     1,0  ]\n" +
            "[    11,0     4,0     1,0  ]";
   
   
   private static final double [] TO12 = {12, 1, 4, 0};
   private static final double [] tableau1 = {50};
   private static final double [] tableau1_1 = {20};
   private static final double [] tableau2 = {25, 100};
   private static final double [] tableau3 = {2, 4, 8};
   private static final double [] tableau4 = {40, 41, 42, 43};
   private static final double [] tableau5 = {4, 9, 5, 8, 3};
   private static final double [] tableau6 = {8, 9, 15, 6, 4, 2};
   private static final double [] tableau7 = {12, 11, 9, 10};
   private static final double [] tableau12 = {1, 2, 4, 6, 4, 4, 5, 6, 7, 1, 1, 0};
   private static final double [] tableau24 = {10, 8, 7, 4, 6, 12, 
                                                1, 2, 4, 6, 11, 1, 
                                                0, 3, 5, 5, 4, 4, 
                                                5, 6, 7, 1, 1, 0};
   private static final double [] tableau11 = {7, 1, 1, 0};
   private static final double [] tableau111 = {4, 5, 1};
   private static final double [] tableau111111 = {4, 9, 5, 8, 3};
   private static final double [] tableau1111 = {0, 1, 0};
   private static final double [] tableau11111 = {1, 3, 6, 12, 0, 9, 3, 4};
   private static final double [] tableauNull = null;
   private static final double [] TM1_tab = {10, 8, 7, 4, 6, 12};
   private static final double [] TM2_tab = { 1, 4, 0};
   private static IMatrice matrice1;
   private static IMatrice matrice2;
   private static IMatrice matrice3;
   private static IMatrice matrice4;
   private static IMatrice matrice5;
    
    public static void testsConstructeursComplementaires() {
        matrice5 = new Matrice( 1, 1, tableau1);
        System.out.print("TEST CONSTRUCTEUR 1...");
        try {
            matrice1 = new Matrice( 0, 1, 10 );
        } catch (MatriceException e) {
            okE();
        } catch (Exception e){
            exception("test contructeur 1");
        }
        System.out.print("TEST CONSTRUCTEUR 2...");
        try {
            matrice1 = new Matrice( 1, 0, 10 );
        } catch (MatriceException e) {
            okE();
        } catch (Exception e){
            exception("test contructeur 2");
        }
        System.out.print("TEST CONSTRUCTEUR 3...");
        try {
            matrice1 = new Matrice( 1, 1, 10 );
            if(matrice1.toString().equals(TC3)) {
                ok();
            } else {
                erreur();
            }
        } catch (Exception e){
            exception("test contructeur 3");
        }
        System.out.print("TEST CONSTRUCTEUR 4...");
        try {
            matrice1 = new Matrice( 10, 8, tableauNull );
        } catch (MatriceException e) {
            okE();
        } catch (Exception e){
            exception("test contructeur 4");
        }
        System.out.print("TEST CONSTRUCTEUR 5...");
        try {
            matrice1 = new Matrice( 3, 5, tableau12 );
        } catch (MatriceException e) {
            okE();
        } catch (Exception e){
            exception("test contructeur 5");
        }
        System.out.print("TEST CONSTRUCTEUR 6...");
        try {
            matrice1 = new Matrice( 3, 4, tableau12 );
            if(matrice1.toString().equals(TC6)) {
                ok();
            } else {
                erreur();
            }
        } catch (Exception e){
            exception("test contructeur 6");
        }
        System.out.print("TEST CONSTRUCTEUR 7...");
        try {
            matrice1 = new Matrice( 0, 12, tableau12 );
        } catch (MatriceException e) {
            okE();
        } catch (Exception e){
            exception("test contructeur 7");
        }
        System.out.print("TEST CONSTRUCTEUR 8...");
        try {
            matrice1 = new Matrice( 12, 0, tableau12 );
        } catch (MatriceException e) {
            okE();
        } catch (Exception e){
            exception("test contructeur 8");
        }
        System.out.print("TEST CONSTRUCTEUR 9...");
        try {
            matrice1 = new Matrice( 0, 12, tableau12 );
        } catch (MatriceException e) {
            okE();
        } catch (Exception e){
            exception("test contructeur 9");
        }
        System.out.print("TEST CONSTRUCTEUR 10...");
        try {
            matrice1 = new Matrice( 1, 5, tableau5 );
            if(matrice1.toString().equals(TC10)) {
                ok();
            } else {
                erreur();
            }
        } catch (Exception e){
            exception("test contructeur 10");
        }
        System.out.print("TEST CONSTRUCTEUR 11...");
        try {
            matrice2 = new Matrice( (Matrice)matrice1 );
            if(matrice2.equals(matrice1)) {
                ok();
            } else {
                erreur();
            }
        } catch (Exception e){
            exception("test contructeur 11");
        }
        System.out.print("TEST CONSTRUCTEUR 12...");
        try {
            matrice2 = new Matrice( 1, 1, tableau1 );
            if(matrice2.toString().equals(TC12)) {
                ok();
            } else {
                erreur();
            }
        } catch (Exception e){
            exception("test contructeur 12");
        }
        System.out.print("TEST CONSTRUCTEUR 13...");
        try {
            matrice3 = new Matrice( 4, 6, tableau24 );
            if(matrice3.toString().equals(TC13)) {
                ok();
            } else {
                erreur();
            }
        } catch (Exception e){
            exception("test contructeur 13");
        }
        System.out.println("FIN TEST CONSTRUCTEUR");   
    }
    
    
    public static void testsObservateursComplementaires() {
        System.out.print("TEST OBSERVATEUR 1...");
        try {
            if( matrice1.getNumColonnes() == 5 ) {
                ok();
            } else {
                erreur();
            }
        } catch (Exception e){
            exception("test observateur 1");
        }
        
        System.out.print("TEST OBSERVATEUR 2...");
        try {
            if( matrice1.getNumLignes() == 1 ) {
                ok();
            } else {
                erreur();
            }
        } catch (Exception e){
            exception("test observateur 2");
        }
        
        System.out.print("TEST OBSERVATEUR 3...");
        try {
            if( matrice3.getNumLignes() == 4 ) {
                ok();
            } else {
                erreur();
            }
        } catch (Exception e){
            exception("test observateur 3");
        }
        
        System.out.print("TEST OBSERVATEUR 4...");
        try {
            if( matrice3.getElement( 0, 0 ) == 10 ) {
                ok();
            } else {
                erreur();
            }
        } catch (Exception e){
            exception("test observateur 4");
        }
        System.out.print("TEST OBSERVATEUR 5...");
        try {
            if( matrice3.getElement( 3, 5 ) == 0 ) {
                ok();
            } else {
                erreur();
            }
        } catch (Exception e){
            exception("test observateur 5");
        }
        System.out.print("TEST OBSERVATEUR 6...");
        try {
            if( matrice3.getElement( 1, 4 ) == 11 ) {
                ok();
            } else {
                erreur();
            }
        } catch (Exception e){
            exception("test observateur 6");
        }
        System.out.print("TEST OBSERVATEUR 7...");
        try {
            matrice3.getElement( 4, 1 );
        } catch (MatriceException e) {
            okE();
        } catch (Exception e){
            exception("test observateur 7");
        }
        System.out.print("TEST OBSERVATEUR 8...");
        try {
            matrice3.getElement( 1, 6 );
        } catch (MatriceException e) {
            okE();
        } catch (Exception e){
            exception("test observateur 8");
        }
        System.out.print("TEST OBSERVATEUR 9...");
        try {
            matrice5.getElement( 0, -1 );
        } catch (MatriceException e) {
            okE();
        } catch (Exception e){
            exception("test observateur 9");
        }
        System.out.print("TEST OBSERVATEUR 10...");
        try {
            matrice1.getLigne( 1 );
        } catch (MatriceException e) {
            okE();
        } catch (Exception e){
            exception("test observateur 10");
        }
        System.out.print("TEST OBSERVATEUR 11...");
        try {
            if( tabEgaux( matrice1.getLigne( 0 ), tableau5 )) {
                ok();
            }
        } catch (Exception e){
            exception("test observateur 11");
        }
        System.out.print("TEST OBSERVATEUR 12...");
        try {
            if( tabEgaux( matrice3.getColonne( 5 ), TO12 )) {
                ok();
            }
        } catch (Exception e){
            exception("test observateur 12");
        }
        System.out.print("TEST OBSERVATEUR 13...");
        try {
        matrice3.getColonne( 6 );
        } catch (MatriceException e) {
            okE();
        } catch (Exception e){
            exception("test observateur 13");
        }
        
        System.out.println("FIN TEST OBSERVATEURS");
        
        
        System.out.print("TEST MODIFICATEUR 1...");
        try {
            if( tabEgaux(matrice3.supprimerLigne( 0 ), TM1_tab) 
                && matrice3.toString().equals(TM1)) {
                ok();
            }
        } catch (Exception e){
            exception("test modificateur 1");
        }
        
        System.out.print("TEST MODIFICATEUR 2...");
        try {
            matrice3.supprimerColonne( 6 );
        } catch (MatriceException e) {
            okE();
        } catch (Exception e){
            exception("test modificateur 2");
        }
        
        System.out.print("TEST MODIFICATEUR 3...");
        try {
            if( tabEgaux(matrice3.supprimerColonne( 5 ), TM2_tab) 
                && matrice3.toString().equals(TM2)) {
                ok();
            }
        } catch (Exception e){
            exception("test modificateur 3");
        }
        System.out.println("FIN TEST MOFIFICATEUR");
        
        
        System.out.print("TEST TRANSPOSE 1...");
        try {
            matrice4 = matrice3.transposee(); 
            if( matrice4.toString().equals(TT1)) {
                ok();
            }
        } catch (Exception e){
            exception("test transpose 1");
        }
        System.out.println("FIN TEST TRANSPOSE");
        
    }
    
    /**
    * Affiche un message d'erreur
    */
    private static void erreur() {
      System.out.println("ERREUR");
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
    * Affiche un message de confirmation
    */
   private static void ok() {
      System.out.println("OK");
   }
   
   private static void okE() {
      System.out.println("OK Exception");
   }
    
    private static void exception(String nomMethode) {
      System.out.println("Exception inattendue dans " + nomMethode + "... arrêt des tests");
   }
    
    private static void matriceException(String nomMethode) {
      System.out.println("Exception inattendue dans " + nomMethode + "... arrêt des tests");
   }
    
    public static void main (String [] args) {
      try {
         testsConstructeursComplementaires();
         testsObservateursComplementaires();
         //testsModificateursEtEquals();
         //testsOperationsMatrices();
         
      } catch (Exception e) {
         System.out.println("Exception inattendue dans methode main");
      }
      
   }
    
    
    
}
