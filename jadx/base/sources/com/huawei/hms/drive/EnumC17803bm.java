package com.huawei.hms.drive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.drive.bm */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC17803bm {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* JADX INFO: renamed from: f */
    final String f52951f;

    EnumC17803bm(String str) {
        this.f52951f = str;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC17803bm m76319a(String str) {
        str.getClass();
        switch (str) {
            case "TLSv1.1":
                return TLS_1_1;
            case "TLSv1.2":
                return TLS_1_2;
            case "TLSv1.3":
                return TLS_1_3;
            case "TLSv1":
                return TLS_1_0;
            default:
                throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: a */
    public static List<EnumC17803bm> m76320a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(m76319a(str));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
