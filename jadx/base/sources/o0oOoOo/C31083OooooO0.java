package o0oOoOo;

import OooOooo.C20785Oooo00o;

/* JADX INFO: renamed from: o0oOoOo.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31083OooooO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f110936OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f110937OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f110938OooO0OO;

    public C31083OooooO0(int i, int i2, boolean z) {
        this.f110936OooO00o = i;
        this.f110937OooO0O0 = i2;
        this.f110938OooO0OO = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31083OooooO0)) {
            return false;
        }
        C31083OooooO0 c31083OooooO0 = (C31083OooooO0) obj;
        return this.f110936OooO00o == c31083OooooO0.f110936OooO00o && this.f110937OooO0O0 == c31083OooooO0.f110937OooO0O0 && this.f110938OooO0OO == c31083OooooO0.f110938OooO0OO;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110938OooO0OO) + C20785Oooo00o.OooO00o(this.f110937OooO0O0, Integer.hashCode(this.f110936OooO00o) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextBoxColorVO(bgColor=");
        sb.append(this.f110936OooO00o);
        sb.append(", textColor=");
        sb.append(this.f110937OooO0O0);
        sb.append(", isSelected=");
        return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f110938OooO0OO);
    }
}
