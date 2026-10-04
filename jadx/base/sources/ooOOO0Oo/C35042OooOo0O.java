package ooOOO0Oo;

import oO00ooO.C32431OooO;

/* JADX INFO: renamed from: ooOOO0Oo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35042OooOo0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C35042OooOo0O f125817OooO0Oo = new C35042OooOo0O(Oooo000.STRICT, 6);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Oooo000 f125818OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C32431OooO f125819OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Oooo000 f125820OooO0OO;

    public C35042OooOo0O(Oooo000 oooo000, C32431OooO c32431OooO, Oooo000 oooo0002) {
        this.f125818OooO00o = oooo000;
        this.f125819OooO0O0 = c32431OooO;
        this.f125820OooO0OO = oooo0002;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35042OooOo0O)) {
            return false;
        }
        C35042OooOo0O c35042OooOo0O = (C35042OooOo0O) obj;
        return this.f125818OooO00o == c35042OooOo0O.f125818OooO00o && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f125819OooO0O0, c35042OooOo0O.f125819OooO0O0) && this.f125820OooO0OO == c35042OooOo0O.f125820OooO0OO;
    }

    public final int hashCode() {
        int iHashCode = this.f125818OooO00o.hashCode() * 31;
        C32431OooO c32431OooO = this.f125819OooO0O0;
        return this.f125820OooO0OO.hashCode() + ((iHashCode + (c32431OooO == null ? 0 : c32431OooO.f116625OooOoO)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f125818OooO00o + ", sinceVersion=" + this.f125819OooO0O0 + ", reportLevelAfter=" + this.f125820OooO0OO + ')';
    }

    public C35042OooOo0O(Oooo000 oooo000, int i) {
        this(oooo000, (i & 2) != 0 ? new C32431OooO(1, 0, 0) : null, oooo000);
    }
}
