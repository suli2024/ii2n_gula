/*
* File: Pyramid.java
* Author: Erős István
* Copyright: 2024, Erős István
* Group: II-2-N
* Date: 2024-11-28
* Github: https://github.com/erosistvan/
* Licenc: MIT
*/

import java.util.Scanner;

public class Pyramid {
    public void startCalc() {
        System.out.println("Gúla térfogat számítása");

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Oldal: ");
        String sideStr = sc.nextLine();
        Double side = Double.parseDouble(sideStr);

        System.out.print("Magasság: ");
        String heightStr = sc.nextLine();
        Double height = Double.parseDouble(heightStr);

        Double volume = 1.0/3.0* Math.pow(side, 2)*height;
        System.out.printf("Térfogat: %f\n", volume);
        sc.close();
    }
}
