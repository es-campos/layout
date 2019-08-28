package com.example.login5;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class Camera extends AppCompatActivity {
    ImageView imageViewFoto;
    private Button button;

    public Camera(Button button) {
        this.button = button;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.camera);

       if(ActivityCompat.checkSelfPermission(
               this, Manifest.permission.CAMERA) !=PackageManager. PERMISSION_GRANTED){
        ActivityCompat.requestPermissions(
                this, new String[] {Manifest.permission.CAMERA}, 0);
       }

        imageViewFoto =findViewById(R.id.imagemview);
        button= findViewById(R.id.button);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tirarfoto();
            }
        });
    }

    private void  tirarfoto(){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if (requestCode ==1 && resultCode == RESULT_OK){
            Bundle extras = data.getExtras();
            Bitmap imagem = (Bitmap) extras.get("data");
            imageViewFoto.setImageBitmap(imagem);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
