package OooOoOO;

/* JADX INFO: renamed from: OooOoOO.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20535OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public double f58655OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public double f58656OooO0O0;

    public C20535OooOo00(double d, double d2) {
        this.f58655OooO00o = d;
        this.f58656OooO0O0 = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20535OooOo00)) {
            return false;
        }
        C20535OooOo00 c20535OooOo00 = (C20535OooOo00) obj;
        return Double.compare(this.f58655OooO00o, c20535OooOo00.f58655OooO00o) == 0 && Double.compare(this.f58656OooO0O0, c20535OooOo00.f58656OooO0O0) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f58656OooO0O0) + (Double.hashCode(this.f58655OooO00o) * 31);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f58655OooO00o + ", _imaginary=" + this.f58656OooO0O0 + ')';
    }
}
