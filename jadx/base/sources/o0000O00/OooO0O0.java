package o0000O00;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0O0 {

    public static class OooO00o extends OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public double[] f81367OooO00o;

        @Override // o0000O00.OooO0O0
        public final double OooO0O0(double d) {
            return this.f81367OooO00o[0];
        }

        @Override // o0000O00.OooO0O0
        public final void OooO0OO(double d, double[] dArr) {
            double[] dArr2 = this.f81367OooO00o;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // o0000O00.OooO0O0
        public final void OooO0Oo(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.f81367OooO00o;
                if (i >= dArr.length) {
                    return;
                }
                fArr[i] = (float) dArr[i];
                i++;
            }
        }

        @Override // o0000O00.OooO0O0
        public final void OooO0o0(double d, double[] dArr) {
            for (int i = 0; i < this.f81367OooO00o.length; i++) {
                dArr[i] = 0.0d;
            }
        }
    }

    public static OooO0O0 OooO00o(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new C24143OooO0oo(dArr, dArr2);
        }
        if (i == 2) {
            double d = dArr[0];
            double[] dArr3 = dArr2[0];
            OooO00o oooO00o = new OooO00o();
            oooO00o.f81367OooO00o = dArr3;
            return oooO00o;
        }
        C24142OooO0oO c24142OooO0oO = new C24142OooO0oO();
        int length = dArr2[0].length;
        c24142OooO0oO.f81397OooO0OO = new double[length];
        c24142OooO0oO.f81395OooO00o = dArr;
        c24142OooO0oO.f81396OooO0O0 = dArr2;
        if (length > 2) {
            double d2 = 0.0d;
            int i2 = 0;
            while (true) {
                double d3 = d2;
                if (i2 >= dArr.length) {
                    break;
                }
                double d4 = dArr2[i2][0];
                if (i2 > 0) {
                    Math.hypot(d4 - d2, d4 - d3);
                }
                i2++;
                d2 = d4;
            }
        }
        return c24142OooO0oO;
    }

    public abstract double OooO0O0(double d);

    public abstract void OooO0OO(double d, double[] dArr);

    public abstract void OooO0Oo(double d, float[] fArr);

    public abstract void OooO0o0(double d, double[] dArr);
}
