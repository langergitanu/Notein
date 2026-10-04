package com.huawei.hms.network.embedded;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.j8 */
/* JADX INFO: loaded from: classes9.dex */
public enum EnumC18230j8 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* JADX INFO: renamed from: a */
    public final String f55359a;

    EnumC18230j8(String str) {
        this.f55359a = str;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC18230j8 m78883a(String str) {
        str.getClass();
        switch (str) {
            case "TLSv1.1":
                return TLS_1_1;
            case "TLSv1.2":
                return TLS_1_2;
            case "TLSv1.3":
                return TLS_1_3;
            case "SSLv3":
                return SSL_3_0;
            case "TLSv1":
                return TLS_1_0;
            default:
                throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: a */
    public String m78885a() {
        return this.f55359a;
    }

    /* JADX INFO: renamed from: a */
    public static List<EnumC18230j8> m78884a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(m78883a(str));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
