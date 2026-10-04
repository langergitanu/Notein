package com.huawei.hms.hatool;

import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.hatool.v */
/* JADX INFO: loaded from: classes8.dex */
public class C18024v {
    /* JADX INFO: renamed from: a */
    public static C17981e1 m77550a(String str, String str2) {
        C17981e1 c17981e1 = new C17981e1();
        c17981e1.m77476a(C18033z0.m77597a().m77598a(str, str2));
        return c17981e1;
    }

    /* JADX INFO: renamed from: b */
    public static C18016r m77553b(String str, String str2) {
        C18030y.m77586c("hmsSdk", "generate UploadData EventModelHandlerBase");
        C18028x.m77569d().m77571a(str, str2);
        if (!TextUtils.isEmpty(C18028x.m77569d().m77570a())) {
            return new C18016r(C18028x.m77569d().m77573c());
        }
        C18030y.m77591f("hmsSdk", "event chifer is empty");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static Map<String, String> m77554c(String str, String str2) {
        HashMap map = new HashMap();
        map.put("App-Id", AbstractC17970b.m77224f());
        map.put("App-Ver", AbstractC17970b.m77226g());
        map.put("Sdk-Name", "hianalytics");
        map.put("Sdk-Ver", "2.2.0.313");
        map.put("Device-Type", Build.MODEL);
        map.put("servicetag", str);
        C18030y.m77581a("hmsSdk", "sendData RequestId : %s", str2);
        map.put("Request-Id", str2);
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static C17984f1 m77551a(String str, String str2, String str3, String str4) {
        C17984f1 c17984f1 = new C17984f1();
        c17984f1.m77479a(str);
        c17984f1.m77480b(AbstractC17970b.m77224f());
        c17984f1.m77483e(str2);
        c17984f1.m77481c(str4);
        StringBuffer stringBuffer = new StringBuffer("hmshi");
        stringBuffer.append(str3);
        stringBuffer.append("qrt");
        c17984f1.m77482d(stringBuffer.toString());
        return c17984f1;
    }

    /* JADX INFO: renamed from: a */
    public static C17987g1 m77552a(String str, String str2, String str3) {
        C17987g1 c17987g1 = new C17987g1();
        c17987g1.m77495c(AbstractC17970b.m77231j());
        c17987g1.m77497e(AbstractC17970b.m77233l());
        c17987g1.m77493a(str3);
        c17987g1.m77494b(C18033z0.m77597a().m77601b(str2, str));
        return c17987g1;
    }
}
