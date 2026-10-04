package com.huawei.agconnect.config.impl;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.huawei.agconnect.config.impl.d */
/* JADX INFO: loaded from: classes8.dex */
public class C17579d {

    /* JADX INFO: renamed from: a */
    private final String f52003a;

    /* JADX INFO: renamed from: b */
    private final String f52004b;

    /* JADX INFO: renamed from: c */
    private final String f52005c;

    /* JADX INFO: renamed from: d */
    private final String f52006d;

    /* JADX INFO: renamed from: e */
    private final String f52007e;

    /* JADX INFO: renamed from: f */
    private final int f52008f;

    /* JADX INFO: renamed from: g */
    private int f52009g;

    public C17579d(String str, String str2, String str3, String str4, String str5, int i) {
        this.f52009g = 0;
        this.f52003a = str;
        this.f52004b = str2;
        this.f52005c = str3;
        this.f52006d = str4;
        this.f52007e = str5;
        this.f52008f = i;
        if (str != null) {
            this.f52009g = str.length() / 2;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m75357a() {
        return (TextUtils.isEmpty(this.f52003a) || TextUtils.isEmpty(this.f52004b) || TextUtils.isEmpty(this.f52005c) || TextUtils.isEmpty(this.f52006d) || this.f52003a.length() != this.f52004b.length() || this.f52004b.length() != this.f52005c.length() || this.f52005c.length() != this.f52009g * 2 || this.f52008f < 0 || TextUtils.isEmpty(this.f52007e)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public String m75358b() {
        return this.f52003a;
    }

    /* JADX INFO: renamed from: c */
    public String m75359c() {
        return this.f52004b;
    }

    /* JADX INFO: renamed from: d */
    public String m75360d() {
        return this.f52005c;
    }

    /* JADX INFO: renamed from: e */
    public String m75361e() {
        return this.f52006d;
    }

    /* JADX INFO: renamed from: f */
    public String m75362f() {
        return this.f52007e;
    }

    /* JADX INFO: renamed from: g */
    public int m75363g() {
        return this.f52008f;
    }

    /* JADX INFO: renamed from: h */
    public int m75364h() {
        return this.f52009g;
    }
}
