package BattleField;
import java.util.HashMap;

import Exception.OutofBoundException;


/**
 * @author cong wang
 *
 * @param <Data> Generic data.
 * 
 * 
 */

public class BattleFieldMatrix<Data>{
	
	private int nbLigne;
	private int nbColonne;
	private Data data;
	
	HashMap<Integer, Data> ligne = new HashMap<Integer, Data>();
	
	@SuppressWarnings("rawtypes")
	HashMap<Integer,HashMap> matrice = new HashMap<Integer, HashMap>();
	
	/**
	 * Contructeur de battle field.
	 * @param nbLigne	Nombre de lignes.
	 * @param nbColonne	Nombre de colonnes.
	 */
	public  BattleFieldMatrix(int nbLigne, int nbColonne) {
		this.nbLigne = nbLigne;
		this.nbColonne = nbColonne;
		
		for(int i = 0; i < nbColonne; i++){
			this.ligne.put(new Integer(i),data); 
		}
		for(int i = 0; i< nbLigne; i++){
			this.matrice.put(new Integer(i), ligne);
		}
	}
	
	

	/**
	 * setter
	 * @param numLigne	Numero de ligne.
	 * @param numColonne	Numero de colonne.
	 * @param data		Generic data,la donnee dans la case.
	 */
	@SuppressWarnings("unchecked")
	public void set(int numLigne, int numColonne,Data data) {
		matrice.get(new Integer(numLigne-1)).put(new Integer(numColonne-1), data);
	}
	
	/**
	 * getter
	 * @param numLigne			Numero de ligne.
	 * @param numCol			Numero de colonne.
	 * @return Data 			
	 * @throws OutofBoundException		Si la case n'existe pas, on
	 */
	@SuppressWarnings("unchecked")
	public Data get(int numLigne, int numCol) throws OutofBoundException{
		if (existe(numLigne, numCol)) {
			return (Data) matrice.get(new Integer(numLigne-1)).get(new Integer(numCol-1));
		}else throw new OutofBoundException();
	}
	
	/**
	 * Tester si une case existe.
	 * @param numLigne			Numero de ligne.
	 * @param numCol			Numero de colonnes.
	 * @return				True, si il exsiste. False, si il n'existe pas.
	 * @throws OutofBoundException		
	 */
	public boolean existe(int numLigne, int numCol)throws OutofBoundException{
		return (0 <= numLigne-1 && numLigne-1 <= nbLigne && 0 <= numCol-1 && numCol-1 <= nbColonne );
	}
	
	
}
