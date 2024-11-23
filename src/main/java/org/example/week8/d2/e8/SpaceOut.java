package org.example.week8.d2.e8;

public class SpaceOut {
    public String spaceOut(String input) {
        StringBuilder spaced = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            spaced.append(input.charAt(i));
//if (i < input.length() - 1) {
                spaced.append(" ");


            }

        return spaced.toString();
    }
}

