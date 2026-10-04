package com.google.android.material.bottomnavigation;

import android.content.Context;
import com.google.android.material.C15966R;
import com.google.android.material.navigation.NavigationBarItemView;

/* JADX INFO: loaded from: classes7.dex */
public class BottomNavigationItemView extends NavigationBarItemView {
    public BottomNavigationItemView(Context context) {
        super(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    public int getItemDefaultMarginResId() {
        return C15966R.dimen.design_bottom_navigation_margin;
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    public int getItemLayoutResId() {
        return C15966R.layout.design_bottom_navigation_item;
    }
}
