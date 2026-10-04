package com.alipay.apmobilesecuritysdk.p007c;

import android.content.Context;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import o00OO0oO.C25002OooO00o;
import o00OO0oO.C25004OooO0Oo;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0177a {
    /* JADX INFO: renamed from: a */
    public static synchronized void m134a(Context context, String str, String str2, String str3) {
        C25002OooO00o c25002OooO00oM137b = m137b(context, str, str2, str3);
        String str4 = context.getFilesDir().getAbsolutePath() + "/log/ap";
        String str5 = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log";
        String string = c25002OooO00oM137b.toString();
        synchronized (C25004OooO0Oo.class) {
            C25004OooO0Oo.f84824OooO00o = str4;
            C25004OooO0Oo.f84825OooO0O0 = str5;
            C25004OooO0Oo.f84826OooO0OO = string;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C25002OooO00o m137b(Context context, String str, String str2, String str3) {
        String packageName;
        try {
            packageName = context.getPackageName();
        } catch (Throwable unused) {
            packageName = "";
        }
        String str4 = Build.MODEL;
        C25002OooO00o c25002OooO00o = new C25002OooO00o();
        c25002OooO00o.f84817OooO00o = packageName;
        c25002OooO00o.f84818OooO0O0 = str;
        c25002OooO00o.f84819OooO0OO = str2;
        c25002OooO00o.f84820OooO0Oo = str3;
        return c25002OooO00o;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m135a(String str) {
        synchronized (C25004OooO0Oo.class) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            C25004OooO0Oo.OooO0O0(arrayList);
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m136a(Throwable th) {
        C25004OooO0Oo.OooO00o(th);
    }
}
