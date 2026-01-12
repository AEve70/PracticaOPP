package PracticaOPP.Ejercicios1201.Ej1;
import javax.swing.JOptionPane;

public class RegistroUsuario extends Authentication {
    
    void registerUser(String email){

       if(authenticate(email)) JOptionPane.showMessageDialog(null,"User registered successfully.");
    }
}


