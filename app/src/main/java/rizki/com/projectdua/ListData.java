package rizki.com.projectdua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListData extends AppCompatActivity {

    String[] judulBerita = {
            "Agus Yudhoyono menjanjikan bantuan Rp 1 miliar per RW di Jakarta. Menurut Anies, program itu sudah ada di APBD DKI.",
            "Kawal Timnas di Filipina Sudah, Bersiap Menjamu Vietnam di Tanah Air Kemudian",
            "Rekor BEI, Emisi Obligasi Korporasi Tembus Rp100 Triliiun",
            "Jabat Kabid Humas Polda Metro, Kombes Argo: Kritik Membangun Tidak Masalah"
    };

    ListView lsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_data);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, judulBerita);

        lsList = (ListView)findViewById(R.id.list);
        lsList.setAdapter(adapter);
    }
}
