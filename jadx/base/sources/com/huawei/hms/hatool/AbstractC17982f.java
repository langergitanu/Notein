package com.huawei.hms.hatool;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.huawei.hms.hatool.f */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC17982f {

    /* JADX INFO: renamed from: com.huawei.hms.hatool.f$a */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m77303a(Class cls, String str, Class[] clsArr, Object[] objArr) throws a {
        String str2;
        if (cls == null) {
            throw new a("class is null in invokeStaticFun");
        }
        if (clsArr == null) {
            if (objArr != null) {
                throw new a("paramsType is null, but params is not null");
            }
        } else {
            if (objArr == null) {
                throw new a("paramsType or params should be same");
            }
            if (clsArr.length != objArr.length) {
                throw new a("paramsType len:" + clsArr.length + " should equal params.len:" + objArr.length);
            }
        }
        try {
        } catch (NoSuchMethodException unused) {
            C18030y.m77591f("hmsSdk", "invokeStaticFun(): cls.getMethod(),No Such Method !");
        }
        try {
            return cls.getMethod(str, clsArr).invoke(null, objArr);
        } catch (IllegalAccessException unused2) {
            str2 = "invokeStaticFun(): method invoke Exception!";
            C18030y.m77591f("hmsSdk", str2);
            return null;
        } catch (IllegalArgumentException unused3) {
            str2 = "invokeStaticFun(): Illegal Argument!";
            C18030y.m77591f("hmsSdk", str2);
            return null;
        } catch (InvocationTargetException unused4) {
            str2 = "invokeStaticFun(): Invocation Target Exception!";
            C18030y.m77591f("hmsSdk", str2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m77309b() {
        String strM77308a = m77308a("com.huawei.android.os.SystemPropertiesEx", "ro.huawei.build.display.id", "");
        C18030y.m77586c("hmsSdk", "SystemPropertiesEx: get rom_ver: " + strM77308a);
        if (!TextUtils.isEmpty(strM77308a)) {
            return strM77308a;
        }
        String str = Build.DISPLAY;
        C18030y.m77586c("hmsSdk", "SystemProperties: get rom_ver: " + str);
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static String m77311c(Context context) {
        return context == null ? "" : context.getPackageName();
    }

    /* JADX INFO: renamed from: d */
    public static String m77312d(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(m77311c(context), 16384).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            C18030y.m77591f("hmsSdk", "getVersion(): The package name is not correct!");
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m77304a(String str, String str2, Class[] clsArr, Object[] objArr) {
        String str3;
        try {
            return m77303a(Class.forName(str), str2, clsArr, objArr);
        } catch (a unused) {
            str3 = "invokeStaticFun(): Static function call Exception ";
            C18030y.m77591f("hmsSdk", str3);
            return null;
        } catch (ClassNotFoundException unused2) {
            str3 = "invokeStaticFun() Not found class!";
            C18030y.m77591f("hmsSdk", str3);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m77310b(Context context) {
        Bundle bundle;
        Object obj;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && (obj = bundle.get("CHANNEL")) != null) {
                String string = obj.toString();
                return string.length() > 256 ? "Unknown" : string;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            C18030y.m77591f("hmsSdk", "getChannel(): The packageName is not correct!");
        }
        return "Unknown";
    }

    /* JADX INFO: renamed from: a */
    public static String m77305a() {
        return m77307a("ro.build.version.emui", "");
    }

    /* JADX INFO: renamed from: a */
    public static String m77306a(Context context) {
        return context == null ? "" : Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    /* JADX INFO: renamed from: a */
    public static String m77307a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        String strM77308a = m77308a("android.os.SystemProperties", str, str2);
        return TextUtils.isEmpty(strM77308a) ? m77308a("com.huawei.android.os.SystemPropertiesEx", str, str2) : strM77308a;
    }

    /* JADX INFO: renamed from: a */
    public static String m77308a(String str, String str2, String str3) {
        Object objM77304a = m77304a(str, "get", new Class[]{String.class, String.class}, new Object[]{str2, str3});
        return objM77304a != null ? (String) objM77304a : str3;
    }
}
