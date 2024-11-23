package org.example.week7.d6.e3;

public class E3StringManipulationsP4 {
    public static void main(String[] args) {

        String textMessage = "Hey! R u free 2day? Wanna grab lunch b4 class? LMK ASAP. THX!";
        System.out.println("Original Message: " + textMessage);
        String expandedMessage = textMessage
                .replace("R u", "Are you")
                .replace("2day", "today")
                .replace("Wanna", "Want to")
                .replace("b4", "before")
                .replace("LMK", "Let me know")
                .replace("ASAP", "as soon as possible")
                .replace("THX", "Thanks");
        System.out.println("Expanded Message: " + expandedMessage);

        ;

    }
}
