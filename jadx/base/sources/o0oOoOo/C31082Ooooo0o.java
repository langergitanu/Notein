package o0oOoOo;

import Oooo0oO.C21023OooO0Oo;

/* JADX INFO: renamed from: o0oOoOo.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31082Ooooo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f110934OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f110935OooO0O0;

    public C31082Ooooo0o(int i, int i2) {
        this.f110934OooO00o = i;
        this.f110935OooO0O0 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31082Ooooo0o)) {
            return false;
        }
        C31082Ooooo0o c31082Ooooo0o = (C31082Ooooo0o) obj;
        return this.f110934OooO00o == c31082Ooooo0o.f110934OooO00o && this.f110935OooO0O0 == c31082Ooooo0o.f110935OooO0O0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f110935OooO0O0) + (Integer.hashCode(this.f110934OooO00o) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextBoxBgToTextColor(bgColor=");
        sb.append(this.f110934OooO00o);
        sb.append(", textColor=");
        return C21023OooO0Oo.OooO0OO(")", this.f110935OooO0O0, sb);
    }
}
