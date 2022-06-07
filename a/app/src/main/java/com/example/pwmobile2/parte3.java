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

public class parte3 extends AppCompatActivity {
    String P24,P25,P26,P27,P28,P29,P30,P31,P32,P33,P34,P35,P36,P37;
    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
    String email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte3);
    }
    public void ObtP24(View view) {
        RadioButton p24nun = findViewById(R.id.P24nun);
        RadioButton p24alg = findViewById(R.id.P24alg);
        RadioButton p24con = findViewById(R.id.P24con);
        RadioButton p24sie = findViewById(R.id.P24sie);
        if(p24nun.isChecked()){
            P24=p24nun.getText().toString();
            System.out.println(P24);
        }
        if(p24alg.isChecked()){
            P24=p24alg.getText().toString();
            System.out.println(P24);
        }
        if(p24con.isChecked()){
            P24=p24con.getText().toString();
            System.out.println(P24);
        }
        if(p24sie.isChecked()){
            P24=p24sie.getText().toString();
            System.out.println(P24);
        }
    }
    public void ObtP25(View view) {
        RadioButton p25nun = findViewById(R.id.P25nun);
        RadioButton p25alg = findViewById(R.id.P25alg);
        RadioButton p25con = findViewById(R.id.P25con);
        RadioButton p25sie = findViewById(R.id.P25sie);
        if(p25nun.isChecked()){
            P25=p25nun.getText().toString();
            System.out.println(P25);
        }
        if(p25alg.isChecked()){
            P25=p25alg.getText().toString();
            System.out.println(P25);
        }
        if(p25con.isChecked()){
            P25=p25con.getText().toString();
            System.out.println(P25);
        }
        if(p25sie.isChecked()){
            P25=p25sie.getText().toString();
            System.out.println(P25);
        }
    }
    public void ObtP26(View view) {
        RadioButton p26nun = findViewById(R.id.P26nun);
        RadioButton p26alg = findViewById(R.id.P26alg);
        RadioButton p26con = findViewById(R.id.P26con);
        RadioButton p26sie = findViewById(R.id.P26sie);
        if(p26nun.isChecked()){
            P26=p26nun.getText().toString();
            System.out.println(P26);
        }
        if(p26alg.isChecked()){
            P26=p26alg.getText().toString();
            System.out.println(P26);
        }
        if(p26con.isChecked()){
            P26=p26con.getText().toString();
            System.out.println(P26);
        }
        if(p26sie.isChecked()){
            P26=p26sie.getText().toString();
            System.out.println(P26);
        }
    }
    public void ObtP27(View view) {
        RadioButton p27nun = findViewById(R.id.P27nun);
        RadioButton p27alg = findViewById(R.id.P27alg);
        RadioButton p27con = findViewById(R.id.P27con);
        RadioButton p27sie = findViewById(R.id.P27sie);
        if(p27nun.isChecked()){
            P27=p27nun.getText().toString();
            System.out.println(P27);
        }
        if(p27alg.isChecked()){
            P27=p27alg.getText().toString();
            System.out.println(P27);
        }
        if(p27con.isChecked()){
            P27=p27con.getText().toString();
            System.out.println(P27);
        }
        if(p27sie.isChecked()){
            P27=p27sie.getText().toString();
            System.out.println(P27);
        }
    }
    public void ObtP28(View view) {
        RadioButton p28nun = findViewById(R.id.P28nun);
        RadioButton p28alg = findViewById(R.id.P28alg);
        RadioButton p28con = findViewById(R.id.P28con);
        RadioButton p28sie = findViewById(R.id.P28sie);
        if(p28nun.isChecked()){
            P28=p28nun.getText().toString();
            System.out.println(P28);
        }
        if(p28alg.isChecked()){
            P28=p28alg.getText().toString();
            System.out.println(P28);
        }
        if(p28con.isChecked()){
            P28=p28con.getText().toString();
            System.out.println(P28);
        }
        if(p28sie.isChecked()){
            P28=p28sie.getText().toString();
            System.out.println(P28);
        }
    }
    public void ObtP29(View view) {
        RadioButton p29nun = findViewById(R.id.P29nun);
        RadioButton p29alg = findViewById(R.id.P29alg);
        RadioButton p29con = findViewById(R.id.P29con);
        RadioButton p29sie = findViewById(R.id.P29sie);
        if(p29nun.isChecked()){
            P29=p29nun.getText().toString();
            System.out.println(P29);
        }
        if(p29alg.isChecked()){
            P29=p29alg.getText().toString();
            System.out.println(P29);
        }
        if(p29con.isChecked()){
            P29=p29con.getText().toString();
            System.out.println(P29);
        }
        if(p29sie.isChecked()){
            P29=p29sie.getText().toString();
            System.out.println(P29);
        }
    }
    public void ObtP30(View view) {
        RadioButton p30nun = findViewById(R.id.P30nun);
        RadioButton p30alg = findViewById(R.id.P30alg);
        RadioButton p30con = findViewById(R.id.P30con);
        RadioButton p30sie = findViewById(R.id.P30sie);
        if(p30nun.isChecked()){
            P30=p30nun.getText().toString();
            System.out.println(P30);
        }
        if(p30alg.isChecked()){
            P30=p30alg.getText().toString();
            System.out.println(P30);
        }
        if(p30con.isChecked()){
            P30=p30con.getText().toString();
            System.out.println(P30);
        }
        if(p30sie.isChecked()){
            P30=p30sie.getText().toString();
            System.out.println(P30);
        }
    }
    public void ObtP31(View view) {
        RadioButton p31nun = findViewById(R.id.P31nun);
        RadioButton p31alg = findViewById(R.id.P31alg);
        RadioButton p31con = findViewById(R.id.P31con);
        RadioButton p31sie = findViewById(R.id.P31sie);
        if(p31nun.isChecked()){
            P31=p31nun.getText().toString();
            System.out.println(P31);
        }
        if(p31alg.isChecked()){
            P31=p31alg.getText().toString();
            System.out.println(P31);
        }
        if(p31con.isChecked()){
            P31=p31con.getText().toString();
            System.out.println(P31);
        }
        if(p31sie.isChecked()){
            P31=p31sie.getText().toString();
            System.out.println(P31);
        }
    }
    public void ObtP32(View view) {
        RadioButton p32nun = findViewById(R.id.P32nun);
        RadioButton p32alg = findViewById(R.id.P32alg);
        RadioButton p32con = findViewById(R.id.P32con);
        RadioButton p32sie = findViewById(R.id.P32sie);
        if(p32nun.isChecked()){
            P32=p32nun.getText().toString();
            System.out.println(P32);
        }
        if(p32alg.isChecked()){
            P32=p32alg.getText().toString();
            System.out.println(P32);
        }
        if(p32con.isChecked()){
            P32=p32con.getText().toString();
            System.out.println(P32);
        }
        if(p32sie.isChecked()){
            P32=p32sie.getText().toString();
            System.out.println(P32);
        }
    }
    public void ObtP33(View view) {
        RadioButton p33nun = findViewById(R.id.P33nun);
        RadioButton p33alg = findViewById(R.id.P33alg);
        RadioButton p33con = findViewById(R.id.P33con);
        RadioButton p33sie = findViewById(R.id.P33sie);
        if(p33nun.isChecked()){
            P33=p33nun.getText().toString();
            System.out.println(P33);
        }
        if(p33alg.isChecked()){
            P33=p33alg.getText().toString();
            System.out.println(P33);
        }
        if(p33con.isChecked()){
            P33=p33con.getText().toString();
            System.out.println(P33);
        }
        if(p33sie.isChecked()){
            P33=p33sie.getText().toString();
            System.out.println(P33);
        }
    }
    public void ObtP34(View view) {
        RadioButton p34nun = findViewById(R.id.P34nun);
        RadioButton p34alg = findViewById(R.id.P34alg);
        RadioButton p34con = findViewById(R.id.P34con);
        RadioButton p34sie = findViewById(R.id.P34sie);
        if(p34nun.isChecked()){
            P34=p34nun.getText().toString();
            System.out.println(P34);
        }
        if(p34alg.isChecked()){
            P34=p34alg.getText().toString();
            System.out.println(P34);
        }
        if(p34con.isChecked()){
            P34=p34con.getText().toString();
            System.out.println(P34);
        }
        if(p34sie.isChecked()){
            P34=p34sie.getText().toString();
            System.out.println(P34);
        }
    }
    public void ObtP35(View view) {
        RadioButton p35nun = findViewById(R.id.P35nun);
        RadioButton p35alg = findViewById(R.id.P35alg);
        RadioButton p35con = findViewById(R.id.P35con);
        RadioButton p35sie = findViewById(R.id.P35sie);
        if(p35nun.isChecked()){
            P35=p35nun.getText().toString();
            System.out.println(P35);
        }
        if(p35alg.isChecked()){
            P35=p35alg.getText().toString();
            System.out.println(P35);
        }
        if(p35con.isChecked()){
            P35=p35con.getText().toString();
            System.out.println(P35);
        }
        if(p35sie.isChecked()){
            P35=p35sie.getText().toString();
            System.out.println(P35);
        }
    }
    public void ObtP36(View view) {
        RadioButton p36nun = findViewById(R.id.P36nun);
        RadioButton p36alg = findViewById(R.id.P36alg);
        RadioButton p36con = findViewById(R.id.P36con);
        RadioButton p36sie = findViewById(R.id.P36sie);
        if(p36nun.isChecked()){
            P36=p36nun.getText().toString();
            System.out.println(P36);
        }
        if(p36alg.isChecked()){
            P36=p36alg.getText().toString();
            System.out.println(P36);
        }
        if(p36con.isChecked()){
            P36=p36con.getText().toString();
            System.out.println(P36);
        }
        if(p36sie.isChecked()){
            P36=p36sie.getText().toString();
            System.out.println(P36);
        }
    }
    public void ObtP37(View view) {
        RadioButton p37nun = findViewById(R.id.P37nun);
        RadioButton p37alg = findViewById(R.id.P37alg);
        RadioButton p37con = findViewById(R.id.P37con);
        RadioButton p37sie = findViewById(R.id.P37sie);
        if(p37nun.isChecked()){
            P37=p37nun.getText().toString();
            System.out.println(P37);
        }
        if(p37alg.isChecked()){
            P37=p37alg.getText().toString();
            System.out.println(P37);
        }
        if(p37con.isChecked()){
            P37=p37con.getText().toString();
            System.out.println(P37);
        }
        if(p37sie.isChecked()){
            P37=p37sie.getText().toString();
            System.out.println(P37);
        }
    }
    public void toP4(View view) {
        if(P24!=null&&P25!=null&&P26!=null&&P27!=null&&P28!=null
                &&P29!=null&&P30!=null&&P31!=null&&P32!=null
                &&P33!=null&&P34!=null&&P35!=null&&P36!=null&&P37!=null
                ) {
            email=user.getEmail();

            DocumentReference dirRef= FirebaseFirestore.getInstance()
                    .collection(email).document("Parte3");
            dirRef.set(new resP3(P24,P25,P26,P27,P28,P29,P30,P31,P32,P33,P34,P35,P36,P37));
            Intent intent = new Intent(this, parte4.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Revise que todas las preguntas estén contestadas, por favor",Toast.LENGTH_LONG).show();
        }
    }
}