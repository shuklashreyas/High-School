/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.Stack;

/**
 *
 * @author shreyasshukla
 */
public class operations 
{
    private Stack<userInput> undo;
    private Stack<userInput> redo;

    public operations() 
    {
        this.undo = new Stack<userInput>();
        this.redo = new Stack<userInput>();
    }

    public void addUndo(int source,int destination)
    {
        userInput ui = new userInput(source,destination);
        this.undo.push(ui);
    }
    
    public userInput undo()
    {
        if(undo.isEmpty())
        {
            return null;
        }
        userInput ui = undo.pop();
        redo.push(ui);
        return ui;
    }
    
    public userInput redo()
    {
        if(redo.isEmpty())
        {
            return null;
        }
         
        userInput ui = redo.pop();
        undo.push(ui);
        return ui;
    }
    
    
    
}
