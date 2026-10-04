package Oooo0OO;

import OooOoO.C20505OooO0OO;
import OooOoO.C20509OooO0oo;

/* JADX INFO: renamed from: Oooo0OO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20953OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f60472OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f60473OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f60474OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f60475OooO0Oo;

    public C20953OooO0oO(float f, float f2, float f3, float f4) {
        this.f60472OooO00o = f;
        this.f60473OooO0O0 = f2;
        this.f60474OooO0OO = f3;
        this.f60475OooO0Oo = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20953OooO0oO)) {
            return false;
        }
        C20953OooO0oO c20953OooO0oO = (C20953OooO0oO) obj;
        return this.f60472OooO00o == c20953OooO0oO.f60472OooO00o && this.f60473OooO0O0 == c20953OooO0oO.f60473OooO0O0 && this.f60474OooO0OO == c20953OooO0oO.f60474OooO0OO && this.f60475OooO0Oo == c20953OooO0oO.f60475OooO0Oo;
    }

    public final int hashCode() {
        return Float.hashCode(this.f60475OooO0Oo) + C20509OooO0oo.OooO0OO(this.f60474OooO0OO, C20509OooO0oo.OooO0OO(this.f60473OooO0O0, Float.hashCode(this.f60472OooO00o) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f60472OooO00o);
        sb.append(", focusedAlpha=");
        sb.append(this.f60473OooO0O0);
        sb.append(", hoveredAlpha=");
        sb.append(this.f60474OooO0OO);
        sb.append(", pressedAlpha=");
        return C20505OooO0OO.OooO0O0(sb, this.f60475OooO0Oo, ')');
    }
}
