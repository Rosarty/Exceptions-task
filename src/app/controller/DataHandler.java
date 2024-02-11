package app.controller;

import app.model.DataValidator;
import app.utils.HeightException;

public class DataHandler {
    public String handleData(String data) {
        DataValidator validator = new DataValidator();

        try {

            return validator.validateHeight(validator.validateInputData(data));
        } catch (IllegalArgumentException | HeightException e) {

            return e.getMessage();
        }
    }
}
