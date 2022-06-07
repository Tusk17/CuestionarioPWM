package com.example.pwmobile2;

import static android.content.ContentValues.TAG;

import static com.example.pwmobile2.R.id.RegisPassword2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

public class MainActivity extends AppCompatActivity {
    GoogleSignInOptions gso;
    GoogleSignInClient gsc;
    SignInButton googlebtn;
    String emailR,passwordR,passwordR1;
    EditText emailL,passwordL;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        googlebtn = findViewById(R.id.googleLogin);

        gso= new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail()
                .requestIdToken(getString(R.string.default_web_client_id)).build();
        gsc= GoogleSignIn.getClient(this,gso);

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        googlebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signIn();
            }
        });
    }

    public void xd(View view){
        emailL=findViewById(R.id.emailLogin);
        passwordL=findViewById(R.id.passwordLogin);
        String e=emailL.getText().toString().trim();
        String c1=passwordL.getText().toString().trim();
        if(e.isEmpty()){
            Toast.makeText(this,"No hay email",Toast.LENGTH_LONG).show();
        }
        if(c1.isEmpty()){
            Toast.makeText(this,"No hay contraseña",Toast.LENGTH_LONG).show();
        }else{
            emailR=emailL.getText().toString();
            passwordR=passwordL.getText().toString();
            signInEmail(emailR,passwordR);
        }
    }

    private void signInEmail(String emailR, String passwordR) {
        // [START sign_in_with_email]
        mAuth.signInWithEmailAndPassword(emailR, passwordR)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "signInWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            toP1();
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "signInWithEmail:failure", task.getException());
                            Toast.makeText(MainActivity.this, "Autenticación fallida.",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
        // [END sign_in_with_email]
    }
    public void googleLogOut(View view) {
        gsc.signOut();
    }
    public void register(View view){
        EditText emailT = findViewById(R.id.registerEmail);
        EditText passwordT1 = findViewById(R.id.RegisPassword1);
        EditText passwordT = findViewById(R.id.RegisPassword2);

        emailR=emailT.getText().toString();
        passwordR1=passwordT1.getText().toString();
        passwordR=passwordT.getText().toString();
        if(emailR.isEmpty()){
            Toast.makeText(this,"No hay email",Toast.LENGTH_SHORT).show();
        }
        if(passwordR1.isEmpty()){
            Toast.makeText(this,"No hay contraseña",Toast.LENGTH_SHORT).show();
        }
        if(passwordR.isEmpty()){
            Toast.makeText(this,"No hay contraseña2",Toast.LENGTH_SHORT).show();
        }
        if(passwordR1.equals(passwordR)){
            String emailF=emailR.trim();
            checkEmail(emailF,passwordR);
            if(passwordR.isEmpty()){
                System.out.println("error");
            }
        }else{
            Toast.makeText(this,"Las contraseñas no coinciden",Toast.LENGTH_SHORT).show();

        }

    }

    void checkEmail(String emailF,String passwordR) {

        mAuth.fetchSignInMethodsForEmail(emailF).addOnCompleteListener(task -> {
            boolean check = !task.getResult().getSignInMethods().isEmpty();
            if(check){
                Toast.makeText(getApplicationContext(),"El email ya está en uso",Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(getApplicationContext(),"Email disponible, usuario creado",Toast.LENGTH_LONG).show();

                mAuth.createUserWithEmailAndPassword(emailF, passwordR)
                        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information
                                    Log.d(TAG, "createUserWithEmail:success");
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    Toast.makeText(MainActivity.this, "Usuario registrado",
                                            Toast.LENGTH_SHORT).show();
                                } else {
                                    // If sign in fails, display a message to the user.
                                    Log.w(TAG, "createUserWithEmail:failure", task.getException());
                                    Toast.makeText(MainActivity.this, "Error",
                                            Toast.LENGTH_SHORT).show();

                                }
                            }
                        });
            }
        });
    }

    private void firebaseAuthWithGoogle(String idToken) {
        AuthCredential credential = GoogleAuthProvider.getCredential(idToken, null);
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "Sign in with GooglesignInWithCredential:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            System.out.println(mAuth);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "signInWithCredential:failure", task.getException());
                        }
                    }
                });
    }
    void toP1() {
        Intent intent = new Intent(this, parte1.class);
        startActivity(intent);
    }

    public void signIn(){
        Intent signInIntent = gsc.getSignInIntent();
        startActivityForResult(signInIntent,1000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1000){
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);

            try{
                task.getResult(ApiException.class);
                toP1();
                GoogleSignInAccount account = task.getResult(ApiException.class);
                Log.d(TAG, "firebaseAuthWithGoogle:" + account.getId());
                firebaseAuthWithGoogle(account.getIdToken());
            } catch (ApiException e) {
                Toast.makeText(getApplicationContext(),"Algo salió mal", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void emailP1(View view) {
        Intent intent = new Intent(this, parte1.class);
        startActivity(intent);
    }
}