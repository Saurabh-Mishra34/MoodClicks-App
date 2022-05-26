package com.example.loginpage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProgrammingVideoAdapter extends RecyclerView.Adapter<ProgrammingVideoAdapter.ProgrammingVideoViewHolder> {

    private String[] data;
    public ProgrammingVideoAdapter(String[] data)
    {
        this.data=data;
    }
    @NonNull
    @Override
    public ProgrammingVideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.vid_rv_layout,parent,false);
        return new ProgrammingVideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingVideoViewHolder holder, int position) {
        String title = data[position];
        holder.txtTitle2.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingVideoViewHolder extends RecyclerView.ViewHolder{

        ImageView imgIcon2;
        TextView txtTitle2;

        public ProgrammingVideoViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon2 = (ImageView) itemView.findViewById(R.id.imgIcon2);
            txtTitle2 = (TextView) itemView.findViewById(R.id.txtTitle2);
        }
    }

}
