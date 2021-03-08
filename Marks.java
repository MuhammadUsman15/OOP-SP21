/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marks;

/**
 *
 * @author cui
 */
public class Marks {

    public int bioMarks,mathMarks,chemMarks;
    public Marks(){
        bioMarks = 80;
        mathMarks = 99;
        chemMarks = 85;
    }
    public Marks(int bM,int mM,int cM){
        bioMarks = bM;
        mathMarks = mM;
        chemMarks = cM;
    }
    public int CalculateSum(){
        return(bioMarks+mathMarks+chemMarks);
    }
}
