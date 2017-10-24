package com.bawei.atry;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.taobao.library.BaseBannerAdapter;
import com.taobao.library.VerticalBannerView;

import java.util.List;

/**
 * Created by 张祺钒
 * on2017/10/24.
 */

public class VerticalBannerAdapter extends BaseBannerAdapter<BannerBean> {
    private Context context;
    public VerticalBannerAdapter(List<BannerBean> datas,Context context) {
        super(datas);
        this.context=context;
    }

    @Override
    public View getView(VerticalBannerView verticalBannerView) {
        return LayoutInflater.from(context).inflate(R.layout.item, null);
    }

    @Override
    public void setItem(View view, BannerBean bannerBean) {
        ImageView image = view.findViewById(R.id.image);
        TextView tv = view.findViewById(R.id.tv);
        ImageLoaderUtils.setImageView(bannerBean.imagePaths,context,image);
        tv.setText(bannerBean.name);
    }
}
