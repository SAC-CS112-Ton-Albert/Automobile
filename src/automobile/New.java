/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobile;

/**
 *
 * @author albertton
 */
public interface New {
    
    public void Automobile (int caryear, String carmake, String carmodel, String carcolor, String carname, int cargears, int carcycle);
    
    public void car (int carcycle);
            
         
	public int returnSpeed ();
    
	public String returnSound ();
        
        public String returnName ();
    
	public int returnCurrentGear ();
    
	public int returnDistance ();
	
    @Override
        public String toString();
        
}

