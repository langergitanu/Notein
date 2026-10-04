package androidx.ink.geometry;

import OooOoO.C20509OooO0oo;
import androidx.ink.geometry.OooO00o;

/* JADX INFO: renamed from: androidx.ink.geometry.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21957OooO0oO extends OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f65404OooO00o = 1.0f;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f65405OooO0O0 = 1.0f;

    @Override // androidx.ink.geometry.OooO00o
    public final float OooO00o() {
        return this.f65404OooO00o;
    }

    @Override // androidx.ink.geometry.OooO00o
    public final float OooO0O0() {
        return 0.0f;
    }

    @Override // androidx.ink.geometry.OooO00o
    public final float OooO0OO() {
        return 0.0f;
    }

    @Override // androidx.ink.geometry.OooO00o
    public final float OooO0Oo() {
        return this.f65405OooO0O0;
    }

    @Override // androidx.ink.geometry.OooO00o
    public final float OooO0o() {
        return 0.0f;
    }

    @Override // androidx.ink.geometry.OooO00o
    public final float OooO0o0() {
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof OooO00o) && OooO00o.C19026OooO00o.OooO00o(this, (OooO00o) obj);
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + C20509OooO0oo.OooO0OO(this.f65405OooO0O0, C20509OooO0oo.OooO0OO(0.0f, C20509OooO0oo.OooO0OO(0.0f, C20509OooO0oo.OooO0OO(0.0f, Float.hashCode(this.f65404OooO00o) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Immutable", OooO00o.C19026OooO00o.OooO0O0(this));
    }
}
