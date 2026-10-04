package o0oOoOo;

import Oooo0oO.C21023OooO0Oo;

/* JADX INFO: renamed from: o0oOoOo.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31058OooOooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f110884OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f110885OooO0O0;

    public C31058OooOooO(int i, int i2) {
        this.f110884OooO00o = i;
        this.f110885OooO0O0 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31058OooOooO)) {
            return false;
        }
        C31058OooOooO c31058OooOooO = (C31058OooOooO) obj;
        return this.f110884OooO00o == c31058OooOooO.f110884OooO00o && this.f110885OooO0O0 == c31058OooOooO.f110885OooO0O0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f110885OooO0O0) + (Integer.hashCode(this.f110884OooO00o) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrivilegeVO(iconId=");
        sb.append(this.f110884OooO00o);
        sb.append(", titleId=");
        return C21023OooO0Oo.OooO0OO(")", this.f110885OooO0O0, sb);
    }
}
