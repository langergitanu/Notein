package com.lzf.easyfloat;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0O0OOO0.OooO0OO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/lzf/easyfloat/EasyFloatInitializer;", "Landroid/content/ContentProvider;", "<init>", "()V", "easyfloat_release"}, m80613k = 1, m80614mv = {1, 5, 1}, m80616xi = 48)
public final class EasyFloatInitializer extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        OooOOO0.OooO0oO(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        OooOOO0.OooO0oO(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        OooOOO0.OooO0oO(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        OooOOO0.OooO0Oo(context);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
        }
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new OooO0OO());
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        OooOOO0.OooO0oO(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        OooOOO0.OooO0oO(uri, "uri");
        return 0;
    }
}
