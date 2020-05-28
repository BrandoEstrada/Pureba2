package com.example.TrabajoFacultativa2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.content.Intent;
import android.os.Bundle;

public class Activity2 extends AppCompatActivity {
    TextView mTitleView, mDescriptionView,mProfesorview,mDiaview,mHoraview,mFechaentregaview;
    ImageView mImageView;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad2);

        ActionBar actionBar=getSupportActionBar();

        mTitleView=findViewById(R.id.title_view);
        mDescriptionView=findViewById(R.id.descripcion_view);
        mImageView=findViewById(R.id.image_view);
        mProfesorview=findViewById(R.id.profesor_view);
        mDiaview=findViewById(R.id.dia_view);
        mHoraview=findViewById(R.id.hora_view);
        mFechaentregaview=findViewById(R.id.fechaentrega_view);

        Intent intent=getIntent();
        String mTitle=intent.getStringExtra("iTitle");
        String mDes=intent.getStringExtra("iDesc");
        String mPro=intent.getStringExtra("iProfesor");
        String mDi=intent.getStringExtra("iDia");
        String mHor=intent.getStringExtra("iHora");
        String mFechen=intent.getStringExtra("iFechentrega");

        byte[] mBytes=getIntent().getByteArrayExtra("iImage");
        Bitmap bitmap=BitmapFactory.decodeByteArray(mBytes,0,mBytes.length);

        actionBar.setTitle(mTitle);
        mTitleView.setText(mTitle);
        mDescriptionView.setText(mDes);
        mImageView.setImageBitmap(bitmap);
        mProfesorview.setText(mPro);
        mDiaview.setText(mDi);
        mHoraview.setText(mHor);
        mFechaentregaview.setText(mFechen);


    }

}
