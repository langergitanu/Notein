package Oooo0o0;

import Oooo00o.AbstractC20903OooO00o;

/* JADX INFO: renamed from: Oooo0o0.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21006OooOoOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC20903OooO00o f60813OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractC20903OooO00o f60814OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractC20903OooO00o f60815OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AbstractC20903OooO00o f60816OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AbstractC20903OooO00o f60817OooO0o0;

    public C21006OooOoOO() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21006OooOoOO)) {
            return false;
        }
        C21006OooOoOO c21006OooOoOO = (C21006OooOoOO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f60813OooO00o, c21006OooOoOO.f60813OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f60814OooO0O0, c21006OooOoOO.f60814OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f60815OooO0OO, c21006OooOoOO.f60815OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f60816OooO0Oo, c21006OooOoOO.f60816OooO0Oo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f60817OooO0o0, c21006OooOoOO.f60817OooO0o0);
    }

    public final int hashCode() {
        return this.f60817OooO0o0.hashCode() + ((this.f60816OooO0Oo.hashCode() + ((this.f60815OooO0OO.hashCode() + ((this.f60814OooO0O0.hashCode() + (this.f60813OooO00o.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f60813OooO00o + ", small=" + this.f60814OooO0O0 + ", medium=" + this.f60815OooO0OO + ", large=" + this.f60816OooO0Oo + ", extraLarge=" + this.f60817OooO0o0 + ')';
    }

    public C21006OooOoOO(int i) {
        Oooo00o.OooO0o extraSmall = C21004OooOoO.f60806OooO00o;
        Oooo00o.OooO0o small = C21004OooOoO.f60807OooO0O0;
        Oooo00o.OooO0o medium = C21004OooOoO.f60808OooO0OO;
        Oooo00o.OooO0o large = C21004OooOoO.f60809OooO0Oo;
        Oooo00o.OooO0o extraLarge = C21004OooOoO.f60810OooO0o0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(extraSmall, "extraSmall");
        kotlin.jvm.internal.OooOOO0.OooO0oO(small, "small");
        kotlin.jvm.internal.OooOOO0.OooO0oO(medium, "medium");
        kotlin.jvm.internal.OooOOO0.OooO0oO(large, "large");
        kotlin.jvm.internal.OooOOO0.OooO0oO(extraLarge, "extraLarge");
        this.f60813OooO00o = extraSmall;
        this.f60814OooO0O0 = small;
        this.f60815OooO0OO = medium;
        this.f60816OooO0Oo = large;
        this.f60817OooO0o0 = extraLarge;
    }
}
