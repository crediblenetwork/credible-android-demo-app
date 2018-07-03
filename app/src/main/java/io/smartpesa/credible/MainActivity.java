package io.smartpesa.credible;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.List;

import io.smartpesa.credible.helper.ExpandableHeightGridView;
import io.smartpesa.credible.helper.HomeMenuAdapter;
import io.smartpesa.credible.helper.HomeMenuItem;

public class MainActivity extends AppCompatActivity {

    public static final int MENU_VIEW_MY_DATA = 0;
    public static final int MENU_ADD_DATA = 1;
    public static final int MENU_VERIFY_DATA = 2;
    public static final int MENU_EXPORT_KEY = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpTransactionMenu();
    }

    private void setUpTransactionMenu() {
        final List<HomeMenuItem> menuItems = new ArrayList<>();

        menuItems.add(new HomeMenuItem(MENU_VIEW_MY_DATA, R.drawable.ic_view_data, R.string.title_view_data));
        menuItems.add(new HomeMenuItem(MENU_ADD_DATA, R.drawable.ic_add_data, R.string.title_add_data));
        menuItems.add(new HomeMenuItem(MENU_VERIFY_DATA, R.drawable.ic_verify_data, R.string.title_verify_data));
        menuItems.add(new HomeMenuItem(MENU_EXPORT_KEY, R.drawable.ic_export_key, R.string.title_export_key));

        HomeMenuAdapter adapter = new HomeMenuAdapter(this, menuItems);
        ExpandableHeightGridView grid = (ExpandableHeightGridView) findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setExpanded(true);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

            }
        });
    }
}
