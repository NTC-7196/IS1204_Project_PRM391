package com.example.tranhuuhiep.holahome;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Account extends Fragment {
    private ListView lvAccount;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_account, null);
        lvAccount =  view.findViewById(R.id.listView);
        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Thông tin cá nhân");
        arrayList.add("Giới thiệu bạn bè");
        arrayList.add("Tiền thưởng");
        arrayList.add("Hợp đồng");
        arrayList.add("Cài đặt");

         ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,arrayList);
         lvAccount.setAdapter(arrayAdapter);

        return view;
    }
}
