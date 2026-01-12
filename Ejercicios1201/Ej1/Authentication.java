package PracticaOPP.Ejercicios1201.Ej1;
import javax.swing.JOptionPane;

class Authentication {
    
    public boolean authenticate(String email){
         
        if(email.contains("@") && email.contains(".")){
            JOptionPane.showMessageDialog(null, "Authentication successful for email: " + email);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Authentication failed for email: " + email);
            
        }

        return false;
    }
}
