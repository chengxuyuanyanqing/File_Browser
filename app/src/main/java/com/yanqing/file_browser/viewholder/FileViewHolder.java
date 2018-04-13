package com.yanqing.file_browser.viewholder;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.yanqing.file_browser.R;

/**
 * Created by yanqing on 2018/4/11.
 */

public class FileViewHolder extends AbsViewHolder {
    public ImageView mIconView;
    public TextView mNameView;
    public TextView mChildCountView;
    public TextView mModifyTimeView;
    public CheckBox mCheckBox;

    public FileViewHolder(View itemView) {
        super(itemView);
        mIconView = itemView.findViewById(R.id.icon);
        mNameView = itemView.findViewById(R.id.name);
        mChildCountView = itemView.findViewById(R.id.child_count);
        mModifyTimeView = itemView.findViewById(R.id.modify_time);
        mCheckBox = itemView.findViewById(R.id.checkBox);
    }
}
