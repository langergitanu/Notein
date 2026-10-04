package o0O0oOoo;

import oO00ooOO.C32466OooO0OO;

/* JADX INFO: renamed from: o0O0oOoo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26153OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C32466OooO0OO f89241OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C32466OooO0OO f89242OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C32466OooO0OO f89243OooO0OO;

    public C26153OooO0Oo(C32466OooO0OO c32466OooO0OO, C32466OooO0OO c32466OooO0OO2, C32466OooO0OO c32466OooO0OO3) {
        this.f89241OooO00o = c32466OooO0OO;
        this.f89242OooO0O0 = c32466OooO0OO2;
        this.f89243OooO0OO = c32466OooO0OO3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26153OooO0Oo)) {
            return false;
        }
        C26153OooO0Oo c26153OooO0Oo = (C26153OooO0Oo) obj;
        return this.f89241OooO00o.equals(c26153OooO0Oo.f89241OooO00o) && this.f89242OooO0O0.equals(c26153OooO0Oo.f89242OooO0O0) && this.f89243OooO0OO.equals(c26153OooO0Oo.f89243OooO0OO);
    }

    public final int hashCode() {
        return this.f89243OooO0OO.hashCode() + ((this.f89242OooO0O0.hashCode() + (this.f89241OooO00o.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Palette(container=" + this.f89241OooO00o + ", content=" + this.f89242OooO0O0 + ", border=" + this.f89243OooO0OO + ")";
    }
}
