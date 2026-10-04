package OooooOo;

import OooOoO.C20505OooO0OO;

/* JADX INFO: renamed from: OooooOo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21394OooOo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f61896OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f61897OooO0O0;

    public C21394OooOo0o(float f, float f2) {
        this.f61896OooO00o = f;
        this.f61897OooO0O0 = f2;
    }

    public final float[] OooO00o() {
        float f = this.f61896OooO00o;
        float f2 = this.f61897OooO0O0;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21394OooOo0o)) {
            return false;
        }
        C21394OooOo0o c21394OooOo0o = (C21394OooOo0o) obj;
        return Float.compare(this.f61896OooO00o, c21394OooOo0o.f61896OooO00o) == 0 && Float.compare(this.f61897OooO0O0, c21394OooOo0o.f61897OooO0O0) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f61897OooO0O0) + (Float.hashCode(this.f61896OooO00o) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f61896OooO00o);
        sb.append(", y=");
        return C20505OooO0OO.OooO0O0(sb, this.f61897OooO0O0, ')');
    }
}
