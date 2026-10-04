package androidx.ink.geometry;

import OooOoO.C20509OooO0oo;
import androidx.ink.geometry.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f65424OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f65425OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f65426OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f65427OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f65428OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f65429OooO0o0;

    @Override // androidx.ink.geometry.OooO00o
    public final float OooO00o() {
        return this.f65424OooO00o;
    }

    @Override // androidx.ink.geometry.OooO00o
    public final float OooO0O0() {
        return this.f65427OooO0Oo;
    }

    @Override // androidx.ink.geometry.OooO00o
    public final float OooO0OO() {
        return this.f65425OooO0O0;
    }

    @Override // androidx.ink.geometry.OooO00o
    public final float OooO0Oo() {
        return this.f65429OooO0o0;
    }

    @Override // androidx.ink.geometry.OooO00o
    public final float OooO0o() {
        return this.f65428OooO0o;
    }

    @Override // androidx.ink.geometry.OooO00o
    public final float OooO0o0() {
        return this.f65426OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof OooO00o) && OooO00o.C19026OooO00o.OooO00o(this, (OooO00o) obj);
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f65428OooO0o) + C20509OooO0oo.OooO0OO(this.f65429OooO0o0, C20509OooO0oo.OooO0OO(this.f65427OooO0Oo, C20509OooO0oo.OooO0OO(this.f65426OooO0OO, C20509OooO0oo.OooO0OO(this.f65425OooO0O0, Float.hashCode(this.f65424OooO00o) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Mutable", OooO00o.C19026OooO00o.OooO0O0(this));
    }
}
