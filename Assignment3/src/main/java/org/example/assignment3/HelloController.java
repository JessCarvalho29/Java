package org.example.assignment3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.text.ParseException;
import java.util.Objects;

import static java.lang.Double.parseDouble;

public class HelloController {
    @FXML
    private Label calculationLabel;
    private String calculationNumbers = "";
    private String operator = "";
    private double firstPartCalculus = 0;
    private double secondPartCalculus = 0;
    private double finalResult = 0;


    @FXML
    protected void onButtonClick(ActionEvent event) throws ParseException {
        //https://stackoverflow.com/questions/45976471/getting-id-from-a-actionevent-in-javafx
        //https://stackoverflow.com/questions/7867834/get-button-name-from-actionlistener
        Button source = (Button) event.getSource();
        String buttonPressed = source.getText();

        if (Objects.equals(buttonPressed, "0")) {
            calculationNumbers += "0";
            calculationLabel.setText(calculationNumbers);
        } else if (Objects.equals(buttonPressed, "1")) {
            calculationNumbers += "1";
            calculationLabel.setText(calculationNumbers);
        } else if (Objects.equals(buttonPressed, "2")) {
            calculationNumbers += "2";
            calculationLabel.setText(calculationNumbers);
        } else if (Objects.equals(buttonPressed, "3")) {
            calculationNumbers += "3";
            calculationLabel.setText(calculationNumbers);
        } else if (Objects.equals(buttonPressed, "4")) {
            calculationNumbers += "4";
            calculationLabel.setText(calculationNumbers);
        } else if (Objects.equals(buttonPressed, "5")) {
            calculationNumbers += "5";
            calculationLabel.setText(calculationNumbers);
        } else if (Objects.equals(buttonPressed, "6")) {
            calculationNumbers += "6";
            calculationLabel.setText(calculationNumbers);
        } else if (Objects.equals(buttonPressed, "7")) {
            calculationNumbers += "7";
            calculationLabel.setText(calculationNumbers);
        } else if (Objects.equals(buttonPressed, "8")) {
            calculationNumbers += "8";
            calculationLabel.setText(calculationNumbers);
        } else if (Objects.equals(buttonPressed, "9")) {
            calculationNumbers += "9";
            calculationLabel.setText(calculationNumbers);
        } else if (Objects.equals(buttonPressed, "%")) {
            String result;
            if (firstPartCalculus > 0 && secondPartCalculus == 0) {
                firstPartCalculus = parseDouble(calculationNumbers) / 100;
                result = firstPartCalculus + "";
            } else {
                secondPartCalculus = parseDouble(calculationNumbers) / 100;
                result = secondPartCalculus + "";
            }

            calculationLabel.setText(result+"%");
            calculationNumbers = result;

        } else if (Objects.equals(buttonPressed, "+")) {
            operator = buttonPressed;
            firstPartCalculus = parseDouble(calculationNumbers);
            calculationNumbers = "";
            calculationLabel.setText("+");
        } else if (Objects.equals(buttonPressed, "-")) {
            operator = buttonPressed;
            firstPartCalculus = parseDouble(calculationNumbers);
            calculationNumbers = "";
            calculationLabel.setText("-");
        } else if (Objects.equals(buttonPressed, "/")) {
            operator = buttonPressed;
            firstPartCalculus = parseDouble(calculationNumbers);
            calculationNumbers = "";
            calculationLabel.setText("/");
        } else if (Objects.equals(buttonPressed, "*")) {
            operator = buttonPressed;
            firstPartCalculus = parseDouble(calculationNumbers);
            calculationNumbers = "";
            calculationLabel.setText("*");
        } else if (Objects.equals(buttonPressed, ".")) {
            if (!calculationNumbers.contains(".")) {
                calculationNumbers += ".";
                calculationLabel.setText(calculationNumbers);
            }
        } else if (Objects.equals(buttonPressed, "=")) {
            secondPartCalculus = parseDouble(calculationNumbers);

            switch (operator) {
                case "+":
                    finalResult = firstPartCalculus + secondPartCalculus;
                    break;
                case "-":
                    finalResult = firstPartCalculus - secondPartCalculus;
                    break;
                case "*":
                    finalResult = firstPartCalculus * secondPartCalculus;
                    break;
                case "/":
                    finalResult = firstPartCalculus / secondPartCalculus;
                    break;
            }
            operator = "";
            String finalValue = finalResult + "";
            calculationLabel.setText(finalValue);
            calculationNumbers = finalValue;

        } else if (Objects.equals(buttonPressed, "AC")) {
            operator = "";
            calculationNumbers = "";
            finalResult = 0;
            firstPartCalculus = 0;
            secondPartCalculus = 0;
            calculationLabel.setText(calculationNumbers);
        } else if (Objects.equals(buttonPressed, "+/-")) {
            String changeSignal;
            if (firstPartCalculus > 0 && secondPartCalculus == 0) {
                firstPartCalculus = parseDouble(calculationNumbers) * -1;
                changeSignal = firstPartCalculus + "";
            } else {
                secondPartCalculus = parseDouble(calculationNumbers) * -1;
                changeSignal = secondPartCalculus + "";
            }

            calculationLabel.setText(changeSignal);
            calculationNumbers = changeSignal;
        }


    }
}