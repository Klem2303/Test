package com.example.root.test;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.siyamed.shapeimageview.CircularImageView;
import com.squareup.picasso.Picasso;

import java.util.List;

import static com.example.root.test.R.id.avatar;

class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<User> usersList;
    Context myContext;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView age;
        public TextView similarity;
        public TextView lastSeen;
        public TextView unreadMessages;
        public CircularImageView avatar;
        public MyViewHolder(View v) {
            super(v);
            name = (TextView) v.findViewById(R.id.name);
            age = (TextView) v.findViewById(R.id.age);
            similarity = (TextView) v.findViewById(R.id.similarity);
            lastSeen = (TextView) v.findViewById(R.id.lastSeen);
            unreadMessages = (TextView) v.findViewById(R.id.unreadMessages);
            avatar = (CircularImageView) v.findViewById(R.id.avatar);
        }
    }

    public MyAdapter(Context context, List<User> users) {
        usersList = users;
        myContext = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item1, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ImageView avatarImage = holder.avatar;
        holder.name.setText(usersList.get(position).getName());
        holder.age.setText(String.valueOf(usersList.get(position).getAge()) + " лет ,");
        holder.similarity.setText(String.valueOf(usersList.get(position).getSimilarity()) + " %");
        holder.lastSeen.setText(String.valueOf(usersList.get(position).getLastSeen()));
        holder.unreadMessages.setText(String.valueOf(usersList.get(position).getUnreadMessages()));
        Picasso.with(myContext).load(usersList.get(position).getAvatar()).resize(150,150).into(avatarImage);
    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }
}
