package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C21565OoooOO0;
import com.google.android.material.C15966R;

/* JADX INFO: loaded from: classes7.dex */
public class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C21565OoooOO0 c21565OoooOO0OooO0o0 = C21565OoooOO0.OooO0o0(context, attributeSet, C15966R.styleable.TabItem);
        int i = C15966R.styleable.TabItem_android_text;
        TypedArray typedArray = c21565OoooOO0OooO0o0.f63093OooO0O0;
        this.text = typedArray.getText(i);
        this.icon = c21565OoooOO0OooO0o0.OooO0O0(C15966R.styleable.TabItem_android_icon);
        this.customLayout = typedArray.getResourceId(C15966R.styleable.TabItem_android_layout, 0);
        c21565OoooOO0OooO0o0.OooO0oO();
    }
}
