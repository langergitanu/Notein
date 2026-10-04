package o0000Ooo;

import OooOoO.C20505OooO0OO;

/* JADX INFO: renamed from: o0000Ooo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24230OooO0Oo implements InterfaceC24229OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final float f81475OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final float f81476OooOo0o;

    public C24230OooO0Oo(float f, float f2) {
        this.f81476OooOo0o = f;
        this.f81475OooOo = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24230OooO0Oo)) {
            return false;
        }
        C24230OooO0Oo c24230OooO0Oo = (C24230OooO0Oo) obj;
        return Float.compare(this.f81476OooOo0o, c24230OooO0Oo.f81476OooOo0o) == 0 && Float.compare(this.f81475OooOo, c24230OooO0Oo.f81475OooOo) == 0;
    }

    @Override // o0000Ooo.InterfaceC24229OooO0OO
    public final float getDensity() {
        return this.f81476OooOo0o;
    }

    public final int hashCode() {
        return Float.hashCode(this.f81475OooOo) + (Float.hashCode(this.f81476OooOo0o) * 31);
    }

    @Override // o0000Ooo.InterfaceC24229OooO0OO
    public final float o0ooOoO() {
        return this.f81475OooOo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f81476OooOo0o);
        sb.append(", fontScale=");
        return C20505OooO0OO.OooO0O0(sb, this.f81475OooOo, ')');
    }
}
