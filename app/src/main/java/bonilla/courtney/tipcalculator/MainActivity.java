package bonilla.courtney.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView bill, tip, total;
    private EditText label;
    private Button one, two, three, four, five, six, seven, eight, nine, ten;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bill = (TextView) findViewById(R.id.bill);
        tip = (TextView) findViewById(R.id.tip);
        total = (TextView) findViewById(R.id.total);
        label = (EditText) findViewById(R.id.label);

        one = (Button) findViewById(R.id.button1);
        one.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                double amount = Double.parseDouble(bill.toString());
                double tip_per = (0.10);
                tip.setText("Tip Percentage: " + Double.toString(tip_per));
                double tip_cal = (amount * tip_per) + amount;
                total.setText("Result : " + Double.toString(tip_cal));
            }
        });

        two = (Button) findViewById(R.id.button2);
        two.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                double amount = Double.parseDouble(bill.toString());
                double tip_per = (0.10);
                tip.setText("Tip Percentage: " + Double.toString(tip_per));
                double tip_cal = (amount * tip_per) + amount;
                total.setText("Result : " + Double.toString(tip_cal));
            }
        });
        three = (Button) findViewById(R.id.button3);
        three.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                double amount = Double.parseDouble(bill.toString());
                double tip_per = (0.10);
                tip.setText("Tip Percentage: " + Double.toString(tip_per));
                double tip_cal = (amount * tip_per) + amount;
                total.setText("Result : " + Double.toString(tip_cal));
            }
        });
        four = (Button) findViewById(R.id.button4);
        four.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                double amount = Double.parseDouble(bill.toString());
                double tip_per = (0.13);
                tip.setText("Tip Percentage: " + Double.toString(tip_per));
                double tip_cal = (amount * tip_per) + amount;
                total.setText("Result : " + Double.toString(tip_cal));
            }
        });
        five = (Button) findViewById(R.id.button5);
        five.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                double amount = Double.parseDouble(bill.toString());
                double tip_per = (0.13);
                tip.setText("Tip Percentage: " + Double.toString(tip_per));
                double tip_cal = (amount * tip_per) + amount;
                total.setText("Result : " + Double.toString(tip_cal));
            }
        });
        six = (Button) findViewById(R.id.button6);
        six.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                double amount = Double.parseDouble(bill.toString());
                double tip_per = (0.15);
                tip.setText("Tip Percentage: " + Double.toString(tip_per));
                double tip_cal = (amount * tip_per) + amount;
                total.setText("Result : " + Double.toString(tip_cal));
            }
        });
        seven = (Button) findViewById(R.id.button7);
        seven.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                double amount = Double.parseDouble(bill.toString());
                double tip_per = (0.15);
                tip.setText("Tip Percentage: " + Double.toString(tip_per));
                double tip_cal = (amount * tip_per) + amount;
                total.setText("Result : " + Double.toString(tip_cal));
            }
        });
        eight = (Button) findViewById(R.id.button8);
        eight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                double amount = Double.parseDouble(bill.toString());
                double tip_per = (0.2);
                tip.setText("Tip Percentage: " + Double.toString(tip_per));
                double tip_cal = (amount * tip_per) + amount;
                total.setText("Result : " + Double.toString(tip_cal));
            }
        });
        nine = (Button) findViewById(R.id.button9);
        nine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                double amount = Double.parseDouble(bill.toString());
                double tip_per = (0.2);
                tip.setText("Tip Percentage: " + Double.toString(tip_per));
                double tip_cal = (amount * tip_per) + amount;
                total.setText("Result : " + Double.toString(tip_cal));
            }
        });
        ten = (Button) findViewById(R.id.button10);
        ten.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                double amount = Double.parseDouble(bill.toString());
                double tip_per = (0.25);
                tip.setText("Tip Percentage: " + Double.toString(tip_per));
                double tip_cal = (amount * tip_per) + amount;
                total.setText("Result : " + Double.toString(tip_cal));
            }
        });

    }
}
