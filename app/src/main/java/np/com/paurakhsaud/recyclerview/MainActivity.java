package np.com.paurakhsaud.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import np.com.paurakhsaud.recyclerview.features.adapter.ProfileRecyclerAdapter;
import np.com.paurakhsaud.recyclerview.features.pojo.ProfilePojo;

public class MainActivity extends AppCompatActivity {
    ArrayList<ProfilePojo> arrayListOfProfiles = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));//setting linear Layout manager
        arrayListOfProfiles.add(new ProfilePojo(R.mipmap.ic_one, "Leonardo DiCaprio", "Sr.Designer", R.drawable.ic_delete));
        arrayListOfProfiles.add(new ProfilePojo(R.mipmap.ic_two, "Hari Shah", "Sr.Designer", R.drawable.ic_delete));
        arrayListOfProfiles.add(new ProfilePojo(R.mipmap.ic_three, "Sita Ram Thing", "Sr.Developer", R.drawable.ic_delete));
        arrayListOfProfiles.add(new ProfilePojo(R.mipmap.ic_four, "Ram Nepali", "Project Manager", R.drawable.ic_delete));
        arrayListOfProfiles.add(new ProfilePojo(R.mipmap.ic_five, "Anuja Simkhada", "Sr.Designer", R.drawable.ic_delete));
        arrayListOfProfiles.add(new ProfilePojo(R.mipmap.ic_six, "Manjil Khoju", "Project Manager", R.drawable.ic_delete));
        arrayListOfProfiles.add(new ProfilePojo(R.mipmap.ic_seven, "Abinash Bhattari", "Section Chief", R.drawable.ic_delete));
        arrayListOfProfiles.add(new ProfilePojo(R.mipmap.ic_eight, "Chiryu Rana", "Content Writer", R.drawable.ic_delete));
        arrayListOfProfiles.add(new ProfilePojo(R.mipmap.ic_nine, "Ace Chhattri", "Project Manager", R.drawable.ic_delete));
        arrayListOfProfiles.add(new ProfilePojo(R.mipmap.ic_ten, "Sita Sargun", "Data Analyst", R.drawable.ic_delete));
        arrayListOfProfiles.add(new ProfilePojo(R.mipmap.ic_ten, "Arjun", "Data Developer", R.drawable.ic_delete));
        arrayListOfProfiles.add(new ProfilePojo(R.mipmap.ic_seven, "Paurakh Saud", "Section Chief", R.drawable.ic_delete));
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        ProfileRecyclerAdapter adapter = new ProfileRecyclerAdapter(this, arrayListOfProfiles);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}