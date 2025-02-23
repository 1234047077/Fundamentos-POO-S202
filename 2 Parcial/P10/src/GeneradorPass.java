/*Realizar una aplicación que genere passwords automáticos, solicitara
al usuario la longitud (8 caracteres por default), si quiere incluir
Mayúsculas o Caracteres especiales, dentro de las opciones que
tendrá agregar una para comprobar fortaleza del password*/

import javax.swing.*;
import java.util.Random;
import javax.swing.JOptionPane;
import java.security.SecureRandom;


 class GeneradorPass {

     public String generarContrasena(int longitud, boolean usarMayusculas, boolean usarEspeciales) {
         String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
         String letrasMayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         String numeros = "0123456789";
         String caracteresEspeciales = "!@#$%^&*()_+-=[]{}|;:,.<>?";

         String todosCaracteres = letrasMinusculas + numeros;
         if (usarMayusculas) {
             todosCaracteres += letrasMayusculas;
         }
         if (usarEspeciales) {
             todosCaracteres += caracteresEspeciales;
         }

         Random random = new Random();
         StringBuilder contrasena = new StringBuilder();

         for (int i = 0; i < longitud; i++) {
             int indice = random.nextInt(todosCaracteres.length());
             contrasena.append(todosCaracteres.charAt(indice));
         }

         return contrasena.toString();
     }

     public String comprobarFortaleza(String contrasena) {
         int fortaleza = 0;


         if (contrasena.length() >= 8) {
             fortaleza++;
         }
         if (contrasena.length() >= 12) {
             fortaleza++;
         }


         if (contrasena.matches(".*[A-Z].*")) {
             fortaleza++;
         }


         if (contrasena.matches(".*\\d.*")) {
             fortaleza++;
         }


         if (contrasena.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\",./<>?].*")) {
             fortaleza++;
         }


         if (fortaleza <= 2) {
             return "DÉBIL";
         } else if (fortaleza <= 4) {
             return "REGULAR";
         } else {
             return "FUERTE";
         }
     }
 }