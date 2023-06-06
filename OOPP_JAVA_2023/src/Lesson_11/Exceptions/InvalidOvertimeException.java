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
public class InvalidOvertimeException extends Exception {
    public InvalidOvertimeException() {}
    
    public InvalidOvertimeException(String error) {
        super(error);
    }
}
