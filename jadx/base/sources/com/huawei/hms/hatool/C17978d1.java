package com.huawei.hms.hatool;

import android.util.Pair;
import java.util.List;
import java.util.Map;
import o0O00o00.OooO00o;

/* JADX INFO: renamed from: com.huawei.hms.hatool.d1 */
/* JADX INFO: loaded from: classes8.dex */
public class C17978d1 extends C18024v {

    /* JADX INFO: renamed from: com.huawei.hms.hatool.d1$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f53772a;

        static {
            int[] iArr = new int[EnumC18031y0.values().length];
            f53772a = iArr;
            try {
                iArr[EnumC18031y0.SN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53772a[EnumC18031y0.IMEI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53772a[EnumC18031y0.UDID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C17981e1 m77283a(String str, String str2) {
        C17981e1 c17981e1M77550a = C18024v.m77550a(str, str2);
        C18029x0 c18029x0M77602c = C18033z0.m77597a().m77602c(str, str2);
        c17981e1M77550a.m77302g(C18033z0.m77597a().m77599a(AbstractC17973c.m77244c(str, str2)));
        c17981e1M77550a.m77301f(AbstractC17973c.m77256o(str, str2));
        c17981e1M77550a.m77298c(C18033z0.m77597a().m77605f(str, str2));
        int i = a.f53772a[c18029x0M77602c.m77577a().ordinal()];
        if (i == 1) {
            c17981e1M77550a.m77299d(c18029x0M77602c.m77578b());
            return c17981e1M77550a;
        }
        if (i == 2) {
            c17981e1M77550a.m77297b(c18029x0M77602c.m77578b());
            return c17981e1M77550a;
        }
        if (i != 3) {
            return c17981e1M77550a;
        }
        c17981e1M77550a.m77300e(c18029x0M77602c.m77578b());
        return c17981e1M77550a;
    }

    /* JADX INFO: renamed from: b */
    public static Map<String, String> m77287b(String str, String str2, String str3) {
        Map<String, String> mapM77554c = C18024v.m77554c(str, str3);
        Map<String, String> mapM77250i = AbstractC17973c.m77250i(str, str2);
        if (mapM77250i == null) {
            return mapM77554c;
        }
        mapM77554c.putAll(mapM77250i);
        return mapM77554c;
    }

    /* JADX INFO: renamed from: a */
    public static C17984f1 m77284a(String str, String str2, String str3, String str4) {
        C17984f1 c17984f1M77551a = C18024v.m77551a(str, str2, str3, str4);
        String strM77599a = C18033z0.m77597a().m77599a(AbstractC17973c.m77244c(str2, str3));
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strOooO00o = OooO00o.OooO00o(AbstractC17970b.m77224f() + strM77599a + jCurrentTimeMillis);
        c17984f1M77551a.m77484f(String.valueOf(jCurrentTimeMillis));
        c17984f1M77551a.m77323g(strOooO00o);
        return c17984f1M77551a;
    }

    /* JADX INFO: renamed from: a */
    public static C17987g1 m77285a(String str, String str2, String str3) {
        C17987g1 c17987g1M77552a = C18024v.m77552a(str, str2, str3);
        Pair<String, String> pairM77604e = C18033z0.m77597a().m77604e(str2, str);
        c17987g1M77552a.m77336f((String) pairM77604e.first);
        c17987g1M77552a.m77337g((String) pairM77604e.second);
        c17987g1M77552a.m77338h(AbstractC17982f.m77309b());
        c17987g1M77552a.m77496d(C18033z0.m77597a().m77603d(str2, str));
        return c17987g1M77552a;
    }

    /* JADX INFO: renamed from: a */
    public static C18016r m77286a(List<C18014q> list, String str, String str2, String str3, String str4) {
        C18030y.m77586c("hmsSdk", "generate UploadData");
        C18016r c18016rM77553b = C18024v.m77553b(str, str2);
        if (c18016rM77553b == null) {
            return null;
        }
        c18016rM77553b.m77516a(m77284a(C18028x.m77569d().m77570a(), str, str2, str3));
        c18016rM77553b.m77515a(m77283a(str, str2));
        c18016rM77553b.m77517a(m77285a(str2, str, str4));
        c18016rM77553b.m77518a(AbstractC17973c.m77248g(str, str2));
        c18016rM77553b.m77519a(list);
        return c18016rM77553b;
    }
}
