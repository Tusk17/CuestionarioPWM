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

public class parte2 extends AppCompatActivity {

    String P1,P2,P3,P4,P5,P6,P7,P8,P9,P10,P11,P12,P13,P14,P15,P16,P17,P18,P19,P20,P21,P22,P23;
    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
    String email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte2);
    }
    public void ObtP1(View view) {
        RadioButton p1Si = findViewById(R.id.P45s);
        RadioButton p1No = findViewById(R.id.P45n);
        if(p1Si.isChecked()){
            P1=p1Si.getText().toString();
            System.out.println(P1);
        }
        if(p1No.isChecked()){
            P1=p1No.getText().toString();
            System.out.println(P1);
        }
    }
    public void ObtP2(View view) {
        RadioButton p2Si = findViewById(R.id.P2s);
        RadioButton p2No = findViewById(R.id.P2n);
        if(p2Si.isChecked()){
            P2=p2Si.getText().toString();
            System.out.println(P2);
        }
        if(p2No.isChecked()){
            P2=p2No.getText().toString();
            System.out.println(P2);
        }
    }
    public void ObtP3(View view) {
        RadioButton p3Si = findViewById(R.id.P3s);
        RadioButton p3No = findViewById(R.id.P3n);
        if(p3Si.isChecked()){
            P3=p3Si.getText().toString();
            System.out.println(P3);
        }
        if(p3No.isChecked()){
            P3=p3No.getText().toString();
            System.out.println(P3);
        }
    }
    public void ObtP4(View view) {
        RadioButton p4Si = findViewById(R.id.P4s);
        RadioButton p4No = findViewById(R.id.P4n);
        if(p4Si.isChecked()){
            P4=p4Si.getText().toString();
            System.out.println(P4);
        }
        if(p4No.isChecked()){
            P4=p4No.getText().toString();
            System.out.println(P4);
        }
    }
    public void ObtP5(View view) {
        RadioButton p5nun = findViewById(R.id.P5nun);
        RadioButton p5alg = findViewById(R.id.P5alg);
        RadioButton p5con = findViewById(R.id.P5con);
        RadioButton p5sie = findViewById(R.id.P5sie);
        if(p5nun.isChecked()){
            P5=p5nun.getText().toString();
            System.out.println(P5);
        }
        if(p5alg.isChecked()){
            P5=p5alg.getText().toString();
            System.out.println(P5);
        }
        if(p5con.isChecked()){
            P5=p5con.getText().toString();
            System.out.println(P5);
        }
        if(p5sie.isChecked()){
            P5=p5sie.getText().toString();
            System.out.println(P5);
        }
    }
    public void ObtP6(View view) {
        RadioButton p6nun = findViewById(R.id.P6nun);
        RadioButton p6alg = findViewById(R.id.P6alg);
        RadioButton p6con = findViewById(R.id.P6con);
        RadioButton p6sie = findViewById(R.id.P6sie);
        if(p6nun.isChecked()){
            P6=p6nun.getText().toString();
            System.out.println(P6);
        }
        if(p6alg.isChecked()){
            P6=p6alg.getText().toString();
            System.out.println(P6);
        }
        if(p6con.isChecked()){
            P6=p6con.getText().toString();
            System.out.println(P6);
        }
        if(p6sie.isChecked()){
            P6=p6sie.getText().toString();
            System.out.println(P6);
        }
    }
    public void ObtP7(View view) {
        RadioButton p7nun = findViewById(R.id.P7nun);
        RadioButton p7alg = findViewById(R.id.P7alg);
        RadioButton p7con = findViewById(R.id.P7con);
        RadioButton p7sie = findViewById(R.id.P7sie);
        if(p7nun.isChecked()){
            P7=p7nun.getText().toString();
            System.out.println(P7);
        }
        if(p7alg.isChecked()){
            P7=p7alg.getText().toString();
            System.out.println(P7);
        }
        if(p7con.isChecked()){
            P7=p7con.getText().toString();
            System.out.println(P7);
        }
        if(p7sie.isChecked()){
            P7=p7sie.getText().toString();
            System.out.println(P7);
        }
    }
    public void ObtP8(View view) {
        RadioButton p8nun = findViewById(R.id.P8nun);
        RadioButton p8alg = findViewById(R.id.P8alg);
        RadioButton p8con = findViewById(R.id.P8con);
        RadioButton p8sie = findViewById(R.id.P8sie);
        if(p8nun.isChecked()){
            P8=p8nun.getText().toString();
            System.out.println(P8);
        }
        if(p8alg.isChecked()){
            P8=p8alg.getText().toString();
            System.out.println(P8);
        }
        if(p8con.isChecked()){
            P8=p8con.getText().toString();
            System.out.println(P8);
        }
        if(p8sie.isChecked()){
            P8=p8sie.getText().toString();
            System.out.println(P8);
        }
    }
    public void ObtP9(View view) {
        RadioButton p9nun = findViewById(R.id.P9nun);
        RadioButton p9alg = findViewById(R.id.P9alg);
        RadioButton p9con = findViewById(R.id.P9con);
        RadioButton p9sie = findViewById(R.id.P9sie);
        if(p9nun.isChecked()){
            P9=p9nun.getText().toString();
            System.out.println(P9);
        }
        if(p9alg.isChecked()){
            P9=p9alg.getText().toString();
            System.out.println(P9);
        }
        if(p9con.isChecked()){
            P9=p9con.getText().toString();
            System.out.println(P9);
        }
        if(p9sie.isChecked()){
            P9=p9sie.getText().toString();
            System.out.println(P9);
        }
    }
    public void ObtP10(View view) {
        RadioButton p10nun = findViewById(R.id.P10nun);
        RadioButton p10alg = findViewById(R.id.P10alg);
        RadioButton p10con = findViewById(R.id.P10con);
        RadioButton p10sie = findViewById(R.id.P10sie);
        if(p10nun.isChecked()){
            P10=p10nun.getText().toString();
            System.out.println(P10);
        }
        if(p10alg.isChecked()){
            P10=p10alg.getText().toString();
            System.out.println(P10);
        }
        if(p10con.isChecked()){
            P10=p10con.getText().toString();
            System.out.println(P10);
        }
        if(p10sie.isChecked()){
            P10=p10sie.getText().toString();
            System.out.println(P10);
        }
    }
    public void ObtP11(View view) {
        RadioButton p11nun = findViewById(R.id.P11nun);
        RadioButton p11alg = findViewById(R.id.P11alg);
        RadioButton p11con = findViewById(R.id.P11con);
        RadioButton p11sie = findViewById(R.id.P11sie);
        if(p11nun.isChecked()){
            P11=p11nun.getText().toString();
            System.out.println(P11);
        }
        if(p11alg.isChecked()){
            P11=p11alg.getText().toString();
            System.out.println(P11);
        }
        if(p11con.isChecked()){
            P11=p11con.getText().toString();
            System.out.println(P11);
        }
        if(p11sie.isChecked()){
            P11=p11sie.getText().toString();
            System.out.println(P11);
        }
    }
    public void ObtP12(View view) {
        RadioButton p12nun = findViewById(R.id.P12nun);
        RadioButton p12alg = findViewById(R.id.P12alg);
        RadioButton p12con = findViewById(R.id.P12con);
        RadioButton p12sie = findViewById(R.id.P12sie);
        if(p12nun.isChecked()){
            P12=p12nun.getText().toString();
            System.out.println(P12);
        }
        if(p12alg.isChecked()){
            P12=p12alg.getText().toString();
            System.out.println(P12);
        }
        if(p12con.isChecked()){
            P12=p12con.getText().toString();
            System.out.println(P12);
        }
        if(p12sie.isChecked()){
            P12=p12sie.getText().toString();
            System.out.println(P12);
        }
    }
    public void ObtP13(View view) {
        RadioButton p13nun = findViewById(R.id.P13nun);
        RadioButton p13alg = findViewById(R.id.P13alg);
        RadioButton p13con = findViewById(R.id.P13con);
        RadioButton p13sie = findViewById(R.id.P13sie);
        if(p13nun.isChecked()){
            P13=p13nun.getText().toString();
            System.out.println(P13);
        }
        if(p13alg.isChecked()){
            P13=p13alg.getText().toString();
            System.out.println(P13);
        }
        if(p13con.isChecked()){
            P13=p13con.getText().toString();
            System.out.println(P13);
        }
        if(p13sie.isChecked()){
            P13=p13sie.getText().toString();
            System.out.println(P13);
        }
    }
    public void ObtP14(View view) {
        RadioButton p14nun = findViewById(R.id.P14nun);
        RadioButton p14alg = findViewById(R.id.P14alg);
        RadioButton p14con = findViewById(R.id.P14con);
        RadioButton p14sie = findViewById(R.id.P14sie);
        if(p14nun.isChecked()){
            P14=p14nun.getText().toString();
            System.out.println(P14);
        }
        if(p14alg.isChecked()){
            P14=p14alg.getText().toString();
            System.out.println(P14);
        }
        if(p14con.isChecked()){
            P14=p14con.getText().toString();
            System.out.println(P14);
        }
        if(p14sie.isChecked()){
            P14=p14sie.getText().toString();
            System.out.println(P14);
        }
    }
    public void ObtP15(View view) {
        RadioButton p15nun = findViewById(R.id.P15nun);
        RadioButton p15alg = findViewById(R.id.P15alg);
        RadioButton p15con = findViewById(R.id.P15con);
        RadioButton p15sie = findViewById(R.id.P15sie);
        if(p15nun.isChecked()){
            P15=p15nun.getText().toString();
            System.out.println(P15);
        }
        if(p15alg.isChecked()){
            P15=p15alg.getText().toString();
            System.out.println(P15);
        }
        if(p15con.isChecked()){
            P15=p15con.getText().toString();
            System.out.println(P15);
        }
        if(p15sie.isChecked()){
            P15=p15sie.getText().toString();
            System.out.println(P15);
        }
    }
    public void ObtP16(View view) {
        RadioButton p16nun = findViewById(R.id.P16nun);
        RadioButton p16alg = findViewById(R.id.P16alg);
        RadioButton p16con = findViewById(R.id.P16con);
        RadioButton p16sie = findViewById(R.id.P16sie);
        if(p16nun.isChecked()){
            P16=p16nun.getText().toString();
            System.out.println(P16);
        }
        if(p16alg.isChecked()){
            P16=p16alg.getText().toString();
            System.out.println(P16);
        }
        if(p16con.isChecked()){
            P16=p16con.getText().toString();
            System.out.println(P16);
        }
        if(p16sie.isChecked()){
            P16=p16sie.getText().toString();
            System.out.println(P16);
        }
    }
    public void ObtP17(View view) {
        RadioButton p17nun = findViewById(R.id.P17nun);
        RadioButton p17alg = findViewById(R.id.P17alg);
        RadioButton p17con = findViewById(R.id.P17con);
        RadioButton p17sie = findViewById(R.id.P17sie);
        if(p17nun.isChecked()){
            P17=p17nun.getText().toString();
            System.out.println(P17);
        }
        if(p17alg.isChecked()){
            P17=p17alg.getText().toString();
            System.out.println(P17);
        }
        if(p17con.isChecked()){
            P17=p17con.getText().toString();
            System.out.println(P17);
        }
        if(p17sie.isChecked()){
            P17=p17sie.getText().toString();
            System.out.println(P17);
        }
    }
    public void ObtP18(View view) {
        RadioButton p18nun = findViewById(R.id.P18nun);
        RadioButton p18alg = findViewById(R.id.P18alg);
        RadioButton p18con = findViewById(R.id.P18con);
        RadioButton p18sie = findViewById(R.id.P18sie);
        if(p18nun.isChecked()){
            P18=p18nun.getText().toString();
            System.out.println(P18);
        }
        if(p18alg.isChecked()){
            P18=p18alg.getText().toString();
            System.out.println(P18);
        }
        if(p18con.isChecked()){
            P18=p18con.getText().toString();
            System.out.println(P18);
        }
        if(p18sie.isChecked()){
            P18=p18sie.getText().toString();
            System.out.println(P18);
        }
    }
    public void ObtP19(View view) {
        RadioButton p19nun = findViewById(R.id.P19nun);
        RadioButton p19alg = findViewById(R.id.P19alg);
        RadioButton p19con = findViewById(R.id.P19con);
        RadioButton p19sie = findViewById(R.id.P19sie);
        if(p19nun.isChecked()){
            P19=p19nun.getText().toString();
            System.out.println(P19);
        }
        if(p19alg.isChecked()){
            P19=p19alg.getText().toString();
            System.out.println(P19);
        }
        if(p19con.isChecked()){
            P19=p19con.getText().toString();
            System.out.println(P19);
        }
        if(p19sie.isChecked()){
            P19=p19sie.getText().toString();
            System.out.println(P19);
        }
    }
    public void ObtP20(View view) {
        RadioButton p20nun = findViewById(R.id.P20nun);
        RadioButton p20alg = findViewById(R.id.P20alg);
        RadioButton p20con = findViewById(R.id.P20con);
        RadioButton p20sie = findViewById(R.id.P20sie);
        if(p20nun.isChecked()){
            P20=p20nun.getText().toString();
            System.out.println(P20);
        }
        if(p20alg.isChecked()){
            P20=p20alg.getText().toString();
            System.out.println(P20);
        }
        if(p20con.isChecked()){
            P20=p20con.getText().toString();
            System.out.println(P20);
        }
        if(p20sie.isChecked()){
            P20=p20sie.getText().toString();
            System.out.println(P20);
        }
    }
    public void ObtP21(View view) {
        RadioButton p21nun = findViewById(R.id.P21nun);
        RadioButton p21alg = findViewById(R.id.P21alg);
        RadioButton p21con = findViewById(R.id.P21con);
        RadioButton p21sie = findViewById(R.id.P21sie);
        if(p21nun.isChecked()){
            P21=p21nun.getText().toString();
            System.out.println(P21);
        }
        if(p21alg.isChecked()){
            P21=p21alg.getText().toString();
            System.out.println(P21);
        }
        if(p21con.isChecked()){
            P21=p21con.getText().toString();
            System.out.println(P21);
        }
        if(p21sie.isChecked()){
            P21=p21sie.getText().toString();
            System.out.println(P21);
        }
    }
    public void ObtP22(View view) {
        RadioButton p22nun = findViewById(R.id.P22nun);
        RadioButton p22alg = findViewById(R.id.P22alg);
        RadioButton p22con = findViewById(R.id.P22con);
        RadioButton p22sie = findViewById(R.id.P22sie);
        if(p22nun.isChecked()){
            P22=p22nun.getText().toString();
            System.out.println(P22);
        }
        if(p22alg.isChecked()){
            P22=p22alg.getText().toString();
            System.out.println(P22);
        }
        if(p22con.isChecked()){
            P22=p22con.getText().toString();
            System.out.println(P22);
        }
        if(p22sie.isChecked()){
            P22=p22sie.getText().toString();
            System.out.println(P22);
        }
    }
    public void ObtP23(View view) {
        RadioButton p23nun = findViewById(R.id.P23nun);
        RadioButton p23alg = findViewById(R.id.P23alg);
        RadioButton p23con = findViewById(R.id.P23con);
        RadioButton p23sie = findViewById(R.id.P23sie);
        if(p23nun.isChecked()){
            P23=p23nun.getText().toString();
            System.out.println(P23);
        }
        if(p23alg.isChecked()){
            P23=p23alg.getText().toString();
            System.out.println(P23);
        }
        if(p23con.isChecked()){
            P23=p23con.getText().toString();
            System.out.println(P23);
        }
        if(p23sie.isChecked()){
            P23=p23sie.getText().toString();
            System.out.println(P23);
        }
    }

    public void toP3(View view) {
        if(P1!=null&&P2!=null&&P3!=null&&P4!=null&&P5!=null
                &&P6!=null&&P7!=null&&P8!=null&&P9!=null
                &&P10!=null&&P11!=null&&P12!=null&&P13!=null&&P14!=null
                &&P15!=null&&P16!=null&&P17!=null&&P18!=null&&P19!=null
                &&P20!=null&&P21!=null&&P22!=null&&P23!=null) {
            email=user.getEmail();

            DocumentReference dirRef= FirebaseFirestore.getInstance()
                    .collection(email).document("Parte2");
            dirRef.set(new resP2(P1,P2,P3,P4,P5,P6,P7,P8,P9,P10,P11,P12,P13,P14,P15,P16,P17,P18,P19,P20,P21,P22,P23));
            Intent intent = new Intent(this, parte3.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Revise que todas las preguntas estén contestadas, por favor",Toast.LENGTH_LONG).show();
        }
    }

}