package o000OOO;

/* JADX INFO: renamed from: o000OOO.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24505OooOOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f82879OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f82880OooO0O0;

    public C24505OooOOoo(float f, float f2) {
        this.f82879OooO00o = f;
        this.f82880OooO0O0 = f2;
    }

    public final float[] OooO00o() {
        float f = this.f82879OooO00o;
        float f2 = this.f82880OooO0O0;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24505OooOOoo)) {
            return false;
        }
        C24505OooOOoo c24505OooOOoo = (C24505OooOOoo) obj;
        return Float.compare(this.f82879OooO00o, c24505OooOOoo.f82879OooO00o) == 0 && Float.compare(this.f82880OooO0O0, c24505OooOOoo.f82880OooO0O0) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f82880OooO0O0) + (Float.hashCode(this.f82879OooO00o) * 31);
    }

    public final String toString() {
        return "WhitePoint(x=" + this.f82879OooO00o + ", y=" + this.f82880OooO0O0 + ")";
    }
}
