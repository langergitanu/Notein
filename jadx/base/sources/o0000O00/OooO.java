package o0000O00;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float[] f81342OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public double[] f81343OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public double[] f81344OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C24143OooO0oo f81345OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f81346OooO0o0;

    public final void OooO00o(double d, float f) {
        int length = this.f81342OooO00o.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f81343OooO0O0, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f81343OooO0O0 = Arrays.copyOf(this.f81343OooO0O0, length);
        this.f81342OooO00o = Arrays.copyOf(this.f81342OooO00o, length);
        this.f81344OooO0OO = new double[length];
        double[] dArr = this.f81343OooO0O0;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f81343OooO0O0[iBinarySearch] = d;
        this.f81342OooO00o[iBinarySearch] = f;
    }

    public final String toString() {
        return "pos =" + Arrays.toString(this.f81343OooO0O0) + " period=" + Arrays.toString(this.f81342OooO00o);
    }
}
