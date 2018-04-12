package com.yanqing.file_browser.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yanqing.file_browser.R;

/**
 * Created by yanqing on 2018/4/11.
 */

public class FileViewHolder extends AbsViewHolder {
    public ImageView mIconView;
    public TextView mNameView;
    public TextView mChlidCountView;
    public TextView mModifyTimeView;

    public FileViewHolder(View itemView) {
        super(itemView);
        mIconView = itemView.findViewById(R.id.icon);
        mNameView = itemView.findViewById(R.id.name);
        mChlidCountView = itemView.findViewById(R.id.child_count);
        mModifyTimeView = itemView.findViewById(R.id.modify_time);
    }
}
