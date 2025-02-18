package org.example;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@NoArgsConstructor
public class ColorService {

    /* Ceci est la classe ColorService */

    public String getColorWheels () {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Yellow");
        colors.add("Pink");
        colors.add("Grey");

        Random rand = new Random();
        int n = rand.nextInt(7);

        return colors.get(n);
    }

    public String getColorWindshield () {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Yellow");
        colors.add("Pink");
        colors.add("Grey");

        Random rand = new Random();
        int n = rand.nextInt(7);

        return colors.get(n);
    }

    public String getColorWindow () {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Yellow");
        colors.add("Pink");
        colors.add("Grey");

        Random rand = new Random();
        int n = rand.nextInt(7);

        return colors.get(n);
    }

    public String getColorRoof () {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Yellow");
        colors.add("Pink");
        colors.add("Grey");

        Random rand = new Random();
        int n = rand.nextInt(7);

        return colors.get(n);
    }
}
