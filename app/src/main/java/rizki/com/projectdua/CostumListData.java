package rizki.com.projectdua;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by MAC on 11/27/16.
 */

public class CostumListData extends AppCompatActivity {

    ListView ls;

    String[] judulBerita = {
            "Agus Yudhoyono menjanjikan bantuan Rp 1 miliar per RW di Jakarta. Menurut Anies, program itu sudah ada di APBD DKI.",
            "Kawal Timnas di Filipina Sudah, Bersiap Menjamu Vietnam di Tanah Air Kemudian",
            "Rekor BEI, Emisi Obligasi Korporasi Tembus Rp100 Triliiun",
            "Jabat Kabid Humas Polda Metro, Kombes Argo: Kritik Membangun Tidak Masalah"
    };

    Integer[] gmbBerita ={
            R.drawable.new_bg,
            R.drawable.new_bg,
            R.drawable.new_bg,
            R.drawable.new_bg
    };


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_data);
        ls = (ListView)findViewById(R.id.list);

        CustomAdapter adapter = new CustomAdapter(this,
                judulBerita, gmbBerita);
        ls.setAdapter(adapter);

    }
}
