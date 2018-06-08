/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author windows8.1pro
 */
public class Tugas {

    /**
     * SYALIMIN E1E117026
     */
    public static void main(String[] args) {
        System.out.println("Mencari Nilai maximum dan minimum");
        Scanner sc = new Scanner(System.in);
        int x[] = new int[100];
        int jml = 100,stop = 0;
        for (int i=0;i<jml;i++) {
            System.out.print("Masukan nilai "+(i+1)+ " = ");
            x[i] = sc.nextInt();
            if(x[i] <=-1 || x[i] >= 100) {
                jml =-1;
                stop = i;
                System.out.println("Berhenti");
            }
        }
        int max =x[0],min = x[0];
        for (int i=0;i<stop;i++) {
            if (x[i]>max) {
                max = x[i];
                
            }
            else if(x[i]<min) {
                min = x[i];
            }
        }
        System.out.println("Nilai Maksimum : " +max);
        System.out.println("Nilai Minimum : " +min);
    }
}
