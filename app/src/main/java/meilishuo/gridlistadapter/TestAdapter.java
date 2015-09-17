package meilishuo.gridlistadapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * meilishuo -- weichenglin create in 15/9/17
 */
public class TestAdapter extends GridAdapter<TestItem> {
    public TestAdapter(Context context) {
        super(context);
    }

    /**
     * @param context Context
     * @param columns gird一行要显示的列数
     */
    public TestAdapter(Context context, int columns) {
        super(context, columns);
    }


    @Override
    protected View getItemView(int position, View convertView) {
        super.getItemView(position, convertView);
        ViewHolder holder;
        if (null == convertView) {
            convertView = inflater.inflate(R.layout.test_item, null);
            holder = new ViewHolder();
            holder.text1 = (TextView) convertView.findViewById(R.id.text1);
            convertView.setTag(holder);
            Log.i("tag_3", "convertView = null");
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.text1.setText(position + "");
        return convertView;
    }

    static class ViewHolder {
        TextView text1;
    }
}
