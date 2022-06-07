package com.example.pwmobile2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class parte4 extends AppCompatActivity {

    String P38,P39,P40,P41,P42,P43,P44,P45;
    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
    String email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte4);
    }
    public void toP5(View view) {
        if(P38!=null&&P39!=null&&P40!=null&&P41!=null&&P42!=null
                &&P43!=null&&P44!=null&&P45!=null) {
            email=user.getEmail();

            DocumentReference dirRef= FirebaseFirestore.getInstance()
                    .collection(email).document("Parte4");
            dirRef.set(new resP4(P38,P39,P40,P41,P42,P43,P44,P45));
            Intent intent = new Intent(this, parte5.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Revise que todas las preguntas estén contestadas, por favor",Toast.LENGTH_LONG).show();
        }
    }

    public void ObtP38(View view) {
        RadioButton p38Si = findViewById(R.id.P38s);
        RadioButton p38No = findViewById(R.id.P38n);
        if(p38Si.isChecked()){
            P38=p38Si.getText().toString();
            System.out.println(P38);
        }
        if(p38No.isChecked()){
            P38=p38No.getText().toString();
            System.out.println(P38);
        }
    }
    public void ObtP39(View view) {
        RadioButton p39Si = findViewById(R.id.P39s);
        RadioButton p39No = findViewById(R.id.P39n);
        if(p39Si.isChecked()){
            P39=p39Si.getText().toString();
            System.out.println(P39);
        }
        if(p39No.isChecked()){
            P39=p39No.getText().toString();
            System.out.println(P39);
        }
    }
    public void ObtP40(View view) {
        RadioButton p40Si = findViewById(R.id.P40s);
        RadioButton p40No = findViewById(R.id.P40n);
        if(p40Si.isChecked()){
            P40=p40Si.getText().toString();
            System.out.println(P40);
        }
        if(p40No.isChecked()){
            P40=p40No.getText().toString();
            System.out.println(P40);
        }
    }
    public void ObtP41(View view) {
        RadioButton p41Si = findViewById(R.id.P41s);
        RadioButton p41No = findViewById(R.id.P41n);
        if(p41Si.isChecked()){
            P41=p41Si.getText().toString();
            System.out.println(P41);
        }
        if(p41No.isChecked()){
            P41=p41No.getText().toString();
            System.out.println(P41);
        }
    }
    public void ObtP42(View view) {
        RadioButton p42Si = findViewById(R.id.P42s);
        RadioButton p42No = findViewById(R.id.P42n);
        if(p42Si.isChecked()){
            P42=p42Si.getText().toString();
            System.out.println(P42);
        }
        if(p42No.isChecked()){
            P42=p42No.getText().toString();
            System.out.println(P42);
        }
    }
    public void ObtP43(View view) {
        RadioButton p43Si = findViewById(R.id.P43s);
        RadioButton p43No = findViewById(R.id.P43n);
        if(p43Si.isChecked()){
            P43=p43Si.getText().toString();
            System.out.println(P42);
        }
        if(p43No.isChecked()){
            P43=p43No.getText().toString();
            System.out.println(P43);
        }
    }
    public void ObtP44(View view) {
        RadioButton p44Si = findViewById(R.id.P44s);
        RadioButton p44No = findViewById(R.id.P44n);
        if(p44Si.isChecked()){
            P44=p44Si.getText().toString();
            System.out.println(P44);
        }
        if(p44No.isChecked()){
            P44=p44No.getText().toString();
            System.out.println(P44);
        }
    }
    public void ObtP45(View view) {
        RadioButton p45Si = findViewById(R.id.P45s);
        RadioButton p45No = findViewById(R.id.P45n);
        if(p45Si.isChecked()){
            P45=p45Si.getText().toString();
            System.out.println(P45);
        }
        if(p45No.isChecked()){
            P45=p45No.getText().toString();
            System.out.println(P45);
        }
    }
}