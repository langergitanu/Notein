package oO0OoOoO;

/* JADX INFO: renamed from: oO0OoOoO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33291OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final double f120516OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final long f120517OooO0O0 = Double.doubleToRawLongBits(0.0d);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final long f120518OooO0OO = Double.doubleToRawLongBits(-0.0d);

    static {
        Float.floatToRawIntBits(0.0f);
        Float.floatToRawIntBits(-0.0f);
        f120516OooO00o = Double.longBitsToDouble(4368491638549381120L);
        Double.longBitsToDouble(4503599627370496L);
    }

    public static boolean OooO00o(double d) {
        long j;
        long j2;
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
        long jDoubleToRawLongBits2 = Double.doubleToRawLongBits(0.0d);
        if (((jDoubleToRawLongBits ^ jDoubleToRawLongBits2) & Long.MIN_VALUE) == 0) {
            long j3 = jDoubleToRawLongBits - jDoubleToRawLongBits2;
            int i = C33290OooO00o.f120515OooO00o;
            long j4 = j3 >>> 63;
            if ((j3 ^ ((~j4) + 1)) + j4 > 1) {
                return false;
            }
        } else {
            long j5 = f120518OooO0OO;
            long j6 = f120517OooO0O0;
            if (jDoubleToRawLongBits < jDoubleToRawLongBits2) {
                j = jDoubleToRawLongBits2 - j6;
                j2 = jDoubleToRawLongBits - j5;
            } else {
                long j7 = jDoubleToRawLongBits2 - j5;
                j = jDoubleToRawLongBits - j6;
                j2 = j7;
            }
            long j8 = 1;
            if (j > j8 || j2 > j8 - j) {
                return false;
            }
        }
        return (Double.isNaN(d) || Double.isNaN(0.0d)) ? false : true;
    }

    public static boolean OooO0O0(double d, double d2) {
        return OooO00o(d) || C33290OooO00o.OooO00o(0.0d - d) <= d2;
    }
}
