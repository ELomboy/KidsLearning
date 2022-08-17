package com.prjucu.attainz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class student extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private EditText email,password;
    private Button studentsignin, studentsignup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        mAuth = FirebaseAuth.getInstance();
        email = findViewById(R.id.login_email);
        password = findViewById(R.id.login_password);
        studentsignin = findViewById(R.id.studentsignin);
        studentsignup = findViewById(R.id.studentsignup);



        studentsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                studentsignin();
            }
        });

        studentsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(student.this, studentsignup.class));
            }
        });

    }

    private void studentsignin()
    {
        String user = email.getText().toString().trim();
        String pass = password.getText().toString().trim();
        if (user.isEmpty())
        {
            email.setError("Email cannot be empty");
        }
        if (pass.isEmpty())
        {
            password.setError("Password cannot be empty");
        }
        else
        {
            mAuth.signInWithEmailAndPassword(user,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task)
                {
                    if (task.isSuccessful())
                    {
                        Toast.makeText(student.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(student.this, studentmenu.class));
                    }
                    else
                    {
                        Toast.makeText(student.this, "Login Failed"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}