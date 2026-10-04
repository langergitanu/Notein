package o0oOoOo;

import OooOoo0.o00000;

/* JADX INFO: renamed from: o0oOoOo.Oooo000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31062Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f110892OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f110893OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractC31059OooOooo f110894OooO0OO;

    public C31062Oooo000(int i, boolean z, AbstractC31059OooOooo abstractC31059OooOooo) {
        this.f110892OooO00o = i;
        this.f110893OooO0O0 = z;
        this.f110894OooO0OO = abstractC31059OooOooo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31062Oooo000)) {
            return false;
        }
        C31062Oooo000 c31062Oooo000 = (C31062Oooo000) obj;
        return this.f110892OooO00o == c31062Oooo000.f110892OooO00o && this.f110893OooO0O0 == c31062Oooo000.f110893OooO0O0 && this.f110894OooO0OO.equals(c31062Oooo000.f110894OooO0OO);
    }

    public final int hashCode() {
        return this.f110894OooO0OO.hashCode() + o00000.OooO0O0(Integer.hashCode(this.f110892OooO00o) * 31, 31, this.f110893OooO0O0);
    }

    public final String toString() {
        return "ShortcutOptionVO(nameResId=" + this.f110892OooO00o + ", selected=" + this.f110893OooO0O0 + ", payload=" + this.f110894OooO0OO + ")";
    }
}
