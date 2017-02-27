package com.example.nanke.cniaoshop.frament;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nanke.cniaoshop.GlideImageLoader;
import com.example.nanke.cniaoshop.R;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zt on 2017/2/24.
 */

public class HomeFragment extends Fragment {
    private Banner banner;
    private List<String> list=new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_home,container,false);
        banner= (Banner) view.findViewById(R.id.banner);
        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1488793445&di=4fb044856c75ddae08623590a1a75352&imgtype=jpg&er=1&src=http%3A%2F%2Fimg007.hc360.cn%2Fg8%2FM00%2F7E%2FCF%2FwKhQt1Nu6haEB6irAAAAABzDZZ4852.jpg");
        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1488198756866&di=0617cf81ec148951d1a16554acc80f9b&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F018f1b56f2057232f875a9448ab29f.jpg%40900w_1l_2o_100sh.jpg");
        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1488802022&di=e3326642f9d455512a260d2e9c30d316&imgtype=jpg&er=1&src=http%3A%2F%2Fpic.58pic.com%2F58pic%2F17%2F25%2F97%2F01c58PICyH9_1024.jpg");
        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1488802049&di=1a7d6316cc49ebf4dd9fcfa0a269fa1a&imgtype=jpg&er=1&src=http%3A%2F%2Fpic.58pic.com%2F58pic%2F17%2F52%2F15%2F25d58PIC8XD_1024.jpg");

        banner.setImages(list).setImageLoader(new GlideImageLoader()).start();
        return  view;
    }
}
