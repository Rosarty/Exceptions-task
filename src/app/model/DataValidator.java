package app.model;

import app.utils.HeightException;

public class DataValidator {
    private static final int HEIGHT_LOWER_LIMIT = 120;
    private static final int HEIGHT_UPPER_LIMIT = 355;

    public static final String INPUT_REGEX = "^\\d+$";


    public String validateInputData(String input) throws IllegalArgumentException {
        if (!input.matches(INPUT_REGEX))

            throw new IllegalArgumentException(input + " is wrong data!");

        return input;
    }


    public String validateHeight(String height) throws HeightException {

        if (Integer.parseInt(height) <= HEIGHT_LOWER_LIMIT) {

            throw new HeightException("Height " + height + " is lower of "
                    + HEIGHT_LOWER_LIMIT + "!");
        }
        if (Integer.parseInt(height) > HEIGHT_UPPER_LIMIT) {
            throw new HeightException("Height " + height + " is upper of "
                    + HEIGHT_UPPER_LIMIT + "!");
        }


        return "Height " + height + " is OK!";
    }
}

