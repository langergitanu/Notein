package com.google.android.play.integrity.internal;

import OooOoo.C20593OooO0Oo;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.ai */
/* JADX INFO: loaded from: classes7.dex */
public final class C16369ai {

    /* JADX INFO: renamed from: a */
    private static final C16408s f51554a = new C16408s("PhoneskyVerificationUtils");

    /* JADX INFO: renamed from: a */
    public static int m75017a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null && applicationInfo.enabled && m75019c(packageInfo.signatures)) {
                return packageInfo.versionCode;
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m75018b(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    if (m75019c(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        return true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    f51554a.m75062e("Play Store package is not found.", new Object[0]);
                }
            } else {
                f51554a.m75062e("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            f51554a.m75062e("Play Store package is not found.", new Object[0]);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m75019c(Signature[] signatureArr) {
        if (signatureArr == null || (signatureArr.length) == 0) {
            f51554a.m75062e("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            String strM75016a = C16368ah.m75016a(signature.toByteArray());
            arrayList.add(strM75016a);
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strM75016a)) {
                return true;
            }
            String str = Build.TAGS;
            if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strM75016a)) {
                return true;
            }
        }
        C16408s c16408s = f51554a;
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) ", ");
            }
        }
        c16408s.m75062e(C20593OooO0Oo.OooO0O0("Play Store package certs are not valid. Found these sha256 certs: [", sb.toString(), "]."), new Object[0]);
        return false;
    }
}
