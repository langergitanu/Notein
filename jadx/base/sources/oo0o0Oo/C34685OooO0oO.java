package oo0o0Oo;

import OooO0Oo.C20398OooO0O0;
import OooOooo.C20785Oooo00o;
import o00000O.C24104OooO0Oo;

/* JADX INFO: renamed from: oo0o0Oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34685OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C24104OooO0Oo f124925OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f124926OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f124927OooO0OO;

    public C34685OooO0oO(C24104OooO0Oo c24104OooO0Oo, int i, int i2) {
        this.f124925OooO00o = c24104OooO0Oo;
        this.f124926OooO0O0 = i;
        this.f124927OooO0OO = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34685OooO0oO)) {
            return false;
        }
        C34685OooO0oO c34685OooO0oO = (C34685OooO0oO) obj;
        return this.f124925OooO00o.equals(c34685OooO0oO.f124925OooO00o) && this.f124926OooO0O0 == c34685OooO0oO.f124926OooO0O0 && this.f124927OooO0OO == c34685OooO0oO.f124927OooO0OO;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f124927OooO0OO) + C20785Oooo00o.OooO00o(this.f124926OooO0O0, this.f124925OooO00o.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f124925OooO00o);
        sb.append(", startIndex=");
        sb.append(this.f124926OooO0O0);
        sb.append(", endIndex=");
        return C20398OooO0O0.OooO00o(')', sb, this.f124927OooO0OO);
    }
}
