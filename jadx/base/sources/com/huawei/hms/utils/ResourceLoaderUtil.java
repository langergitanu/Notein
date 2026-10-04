package com.huawei.hms.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ResourceLoaderUtil {

    /* JADX INFO: renamed from: a */
    public static Context f57036a;

    /* JADX INFO: renamed from: b */
    public static String f57037b;

    public static int getAnimId(String str) {
        return f57036a.getResources().getIdentifier(str, "anim", f57037b);
    }

    public static int getColorId(String str) {
        return f57036a.getResources().getIdentifier(str, "color", f57037b);
    }

    public static Drawable getDrawable(String str) {
        return f57036a.getResources().getDrawable(getDrawableId(str));
    }

    public static int getDrawableId(String str) {
        return f57036a.getResources().getIdentifier(str, "drawable", f57037b);
    }

    public static int getIdId(String str) {
        return f57036a.getResources().getIdentifier(str, "id", f57037b);
    }

    public static int getLayoutId(String str) {
        return f57036a.getResources().getIdentifier(str, "layout", f57037b);
    }

    public static String getString(String str) {
        return f57036a.getResources().getString(getStringId(str));
    }

    public static int getStringId(String str) {
        return f57036a.getResources().getIdentifier(str, "string", f57037b);
    }

    public static int getStyleId(String str) {
        return f57036a.getResources().getIdentifier(str, "style", f57037b);
    }

    public static Context getmContext() {
        return f57036a;
    }

    public static void setmContext(Context context) {
        f57036a = context;
        f57037b = context.getPackageName();
    }

    public static String getString(String str, Object... objArr) {
        return f57036a.getResources().getString(getStringId(str), objArr);
    }
}
