package com.hridhinpt;

import java.security.KeyStore;
import java.util.Scanner;

public class keys {
    private String passCode;

    public keys() {
        this.passCode = "itsme";
    }

    public boolean check() {
        Scanner sc = new Scanner(System.in);
        String checkPassCode = sc.nextLine();

        if (passCode == checkPassCode) {
            return true;
        }
        return false;

    }
}
