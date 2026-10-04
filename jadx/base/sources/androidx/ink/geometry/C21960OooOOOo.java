package androidx.ink.geometry;

import androidx.ink.geometry.Vec;

/* JADX INFO: renamed from: androidx.ink.geometry.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21960OooOOOo extends AbstractC21964OooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public MutableVec f65430OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public MutableVec f65431OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public MutableVec f65432OooO0OO;

    @Override // androidx.ink.geometry.AbstractC21964OooOo0
    public final MutableVec OooO00o() {
        return this.f65430OooO00o;
    }

    @Override // androidx.ink.geometry.AbstractC21964OooOo0
    public final MutableVec OooO0O0() {
        return this.f65431OooO0O0;
    }

    @Override // androidx.ink.geometry.AbstractC21964OooOo0
    public final MutableVec OooO0OO() {
        return this.f65432OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21964OooOo0)) {
            return false;
        }
        AbstractC21964OooOo0 second = (AbstractC21964OooOo0) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(second, "second");
        int i = Vec.f65442OooO00o;
        return Vec.OooO00o.OooO00o(this.f65430OooO00o, second.OooO00o()) && Vec.OooO00o.OooO00o(this.f65431OooO0O0, second.OooO0O0()) && Vec.OooO00o.OooO00o(this.f65432OooO0OO, second.OooO0OO());
    }

    public final int hashCode() {
        return Float.hashCode(this.f65432OooO0OO.y) + (Float.hashCode(this.f65432OooO0OO.x) * 31) + Float.hashCode(this.f65431OooO0O0.y) + (Float.hashCode(this.f65431OooO0O0.x) * 31) + Float.hashCode(this.f65430OooO00o.y) + (Float.hashCode(this.f65430OooO00o.x) * 31);
    }

    public final String toString() {
        return com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Mutable", "Triangle(p0=" + this.f65430OooO00o + ", p1=" + this.f65431OooO0O0 + ", p2=" + this.f65432OooO0OO + ")");
    }
}
