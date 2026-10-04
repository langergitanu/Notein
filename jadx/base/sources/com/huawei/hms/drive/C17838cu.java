package com.huawei.hms.drive;

import com.huawei.hms.network.embedded.C18134ca;
import com.huawei.hms.network.embedded.C18241k5;
import oOo00OoO.C34527OooO0oO;

/* JADX INFO: renamed from: com.huawei.hms.drive.cu */
/* JADX INFO: loaded from: classes6.dex */
public final class C17838cu {

    /* JADX INFO: renamed from: a */
    public static final C34527OooO0oO f53177a;

    /* JADX INFO: renamed from: b */
    public static final C34527OooO0oO f53178b;

    /* JADX INFO: renamed from: c */
    public static final C34527OooO0oO f53179c;

    /* JADX INFO: renamed from: d */
    public static final C34527OooO0oO f53180d;

    /* JADX INFO: renamed from: e */
    public static final C34527OooO0oO f53181e;

    /* JADX INFO: renamed from: f */
    public static final C34527OooO0oO f53182f;

    /* JADX INFO: renamed from: g */
    public final C34527OooO0oO f53183g;

    /* JADX INFO: renamed from: h */
    public final C34527OooO0oO f53184h;

    /* JADX INFO: renamed from: i */
    final int f53185i;

    /* JADX INFO: renamed from: com.huawei.hms.drive.cu$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void m76527a(C17788ay c17788ay);
    }

    static {
        C34527OooO0oO c34527OooO0oO = C34527OooO0oO.f123734OooOoO;
        f53177a = C34527OooO0oO.OooO00o.OooO0O0(C18241k5.f55433h);
        f53178b = C34527OooO0oO.OooO00o.OooO0O0(C18134ca.f54486e);
        f53179c = C34527OooO0oO.OooO00o.OooO0O0(C18134ca.f54487f);
        f53180d = C34527OooO0oO.OooO00o.OooO0O0(C18134ca.f54488g);
        f53181e = C34527OooO0oO.OooO00o.OooO0O0(C18134ca.f54489h);
        f53182f = C34527OooO0oO.OooO00o.OooO0O0(C18134ca.f54490i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17838cu(String str, String str2) {
        this(C34527OooO0oO.OooO00o.OooO0O0(str), C34527OooO0oO.OooO00o.OooO0O0(str2));
        C34527OooO0oO c34527OooO0oO = C34527OooO0oO.f123734OooOoO;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C17838cu) {
            C17838cu c17838cu = (C17838cu) obj;
            if (this.f53183g.equals(c17838cu.f53183g) && this.f53184h.equals(c17838cu.f53184h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f53184h.hashCode() + ((this.f53183g.hashCode() + 527) * 31);
    }

    public String toString() {
        return C17806bp.m76330a("%s: %s", this.f53183g.OooOOO0(), this.f53184h.OooOOO0());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17838cu(C34527OooO0oO c34527OooO0oO, String str) {
        this(c34527OooO0oO, C34527OooO0oO.OooO00o.OooO0O0(str));
        C34527OooO0oO c34527OooO0oO2 = C34527OooO0oO.f123734OooOoO;
    }

    public C17838cu(C34527OooO0oO c34527OooO0oO, C34527OooO0oO c34527OooO0oO2) {
        this.f53183g = c34527OooO0oO;
        this.f53184h = c34527OooO0oO2;
        this.f53185i = c34527OooO0oO2.OooO0OO() + c34527OooO0oO.OooO0OO() + 32;
    }
}
