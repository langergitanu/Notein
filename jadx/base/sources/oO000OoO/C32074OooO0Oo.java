package oO000OoO;

import Oooo0oO.o0Oo0oo;
import com.huawei.hms.network.embedded.C18134ca;
import oOo00OoO.C34527OooO0oO;

/* JADX INFO: renamed from: oO000OoO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32074OooO0Oo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C34527OooO0oO f114848OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final C34527OooO0oO f114849OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C34527OooO0oO f114850OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final C34527OooO0oO f114851OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final C34527OooO0oO f114852OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34527OooO0oO f114853OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34527OooO0oO f114854OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f114855OooO0OO;

    static {
        C34527OooO0oO c34527OooO0oO = C34527OooO0oO.f123734OooOoO;
        f114848OooO0Oo = C34527OooO0oO.OooO00o.OooO0O0(C18134ca.f54486e);
        f114850OooO0o0 = C34527OooO0oO.OooO00o.OooO0O0(C18134ca.f54487f);
        f114849OooO0o = C34527OooO0oO.OooO00o.OooO0O0(C18134ca.f54488g);
        f114851OooO0oO = C34527OooO0oO.OooO00o.OooO0O0(C18134ca.f54489h);
        f114852OooO0oo = C34527OooO0oO.OooO00o.OooO0O0(C18134ca.f54490i);
        C34527OooO0oO.OooO00o.OooO0O0(":host");
        C34527OooO0oO.OooO00o.OooO0O0(":version");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32074OooO0Oo(String str, String str2) {
        this(C34527OooO0oO.OooO00o.OooO0O0(str), C34527OooO0oO.OooO00o.OooO0O0(str2));
        C34527OooO0oO c34527OooO0oO = C34527OooO0oO.f123734OooOoO;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C32074OooO0Oo) {
            C32074OooO0Oo c32074OooO0Oo = (C32074OooO0Oo) obj;
            if (this.f114853OooO00o.equals(c32074OooO0Oo.f114853OooO00o) && this.f114854OooO0O0.equals(c32074OooO0Oo.f114854OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f114854OooO0O0.hashCode() + ((this.f114853OooO00o.hashCode() + 527) * 31);
    }

    public final String toString() {
        return o0Oo0oo.OooO0Oo(this.f114853OooO00o.OooOOO0(), ": ", this.f114854OooO0O0.OooOOO0());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32074OooO0Oo(C34527OooO0oO c34527OooO0oO, String str) {
        this(c34527OooO0oO, C34527OooO0oO.OooO00o.OooO0O0(str));
        C34527OooO0oO c34527OooO0oO2 = C34527OooO0oO.f123734OooOoO;
    }

    public C32074OooO0Oo(C34527OooO0oO c34527OooO0oO, C34527OooO0oO c34527OooO0oO2) {
        this.f114853OooO00o = c34527OooO0oO;
        this.f114854OooO0O0 = c34527OooO0oO2;
        this.f114855OooO0OO = c34527OooO0oO2.OooO0OO() + c34527OooO0oO.OooO0OO() + 32;
    }
}
