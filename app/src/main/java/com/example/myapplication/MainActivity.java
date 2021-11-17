package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import org.mariuszgromada.math.mxparser.*;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;



public class MainActivity extends AppCompatActivity {

    TextView calculatorScreen;

    String workings = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initTextViews();
    }

    private void initTextViews() {
        this.calculatorScreen = findViewById(R.id.calculatorScreen);
    }

    private void setWorkings(String givenValue){

        workings = workings + givenValue;
        calculatorScreen.setText(workings);
    }

    public void zeroOnClick(View view) {
        setWorkings("0");
    }

    public void oneOnClick(View view) {
        setWorkings("1");

    }

    public void twoOnClick(View view) {
        setWorkings("2");
    }

    public void threeOnClick(View view) {
        setWorkings("3");
    }

    public void fourOnClick(View view) {
        setWorkings("4");
    }

    public void fiveOnClick(View view) {
        setWorkings("5");
    }

    public void sixOnClick(View view) {
        setWorkings("6");
    }

    public void sevenOnClick(View view) {
        setWorkings("7");
    }

    public void eightOnClick(View view) {
        setWorkings("8");
    }

    public void nineOnClick(View view) {
        setWorkings("9");
    }

    public void dotOnClick(View view) {
        setWorkings(".");
    }

    public void plusOnClick(View view) {
        setWorkings("+");
    }

    public void minusOnClick(View view) {
        setWorkings("-");
    }

    public void multiplyOnClick(View view) {
        setWorkings("*");
    }

    public void divideOnClick(View view) {
        setWorkings("/");
    }

    public void rootOnClick(View view) {
        setWorkings("√");
    }

    public void clearOnClick(View view) {
        workings = "";
        calculatorScreen.setText(workings);
    }

    public void clearallOnClick(View view) {
        workings = "";
        calculatorScreen.setText(workings);
    }

    public void deleteOnClick(View view) {
        if(workings=="" || workings.isEmpty() || workings == null){}else{
        workings = calculatorScreen.getText().toString();
        workings = workings.substring(0, workings.length() - 1);
        calculatorScreen.setText(workings);}
    }

    public void equalOnClick(View view) {
        Expression exp = new Expression(workings);

        String result = String.valueOf(exp.calculate());
        calculatorScreen.setText(result);
    }

    public void plusMinusOnClick(View view) {
        String minusPlus = calculatorScreen.getText().toString();

        if(minusPlus.startsWith("-")){
            String newStr = calculatorScreen.getText().toString().replaceFirst("-","");
            workings = newStr;
            calculatorScreen.setText(workings);
            calculatorScreen.setText(workings);

        }
        else{
            String newStr = calculatorScreen.getText().toString().replaceFirst("","-");
            workings = newStr;
            calculatorScreen.setText(workings);
            calculatorScreen.setText(workings);

        }
    }
}
