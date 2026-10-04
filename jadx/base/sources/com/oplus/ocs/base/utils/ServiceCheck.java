package com.oplus.ocs.base.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes9.dex */
public class ServiceCheck {

    /* JADX INFO: renamed from: a */
    private static final String f57606a = "ServiceCheck";

    /* JADX INFO: renamed from: a */
    public static boolean m80540a(Context context) {
        return m80541a(context, "com.coloros.ocs.opencapabilityservice") || m80541a(context, "com.oplus.ocs");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m80542b(Context context) {
        return m80543b(context, "com.coloros.ocs.opencapabilityservice") || m80543b(context, "com.oplus.ocs");
    }

    public static boolean check(Context context, String str) {
        int i;
        try {
            i = context.getPackageManager().getApplicationInfo(str, 128).uid;
        } catch (PackageManager.NameNotFoundException unused) {
            C18861a.m80548d(f57606a, str + " not found");
            i = 0;
        }
        return i != 0;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m80541a(Context context, String str) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(str, 128).metaData;
            return bundle != null && bundle.containsKey("ocs_internal") && bundle.getInt("ocs_internal", 0) == 1;
        } catch (PackageManager.NameNotFoundException e) {
            C18861a.m80548d(f57606a, "Unable to fetch metadata from teh manifest " + e.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m80543b(Context context, String str) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(str, 128).metaData;
            if (bundle != null && bundle.containsKey("ocs_internal") && bundle.containsKey("ocs_optimize")) {
                int i = bundle.getInt("ocs_internal", 0);
                int i2 = bundle.getInt("ocs_optimize", 0);
                if (i == 1 && i2 == 1) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            C18861a.m80548d(f57606a, "Unable to fetch metadata from teh manifest " + e.getMessage());
            return false;
        }
    }
}
