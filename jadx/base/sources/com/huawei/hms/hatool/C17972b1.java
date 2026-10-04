package com.huawei.hms.hatool;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Pair;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.huawei.hms.hatool.b1 */
/* JADX INFO: loaded from: classes8.dex */
public class C17972b1 extends AbstractC17982f {
    /* JADX INFO: renamed from: c */
    public static String m77239c() {
        String str;
        String str2;
        String str3 = "";
        try {
            str2 = (String) Class.forName("com.huawei.android.os.BuildEx").getMethod("getUDID", new Class[0]).invoke(null, new Object[0]);
        } catch (AndroidRuntimeException unused) {
        } catch (ClassNotFoundException unused2) {
        } catch (IllegalAccessException unused3) {
        } catch (IllegalArgumentException unused4) {
        } catch (NoSuchMethodException unused5) {
        } catch (InvocationTargetException unused6) {
        }
        try {
            C18030y.m77586c("hmsSdk", "getUDID success");
            return str2;
        } catch (AndroidRuntimeException unused7) {
            str3 = str2;
            str = "getUDID getudid failed, RuntimeException is AndroidRuntimeException";
            C18030y.m77591f("hmsSdk", str);
            return str3;
        } catch (ClassNotFoundException unused8) {
            str3 = str2;
            str = "getUDID method invoke failed";
            C18030y.m77591f("hmsSdk", str);
            return str3;
        } catch (IllegalAccessException unused9) {
            str3 = str2;
            str = "getUDID method invoke failed : Illegal AccessException";
            C18030y.m77591f("hmsSdk", str);
            return str3;
        } catch (IllegalArgumentException unused10) {
            str3 = str2;
            str = "getUDID method invoke failed : Illegal ArgumentException";
            C18030y.m77591f("hmsSdk", str);
            return str3;
        } catch (NoSuchMethodException unused11) {
            str3 = str2;
            str = "getUDID method invoke failed : NoSuchMethodException";
            C18030y.m77591f("hmsSdk", str);
            return str3;
        } catch (InvocationTargetException unused12) {
            str3 = str2;
            str = "getUDID method invoke failed : InvocationTargetException";
            C18030y.m77591f("hmsSdk", str);
            return str3;
        }
    }

    /* JADX INFO: renamed from: e */
    public static Pair<String, String> m77240e(Context context) {
        if (C18015q0.m77512a(context, "android.permission.READ_PHONE_STATE")) {
            C18030y.m77591f("hmsSdk", "getMccAndMnc() Pair value is empty");
            return new Pair<>("", "");
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null && telephonyManager.getSimState() == 5) {
            String networkOperator = telephonyManager.getNetworkOperator();
            return (TextUtils.isEmpty(networkOperator) || TextUtils.equals(networkOperator, CloudMetaExtra.DEFINE_NON_PARENT_ID)) ? new Pair<>("", "") : networkOperator.length() > 3 ? new Pair<>(networkOperator.substring(0, 3), networkOperator.substring(3)) : new Pair<>("", "");
        }
        return new Pair<>("", "");
    }
}
