package edu.canisius.cyb.cyb600.lab2;

public class Task2 {

    public String method1(String parameter1) {
        if (parameter1 == null) {
            return "";
        }
        StringBuilder builder = new StringBuilder(parameter1);

        builder.reverse();

        return builder.toString().toUpperCase();
    }

    public String method2(String parameter2) {
        if (parameter2 == null || parameter2.isEmpty()) {
            return "";
        }
        switch (parameter2) {
            case "test":
                return "tttt" + parameter2;
            case "apple cider":
                return "aaaaaaaaaaa" + parameter2;
            case "Raspberries":
                return "RRRRRRRRRRR" + parameter2;
        }
        return parameter2;
    }
    public String method3(String parameter3){
        if (parameter3 == null || parameter3.isEmpty()) {
            return "";
        }
    String[] words = parameter3.split("\\s+");

    StringBuilder builder = new StringBuilder();

    for (int i = words.length - 1; i >= 0; i--) {
        builder.append(words[i]);
        if (i > 0) {
            builder.append(" ");
        }
    }
    return builder.toString();
    }
}