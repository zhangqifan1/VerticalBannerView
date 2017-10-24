package com.bawei.atry;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.taobao.library.VerticalBannerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private VerticalBannerView mBannerView;
    private String imagePath0="img1.imgtn.bdimg.com/it/u=594559231,2167829292&fm=27&gp=0.jpg";
    private String imagePath1="https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3965705221,2010595691&fm=27&gp=0.jpg";
    private String imagePath2="https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=996503075,3768564257&fm=200&gp=0.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        List<BannerBean> list=new ArrayList<>();
        list.add(new BannerBean("图片0",imagePath0));
        list.add(new BannerBean("图片1",imagePath1));
        list.add(new BannerBean("图片2",imagePath2));
        VerticalBannerAdapter adapter = new VerticalBannerAdapter(list,this);
        mBannerView.setAdapter(adapter);
        mBannerView.start();

    }


    private void initView() {
        mBannerView = (VerticalBannerView) findViewById(R.id.bannerView);
    }
}
