package com.huawei.hms.network.api;

import OoooooO.C21445Oooo;
import android.content.Context;
import android.os.Build;
import com.aspose.slides.C22226Oooo0oo;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.Utils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: com.huawei.hms.network.api.a */
/* JADX INFO: loaded from: classes9.dex */
public class C18083a {

    /* JADX INFO: renamed from: a */
    private static final String f54006a = "ClassLoaderPathManager";

    /* JADX INFO: renamed from: b */
    private static final String f54007b = "lib";

    /* JADX INFO: renamed from: c */
    private static final String f54008c = "!";

    /* JADX INFO: renamed from: d */
    private static final String f54009d = "arm64-v8a";

    /* JADX INFO: renamed from: e */
    private static final String f54010e = "armeabi-v7a";

    /* JADX INFO: renamed from: a */
    public static String m77727a(Context context, String str) {
        for (String str2 : m77729a(context)) {
            StringBuilder sb = new StringBuilder();
            String str3 = File.separator;
            sb.append(str.substring(0, str.lastIndexOf(str3)));
            sb.append(str3);
            sb.append(str2);
            String string = sb.toString();
            if (new File(string).exists()) {
                return string;
            }
        }
        return m77730b(context, str);
    }

    /* JADX INFO: renamed from: b */
    public static String m77730b(Context context, String str) {
        StringBuilder sbOooO0OO;
        String str2;
        String str3;
        if (Utils.is64Bit(context)) {
            sbOooO0OO = C22226Oooo0oo.OooO0OO(str, f54008c);
            str2 = File.separator;
            str3 = f54009d;
        } else {
            sbOooO0OO = C22226Oooo0oo.OooO0OO(str, f54008c);
            str2 = File.separator;
            str3 = f54010e;
        }
        return C21445Oooo.OooO0O0(sbOooO0OO, str2, f54007b, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public static String m77728a(Context context, String[] strArr) {
        String str;
        if (context == null || strArr == null) {
            Logger.m76967w(f54006a, "clientContext or dynamicApkPath is null.");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (i == strArr.length - 1) {
                str = strArr[i];
            } else {
                sb.append(strArr[i]);
                str = File.pathSeparator;
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList<String> m77729a(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (Utils.is64Bit(context)) {
            Collections.addAll(arrayList, Build.SUPPORTED_64_BIT_ABIS);
            return arrayList;
        }
        Collections.addAll(arrayList, Build.SUPPORTED_32_BIT_ABIS);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static String m77731b(Context context, String[] strArr) {
        String strM77727a;
        if (context == null || strArr == null) {
            Logger.m76967w(f54006a, "clientContext or dynamicApkPath  is null.");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (i == strArr.length - 1) {
                strM77727a = m77727a(context, strArr[i]);
            } else {
                sb.append(m77727a(context, strArr[i]));
                strM77727a = File.pathSeparator;
            }
            sb.append(strM77727a);
        }
        return sb.toString();
    }
}
