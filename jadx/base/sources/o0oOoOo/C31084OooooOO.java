package o0oOoOo;

import OooOoo0.o00000;

/* JADX INFO: renamed from: o0oOoOo.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31084OooooOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f110939OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f110940OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f110941OooO0OO;

    public C31084OooooOO(int i, boolean z, boolean z2) {
        this.f110939OooO00o = i;
        this.f110940OooO0O0 = z;
        this.f110941OooO0OO = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31084OooooOO)) {
            return false;
        }
        C31084OooooOO c31084OooooOO = (C31084OooooOO) obj;
        return this.f110939OooO00o == c31084OooooOO.f110939OooO00o && this.f110940OooO0O0 == c31084OooooOO.f110940OooO0O0 && this.f110941OooO0OO == c31084OooooOO.f110941OooO0OO;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110941OooO0OO) + o00000.OooO0O0(Integer.hashCode(this.f110939OooO00o) * 31, 31, this.f110940OooO0O0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextColorVO(color=");
        sb.append(this.f110939OooO00o);
        sb.append(", isSelected=");
        sb.append(this.f110940OooO0O0);
        sb.append(", isForegroundColor=");
        return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f110941OooO0OO);
    }
}
