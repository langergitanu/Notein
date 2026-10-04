package com.huawei.hms.hatool;

import Oooo0oO.C21111o0ooOoO;
import Oooo0oO.o0Oo0oo;
import android.util.Pair;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: com.huawei.hms.hatool.u0 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC18023u0 {
    /* JADX INFO: renamed from: a */
    public static long m77544a(String str, long j) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
            return simpleDateFormat.parse(simpleDateFormat.format(Long.valueOf(j))).getTime();
        } catch (ParseException unused) {
            C18030y.m77591f("hmsSdk/stringUtil", "getMillisOfDate(): Time conversion Exception !");
            return 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Pair<String, String> m77545a(String str) {
        String strSubstring;
        String str2;
        if ("_default_config_tag".equals(str)) {
            return new Pair<>(str, "");
        }
        String[] strArrSplit = str.split(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
        if (strArrSplit.length > 2) {
            str2 = strArrSplit[strArrSplit.length - 1];
            strSubstring = str.substring(0, (str.length() - str2.length()) - 1);
        } else {
            strSubstring = strArrSplit[0];
            str2 = strArrSplit[1];
        }
        return new Pair<>(strSubstring, str2);
    }

    /* JADX INFO: renamed from: a */
    public static String m77546a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "alltype" : "diffprivacy" : "preins" : "maint" : "oper";
    }

    /* JADX INFO: renamed from: a */
    public static String m77547a(String str, String str2) {
        return "_default_config_tag".equals(str) ? str : o0Oo0oo.OooO0Oo(str, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, str2);
    }

    /* JADX INFO: renamed from: a */
    public static String m77548a(String str, String str2, String str3) {
        if ("_default_config_tag".equals(str)) {
            return OooO00o.OooO00o("_default_config_tag#", str3);
        }
        return str + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + str2 + "#" + str3;
    }

    /* JADX INFO: renamed from: a */
    public static Set<String> m77549a(Set<String> set) {
        if (set == null || set.size() == 0) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if ("_default_config_tag".equals(str)) {
                hashSet.add("_default_config_tag");
            } else {
                String strOooO0Oo = C21111o0ooOoO.OooO0Oo(str, "-oper");
                String strOooO0Oo2 = C21111o0ooOoO.OooO0Oo(str, "-maint");
                hashSet.add(strOooO0Oo);
                hashSet.add(strOooO0Oo2);
                hashSet.add(str + "-diffprivacy");
            }
        }
        return hashSet;
    }
}
