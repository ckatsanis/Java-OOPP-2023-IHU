/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_11.Exceptions;

/**
 *
 * @author user
 */
public class InvalidBirthDateException extends Exception {
    public InvalidBirthDateException() {}
    public InvalidBirthDateException(String error) {
        super(error);
    }
}
