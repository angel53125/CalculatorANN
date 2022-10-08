package com.hfad.calculatorann;

//@author Angel Negron

//This calculator preforms mathmatical operations
//Utilizes pemdas and other various math functions
/**
 * Note
I attempted to salvage my original code
Which was a bad idea leading to some very messy/not so mature code
 I see now there was a lot I could have done better if I was not so
 Stubborn from the start
 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.buttonOne);    //value of number 1
        Button btn2 = (Button) findViewById(R.id.button2);  //value of number 2
        Button btn3 = (Button) findViewById(R.id.button3);  //value of number 3
        Button btn4 = (Button) findViewById(R.id.buttonFour);   //value of number 4
        Button btn5 = (Button) findViewById(R.id.buttonFive);   //value of number 5
        Button btn6 = (Button) findViewById(R.id.buttonSix);    //value of number 6
        Button btn7 = (Button) findViewById(R.id.buttonSeven);  //value of number 7
        Button btn8 = (Button) findViewById(R.id.buttonEight);  //value of number 8
        Button btn9 = (Button) findViewById(R.id.buttonNine);   //value of number 9
        Button btnPlus = (Button) findViewById(R.id.buttonPlus);    //value of plus sign
        Button btnPlusNeg = (Button) findViewById(R.id.buttonPlusNeg);  //Make num negative or positive
        Button btnMinus= (Button) findViewById(R.id.buttonMinus);   //Subtract values
        Button btnClear = (Button) findViewById(R.id.buttonClear);  //Clear all data
        Button btnMultiply = (Button) findViewById(R.id.buttonMultiplication);  //Multiply numbers
        Button btnDivision = (Button) findViewById(R.id.buttonDivision);    //Divide numbers
        Button btnPercent = (Button) findViewById(R.id.buttonPercent);  //vPercent values
        Button btnEquals= (Button) findViewById(R.id.buttonEqual);  //Preform all operations
        Button btnDecimal= (Button) findViewById(R.id.buttonDecimal);   //Add a decimal point
        Button btnZero= (Button) findViewById(R.id.buttonZero); //Value of number 0
        TextView tvTotal = (TextView) findViewById(R.id.textView);  //text view

        //Place all Buttons into an array List
        Button[] buttons = {btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,
                            btnMinus,btnPlus,btnClear,btnMultiply,btnDivision,btnPercent,btnEquals,btnPlusNeg,btnDecimal,btnZero};


        ArrayList<Double> nums = new ArrayList<Double>();   //Holds Array list of double numbers
        ArrayList<String> operations = new ArrayList<String>(); //Holds operations Values
        ArrayList<String> combineLists = new ArrayList<String>(); //Combinded list of operations and numbers as strings
        final int[] size = {0};     //Size of the changing number array list, it changes with the array list as it grows

        /*
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTotal.setText(buttonPressed(buttons));

            }


        });*/
            for(int i = 0; i < buttons.length;i++)
            {
                System.out.println(i);
                if((Button) findViewById(R.id.buttonOne) == buttons[i] )
                {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            //Adds n to text view
                            tvTotal.append("1");

                            //This makes sure the user can continue to press 1 without reseting text by
                            //Checking if the text is empty, checking that the number list is greter or equal to n that the size of the array list
                            //is the same as the size variable, and that the text view is not an empty string
                           if(!tvTotal.getText().toString().isEmpty() && nums.size() >= 1 && nums.size() == size[0] || tvTotal.getText() == "")
                           {
                               tvTotal.setText("");
                               tvTotal.append("1");
                               size[0]++;
                           }
                        }
                    });
                }

                if((Button) findViewById(R.id.button2) == buttons[i] )
                {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            //Adds n to text view
                            tvTotal.append("2");

                            //This makes sure the user can continue to press 1 without reseting text by
                            //Checking if the text is empty, checking that the number list is greter or equal to n that the size of the array list
                            //is the same as the size variable, and that the text view is not an empty string
                            if(!tvTotal.getText().toString().isEmpty() && nums.size() >= 1 && nums.size() == size[0])
                            {
                                tvTotal.setText("");
                                tvTotal.append("2");
                                size[0]++;
                            }
                        }
                    });
                }

                if((Button) findViewById(R.id.button3) == buttons[i] )
                {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            //Adds n to text view
                            tvTotal.append("3");

                            //This makes sure the user can continue to press 1 without reseting text by
                            //Checking if the text is empty, checking that the number list is greter or equal to n that the size of the array list
                            //is the same as the size variable, and that the text view is not an empty string
                            if(!tvTotal.getText().toString().isEmpty() && nums.size() >= 1 && nums.size() == size[0])
                            {
                                tvTotal.setText("");
                                tvTotal.append("3");
                                size[0]++;
                            }
                        }
                    });
                }

                if((Button) findViewById(R.id.buttonFour) == buttons[i] )
                {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            //Adds n to text view
                            tvTotal.append("4");

                            //This makes sure the user can continue to press 1 without reseting text by
                            //Checking if the text is empty, checking that the number list is greter or equal to n that the size of the array list
                            //is the same as the size variable, and that the text view is not an empty string
                            if(!tvTotal.getText().toString().isEmpty() && nums.size() >= 1 && nums.size() == size[0])
                            {
                                tvTotal.setText("");
                                tvTotal.append("4");
                                size[0]++;
                            }
                        }
                    });
                }

                if((Button) findViewById(R.id.buttonFive) == buttons[i] )
                {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            //Adds n to text view
                            tvTotal.append("5");

                            //This makes sure the user can continue to press 1 without reseting text by
                            //Checking if the text is empty, checking that the number list is greter or equal to n that the size of the array list
                            //is the same as the size variable, and that the text view is not an empty string
                            if(!tvTotal.getText().toString().isEmpty() && nums.size() >= 1 && nums.size() == size[0])
                            {
                                tvTotal.setText("");
                                tvTotal.append("5");
                                size[0]++;
                            }
                        }
                    });
                }
                if((Button) findViewById(R.id.buttonSix) == buttons[i] )
                {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            //Adds n to text view
                            tvTotal.append("6");

                            //This makes sure the user can continue to press 1 without reseting text by
                            //Checking if the text is empty, checking that the number list is greter or equal to n that the size of the array list
                            //is the same as the size variable, and that the text view is not an empty string
                            if(!tvTotal.getText().toString().isEmpty() && nums.size() >= 1 && nums.size() == size[0])
                            {
                                tvTotal.setText("");
                                tvTotal.append("6");
                                size[0]++;
                            }
                        }
                    });
                }


                if((Button) findViewById(R.id.buttonSeven) == buttons[i] )
                {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            //Adds n to text view
                            tvTotal.append("7");

                            //This makes sure the user can continue to press 1 without reseting text by
                            //Checking if the text is empty, checking that the number list is greter or equal to n that the size of the array list
                            //is the same as the size variable, and that the text view is not an empty string
                            if(!tvTotal.getText().toString().isEmpty() && nums.size() >= 1 && nums.size() == size[0])
                            {
                                tvTotal.setText("");
                                tvTotal.append("7");
                                size[0]++;
                            }
                        }
                    });
                }


                if((Button) findViewById(R.id.buttonEight) == buttons[i] )
                {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            //Adds n to text view
                            tvTotal.append("8");

                            //This makes sure the user can continue to press 1 without reseting text by
                            //Checking if the text is empty, checking that the number list is greter or equal to n that the size of the array list
                            //is the same as the size variable, and that the text view is not an empty string
                            if(!tvTotal.getText().toString().isEmpty() && nums.size() >= 1 && nums.size() == size[0])
                            {
                                tvTotal.setText("");
                                tvTotal.append("8");
                                size[0]++;
                            }
                        }
                    });
                }


                if((Button) findViewById(R.id.buttonNine) == buttons[i] )
                {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            //Adds n to text view
                            tvTotal.append("9");

                            //This makes sure the user can continue to press 1 without reseting text by
                            //Checking if the text is empty, checking that the number list is greter or equal to n that the size of the array list
                            //is the same as the size variable, and that the text view is not an empty string
                            if(!tvTotal.getText().toString().isEmpty() && nums.size() >= 1 && nums.size() == size[0])
                            {
                                tvTotal.setText("");
                                tvTotal.append("9");
                                size[0]++;
                            }
                        }
                    });
                }

                if((Button) findViewById(R.id.buttonZero) == buttons[i] )
                {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            //Adds n to text view
                            tvTotal.append("0");

                            //This makes sure the user can continue to press 1 without reseting text by
                            //Checking if the text is empty, checking that the number list is greter or equal to n that the size of the array list
                            //is the same as the size variable, and that the text view is not an empty string
                            if(!tvTotal.getText().toString().isEmpty() && nums.size() >= 1 && nums.size() == size[0])
                            {
                                tvTotal.setText("");
                                tvTotal.append("0");
                                size[0]++;
                            }
                        }
                    });
                }

                if((Button) findViewById(R.id.buttonMinus) == buttons[i] )
                {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            //Adds a number if operation button is hit
                            if (nums.isEmpty())
                            {
                                nums.add(0.0);
                            }

                            //Adds subtraction element to operations list
                            if(!tvTotal.getText().toString().isEmpty())
                            {
                                nums.add(Double.parseDouble(tvTotal.getText().toString()));
                                size[0] = nums.size();
                                tvTotal.setText(Double.toString(nums.get(nums.size()-1)));
                                System.out.println(nums);
                                operations.add("-");
                                // System.out.println(nums.get((nums.size() + 1)).toString().isEmpty());
                            }
                            else
                                tvTotal.setText(""); //Sets text to empty string
                        }
                    });
                }

                if((Button) findViewById(R.id.buttonPlus) == buttons[i] )
                {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            //Adds a number if operation button is hit
                            if (nums.isEmpty())
                            {
                                nums.add(0.0);
                            }
                            //Adds operation element to operations list
                            if(!tvTotal.getText().toString().isEmpty())
                            {
                                nums.add(Double.parseDouble(tvTotal.getText().toString()));
                                size[0] = nums.size();
                                tvTotal.setText(Double.toString(nums.get(nums.size()-1)));
                                System.out.println(nums.size());
                                System.out.println(nums);
                                operations.add("+");
                               // System.out.println(nums.get((nums.size() + 1)).toString().isEmpty());
                            }
                            else
                                tvTotal.setText(""); //Sets text to empty string

                        }
                    });
                }

                //This Button Will empty the number list and
                //Change the number on screen to 0
                if((Button) findViewById(R.id.buttonClear) == buttons[i] )
                {

                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            //Set all array list to empty
                            nums.clear();
                            operations.clear();
                            combineLists.clear();
                            tvTotal.setText("");
                        }
                    });
                }
                if((Button) findViewById(R.id.buttonDivision) == buttons[i] )
                {

                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            //Adds operation element to operations list
                            if(!tvTotal.getText().toString().isEmpty())
                            {
                                if (nums.isEmpty())
                                {
                                    nums.add(Double.parseDouble(tvTotal.getText().toString()) * Double.parseDouble(tvTotal.getText().toString()));
                                }
                                nums.add(Double.parseDouble(tvTotal.getText().toString()));
                                size[0] = nums.size();
                                tvTotal.setText(Double.toString(nums.get(nums.size()-1)));
                                System.out.println(nums);
                                System.out.println("divison");
                                operations.add("/");
                                // System.out.println(nums.get((nums.size() + 1)).toString().isEmpty());
                            }
                            else
                                tvTotal.setText("");

                        }
                    });
                }
                if((Button) findViewById(R.id.buttonMultiplication) == buttons[i] )
                {

                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                                if (nums.isEmpty()) {
                                    nums.add(1.0);
                                }
                            //Adds operation element to operations list
                                if (!tvTotal.getText().toString().isEmpty()) {
                                    nums.add(Double.parseDouble(tvTotal.getText().toString()));
                                    size[0] = nums.size();
                                    tvTotal.setText(Double.toString(nums.get(nums.size() - 1)));
                                    System.out.println(nums);
                                    operations.add("*");
                                    // System.out.println(nums.get((nums.size() + 1)).toString().isEmpty());
                                } else
                                    tvTotal.setText("");
                            }
                    });

                }

                if((Button) findViewById(R.id.buttonPlusNeg) == buttons[i] )
                {

                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                                if (!tvTotal.getText().toString().isEmpty() && tvTotal.getText().toString() != "0") {

                                    //Makes a number positive or negative
                                    if(nums.isEmpty())
                                    {
                                        nums.add(Double.parseDouble(tvTotal.getText().toString()));
                                    }
                                    tvTotal.setText(Double.toString(Double.parseDouble(tvTotal.getText().toString()) * -1));
                                    System.out.println(nums);
                                    // System.out.println(nums.get((nums.size() + 1)).toString().isEmpty());
                                } else
                                    tvTotal.setText("");

                                nums.set(nums.size()-1,Double.parseDouble(tvTotal.getText().toString()) * -1);
                        }
                    });
                }

                if((Button) findViewById(R.id.buttonPercent) == buttons[i] )
                {

                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            //Turns a number into a percent
                            if (nums.isEmpty())
                            {
                                nums.add(1.0);
                            }
                            if(!tvTotal.getText().toString().isEmpty())
                            {
                                nums.add(Double.parseDouble(tvTotal.getText().toString()));
                                size[0] = nums.size();
                                tvTotal.setText(percentage(nums));
                                System.out.println(nums);
                                // System.out.println(nums.get((nums.size() + 1)).toString().isEmpty());
                            }
                            else
                                tvTotal.setText("");

                        }
                    });

                }
                if((Button) findViewById(R.id.buttonDecimal) == buttons[i] )
                {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            //adds decimal, and make sure only one is allowed
                            if(!tvTotal.getText().toString().contains(".")) {
                                tvTotal.append(".");
                            }

                            if(!tvTotal.getText().toString().isEmpty() && nums.size() >= 1 && nums.size() == size[0])
                            {
                                tvTotal.setText("");
                                tvTotal.append(".");
                                size[0]++;
                            }
                        }
                    });
                }
                if((Button) findViewById(R.id.buttonEqual) == buttons[i] )
                {

                    //Preforms all operations
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (!tvTotal.getText().toString().isEmpty()) {
                                //Adds last number entered
                                nums.add(Double.parseDouble(tvTotal.getText().toString()));

                                //sets size = to current num size last time num size will be changed
                                size[0] = nums.size();

                                //This is how I created a combined lists of operations and numbers
                                for (int i = 1; i < nums.size(); i++) {
                                   // System.out.println("Index:" + operations.indexOf("*"));
                                    //System.out.println("List loop" + combineLists);

                                   // if (nums.size() % 5 == 0) {
                                        //combineLists.add("(");
                                   // }
                                    combineLists.add(Double.toString(nums.get(i)));
                                    if (i <= operations.size()) {
                                        combineLists.add(operations.get(i - 1));
                                    }
                                   // System.out.println("STart " + i + ": " + combineLists.size());
                                   // if (combineLists.size() % 5 == 0 && combineLists.size() > 5) {
                                        // combineLists.add(")");
                                    //}

                                }


                                //These were used for debugging
                                System.out.println("Result List" + combineLists);
                                System.out.println(nums);
                                System.out.println(nums.get(operations.size()));
                                System.out.println(nums.get(operations.size() - 1));
                                System.out.println(nums.get(operations.size() + 1));
                                System.out.println(operations);

                                //Checks for operations and shortens the combined lists until result remains
                                int opIndex;

                                    while (combineLists.contains("*")) {
                                        opIndex = combineLists.indexOf("*");
                                        condensedResult(combineLists, opIndex);
                                        System.out.println(combineLists);
                                    }

                                    while (combineLists.contains("/")) {
                                        opIndex = combineLists.indexOf("/");
                                        if(Double.parseDouble(combineLists.get(combineLists.indexOf("/")-1)) != 0.0) {
                                            condensedResult(combineLists, opIndex);
                                        }
                                        else
                                            combineLists.clear();
                                            operations.clear();
                                            nums.clear();
                                            combineLists.add("Error");
                                        System.out.println(combineLists);
                                    }

                                    while (combineLists.contains("+")) {
                                        opIndex = combineLists.indexOf("+");
                                        condensedResult(combineLists, opIndex);
                                        System.out.println(combineLists);
                                    }

                                    while (combineLists.contains("-")) {
                                        opIndex = combineLists.indexOf("-");
                                        condensedResult(combineLists, opIndex);
                                        System.out.println(combineLists);
                                    }


                                    //Clear all data and displays the result does not include 0 / n
                                if(!combineLists.get(0).equals("Error")) {
                                    tvTotal.setText(combineLists.get(0));
                                    operations.clear();
                                    combineLists.clear();
                                    nums.clear();
                                }
                                else
                                    tvTotal.setText("");

                                    // System.out.println(nums.get((nums.size() + 1)).toString().isEmpty());
                                } else
                                    tvTotal.setText("");

                        }

                    });

                }
            }
    }

    /**
     * This method finds operator at operator index and performs calculation
     * with left and right number. Updates array list condensing the three part equation
     * into single number
     * @param combined holds string of operations and of numbers
     * @param operatorIndex holds index of an operation
     */
    public static void condensedResult( ArrayList<String> combined,int operatorIndex)
    {
        Double num1 = 0.0;

        if(combined.get(operatorIndex) == "*")
        {
            num1 = Double.parseDouble(combined.get(operatorIndex - 1)) * Double.parseDouble(combined.get(operatorIndex + 1));
        }
        if(combined.get(operatorIndex) == "/")
        {
                num1 = Double.parseDouble(combined.get(operatorIndex - 1)) / Double.parseDouble(combined.get(operatorIndex + 1));
        }
        if(combined.get(operatorIndex) == "+")
        {
            num1 = Double.parseDouble(combined.get(operatorIndex - 1)) + Double.parseDouble(combined.get(operatorIndex + 1));
        }
        if(combined.get(operatorIndex) == "-")
        {
            num1 = Double.parseDouble(combined.get(operatorIndex - 1)) - Double.parseDouble(combined.get(operatorIndex + 1));
        }
        combined.set(operatorIndex,Double.toString(num1));
        combined.remove(operatorIndex+1);
        combined.remove(operatorIndex-1);
        System.out.println("final ans " + num1);

    }

    /**
     * Converts a given number to a percentage
     * @param num is the number entered in the calculator
     * @return the number as percentage
     */
    public String percentage( ArrayList<Double> num)
    {
        return Double.toString(num.get(num.size()-1) / 100.0);
    }

  /*
    public String addition( ArrayList<Double> num)
    {

            double total = 0;
            for (int i = 0; i < num.size(); i++) {
                total+= num.get(i);
            }
            return Double.toString(total);

    }

    public String subtraction( ArrayList<Double> num)
    {

        double total = 0;
        for (int i = 0; i < num.size(); i++) {
            total-= num.get(i);
        }
        return Double.toString(total);

        return Double.toString(num.get(num.size()-2) - num.get(num.size() -1));
    }

    public String multiplication( ArrayList<Double> num)
    {
        return Double.toString(num.get(num.size()-2) * num.get(num.size() -1));
    }

    public String division( ArrayList<Double> num)
    {
        return Double.toString(num.get(num.size()-2) / num.get(num.size() -1));
    }



    public String results(ArrayList<String> ops, ArrayList<Double> num)
    {


        if (ops.contains("X"))
        {
            return Double.toString(num.get(ops.indexOf("X")+1) * num.get(ops.indexOf("X") + 2));
        }
        else if (ops.contains("/"))
        {

            return Double.toString(num.get(ops.size()) / num.get(ops.size() + 1));
        }
        else if (ops.contains("+"))
        {

            return Double.toString(num.get(ops.size()) + num.get(ops.size() + 1));
        }
        else
        {

            return Double.toString(num.get(ops.size()) - num.get(ops.size() + 1));
        }

        ArrayList<Double> temp = new ArrayList<Double>();
        double total = 0;
        if(ops.contains("X")) {
            for (int i = 0; i < ops.size(); i++) {
                if (ops.get(i).charAt(0) == 'X') {
                    System.out.println("location" + i);
                    if (total == 0) {
                        total = Double.parseDouble(ops.get(i - 1)) * Double.parseDouble(ops.get(i + 1));
                    } else
                        total = total * Double.parseDouble(ops.get(i + 1));
                    System.out.println("Total after multiplication" + total);
                }

            }
        }
        System.out.println("After multiplication: " + ops);
        if(ops.contains("+"))
        {
            for (int i = 0; i < ops.size(); i++) {
                if (ops.get(i).charAt(0) == '+') {
                    System.out.println("location" + i);
                    if (total == 0) {
                        total = Double.parseDouble(ops.get(i - 1)) + Double.parseDouble(ops.get(i + 1));
                    } else
                        total = total + Double.parseDouble(ops.get(i + 1));
                    System.out.println(ops.get(i + 1));
                    System.out.println("After addition" + total);
                }

            }
        }
        if(ops.contains("-"))
        {
            for (int i = 0; i < ops.size(); i++) {
                if (ops.get(i).charAt(0) == '-') {
                    System.out.println("location" + i);
                    if (total == 0) {
                        total = Double.parseDouble(ops.get(i - 1)) - Double.parseDouble(ops.get(i + 1));
                    } else
                        total = total - Double.parseDouble(ops.get(i + 1));
                    System.out.println(ops.get(i + 1));
                    System.out.println("After sub" + total);
                }

            }
        }
        if(ops.contains("/"))
        {
            for (int i = 0; i < ops.size(); i++) {
                if (ops.get(i).charAt(0) == '/') {
                    System.out.println("location" + i);
                    if (total == 0) {
                        total = Double.parseDouble(ops.get(i - 1)) / Double.parseDouble(ops.get(i + 1));
                    } else
                        total = total / Double.parseDouble(ops.get(i + 1));
                    System.out.println(ops.get(i + 1));
                    System.out.println("After div" + total);
                }
            }
        }


        String op = "";
        for(int i = 0; i < ops.size();i++)
        {
           op += ops.get(i);
           System.out.println("Loop" + op);
        }

        System.out.println("FINAL" + op);

        //System.out.println(temp);
        char ch2 = '(';
        char ch1 = ')';
        int ascii = ch2;
        System.out.println("Ascii code:" +ascii+3*2);
        return Double.toString(total);
    }

    public void Equals(ArrayList<String> combined, ArrayList<Double> num)
    {
        System.out.println("COmbine size" + combined.size());
        if ((combined.size()-1) % 2 == 0) {
            for (int i = 0; i < combined.size() - 1; i++) {
                System.out.println("Inloop");

                System.out.println("In first if" + i);
                if (i % 6 == 0) {
                    combined.add(i, "(");
                }
                if ((i % 6 == 4 && i != 0) || i == 4) {
                    combined.add(i, ")");
                }
            }
            combined.add(")");
        }

        String number = "";

        for(int i = 0; i < combined.size();i++)
        {
            number+= combined.get(i);
        }

       // double total = Double.parseDouble("(8.0*9.0)*(5.0+2.0)");
        System.out.println(number);
       // System.out.println(total);
        System.out.println(combined);

    }


     public String equal(ArrayList<String> combined, ArrayList<Double> num,final int[] size)
     {
         while (size[0] >1 )
             if(combined.contains('*'))
             {

             }
     }
 */





}



