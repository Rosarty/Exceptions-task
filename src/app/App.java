package app;

import app.controller.DataHandler;
import app.view.DataProvider;
import app.view.Outputer;

public class App {
    public static void main(String[] args) {
        Outputer outputer = new Outputer();
        DataProvider provider = new DataProvider();
        String data = provider.getData();

        DataHandler handler = new DataHandler();
        outputer.getOutput(handler.handleData(data));

        outputer.getOutput("Some code.");
    }


}
