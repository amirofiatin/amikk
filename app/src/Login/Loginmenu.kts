package com.aplikasi.laudry;

import ...

public class login extends AppCompatActivity {
    EditText txUser, txtPass;
    Button btnlogin;
    Spinner Spinner;

    @SuppressLint("MissingInflatedId")
    @override
    protected void onCreate(Bundle savedInstancestate) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtUser = (EditText) findViewById(I.id.user);
        txtPass = (EditText) findViewById(I.id.passw);
        btnLogin = (Button) findViewById(R.id.btn1);
        spinner = (spinner) findViewById(R.id.spinner1);

        ArrayAdapter<CharSequence> adapter =ArrayAdapter.CreateFromResource(this, R.array.usertype, androidx.appcompat.R.layout.support_simpel_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        btnlogin.setOnClickListener(new view.onClickListener() {
            @Override
            public void onClick(View v){
                string item = spinner.getSelecteditem().toString();
                if (txUser.getText().equals("admin") && txPass.getText().toString.equals("admin") && item.equals("user")){
                    intent pindah = net intent (packageControl login.this, Admin.Class);
                    Toast.makeText(getApplicationContext(),"Login Berhasil", Toast.LENGTH_SHORT).show();
                }
                else if (txtUser.getText().toString().equals("user") && txtPass.getText().toString().equals("user") && item.equals("user")) {
                    intent intent = new intent ( login.this, Process1.class);
                    startActivity(intent);
                    Toast.makeText(getAplicationContext(), "login berhasil", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Error!! Login Gagal", Toast.LENGTH_SHORT).show();
                }
            }

        })

    }
}