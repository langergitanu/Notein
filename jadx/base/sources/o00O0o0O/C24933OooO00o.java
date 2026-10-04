package o00O0o0O;

import java.io.Serializable;

/* JADX INFO: renamed from: o00O0o0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24933OooO00o implements Serializable {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final C24933OooO00o f84597OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final C24933OooO00o f84598OooOoo0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final double f84599OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final double f84600OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final transient boolean f84601OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final transient boolean f84602OooOoO0;

    static {
        new C24933OooO00o(0.0d, 1.0d);
        f84597OooOoOO = new C24933OooO00o(Double.NaN, Double.NaN);
        new C24933OooO00o(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        new C24933OooO00o(1.0d, 0.0d);
        f84598OooOoo0 = new C24933OooO00o(0.0d, 0.0d);
    }

    public C24933OooO00o(double d, double d2) {
        this.f84599OooOo = d;
        this.f84600OooOo0o = d2;
        boolean z = true;
        boolean z2 = Double.isNaN(d) || Double.isNaN(d2);
        this.f84602OooOoO0 = z2;
        if (z2 || (!Double.isInfinite(d) && !Double.isInfinite(d2))) {
            z = false;
        }
        this.f84601OooOoO = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C24933OooO00o) {
            C24933OooO00o c24933OooO00o = (C24933OooO00o) obj;
            if (c24933OooO00o.f84602OooOoO0) {
                return this.f84602OooOoO0;
            }
            if (new Double(this.f84599OooOo).equals(new Double(c24933OooO00o.f84599OooOo)) && new Double(this.f84600OooOo0o).equals(new Double(c24933OooO00o.f84600OooOo0o))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f84602OooOoO0) {
            return 7;
        }
        return (new Double(this.f84599OooOo).hashCode() + (new Double(this.f84600OooOo0o).hashCode() * 17)) * 37;
    }

    public final String toString() {
        return "(" + this.f84599OooOo + ", " + this.f84600OooOo0o + ")";
    }
}
