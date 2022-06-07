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

public class parte5 extends AppCompatActivity {

    String P46,P47,P48,P49,P50,P51,P52,P53,P54,P55,P56;
    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
    String email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte5);
    }
    public void ObtP46(View view) {
        RadioButton p46nun = findViewById(R.id.P46nun);
        RadioButton p46alg = findViewById(R.id.P46alg);
        RadioButton p46con = findViewById(R.id.P46con);
        RadioButton p46sie = findViewById(R.id.P46sie);
        if(p46nun.isChecked()){
            P46=p46nun.getText().toString();
            System.out.println(P46);
        }
        if(p46alg.isChecked()){
            P46=p46alg.getText().toString();
            System.out.println(P46);
        }
        if(p46con.isChecked()){
            P46=p46con.getText().toString();
            System.out.println(P46);
        }
        if(p46sie.isChecked()){
            P46=p46sie.getText().toString();
            System.out.println(P46);
        }
    }
    public void ObtP47(View view) {
        RadioButton p47nun = findViewById(R.id.P47nun);
        RadioButton p47alg = findViewById(R.id.P47alg);
        RadioButton p47con = findViewById(R.id.P47con);
        RadioButton p47sie = findViewById(R.id.P47sie);
        if(p47nun.isChecked()){
            P47=p47nun.getText().toString();
            System.out.println(P47);
        }
        if(p47alg.isChecked()){
            P47=p47alg.getText().toString();
            System.out.println(P47);
        }
        if(p47con.isChecked()){
            P47=p47con.getText().toString();
            System.out.println(P47);
        }
        if(p47sie.isChecked()){
            P47=p47sie.getText().toString();
            System.out.println(P47);
        }
    }
    public void ObtP48(View view) {
        RadioButton p48nun = findViewById(R.id.P48nun);
        RadioButton p48alg = findViewById(R.id.P48alg);
        RadioButton p48con = findViewById(R.id.P48con);
        RadioButton p48sie = findViewById(R.id.P48sie);
        if(p48nun.isChecked()){
            P48=p48nun.getText().toString();
            System.out.println(P48);
        }
        if(p48alg.isChecked()){
            P48=p48alg.getText().toString();
            System.out.println(P48);
        }
        if(p48con.isChecked()){
            P48=p48con.getText().toString();
            System.out.println(P48);
        }
        if(p48sie.isChecked()){
            P48=p48sie.getText().toString();
            System.out.println(P48);
        }
    }
    public void ObtP49(View view) {
        RadioButton p49nun = findViewById(R.id.P49nun);
        RadioButton p49alg = findViewById(R.id.P49alg);
        RadioButton p49con = findViewById(R.id.P49con);
        RadioButton p49sie = findViewById(R.id.P49sie);
        if(p49nun.isChecked()){
            P49=p49nun.getText().toString();
            System.out.println(P49);
        }
        if(p49alg.isChecked()){
            P49=p49alg.getText().toString();
            System.out.println(P49);
        }
        if(p49con.isChecked()){
            P49=p49con.getText().toString();
            System.out.println(P49);
        }
        if(p49sie.isChecked()){
            P49=p49sie.getText().toString();
            System.out.println(P49);
        }
    }
    public void ObtP50(View view) {
        RadioButton p50nun = findViewById(R.id.P50nun);
        RadioButton p50alg = findViewById(R.id.P50alg);
        RadioButton p50con = findViewById(R.id.P50con);
        RadioButton p50sie = findViewById(R.id.P50sie);
        if(p50nun.isChecked()){
            P50=p50nun.getText().toString();
            System.out.println(P50);
        }
        if(p50alg.isChecked()){
            P50=p50alg.getText().toString();
            System.out.println(P50);
        }
        if(p50con.isChecked()){
            P50=p50con.getText().toString();
            System.out.println(P50);
        }
        if(p50sie.isChecked()){
            P50=p50sie.getText().toString();
            System.out.println(P50);
        }
    }
    public void ObtP51(View view) {
        RadioButton p51nun = findViewById(R.id.P51nun);
        RadioButton p51alg = findViewById(R.id.P51alg);
        RadioButton p51con = findViewById(R.id.P51con);
        RadioButton p51sie = findViewById(R.id.P51sie);
        if(p51nun.isChecked()){
            P51=p51nun.getText().toString();
            System.out.println(P51);
        }
        if(p51alg.isChecked()){
            P51=p51alg.getText().toString();
            System.out.println(P51);
        }
        if(p51con.isChecked()){
            P51=p51con.getText().toString();
            System.out.println(P51);
        }
        if(p51sie.isChecked()){
            P51=p51sie.getText().toString();
            System.out.println(P51);
        }
    }
    public void ObtP52(View view) {
        RadioButton p52nun = findViewById(R.id.P52nun);
        RadioButton p52alg = findViewById(R.id.P52alg);
        RadioButton p52con = findViewById(R.id.P52con);
        RadioButton p52sie = findViewById(R.id.P52sie);
        if(p52nun.isChecked()){
            P52=p52nun.getText().toString();
            System.out.println(P52);
        }
        if(p52alg.isChecked()){
            P52=p52alg.getText().toString();
            System.out.println(P52);
        }
        if(p52con.isChecked()){
            P52=p52con.getText().toString();
            System.out.println(P52);
        }
        if(p52sie.isChecked()){
            P52=p52sie.getText().toString();
            System.out.println(P52);
        }
    }
    public void ObtP53(View view) {
        RadioButton p53nun = findViewById(R.id.P53nun);
        RadioButton p53alg = findViewById(R.id.P53alg);
        RadioButton p53con = findViewById(R.id.P53con);
        RadioButton p53sie = findViewById(R.id.P53sie);
        if(p53nun.isChecked()){
            P53=p53nun.getText().toString();
            System.out.println(P53);
        }
        if(p53alg.isChecked()){
            P53=p53alg.getText().toString();
            System.out.println(P53);
        }
        if(p53con.isChecked()){
            P53=p53con.getText().toString();
            System.out.println(P53);
        }
        if(p53sie.isChecked()){
            P53=p53sie.getText().toString();
            System.out.println(P53);
        }
    }
    public void ObtP54(View view) {
        RadioButton p54nun = findViewById(R.id.P54nun);
        RadioButton p54alg = findViewById(R.id.P54alg);
        RadioButton p54con = findViewById(R.id.P54con);
        RadioButton p54sie = findViewById(R.id.P54sie);
        if(p54nun.isChecked()){
            P54=p54nun.getText().toString();
            System.out.println(P54);
        }
        if(p54alg.isChecked()){
            P54=p54alg.getText().toString();
            System.out.println(P54);
        }
        if(p54con.isChecked()){
            P54=p54con.getText().toString();
            System.out.println(P54);
        }
        if(p54sie.isChecked()){
            P54=p54sie.getText().toString();
            System.out.println(P54);
        }
    }
    public void ObtP55(View view) {
        RadioButton p55nun = findViewById(R.id.P55nun);
        RadioButton p55alg = findViewById(R.id.P55alg);
        RadioButton p55con = findViewById(R.id.P55con);
        RadioButton p55sie = findViewById(R.id.P55sie);
        if(p55nun.isChecked()){
            P55=p55nun.getText().toString();
            System.out.println(P55);
        }
        if(p55alg.isChecked()){
            P55=p55alg.getText().toString();
            System.out.println(P55);
        }
        if(p55con.isChecked()){
            P55=p55con.getText().toString();
            System.out.println(P55);
        }
        if(p55sie.isChecked()){
            P55=p55sie.getText().toString();
            System.out.println(P55);
        }
    }
    public void ObtP56(View view) {
        RadioButton p56nun = findViewById(R.id.P56nun);
        RadioButton p56alg = findViewById(R.id.P56alg);
        RadioButton p56con = findViewById(R.id.P56con);
        RadioButton p56sie = findViewById(R.id.P56sie);
        if(p56nun.isChecked()){
            P56=p56nun.getText().toString();
            System.out.println(P56);
        }
        if(p56alg.isChecked()){
            P56=p56alg.getText().toString();
            System.out.println(P56);
        }
        if(p56con.isChecked()){
            P56=p56con.getText().toString();
            System.out.println(P56);
        }
        if(p56sie.isChecked()){
            P56=p56sie.getText().toString();
            System.out.println(P56);
        }
    }
    public void end(View view) {
        if(P46!=null&&P47!=null&&P48!=null&&P49!=null&&P50!=null
                &&P51!=null&&P52!=null&&P53!=null&&P54!=null
                &&P55!=null&&P56!=null) {
            email=user.getEmail();

            DocumentReference dirRef= FirebaseFirestore.getInstance()
                    .collection(email).document("Parte5");
            dirRef.set(new resP5(P46,P47,P48,P49,P50,P51,P52,P53,P54,P55,P56));
            Toast.makeText(this, "Muchas gracias por completar el cuestionario",Toast.LENGTH_LONG).show();
            finish();
        }else{
            Toast.makeText(this, "Revise que todas las preguntas estén contestadas, por favor",Toast.LENGTH_LONG).show();
        }
    }
}