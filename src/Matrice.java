/**
 * Cette classe implemente la classe IMatrice et represente une liste d'objets de 
 * type Double sous forme d'une matrice.
 * L'attribut numLignes represente le nombre de lignes definissant la matrice. On 
 * peut naviguer d'une ligne à l'autre par la coordonnee y . 
 * L'attribut numColonnes represente le nombre de colonnes definissant la matrice. On 
 * peut naviguer d'une colonne à l'autre par la coordonnee x . 
 * L'attribut elements pointe vers une ArrayList d'objets de type Double.
 * 
 * Classe a contruire pour le TP1 dans le cadre du cours INF2120, hiver 2015.
 * 
 * @author Alexandre Marleau
 * @version hiver 2015
 */

import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 *
 * @author Administrator
 */
public class Matrice implements IMatrice {
    
    private int numLignes = 0;
    private int numColonnes = 0;
    private ArrayList <Double> elements;
    
    /**
    * Construit une elements numLignes x numColonnes, dont toutes les cases
    *  contiennent la valeur donnee.
    * @param numLignes le nombre de lignes de cette elements.
    * @param numColonnes le nombre de colonnes de cette elements.
    * @param valeur la valeur d'initialisation de toutes les cases de cette
    *  elements.
    * @throws MatriceException si :
    * - numLignes est plus petit que 1
    * - numCol est plus petit que 1
    */
    public Matrice (int numLignes, int numColonnes, double valeur) throws MatriceException {
        
        int numElements;
        if( numLignes >= 1 && numColonnes >= 1 ) {
            this.numLignes = numLignes;
            this.numColonnes = numColonnes;
            numElements = numLignes * numColonnes;
            elements = new ArrayList<> ( numElements );
            for( int i = 0; i < numElements; i++ ){
                elements.add( i, valeur );
            }
        } else {
            throw new MatriceException();
        }
           
    }
    
    /**
    * Construit une elements numLignes X numColonnes, dont les cases sont
    *  initialisees avec les elements passes en parametre. Le parametre elements
    *  est une liste de nombres contenant les lignes de la elements, une a la
    *  suite de l'autre.
    *  Ex: numLignes = 4, numCol = 3, elems : 1 2 3 4 5 6 7 8 9 10 11 12
    *  correspond a la elements :
    *  [ 1 2 3 ]
    *  [ 4 5 6 ]
    *  [ 7 8 9 ]
    *  [ 10 11 12]
    *
    * @param numLignes le nombre de lignes de cette elements.
    * @param numColonnes le nombre de colonnes de cette elements
    * @param elements la liste des valeurs d'initialisation de toutes les cases
    *  de cette elements.
    * @throws MatriceException si :
    * - numLignes est plus petit que 1
    * - numColonnes est plus petit que 1
    * - elements est null ou ne contient pas exactement
    * (numLignes * numColonnes) elements.
    */
    public Matrice (int numLignes, int numColonnes, double[] elements) throws MatriceException {
    
        int numElements = numLignes * numColonnes;
        if( numLignes >= 1
                && numColonnes >= 1 
                && elements != null 
                && elements.length == numElements  ) {
            this.numLignes = numLignes;
            this.numColonnes = numColonnes;
            this.elements = new ArrayList<> ( numElements );
            for( int i = 0; i < numElements; i++ ){
                this.elements.add( i, elements[ i ] );
            }
        } else {
            throw new MatriceException();
        }
        
    }
    
    /**
    * Constructeur de copie. Construit une copie de surface de autreMatrice.
    * @param autreMatrice la elements a copier.
    */
    public Matrice (Matrice autreMatrice) {
        
        int numElements;
        numLignes = autreMatrice.getNumLignes();
        numColonnes = autreMatrice.getNumColonnes();
        numElements = numLignes * numColonnes;
        this.elements = new ArrayList<> ( numElements );
        for( int i = 0; i < numElements; i++ ){
            this.elements.add( i, autreMatrice.elements.get( i ) );
        }
        
    }

    /**
    * Retourne le nombre de lignes de cette elements.
    * @return le nombre de lignes de cette elements.
    */
    @Override
    public int getNumLignes (){
       
        return this.numLignes;
       
   }
   
   /**
    * Retourne le nombre de colonnes de cette elements.
    * @return le nombre de colonnes de cette elements.
    */
    @Override
    public int getNumColonnes (){
       
        return this.numColonnes;
       
   }
   
   /**
    * Retourne l'element de la elements a la position noLigne, noCol.
    * @param noLigne le numero de la ligne dans cette elements.
    * @param noCol le numero de la colonne dans cette elements.
    * @return l'element de la elements a la position noLigne, noCol.
    * @throws MatriceException si :
    *  noLigne ou noCol n'est pas un indice valide dans cette elements.
    */
    @Override
    public double getElement (int noLigne, int noCol) throws MatriceException {
       
        if(    noLigne >= 0 
            && noCol >= 0
            && noLigne < getNumLignes() 
            && noCol < getNumColonnes() ){
            return elements.get( noLigne * getNumColonnes() + noCol );
        } else {
            throw new MatriceException();
        }
       
    }

    /**
     * Modifie l'element a la position noLigne, noCol par l'element passe en 
     * parametre.
     * @param noLigne le numero de la ligne dans cette elements.
     * @param noCol le numero de la colonne dans cette elements.
     * @param element le nouvel element a inserer a la position noLigne, noCol
     *  dans cette elements.
     * @throws MatriceException si noLigne ou noCol n'est pas un indice valide 
     *  dans cette elements.
     */
    @Override
    public void setElement (int noLigne, int noCol, double element) throws MatriceException {
        
        if( noLigne >= 0 
                && noCol >= 0
                && noLigne < getNumLignes()
                && noCol < getNumColonnes() ){
            
            this.elements.set( noLigne * getNumColonnes() + noCol, element );
        } else {
            throw new MatriceException();
        }

    }

    /**
     * Retourne la ligne de cette elements specifiee par noLigne.
     * @param noLigne le numero de la ligne a retourner.
     * @return la ligne de cette elements specifiee par noLigne.
     * @throws MatriceException si noLigne n'est pas une ligne valide
     *  dans cette elements.
     */
    @Override
    public double[] getLigne (int noLigne) throws MatriceException {
        
        double[] tabLigne;
        if( noLigne >= 0 && noLigne < getNumLignes() ) {
            tabLigne = new double[ getNumColonnes() ];
            for( int i = 0; i < getNumColonnes(); i++ ) {
                tabLigne[ i ] = elements.get( noLigne * getNumColonnes() + i );
            }
            return tabLigne;
        } else {
            throw new MatriceException();
        }

    }

    /**
     * Retourne la colonne de cette elements specifiee par noCol.
     * @param noCol le numero de la colonne a retourner.
     * @return la colonne de cette elements specifiee par noCol.
     * @throws MatriceException si noCol n'est pas une colonne valide
     *  dans cette elements.
     */
    @Override
    public double[] getColonne (int noCol) throws MatriceException{
        
        double[] tabColonne;
        if( noCol >= 0 && noCol < getNumColonnes() ) {
            tabColonne = new double[ getNumLignes() ];
            for( int i = 0; i < getNumLignes(); i++ ) {
                tabColonne[ i ] = elements.get( i * getNumColonnes() + noCol );
            }
            return tabColonne;
        } else {
            throw new MatriceException();
        }

    }

    /**
     * Remplace la ligne specifiee par noLigne de cette elements par la ligne
     *  donnee en parametre. 
     * @param noLigne le numero de la ligne a remplacer.
     * @param ligne la nouvelle ligne 
     * @throws Matrice Exception si :
     *        - noLigne n'est pas une ligne valide dans cette elements.
     *        - ligne est null ou ne contient pas exactement getNumColonnes() 
     *          valeurs.
     */
    @Override
    public void remplacerLigne (int noLigne, double[] ligne) throws MatriceException {
        
        if( noLigne >= 0 
                && noLigne < getNumLignes()
                && ligne != null 
                && ligne.length == getNumColonnes() ) {
            for( int i = 0; i < getNumColonnes(); i++ ) {
                elements.set( noLigne * getNumColonnes() + i, ligne[ i ] );
            }
        } else {
            throw new MatriceException();
        }
        
    }

    /**
     * Remplace la colonne specifiee par noCol de cette elements par la colonne
     *  donnee en parametre. 
     * @param noCol le numero de la colonne a remplacer.
     * @param colonne la nouvelle colonne 
     * @throws MatriceException si :
     *        - noCol n'est pas une colonne valide dans cette elements.
     *        - colonne est null ou ne contient pas exactement getNumLignes() 
     *          valeurs.
     */
    @Override
    public void remplacerColonne (int noCol, double[] colonne) throws MatriceException {
        
        if( noCol >= 0 
                && noCol < getNumColonnes()
                && colonne != null 
                && colonne.length == getNumLignes() ) {
            for( int i = 0; i < getNumLignes(); i++ ) {
                elements.set( i * getNumColonnes() + noCol, colonne[ i ] );
            }
        } else {
            throw new MatriceException();
        }
        
    }

    /**
     * Ajoute a cette elements la ligne donnee au noLigne donne. 
     * Apres cet ajout, la elements contient une ligne de plus et la nouvelle 
     *  ligne se trouve a l'indice noLigne (le numero des lignes suivantes aura 
     *  augmente de 1). 
     * @param noLigne l'indice de la nouvelle ligne apres l'ajout.
     * @param ligne la ligne a ajouter dans cette elements, a l'indice noLigne.
     * @throws MatriceException si :
     *  - noLigne n'est pas entre 0 et getNumLignes() inclusivement
     *  - ligne est null ou ne contient pas exactement getNumColonnes() valeurs.
     */
    @Override
    public void ajouterLigne (int noLigne, double[] ligne) throws MatriceException {
        
        if( noLigne >= 0 
                && noLigne <= getNumLignes()
                && ligne != null 
                && ligne.length == getNumColonnes() ) {
            for( int i = 0; i < getNumColonnes(); i++ ) {
                elements.add( noLigne * getNumColonnes() + i, ligne[ i ] );
            }
            numLignes = getNumLignes() + 1;
        } else {
            throw new MatriceException();
        }

    }

    /**
     * Ajoute a cette elements la colonne donnee au noCol donne. 
     * Apres cet ajout, la elements contient une colonne de plus et la nouvelle 
     *  colonne se trouve a l'indice noCol (le numero des colonnes suivantes aura 
     *  augmente de 1). 
     * @param noCol l'indice de la nouvelle colonne apres l'ajout. 
     * @param colonne la colonne a ajouter.
     * @throws MatriceException si :
     *  - noCol n'est pas entre 0 et getNumColonnes() inclusivement.
     *  - colonne est null ou ne contient pas exactement getNumLignes() valeurs.
     */
    @Override
    public void ajouterColonne (int noCol, double[] colonne) throws MatriceException {
        
        int j = 0;
        if( noCol >= 0 
                && noCol <= getNumColonnes()
                && colonne != null 
                && colonne.length == getNumLignes() ) {
            for( int i = 0; i < getNumLignes() ; i++ ) {
                elements.add( i + ( i * getNumColonnes() ) + noCol, colonne[ i ] );
            }
            numColonnes = getNumColonnes() + 1;
        } else {
            throw new MatriceException();
        }
        

    }

    /**
     * Supprime la ligne de cette elements correspondant au noLigne donne.
     * Apres l'appel de cette methode, cette elements contient une ligne de moins.
     *  Note : on ne peut pas supprimer une ligne dans une elements qui ne contient 
     * qu'une seule ligne.
     * @param noLigne le numero de la ligne a supprimer.
     * @return la ligne supprimee.
     * @throws MatriceException si :
     *        - noLigne n'est pas une ligne valide dans cette elements ou 
     *        - si cette elements ne contient qu'une seule ligne avant la 
     *          suppression.
     */
    @Override
    public double[] supprimerLigne (int noLigne) throws MatriceException {

        double[] tabLigne;
        if( noLigne >= 0
                && getNumLignes() > 1
                && noLigne < getNumLignes() ) {
            tabLigne = new double[ getNumColonnes() ];
            for( int i = 0; i < getNumColonnes(); i++ ) {
                tabLigne[ i ] = elements.get( noLigne * getNumColonnes() );
                elements.remove( noLigne * getNumColonnes() );
            }
            numLignes = getNumLignes() - 1;
        } else {
            throw new MatriceException();
        }
        return tabLigne;
        
    }

    /**
     * Supprime la colonne de cette elements correspondant au noCol donne.
     * Apres l'appel de cette methode, cette elements contient une colonne de moins.
     * Note : on ne peut pas supprimer une colonne dans une elements qui ne contient 
     *  qu'une seule colonne.
     * @param noCol le numero de la colonne a supprimer.
     * @return la colonne supprimee.
     * @throws MatriceException si :
     *        - noCol n'est pas une colonne valide dans cette elements 
     *        - si cette elements ne contient qu'une seule colonne avant la 
     *          suppression.
     */
    @Override
    public double[] supprimerColonne (int noCol) throws MatriceException {

        double[] tabColonne;
        if( noCol >= 0
                && getNumColonnes() > 1
                && noCol < getNumColonnes() ) {
            tabColonne = new double[ getNumLignes() ];
            for( int i = 0; i < getNumLignes(); i++ ) {
                tabColonne[ i ] = elements.get( i * ( getNumColonnes() - 1 ) + noCol );
                elements.remove( i * ( getNumColonnes() - 1 ) + noCol );
            }
            numColonnes = getNumColonnes() - 1;
        } else {
            throw new MatriceException();
        }
        return tabColonne;
        
    }

    /**
     * Effectue la somme de cette Matrice avec autreMatrice donnee en parametre.
     * @param autreMatrice la elements a additionner avec cette elements.
     * @return la elements resultante de la somme de cette elements avec
     *  autreMatrice.
     * @throws MatriceException si autreMatrice est null ou n'est pas de meme 
     *  dimension que cette elements(meme nombre de lignes et meme nombre de 
     *  colonnes).
     */
    @Override
    public IMatrice somme (IMatrice autreMatrice) throws MatriceException {
        
        IMatrice nouvelleMatrice;
        if ( autreMatrice!= null
                && getNumLignes() == autreMatrice.getNumLignes()
                && getNumColonnes() == autreMatrice.getNumColonnes() ) {
            nouvelleMatrice = new Matrice( getNumLignes(), getNumColonnes(), 0 );
            for( int i = 0; i < getNumLignes(); i++ ) {
                for ( int j = 0; j < getNumColonnes(); j++ ) {
                    nouvelleMatrice.setElement( i, j, 
                                                     this.getElement( i, j) 
                                                   + autreMatrice.getElement( i, j) );   
                }
            }
        } else {
            throw new MatriceException();
        }
        return nouvelleMatrice;
      
    }

    /**
     * Calcul le produit de cette elements par la valeur donnee.
     * @param valeur la valeur de multiplication de cette elements.
     * @return la elements resultante du produit de cette elements par la 
     *  valeur donnee.
     */
    @Override
    public IMatrice produit (double valeur) {

        IMatrice nouvelleMatrice = new Matrice( getNumLignes(), getNumColonnes(), 0 );
            for( int i = 0; i < getNumLignes(); i++ ) {
                for ( int j = 0; j < getNumColonnes(); j++ ) {
                    nouvelleMatrice.setElement( i, j, this.getElement( i, j) * valeur ); 
                }
            }
        return nouvelleMatrice;
        
    }

    /**
     * Calcule le produit de cette Matrice (A) par autreMatrice (B) = A X B.
     * @param autreMatrice la elements a multiplier avec cette elements.
     * @return la elements resultante du produit de cette elements par 
     * autreMatrice. La dimension de la elements resultante sera 
     * this.getNumLignes() X autreMatrice.getNumColonnes().
     * @throws MatriceException si : 
     *              - autreMatrice est null  
     *              - le nombre de colonnes de cette elements n'est pas egal au 
     *                nombre de lignes de autreMatrice.
     */
    @Override
    public IMatrice produit (IMatrice autreMatrice) throws MatriceException {

        IMatrice nouvelleMatrice;
        double[] ligne;
        double[] colonne;
        if( autreMatrice!= null
                && getNumColonnes() == autreMatrice.getNumLignes() ) {
            nouvelleMatrice = new Matrice( getNumLignes(), autreMatrice.getNumColonnes() , 0 );
            for( int i = 0; i < nouvelleMatrice.getNumLignes(); i++ ) {
                for( int j = 0; j < nouvelleMatrice.getNumColonnes(); j++ ) {
                    ligne = this.getLigne( i );
                    colonne = autreMatrice.getColonne( j );
                    nouvelleMatrice.setElement( i, j, produitLigneParColonne( ligne, colonne ) );
                }
            }
        } else {
            throw new MatriceException();
        }
        return nouvelleMatrice;
        
    }

    /**
     * Construit la transposee de cette elements.
     * @return la transposee de cette elements.
     */
    @Override
    public IMatrice transposee(){
        
        IMatrice nouvelleMatrice = new Matrice( getNumColonnes(), getNumLignes(), 0 );
        for( int i = 0; i < getNumLignes(); i++ ) { 
            for( int j = 0; j < getNumColonnes(); j++ ) {
                //Recuperation de l'element aux coordonnees (x,y) de la matrice 
                //source afin de le placer dans la nouvelle matrice aux 
                //coordonnees (y,x)
                nouvelleMatrice.setElement( j, i, this.getElement( i, j ) );
            }
        }        
        return nouvelleMatrice;
        
    }
    
    /**
     * Calcule le produit de la ligne i de matrice par la colonne j de autreMatrice
     * @param ligne tableau equivalent aux elements de la ligne i de la matrice
     * sur laquelle la methode «produit (IMatrice autreMatrice)» a ete appelee
     * @param colonne tableau equivalent aux elements de la colonne j de autreMatrice
     * passe en parametre dans la methode «produit (IMatrice autreMatrice)»
     * 
     * Exemple:
     *                 [ 3 ]
     *                 [ 2 ]       (1 * 3) + (2 * 2) + (0 * 1) + (7 * 0) + (5 * 2)
     * [ 1 2 0 7 5 ]   [ 1 ]                              =
     *                 [ 0 ]                              17
     *                 [ 2 ]
     * Ligne i de      Ligne j de                    e(i,j) = 17
     * matrice         autreMatrice          dans la matrice resultante
     * 
     * @return le produit obtenu par la multiplication de la ligne i de matrice 
     * par la colonne j de autreMatrice de la methode «produit (IMatrice autreMatrice)» 
     */
    private double produitLigneParColonne( double[] ligne, double[] colonne ) {
        
        double sommeDesProduits = 0;
        for( int i = 0; i < ligne.length; i++ ) {
            sommeDesProduits = sommeDesProduits + ligne[ i ] * colonne[ i ];
        }
        return sommeDesProduits;
        
    }
    
    /**
     * Retourne une representation sous forme de chaine de caracteres de cette
     * elements. 
     * Exemple de la representation d'une elements de 3 lignes par 2 colonnes :
     *  
     *                                   [     9,0     5,0  ]
     *                                   [     6,0     7,0  ]
     *                                   [     7,0     4,0  ]
     *  
     * NOTE : Cette methode fonctionne pour les matrices dont tous les 
     * elements sous forme de chaine de caracteres ne contiennent pas plus de 7 
     * caracteres. Les elements sont arrondis a une decimale.
     * @return une representation sous forme de chaine de caracteres de cette
     * elements.
     */
    @Override
    public String toString() {
       final DecimalFormat DEC_FORMAT = new DecimalFormat("0.0");
       final int ESP = 8; 
       int num;
       String sTmp;
       String s = "[";
       for (int i = 0 ; i < (numLignes * numColonnes) ; i++) {
          //etendre i sur ESP colonnes
          sTmp = "";
          num =  ESP - DEC_FORMAT.format(elements.get(i)).length();
          for (int j = 0 ; j < num ; j++) {
             sTmp = sTmp + " ";
          }
          sTmp = sTmp + DEC_FORMAT.format(elements.get(i));

          if (i != 0 && i % numColonnes == 0) {
             s = s + "  ]\n[" + sTmp; 
          } else {
             s = s + sTmp;
          }
       }
       s = s + "  ]";
       return s;
    }
    
    /**
     * Retourne un boolean reflatant l'egalite entre 2 objets de type Matrice ou
     * IMatrice.
     * 2 IMatrices ou Matrices sont dites egales si elles sont de même dimension
     * et si tous les elements aux positions ( x, y ) de la matrice sont egales 
     * aux elements aux positions ( x, y ) de la matrice passee en parametres.
     * @param autreMatrice la matrice a comparer avec la matrice sur laquelle 
     * la methode est appelee.
     * @return une valeur boolean: true si les deux matrices sont egales.
     */
    @Override
    public boolean equals( Object autreMatrice ) {
        
        boolean egalite = true;
        int i = 0;
        int j = 0;
        
        if( autreMatrice != null
                && autreMatrice instanceof Matrice
                && getNumLignes() == ((Matrice)autreMatrice).getNumLignes()
                && getNumColonnes() == ((Matrice)autreMatrice).getNumColonnes() ) {
            do {
                do {
                    if ( this.getElement( i, j ) 
                                != ((Matrice)autreMatrice).getElement( i, j ) ) {
                            egalite = false;
                    }
                    j++;
                } while ( j < getNumColonnes() && egalite == true );
                i++;
                j = 0;
            } while( i < getNumLignes() && egalite == true );
        } else {
            egalite = false;
        }
        return egalite;
        
    }

 }
