package com.alipay.android.phone.mrpc.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0163o extends AbstractC0168t {

    /* JADX INFO: renamed from: b */
    public String f82b;

    /* JADX INFO: renamed from: c */
    public byte[] f83c;

    /* JADX INFO: renamed from: g */
    public boolean f87g;

    /* JADX INFO: renamed from: e */
    public ArrayList<Header> f85e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public Map<String, String> f86f = new HashMap();

    /* JADX INFO: renamed from: d */
    public String f84d = "application/x-www-form-urlencoded";

    public C0163o(String str) {
        this.f82b = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m82a() {
        return this.f82b;
    }

    /* JADX INFO: renamed from: b */
    public final String m88b(String str) {
        Map<String, String> map = this.f86f;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* JADX INFO: renamed from: c */
    public final String m90c() {
        return this.f84d;
    }

    /* JADX INFO: renamed from: d */
    public final ArrayList<Header> m91d() {
        return this.f85e;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m92e() {
        return this.f87g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0163o.class != obj.getClass()) {
            return false;
        }
        C0163o c0163o = (C0163o) obj;
        byte[] bArr = this.f83c;
        if (bArr == null) {
            if (c0163o.f83c != null) {
                return false;
            }
        } else if (!bArr.equals(c0163o.f83c)) {
            return false;
        }
        String str = this.f82b;
        String str2 = c0163o.f82b;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Map<String, String> map = this.f86f;
        int iHashCode = ((map == null || !map.containsKey("id")) ? 1 : this.f86f.get("id").hashCode() + 31) * 31;
        String str = this.f82b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return String.format("Url : %s,HttpHeader: %s", this.f82b, this.f85e);
    }

    /* JADX INFO: renamed from: a */
    public final void m83a(String str) {
        this.f84d = str;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m89b() {
        return this.f83c;
    }

    /* JADX INFO: renamed from: a */
    public final void m84a(String str, String str2) {
        if (this.f86f == null) {
            this.f86f = new HashMap();
        }
        this.f86f.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m85a(Header header) {
        this.f85e.add(header);
    }

    /* JADX INFO: renamed from: a */
    public final void m86a(boolean z) {
        this.f87g = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m87a(byte[] bArr) {
        this.f83c = bArr;
    }
}
