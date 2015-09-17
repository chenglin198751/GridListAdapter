package meilishuo.gridlistadapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    TestAdapter adapter;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.list_view);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<TestItem> list = new ArrayList<TestItem>();
                for (int i = 0; i < 2; i++) {
                    TestItem itemView = new TestItem();
                    list.add(itemView);
                }
                adapter.addAll(list);

            }
        });

        adapter = new TestAdapter(this, 5);

        ArrayList<TestItem> list = new ArrayList<TestItem>();
        for (int i = 0; i < 2; i++) {
            TestItem itemView = new TestItem();
            list.add(itemView);
        }
        adapter.setData(list);
        mListView.setAdapter(adapter);
    }
}
