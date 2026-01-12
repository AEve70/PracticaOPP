package PracticaOPP.Ejercicios1201.Ej1;
import javax.swing.JOptionPane;
public class RecuperacionCuenta extends Authentication {
    
    void recoverAccount(String email){
        
        if(authenticate(email)) JOptionPane.showMessageDialog(null,"Account recovery completed.");
    }
    
}
