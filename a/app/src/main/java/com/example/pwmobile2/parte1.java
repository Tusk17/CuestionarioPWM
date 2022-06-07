package com.example.pwmobile2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class parte1 extends AppCompatActivity {

    String Cat,Gen,Edad,EstCiv,Antiguedad,Escolaridad;
    String Plaza,OtroPlaza,Discapacidad,TipoDisc;
    String SectorPob,TipoSector,OtroSector;
    String CT1,CT2,CT3,CT4;
    String HorInicio,HorFinal;
    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
    String email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte1);

    }

    public void ObtCat(View view) {
        RadioButton Cat1 = findViewById(R.id.Doce);
        RadioButton Cat2 = findViewById(R.id.Admin);
        RadioButton Cat3 = findViewById(R.id.Serv);
        if(Cat1.isChecked()){
            Cat=Cat1.getText().toString();
            System.out.println(Cat);
        }
        if(Cat2.isChecked()){
            Cat=Cat2.getText().toString();
            System.out.println(Cat);
        }
        if(Cat3.isChecked()){
            Cat=Cat3.getText().toString();
            System.out.println(Cat);
        }
    }
    public void ObtGen(View view) {
        RadioButton GenH = findViewById(R.id.H);
        RadioButton GenM = findViewById(R.id.M);
        if(GenH.isChecked()){
            Gen=GenH.getText().toString();
            System.out.println(Gen);
        }
        if(GenM.isChecked()){
            Gen=GenM.getText().toString();
            System.out.println(Gen);
        }
    }
    public void ObtEdad(View view) {
        RadioButton E1 = findViewById(R.id.E1);
        RadioButton E2 = findViewById(R.id.E2);
        RadioButton E3 = findViewById(R.id.E3);
        RadioButton E4 = findViewById(R.id.E4);
        RadioButton E5 = findViewById(R.id.E5);
        if(E1.isChecked()){
            Edad=E1.getText().toString();
            System.out.println(Edad);
        }
        if(E2.isChecked()){
            Edad=E2.getText().toString();
            System.out.println(Edad);
        }
        if(E3.isChecked()){
            Edad=E3.getText().toString();
            System.out.println(Edad);
        }
        if(E4.isChecked()){
            Edad=E4.getText().toString();
            System.out.println(Edad);
        }
        if(E5.isChecked()){
            Edad=E5.getText().toString();
            System.out.println(Edad);
        }
    }
    public void ObtEstCiv(View view) {
        RadioButton Solter = findViewById(R.id.P45n);
        RadioButton Casad = findViewById(R.id.Casad);
        RadioButton Union = findViewById(R.id.Union);
        RadioButton Div = findViewById(R.id.Divorcia);
        RadioButton Viud = findViewById(R.id.Viud);
        if(Solter.isChecked()){
            EstCiv=Solter.getText().toString();
            System.out.println(EstCiv);
        }
        if(Casad.isChecked()){
            EstCiv=Casad.getText().toString();
            System.out.println(EstCiv);
        }
        if(Union.isChecked()){
            EstCiv=Union.getText().toString();
            System.out.println(EstCiv);
        }
        if(Div.isChecked()){
            EstCiv=Div.getText().toString();
            System.out.println(EstCiv);
        }
        if(Viud.isChecked()){
            EstCiv=Viud.getText().toString();
            System.out.println(EstCiv);
        }
    }
    public void ObtAntiguedad(View view) {
        RadioButton A1 = findViewById(R.id.A1);
        RadioButton A2 = findViewById(R.id.A2);
        RadioButton A3 = findViewById(R.id.A3);
        RadioButton A4 = findViewById(R.id.A4);
        if(A1.isChecked()){
            Antiguedad=A1.getText().toString();
            System.out.println(Antiguedad);
        }
        if(A2.isChecked()){
            Antiguedad=A2.getText().toString();
            System.out.println(Antiguedad);
        }
        if(A3.isChecked()){
            Antiguedad=A3.getText().toString();
            System.out.println(Antiguedad);
        }
        if(A4.isChecked()){
            Antiguedad=A4.getText().toString();
            System.out.println(Antiguedad);
        }
    }
    public void ObtEsc(View view) {
        RadioButton Esc1 = findViewById(R.id.Esc1);
        RadioButton Esc2 = findViewById(R.id.Esc2);
        RadioButton Esc3 = findViewById(R.id.Esc3);
        RadioButton Esc4 = findViewById(R.id.Esc4);
        RadioButton Esc5 = findViewById(R.id.Esc5);
        RadioButton Esc6 = findViewById(R.id.Esc6);
        RadioButton Esc7 = findViewById(R.id.Esc7);
        RadioButton Esc8 = findViewById(R.id.Esc8);
        if(Esc1.isChecked()){
            Escolaridad=Esc1.getText().toString();
            System.out.println(Escolaridad);
        }
        if(Esc2.isChecked()){
            Escolaridad=Esc2.getText().toString();
            System.out.println(Escolaridad);
        }
        if(Esc3.isChecked()){
            Escolaridad=Esc3.getText().toString();
            System.out.println(Escolaridad);
        }
        if(Esc4.isChecked()){
            Escolaridad=Esc4.getText().toString();
            System.out.println(Escolaridad);
        }
        if(Esc5.isChecked()){
            Escolaridad=Esc5.getText().toString();
            System.out.println(Escolaridad);
        }
        if(Esc6.isChecked()){
            Escolaridad=Esc6.getText().toString();
            System.out.println(Escolaridad);
        }
        if(Esc7.isChecked()){
            Escolaridad=Esc7.getText().toString();
            System.out.println(Escolaridad);
        }
        if(Esc8.isChecked()){
            Escolaridad=Esc8.getText().toString();
            System.out.println(Escolaridad);
        }
    }
    public void ObtHorario(View view) {
        TextView HorIni = findViewById(R.id.HorInicio);
        TextView HorFin = findViewById(R.id.HorFinal);
        HorInicio=HorIni.getText().toString();
        HorFinal=HorFin.getText().toString();
        System.out.println(HorInicio);
        System.out.println(HorFinal);
        HorIni.setEnabled(false);
        HorFin.setEnabled(false);
    }
    public void ObtPlaza(View view) {
        RadioButton Pla1 = findViewById(R.id.Pla1);
        RadioButton Pla2 = findViewById(R.id.Pla2);
        RadioButton Pla3 = findViewById(R.id.Pla3);
        TextView PlaOtro = findViewById(R.id.PlaOtro);
        if(Pla1.isChecked()){
            Plaza=Pla1.getText().toString();
            System.out.println(Plaza);
        }
        if(Pla2.isChecked()){
            Plaza=Pla2.getText().toString();
            System.out.println(Plaza);
        }
        if(Pla3.isChecked()){
            Plaza=Pla3.getText().toString();
            System.out.println(Plaza);
        }
        OtroPlaza=PlaOtro.getText().toString();
        System.out.println(OtroPlaza);
    }
    public void ObtDisc(View view) {
        RadioButton DiscSi = findViewById(R.id.DiscSi);
        RadioButton DiscNo = findViewById(R.id.DiscNo);
        TextView DiscOtro = findViewById(R.id.OtroDisc);
        if(DiscSi.isChecked()){
            Discapacidad=DiscSi.getText().toString();
            System.out.println(Discapacidad);
        }
        if(DiscNo.isChecked()){
            Discapacidad=DiscNo.getText().toString();
            System.out.println(Discapacidad);
        }
        TipoDisc=DiscOtro.getText().toString();
        System.out.println(TipoDisc);
    }
    public void ObtPob(View view) {
        RadioButton DiverSi = findViewById(R.id.PobSi);
        RadioButton DiverNo = findViewById(R.id.PobNo);
        RadioButton DiverSex = findViewById(R.id.DivSex);
        RadioButton Indigenas = findViewById(R.id.Indi);
        RadioButton AfroDes = findViewById(R.id.Afro);
        RadioButton AdulMay = findViewById(R.id.AdultosM);
        TextView PobOtro = findViewById(R.id.PobOtro);
        if(DiverSi.isChecked()){
            SectorPob=DiverSi.getText().toString();
            System.out.println(SectorPob);
        }
        if(DiverNo.isChecked()){
            SectorPob=DiverNo.getText().toString();
            System.out.println(SectorPob);
        }
        if(DiverSex.isChecked()){
            TipoSector=DiverSex.getText().toString();
            System.out.println(TipoSector);
        }
        if(Indigenas.isChecked()){
            TipoSector=Indigenas.getText().toString();
            System.out.println(TipoSector);
        }
        if(AfroDes.isChecked()){
            TipoSector=AfroDes.getText().toString();
            System.out.println(TipoSector);
        }
        if(AdulMay.isChecked()){
            TipoSector=AdulMay.getText().toString();
            System.out.println(TipoSector);
        }
        OtroSector=PobOtro.getText().toString();
        System.out.println(OtroSector);
    }
    public void CentroTrabajo(View view) {
        RadioButton CT1s = findViewById(R.id.CT1si);
        RadioButton CT1n = findViewById(R.id.CT1no);
        RadioButton CT1ns = findViewById(R.id.CT1nose);
        RadioButton CT2s = findViewById(R.id.CT2si);
        RadioButton CT2n = findViewById(R.id.CT2no);
        RadioButton CT2ns = findViewById(R.id.CT2nose);
        RadioButton CT3s = findViewById(R.id.CT3si);
        RadioButton CT3n = findViewById(R.id.CT3no);
        RadioButton CT3ns = findViewById(R.id.CT3nose);
        RadioButton CT4s = findViewById(R.id.CT4si);
        RadioButton CT4n = findViewById(R.id.CT4no);
        RadioButton CT4ns = findViewById(R.id.CT4nose);

        if(CT1s.isChecked()){
            CT1=CT1s.getText().toString();
            System.out.println(CT1);
        }
        if(CT1n.isChecked()){
            CT1=CT1n.getText().toString();
            System.out.println(CT1);
        }
        if(CT1ns.isChecked()){
            CT1=CT1ns.getText().toString();
            System.out.println(CT1);
        }
        if(CT2s.isChecked()){
            CT2=CT2s.getText().toString();
            System.out.println(CT2);
        }
        if(CT2n.isChecked()){
            CT2=CT2n.getText().toString();
            System.out.println(CT2);
        }
        if(CT2ns.isChecked()){
            CT2=CT2ns.getText().toString();
            System.out.println(CT2);
        }
        if(CT3s.isChecked()){
            CT3=CT3s.getText().toString();
            System.out.println(CT3);
        }
        if(CT3n.isChecked()){
            CT3=CT3n.getText().toString();
            System.out.println(CT3);
        }
        if(CT3ns.isChecked()){
            CT3=CT3ns.getText().toString();
            System.out.println(CT3);
        }
        if(CT4s.isChecked()){
            CT4=CT4s.getText().toString();
            System.out.println(CT4);
        }
        if(CT4n.isChecked()){
            CT4=CT4n.getText().toString();
            System.out.println(CT4);
        }
        if(CT4ns.isChecked()){
            CT4=CT4ns.getText().toString();
            System.out.println(CT4);
        }
    }
    public void toP2(View view) {
        if(Cat!=null&&Edad!=null&&EstCiv!=null&&Antiguedad!=null&&Escolaridad!=null
        &&Plaza!=null&&Discapacidad!=null&&SectorPob!=null&&HorInicio!=null
        &&HorFinal!=null&&CT1!=null&&CT2!=null&&CT3!=null&&CT4!=null) {
            email=user.getEmail();

            DocumentReference dirRef= FirebaseFirestore.getInstance()
                    .collection(email).document("Parte1");
            dirRef.set(new resP1(Cat,Gen,Edad,EstCiv,Antiguedad,Escolaridad,
                    Plaza,OtroPlaza,Discapacidad,TipoDisc,
                    SectorPob,TipoSector,OtroSector,
                    CT1,CT2,CT3,CT4,
                    HorInicio,HorFinal));
            Intent intent = new Intent(this, parte2.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Revise que todas las preguntas estén contestadas, por favor",Toast.LENGTH_LONG).show();
        }
    }
}