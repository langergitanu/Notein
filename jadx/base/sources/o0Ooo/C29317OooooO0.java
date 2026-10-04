package o0Ooo;

import Oooo0oO.C21023OooO0Oo;

/* JADX INFO: renamed from: o0Ooo.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29317OooooO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f103965OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f103966OooO0O0;

    public C29317OooooO0(int i, int i2) {
        this.f103965OooO00o = i;
        this.f103966OooO0O0 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29317OooooO0)) {
            return false;
        }
        C29317OooooO0 c29317OooooO0 = (C29317OooooO0) obj;
        return this.f103965OooO00o == c29317OooooO0.f103965OooO00o && this.f103966OooO0O0 == c29317OooooO0.f103966OooO0O0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f103966OooO0O0) + (Integer.hashCode(this.f103965OooO00o) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PenListMargins(start=");
        sb.append(this.f103965OooO00o);
        sb.append(", end=");
        return C21023OooO0Oo.OooO0OO(")", this.f103966OooO0O0, sb);
    }
}
