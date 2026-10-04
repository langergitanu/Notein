package com.huawei.agconnect.credential.obs;

import android.text.TextUtils;
import com.huawei.agconnect.datastore.annotation.SharedPreference;
import java.util.Arrays;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.ad */
/* JADX INFO: loaded from: classes8.dex */
public class C17602ad {

    /* JADX INFO: renamed from: a */
    private Boolean f52100a;

    /* JADX INFO: renamed from: b */
    private String f52101b;

    @SharedPreference(fileName = "agc_site", isDynamic = true, key = "backup")
    String backUrl;

    @SharedPreference(fileName = "agc_site", isDynamic = true, key = "main")
    String mainUrl;

    @SharedPreference(fileName = "agc_site", isDynamic = true, key = "validTime")
    long validTime;

    private C17602ad() {
        this.validTime = 0L;
        this.f52100a = Boolean.FALSE;
        this.f52101b = null;
    }

    /* JADX INFO: renamed from: a */
    private int m75430a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* JADX INFO: renamed from: b */
    public static C17602ad m75433b(String str) {
        C17602ad c17602ad = new C17602ad();
        C17603ae.m75445a().m75455d(c17602ad, str);
        C17603ae.m75445a().m75456e(c17602ad, str);
        C17603ae.m75445a().m75457f(c17602ad, str);
        return c17602ad;
    }

    /* JADX INFO: renamed from: c */
    public String m75440c() {
        return this.f52100a.booleanValue() ? this.backUrl : this.mainUrl;
    }

    /* JADX INFO: renamed from: d */
    public Boolean m75441d() {
        return this.f52100a;
    }

    /* JADX INFO: renamed from: e */
    public String m75442e() {
        return this.f52101b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C17602ad c17602ad = (C17602ad) obj;
            if (m75432a(this.mainUrl, c17602ad.mainUrl) && m75432a(this.backUrl, c17602ad.backUrl)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public long m75443f() {
        return this.validTime;
    }

    /* JADX INFO: renamed from: g */
    public boolean m75444g() {
        return (TextUtils.isEmpty(this.mainUrl) && TextUtils.isEmpty(this.backUrl)) ? false : true;
    }

    public int hashCode() {
        return m75430a(this.mainUrl, this.backUrl);
    }

    public C17602ad(String str, String str2) {
        this.validTime = 0L;
        this.f52100a = Boolean.FALSE;
        this.f52101b = null;
        this.mainUrl = str;
        this.backUrl = str2;
        if (TextUtils.isEmpty(str)) {
            this.f52100a = Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m75434c(String str) {
        C17603ae.m75445a().m75448a(str);
        C17603ae.m75445a().m75452b(str);
    }

    /* JADX INFO: renamed from: a */
    public String m75435a() {
        return this.mainUrl;
    }

    /* JADX INFO: renamed from: b */
    public String m75439b() {
        return this.backUrl;
    }

    /* JADX INFO: renamed from: a */
    public void m75436a(Boolean bool) {
        this.f52100a = bool;
    }

    /* JADX INFO: renamed from: a */
    public void m75437a(String str) {
        if (!TextUtils.isEmpty(this.mainUrl)) {
            C17603ae.m75445a().m75447a(this, str);
        }
        if (TextUtils.isEmpty(this.backUrl)) {
            return;
        }
        C17603ae.m75445a().m75451b(this, str);
    }

    /* JADX INFO: renamed from: a */
    public static void m75431a(String str, long j) {
        C17602ad c17602ad = new C17602ad();
        c17602ad.validTime = j;
        C17603ae.m75445a().m75453c(c17602ad, str);
    }

    /* JADX INFO: renamed from: a */
    public void m75438a(String str, boolean z) {
        this.f52101b = str;
        this.f52100a = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: a */
    private boolean m75432a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
