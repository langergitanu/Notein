package ooOOOOoo;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.C22172OooOoO;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Supplier;

/* JADX INFO: renamed from: ooOOOOoo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35074OooOOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static Boolean f125991OooO00o;

    public static int OooO00o() {
        int i;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            i = Integer.parseInt((String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.miui.ui.version.code", "0"));
        } catch (Throwable th) {
            Log.e(C35077OooOo0O.OooO00o("HU"), "getMiuiVersion error", th);
            i = 0;
        }
        C35077OooOo0O.OooO0o0("HU", "getMiuiVersion ,version=%s", Integer.valueOf(i));
        return i;
    }

    public static String OooO0O0(Context context) {
        Objects.requireNonNull(context);
        PackageManager packageManager = context.getPackageManager();
        Iterator<ResolveInfo> it = (Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentServices(new Intent("com.xiaomi.dist.intent.action.APP_HANDOFF"), PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentServices(new Intent("com.xiaomi.dist.intent.action.APP_HANDOFF"), 0)).iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().serviceInfo;
            if (serviceInfo != null && serviceInfo.isEnabled()) {
                String str = serviceInfo.packageName;
                if (Objects.equals(serviceInfo.name, "com.xiaomi.dist.handoff.AppHandoffService") && "com.milink.service".equals(str) && (serviceInfo.applicationInfo.flags & 1) != 0) {
                    return str;
                }
            }
        }
        return null;
    }

    public static Boolean OooO0OO(Context context) {
        Bundle bundleCall;
        if (context == null) {
            return Boolean.FALSE;
        }
        Boolean bool = f125991OooO00o;
        if (bool != null) {
            return bool;
        }
        try {
            bundleCall = context.getContentResolver().call(Uri.parse("content://com.xiaomi.dist.provider.app_meta"), "getAppInfo", (String) null, C22172OooOoO.OooO00o("androidPackageName", context.getPackageName()));
        } catch (Throwable th) {
            Log.e(C35077OooOo0O.OooO00o("HU"), "isInHandoffWhiteList, get AppMeta error", th);
            bundleCall = null;
        }
        if (bundleCall != null && bundleCall.containsKey("supportHandoff")) {
            f125991OooO00o = Boolean.valueOf(bundleCall.getBoolean("supportHandoff", true));
        } else {
            f125991OooO00o = null;
        }
        return f125991OooO00o;
    }

    public static String OooO0Oo(Supplier<Uri> supplier) {
        Uri uri = supplier != null ? supplier.get() : null;
        String string = uri != null ? uri.toString() : "";
        C35077OooOo0O.OooO0o0("HU", "getUriString : %s", uri);
        return string;
    }

    public static boolean OooO0o(Context context) {
        if (OooO00o() < 14) {
            C35077OooOo0O.OooO0Oo("HU", "isSupported, miui version not support", null);
            return false;
        }
        Boolean boolOooO0OO = OooO0OO(context);
        if (boolOooO0OO != null && !boolOooO0OO.booleanValue()) {
            C35077OooOo0O.OooO0Oo("HU", "isSupported, not in whitelist", null);
            return false;
        }
        boolean z = !TextUtils.isEmpty(OooO0O0(context));
        C35077OooOo0O.OooO0o0("HU", "isSupported=%s", Boolean.valueOf(z));
        return z;
    }

    public static boolean OooO0o0(Context context) {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfo = null;
        boolean z = false;
        if (OooO00o() < 14) {
            C35077OooOo0O.OooO0Oo("HU", "isMiuiRelaySupported, miui version not support", null);
            return false;
        }
        Boolean boolOooO0OO = OooO0OO(context);
        if (boolOooO0OO != null && !boolOooO0OO.booleanValue()) {
            C35077OooOo0O.OooO0Oo("HU", "isSupported, not in whitelist", null);
            return false;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.xiaomi.mirror", 0);
        } catch (Throwable unused) {
            C35077OooOo0O.OooO0o("HU", "isn't SupportRelay:%s", "com.xiaomi.mirror");
        }
        if (Build.VERSION.SDK_INT >= 28 && packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null && applicationInfo.uid == 1000 && packageInfo.getLongVersionCode() >= 20000) {
            z = true;
        }
        C35077OooOo0O.OooO0o0("HU", "SupportRelay=%s", Boolean.valueOf(z));
        return z;
    }
}
