package o0oOoOo;

import Oooo0oO.C21023OooO0Oo;

/* JADX INFO: renamed from: o0oOoOo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31041OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f110823OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f110824OooO0O0;

    public C31041OooOOO() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31041OooOOO)) {
            return false;
        }
        C31041OooOOO c31041OooOOO = (C31041OooOOO) obj;
        return this.f110823OooO00o == c31041OooOOO.f110823OooO00o && this.f110824OooO0O0 == c31041OooOOO.f110824OooO0O0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f110824OooO0O0) + (Integer.hashCode(this.f110823OooO00o) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GridStyleVO(interval=");
        sb.append(this.f110823OooO00o);
        sb.append(", opacity=");
        return C21023OooO0Oo.OooO0OO(")", this.f110824OooO0O0, sb);
    }

    public /* synthetic */ C31041OooOOO(int i) {
        this(25, 100);
    }

    public C31041OooOOO(int i, int i2) {
        this.f110823OooO00o = i;
        this.f110824OooO0O0 = i2;
    }
}
