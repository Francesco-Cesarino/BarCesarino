/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CesarinoBar;

import java.util.concurrent.Semaphore;
import javax.print.attribute.standard.SheetCollate;

public class Cameriere extends Thread
{
    protected static int ordinazioni = 0;
    protected static Semaphore semaforo = new Semaphore(1);
    
}
