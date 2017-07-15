package com.example.pothi.uwh18.Adapter;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pothi.uwh18.Common.Person;
import com.example.pothi.uwh18.R;

import java.util.ArrayList;

/**
 * Created by pothi on 15-07-2017.
 */

public class Subadapter extends BaseAdapter {
    Context mcontext;
    ArrayList<Person> arrayList = new ArrayList<>();
    public Subadapter(Context context, ArrayList<Person> personArrayList)
    {
        this.mcontext=context;
        this.arrayList=personArrayList;
        System.out.println("***********List*"+arrayList);

    }
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Person person=arrayList.get(position);

        convertView = LayoutInflater.from(mcontext).inflate(R.layout.uwhlayout,null);
        final ImageView ivProfilePic = (ImageView) convertView.findViewById(R.id.ivProfilePic);

        final TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvStatus = (TextView) convertView.findViewById(R.id.tvStatus);
        TextView tvDate = (TextView) convertView.findViewById(R.id.tvDate);

        tvName.setText(person.getUserName());
        tvStatus.setText(person.getUserStatus());
        tvDate.setText(person.getUserLastSeenDate());
        ivProfilePic.setImageResource(person.getProfilePic());


        ivProfilePic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Dialog dialog = new Dialog(mcontext);
                dialog.setContentView(R.layout.custom_user_dialog);

                TextView tvUserName = (TextView) dialog.findViewById(R.id.tvUserName);
                TextView tvCall = (TextView) dialog.findViewById(R.id.tvCall);
                Button tvMessage = (Button) dialog.findViewById(R.id.regcamp);///push notificat
                ImageView ivImage = (ImageView) dialog.findViewById(R.id.ivProfilePic);

                tvUserName.setText(person.getUserName());
                ivProfilePic.setBackgroundResource(person.getProfilePic());
                dialog.show();
            }
        });



        return convertView;
    }
}
