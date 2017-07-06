package rizki.com.projectdua;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by MAC on 11/27/16.
 */

public class CustomAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private  final String[] judulBerita;
    private final Integer[] gambarBerita;
    public CustomAdapter(Activity context, String[] judulBerita, Integer[]
                         gambarBerita) {
        super(context, R.layout.list_item, judulBerita);

        this.gambarBerita = gambarBerita;
        this.judulBerita = judulBerita;
        this.context = context;
    }



    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();

        View rowView = inflater.inflate(R.layout.list_item,null, true);
        TextView txtJudul = (TextView)rowView.findViewById
                (R.id.txtListItem);
        ImageView imgBerita = (ImageView)rowView.findViewById
                (R.id.imgListItem);

        txtJudul.setText(judulBerita[position]);
        imgBerita.setImageResource(gambarBerita[position]);
        return rowView;

    }
}
