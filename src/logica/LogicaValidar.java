/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author JuanGutierrezMorales
 */
public class LogicaValidar {
    static public String validar(String tipoValidacion, String jTxtFldValor){
        String resultado = "";
        
        switch (tipoValidacion){
            case ("cp"):
                if(jTxtFldValor.length() == 5){
                    resultado = "";
                    break;
                }else {
                    resultado = "El codigo postal NO es correcto";
                    break;
                }
            case ("dni"):
                if(jTxtFldValor.length() == 9){
                    resultado = "";
                    break;
                }else {
                    resultado = "El DNI NO es correcto";
                    break;
                }
            case ("correo"):
                if(jTxtFldValor.contains("@")){
                    resultado = "";
                    break;
                }else {
                    resultado = "El email NO es correcto";
                    break;
                }
        }
        return resultado;
    }
}
