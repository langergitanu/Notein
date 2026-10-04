package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0167s {

    /* JADX INFO: renamed from: a */
    public static Boolean f111a;

    /* JADX INFO: renamed from: a */
    public static final boolean m113a(Context context) {
        Boolean bool = f111a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            boolean z = (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) != 0;
            f111a = Boolean.valueOf(z);
            return z;
        } catch (Exception unused) {
            return false;
        }
    }
}
