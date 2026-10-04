package o00000o0;

import OooOoO.C20505OooO0OO;

/* JADX INFO: renamed from: o00000o0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24120OooOO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C24120OooOO0o f81279OooO0OO = new C24120OooOO0o(1.0f, 0.0f);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f81280OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f81281OooO0O0;

    public C24120OooOO0o(float f, float f2) {
        this.f81280OooO00o = f;
        this.f81281OooO0O0 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24120OooOO0o)) {
            return false;
        }
        C24120OooOO0o c24120OooOO0o = (C24120OooOO0o) obj;
        return this.f81280OooO00o == c24120OooOO0o.f81280OooO00o && this.f81281OooO0O0 == c24120OooOO0o.f81281OooO0O0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f81281OooO0O0) + (Float.hashCode(this.f81280OooO00o) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f81280OooO00o);
        sb.append(", skewX=");
        return C20505OooO0OO.OooO0O0(sb, this.f81281OooO0O0, ')');
    }

    public C24120OooOO0o() {
        this(1.0f, 0.0f);
    }
}
