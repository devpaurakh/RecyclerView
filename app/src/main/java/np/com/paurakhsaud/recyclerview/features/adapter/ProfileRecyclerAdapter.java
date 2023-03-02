package np.com.paurakhsaud.recyclerview.features.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import np.com.paurakhsaud.recyclerview.R;
import np.com.paurakhsaud.recyclerview.features.pojo.ProfilePojo;

public class ProfileRecyclerAdapter extends RecyclerView.Adapter<ProfileRecyclerAdapter.ViewHolder> {

    Context context;
    ArrayList<ProfilePojo> arrProfiles;

    public ProfileRecyclerAdapter(Context context, ArrayList<ProfilePojo> arrProfiles) {
        this.context = context;
        this.arrProfiles = arrProfiles;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { //
        View view = LayoutInflater.from(context).inflate(R.layout.contact_column, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.profilePhoto.setImageResource(arrProfiles.get(position).profilePhoto);
        holder.txtName.setText(arrProfiles.get(position).name);
        holder.txtPost.setText(arrProfiles.get(position).post);
        holder.bin.setImageResource(arrProfiles.get(position).bin);
    }

    @Override
    public int getItemCount() {
        return arrProfiles.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtPost;
        ImageView profilePhoto, bin;

        public ViewHolder(View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.tvName);
            txtPost = itemView.findViewById(R.id.tvPost);
            profilePhoto = itemView.findViewById(R.id.ivProfile);
            bin = itemView.findViewById(R.id.ivDelete);

        }
    }
}
