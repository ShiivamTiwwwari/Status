/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package status;


public enum StatusCode {
    ZERO, ONE, TWO, THREE;

    public static StatusCode fromInput(String input) {
        try {
            return StatusCode.valueOf(input);
        } catch (IllegalArgumentException e) {
            return null; // Invalid input returns null
        }
    }
}