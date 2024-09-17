package it.kyaw.my_onlineshop.Activity;

import static java.util.ResourceBundle.getBundle;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

import it.kyaw.my_onlineshop.Domain.PopularDomain;
import it.kyaw.my_onlineshop.Helper.Managment;
import it.kyaw.my_onlineshop.R;

public class DetailsActivity extends AppCompatActivity {

    private Button addToCartBtn ;
    private TextView titleTxt,feeTxt,descriptionTxt,reviewTxt,scoreTxt;
    private ImageView picItem , backBtn;
    private PopularDomain object;
    private  int  numberOrder = 1;
    private Managment managment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details);

        managment = new Managment(this);

        intView();
        getBundle();
    }

    private void getBundle() {
//
//        object = (PopularDomain)getIntent().getSerializableExtra("object");
//        int drawableResourceId = this.getResources().getIdentifier(object.getPicUrl(),"drawable",this.getPackageName());
//
//        Glide.with(this)
//                .load(drawableResourceId)
//                .into(picItem);
//
//        titleTxt.setText(object.getTitle());
//        feeTxt.setText("$ " + object.getPrice());
//        descriptionTxt.setText(object.getDescription());
//        reviewTxt.setText(object.getReview() + "");
//        scoreTxt.setText(object.getScore() + "");
//
//
//        addToCartBtn.setOnClickListener(v -> {
//            object.setNumberinCart(numberOrder);
//            managment.insertFood(object);
//        });
//
        backBtn.setOnClickListener(v -> {
            startActivity(new Intent(DetailsActivity.this,MainActivity.class));
        });
    }


//    private void getBundle() {
//        object = (PopularDomain)getIntent().getSerializableExtra("object");
//        int drawableResourceId = this.getResources().getIdentifier(object.getPicUrl(),"drawable",this.getPackageName());
//
//        Glide.with(this)
//                .load(drawableResourceId)
//                .into(picFood);
//
//        titleTxt.setText(object.getTitle());
//        feeTxt.setText("$" + object.getPrice());
//        descriptionTxt.setText(object.getDescription());
//        reviewTxt.setText(object.getReview() + "");
//        scoreTxt.setText(object.getScore() + "");
//
//
//        addToCartBtn.setOnClickListener(v -> {
//            object.setNumberinCart(numberOrder);
//            managment.insertFood(object);
//        });
//
//
//
//
//    }

    private void intView() {
        feeTxt = findViewById(R.id.priceTxt);
        addToCartBtn = findViewById(R.id.addToCartBtn);
        titleTxt = findViewById(R.id.titleTxt);
        descriptionTxt = findViewById(R.id.descriptionTxt);
        reviewTxt = findViewById(R.id.reviewTxt);
        scoreTxt = findViewById(R.id.scoreTxt);
        picItem = findViewById(R.id.picItem);
        backBtn = findViewById(R.id.backBtn);

    }

}