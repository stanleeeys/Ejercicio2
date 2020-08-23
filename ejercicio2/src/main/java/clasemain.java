/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stanley
 */
public class clasemain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        profesor profe = new profesor("Stanley", "Chalatenango", "22/01/2001", "Masculino" ,19, "ninguno", "Videojuegos");
        System.out.println(profe.toString());
        
        estudiante est = new estudiante("Marta", "chalate", "01/05/2001", "F", 19, 1633, "Doctorado");
        System.out.println(est.toString());
    }
    
}
