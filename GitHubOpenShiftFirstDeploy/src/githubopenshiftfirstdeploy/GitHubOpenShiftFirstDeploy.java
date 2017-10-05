/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubopenshiftfirstdeploy;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author burak
 */
public class GitHubOpenShiftFirstDeploy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("Başladı.");
            Thread.currentThread().sleep(1000);
            for (int i = 0; i < 10; i++) {
                System.out.println("Merhaba " + (i+1));
            }
            Thread.sleep(3000);
            System.out.println("Sonlandı.");
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted fail. Error msg : " + e.getMessage());
        }
    }
    
}
