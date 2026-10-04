package com.hbb20;

import android.widget.TextView;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes8.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f68812OooO00o = 0;

    static {
        try {
            TextView.class.getDeclaredField("mCursorDrawableRes").setAccessible(true);
            Field declaredField = TextView.class.getDeclaredField("mEditor");
            declaredField.setAccessible(true);
            declaredField.getType().getDeclaredField("mCursorDrawable").setAccessible(true);
        } catch (Exception unused) {
        }
    }
}
