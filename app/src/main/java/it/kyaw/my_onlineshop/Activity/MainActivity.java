package it.kyaw.my_onlineshop.Activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import it.kyaw.my_onlineshop.Adapter.PopularListAdapter;
import it.kyaw.my_onlineshop.Domain.PopularDomain;
import it.kyaw.my_onlineshop.R;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterPopular;
    private RecyclerView recyclerViewPopular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        
        intRecyclerView();
       
    }

    private void intRecyclerView() {
        ArrayList<PopularDomain> items = new ArrayList<>();
        items.add(new PopularDomain("MacBook 13 M2 chip","Your MacBook Pro comes with 90 days of complimentary technical support and a one-year limited warranty. Purchase AppleCare+ for Mac to extend your coverage from your AppleCare+ purchase date and add unlimited repairs for accidental damage from handling, each subject to a service fee of $99 for screen damage or external enclosure damage, or $299 for other repairable accidental damage, plus applicable tax.","pic1",15,4,500));
        items.add(new PopularDomain("PS-5 Digital","Your MacBook Pro comes with 90 days of complimentary technical support and a one-year limited warranty. Purchase AppleCare+ for Mac to extend your coverage from your AppleCare+ purchase date and add unlimited repairs for accidental damage from handling, each subject to a service fee of $99 for screen damage or external enclosure damage, or $299 for other repairable accidental damage, plus applicable tax.","pic2",10,30,450));
        items.add(new PopularDomain("Iphone 14","Your MacBook Pro comes with 90 days of complimentary technical support and a one-year limited warranty. Purchase AppleCare+ for Mac to extend your coverage from your AppleCare+ purchase date and add unlimited repairs for accidental damage from handling, each subject to a service fee of $99 for screen damage or external enclosure damage, or $299 for other repairable accidental damage, plus applicable tax.","pic3",15,20,800));

        recyclerViewPopular = findViewById(R.id.view1);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterPopular = new PopularListAdapter(items);
        recyclerViewPopular .setAdapter(adapterPopular);

    }
}