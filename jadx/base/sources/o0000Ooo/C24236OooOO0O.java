package o0000Ooo;

import OooO0Oo.C20398OooO0O0;
import OooOooo.C20785Oooo00o;

/* JADX INFO: renamed from: o0000Ooo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24236OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f81488OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f81489OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f81490OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f81491OooO0Oo;

    public C24236OooOO0O(int i, int i2, int i3, int i4) {
        this.f81488OooO00o = i;
        this.f81489OooO0O0 = i2;
        this.f81490OooO0OO = i3;
        this.f81491OooO0Oo = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24236OooOO0O)) {
            return false;
        }
        C24236OooOO0O c24236OooOO0O = (C24236OooOO0O) obj;
        return this.f81488OooO00o == c24236OooOO0O.f81488OooO00o && this.f81489OooO0O0 == c24236OooOO0O.f81489OooO0O0 && this.f81490OooO0OO == c24236OooOO0O.f81490OooO0OO && this.f81491OooO0Oo == c24236OooOO0O.f81491OooO0Oo;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f81491OooO0Oo) + C20785Oooo00o.OooO00o(this.f81490OooO0OO, C20785Oooo00o.OooO00o(this.f81489OooO0O0, Integer.hashCode(this.f81488OooO00o) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f81488OooO00o);
        sb.append(", ");
        sb.append(this.f81489OooO0O0);
        sb.append(", ");
        sb.append(this.f81490OooO0OO);
        sb.append(", ");
        return C20398OooO0O0.OooO00o(')', sb, this.f81491OooO0Oo);
    }
}
