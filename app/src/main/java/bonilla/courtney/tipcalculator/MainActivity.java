package bonilla.courtney.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private TextView tip, total, label;
    private EditText bill;
    private Button one, two, three, four, five, six, seven, eight, nine, ten;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bill = (EditText) findViewById(R.id.bill);
        tip = (TextView) findViewById(R.id.tip);
        total = (TextView) findViewById(R.id.total);
        label = (TextView) findViewById(R.id.label);

        final NumberFormat formatter = new DecimalFormat("#0.00");



//for buttons 1-3, tip percentage is 10%
        //calculate the total from tip= (percentage * total bill) + total bill

        one = (Button) findViewById(R.id.button1);
        one.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (view.getId() == R.id.button1) {
                    double amount = Double.parseDouble(bill.getText().toString());
                    double tip_per = 0.10;
                    tip.setText("Tip Percentage: " + Double.toString(tip_per));
                    double tip_cal = (amount * tip_per) + amount;

                    String totalAmt = formatter.format(tip_cal);
                    total.setText("Result : $" + totalAmt);
                }
            }
        });

        two = (Button) findViewById(R.id.button2);
        two.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (view.getId() == R.id.button2) {
                    double amount = Double.parseDouble(bill.getText().toString());
                    double tip_per = (0.10);
                    tip.setText("Tip Percentage: " + Double.toString(tip_per));
                    double tip_cal = (amount * tip_per) + amount;

                    String totalAmt = formatter.format(tip_cal);
                    total.setText("Result : $" + totalAmt);
                }
            }
        });
        three = (Button) findViewById(R.id.button3);
        three.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.button3) {
                    double amount = Double.parseDouble(bill.getText().toString());
                    double tip_per = (0.10);
                    tip.setText("Tip Percentage: " + Double.toString(tip_per));
                    double tip_cal = (amount * tip_per) + amount;

                String totalAmt = formatter.format(tip_cal);
                total.setText("Result : $" + totalAmt);
                }
            }
        });
//for buttons 4-5 tip percentage is 13%
        four = (Button) findViewById(R.id.button4);
        four.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (view.getId() == R.id.button4) {
                    double amount = Double.parseDouble(bill.getText().toString());
                    double tip_per = (0.13);
                    tip.setText("Tip Percentage: " + Double.toString(tip_per));
                    double tip_cal = (amount * tip_per) + amount;

                    String totalAmt = formatter.format(tip_cal);
                    total.setText("Result : $" + totalAmt);
                }
            }
        });
        five = (Button) findViewById(R.id.button5);
        five.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (view.getId() == R.id.button5) {
                    double amount = Double.parseDouble(bill.getText().toString());
                    double tip_per = (0.13);
                    tip.setText("Tip Percentage: " + Double.toString(tip_per));
                    double tip_cal = (amount * tip_per) + amount;

                    String totalAmt = formatter.format(tip_cal);
                    total.setText("Result : $" + totalAmt);
                }
            }
        });

//for buttons 6-7 tip percentage is 15%
        six = (Button) findViewById(R.id.button6);
        six.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (view.getId() == R.id.button6) {
                    double amount = Double.parseDouble(bill.getText().toString());
                    double tip_per = (0.15);
                    tip.setText("Tip Percentage: " + Double.toString(tip_per));
                    double tip_cal = (amount * tip_per) + amount;

                    String totalAmt = formatter.format(tip_cal);
                    total.setText("Result : $" + totalAmt);
                }
            }
        });
        seven = (Button) findViewById(R.id.button7);
        seven.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (view.getId() == R.id.button7) {
                    double amount = Double.parseDouble(bill.getText().toString());
                    double tip_per = (0.15);
                    tip.setText("Tip Percentage: " + Double.toString(tip_per));
                    double tip_cal = (amount * tip_per) + amount;

                    String totalAmt = formatter.format(tip_cal);
                    total.setText("Result : $" + totalAmt);
                }
            }
        });

//for buttons 8 and 9, tip percentage is 20%
        eight = (Button) findViewById(R.id.button8);
        eight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (view.getId() == R.id.button8) {
                    double amount = Double.parseDouble(bill.getText().toString());
                    double tip_per = (0.2);
                    tip.setText("Tip Percentage: " + Double.toString(tip_per));
                    double tip_cal = (amount * tip_per) + amount;

                    String totalAmt = formatter.format(tip_cal);
                    total.setText("Result : $" + totalAmt);
                }
            }
        });
        nine = (Button) findViewById(R.id.button9);
        nine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (view.getId() == R.id.button9) {
                    double amount = Double.parseDouble(bill.getText().toString());
                    double tip_per = (0.20);
                    tip.setText("Tip Percentage: " + Double.toString(tip_per));
                    double tip_cal = (amount * tip_per) + amount;

                    String totalAmt = formatter.format(tip_cal);
                    total.setText("Result : $" + totalAmt);
                }
            }
        });

//for a rating/button 10, tip percentage is 25%
        ten = (Button) findViewById(R.id.button10);
        ten.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (view.getId() == R.id.button10) {
                    double amount = Double.parseDouble(bill.getText().toString());
                    double tip_per = (0.25);
                    tip.setText("Tip Percentage: " + Double.toString(tip_per));
                    double tip_cal = (amount * tip_per) + amount;

                    String totalAmt = formatter.format(tip_cal);
                    total.setText("Result : $" + totalAmt);
                }
            }
        });

    }
}
