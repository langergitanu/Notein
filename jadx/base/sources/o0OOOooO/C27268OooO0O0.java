package o0OOOooO;

import OooOooo.C20785Oooo00o;
import Oooo0oO.C21023OooO0Oo;

/* JADX INFO: renamed from: o0OOOooO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27268OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f95068OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f95069OooO0O0;

    public C27268OooO0O0(int i, int i2) {
        this.f95068OooO00o = i;
        this.f95069OooO0O0 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27268OooO0O0)) {
            return false;
        }
        C27268OooO0O0 c27268OooO0O0 = (C27268OooO0O0) obj;
        return this.f95068OooO00o == c27268OooO0O0.f95068OooO00o && this.f95069OooO0O0 == c27268OooO0O0.f95069OooO0O0;
    }

    public final int hashCode() {
        return C20785Oooo00o.OooO00o(this.f95069OooO0O0, Integer.hashCode(this.f95068OooO00o) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserEvent(what=");
        sb.append(this.f95068OooO00o);
        sb.append(", result=");
        return C21023OooO0Oo.OooO0OO(", data=null)", this.f95069OooO0O0, sb);
    }
}
