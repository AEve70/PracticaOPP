package PracticaOPP.Ejercicios1201.Ej1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        RecuperacionCuenta recovery = new RecuperacionCuenta();
        RegistroUsuario userR = new RegistroUsuario();

        String email = JOptionPane.showInputDialog("Enter your email for registration:");
        userR.registerUser(email);
        recovery.recoverAccount(email);
    }
}
