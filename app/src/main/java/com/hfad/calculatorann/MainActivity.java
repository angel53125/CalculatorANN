package com.hfad.calculatorann;

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

        Button btn1 = (Button) findViewById(R.id.buttonOne);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn4 = (Button) findViewById(R.id.buttonFour);
        Button btn5 = (Button) findViewById(R.id.buttonFive);
        Button btn6 = (Button) findViewById(R.id.buttonSix);
        Button btn7 = (Button) findViewById(R.id.buttonSeven);
        Button btn8 = (Button) findViewById(R.id.buttonEight);
        Button btn9 = (Button) findViewById(R.id.buttonNine);
        Button btnPlus = (Button) findViewById(R.id.buttonPlus);
        Button btnPlusNeg = (Button) findViewById(R.id.buttonPlusNeg);
        Button btnMinus= (Button) findViewById(R.id.buttonMinus);
        Button btnClear = (Button) findViewById(R.id.buttonClear);
        Button btnMultiply = (Button) findViewById(R.id.buttonMultiplication);
        Button btnDivision = (Button) findViewById(R.id.buttonDivision);
        Button btnPercent = (Button) findViewById(R.id.buttonPercent);
        Button btnEquals= (Button) findViewById(R.id.buttonEqual);
        TextView tvTotal = (TextView) findViewById(R.id.textView);

        Button[] buttons = {btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,
                            btnMinus,btnPlus,btnClear,btnMultiply,btnDivision,btnPercent,btnEquals,btnPlusNeg};
        ArrayList<Double> nums = new ArrayList<Double>();
        ArrayList<String> operations = new ArrayList<String>();
        List<List> listOfMixedTypes = new ArrayList<List>();
        ArrayList<String> combineLists = new ArrayList<String>();
        final boolean isClear = true;
        final int[] size = {0};

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


                            tvTotal.append("1");

                           if(!tvTotal.getText().toString().isEmpty() && nums.size() >= 1 && nums.size() == size[0])
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
                            tvTotal.append("2");

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
                            tvTotal.append("3");

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
                            tvTotal.append("4");

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
                            tvTotal.append("5");

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
                            tvTotal.append("6");

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
                            tvTotal.append("7");

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
                            tvTotal.append("8");

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
                            tvTotal.append("9");

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
                            tvTotal.append("0");

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
                            if (nums.isEmpty())
                            {
                                nums.add(0.0);
                            }
                            if(!tvTotal.getText().toString().isEmpty())
                            {
                                nums.add(Double.parseDouble(tvTotal.getText().toString()));
                                size[0] = nums.size();
                                tvTotal.setText(subtraction(nums));
                                System.out.println(nums);
                                operations.add("-");
                                // System.out.println(nums.get((nums.size() + 1)).toString().isEmpty());
                            }
                            else
                                tvTotal.setText("");
                        }
                    });
                }

                if((Button) findViewById(R.id.buttonPlus) == buttons[i] )
                {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (nums.isEmpty())
                            {
                                nums.add(0.0);
                            }
                            if(!tvTotal.getText().toString().isEmpty())
                            {
                                nums.add(Double.parseDouble(tvTotal.getText().toString()));
                                size[0] = nums.size();
                                tvTotal.setText(addition(nums));
                                System.out.println(nums.size());
                                System.out.println(nums);
                                operations.add("+");
                               // System.out.println(nums.get((nums.size() + 1)).toString().isEmpty());
                            }
                            else
                                tvTotal.setText("");

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
                            nums.clear();
                            tvTotal.setText("");
                        }
                    });
                }
                if((Button) findViewById(R.id.buttonDivision) == buttons[i] )
                {

                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {



                            if(!tvTotal.getText().toString().isEmpty())
                            {
                                if (nums.isEmpty())
                                {
                                    nums.add(Double.parseDouble(tvTotal.getText().toString()) * Double.parseDouble(tvTotal.getText().toString()));
                                }
                                nums.add(Double.parseDouble(tvTotal.getText().toString()));
                                size[0] = nums.size();
                                tvTotal.setText(division(nums));
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
                            if (nums.isEmpty())
                            {
                                nums.add(1.0);
                            }
                            if(!tvTotal.getText().toString().isEmpty())
                            {
                                nums.add(Double.parseDouble(tvTotal.getText().toString()));
                                size[0] = nums.size();
                                tvTotal.setText(multiplication(nums));
                                System.out.println(nums);
                                operations.add("*");
                                // System.out.println(nums.get((nums.size() + 1)).toString().isEmpty());
                            }
                            else
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

                if((Button) findViewById(R.id.buttonEqual) == buttons[i] )
                {

                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(!tvTotal.getText().toString().isEmpty())
                            {
                                nums.add(Double.parseDouble(tvTotal.getText().toString()));
                                size[0] = nums.size();

                                for(int i = 1; i < nums.size();i++)
                                {
                                    System.out.println("Index:" + operations.indexOf("*"));
                                    System.out.println("List loop" + combineLists);

                                    if(nums.size() % 5 == 0) {
                                        //combineLists.add("(");
                                    }
                                    combineLists.add(Double.toString(nums.get(i)));
                                    if(i <= operations.size())
                                    {
                                        combineLists.add(operations.get(i - 1));
                                    }
                                    System.out.println("STart "+ i + ": "+ combineLists.size());
                                    if(combineLists.size() % 5  == 0 && combineLists.size() > 5)
                                    {
                                       // combineLists.add(")");
                                    }

                                }

                                System.out.println("Result List" + combineLists);
                                tvTotal.setText(results(combineLists,nums));
                                System.out.println(nums);
                                System.out.println(nums.get(operations.size()));
                                System.out.println(nums.get(operations.size() -1));
                                System.out.println(nums.get(operations.size() +1));
                                System.out.println(operations);
                                Equals(combineLists,nums);
                                operations.clear();
                                combineLists.clear();

                                // System.out.println(nums.get((nums.size() + 1)).toString().isEmpty());
                            }
                            else
                                tvTotal.setText("");

                        }
                    });

                }
            }
    }

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
        /*
        double total = 0;
        for (int i = 0; i < num.size(); i++) {
            total-= num.get(i);
        }
        return Double.toString(total);
        */
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

    public String percentage( ArrayList<Double> num)
    {
        return Double.toString(num.get(num.size()-1) / 100.0);
    }

    public String results(ArrayList<String> ops, ArrayList<Double> num)
    {

        /*
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

*/
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

        /*
        String op = "";
        for(int i = 0; i < ops.size();i++)
        {
           op += ops.get(i);
           System.out.println("Loop" + op);
        }

        System.out.println("FINAL" + op);
*/
        //System.out.println(temp);
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




}



