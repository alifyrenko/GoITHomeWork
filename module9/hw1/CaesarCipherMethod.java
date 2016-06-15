package com.goit.gojavaonline.module9.hw1;

import java.util.*;

/**
 * Created by ANTON on 12.06.2016.
 */
public class CaesarCipherMethod {

    public static List<String> cipher(List<String> listToCipher) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to encode message - enter '1'");
        System.out.println("If you want to decode message - enter '2'");
        int cipher = scanner.nextInt();

        List<String> cipheredList = new ArrayList<>();

        for (int i = 0; i < listToCipher.size(); i++) {
            String cipheredWord;
            char[] arrayToCipher = listToCipher.get(i).toCharArray();
            cipheredWord = Cipher.makeArrayCipheredUnCiphered(arrayToCipher, cipher);
            cipheredList.add(cipheredWord);
        }

        cipheredList
                .stream()
                .forEach(p -> System.out.println(p));

        return cipheredList;
    }
}