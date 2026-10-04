package androidx.appcompat.app;

/* JADX INFO: renamed from: androidx.appcompat.app.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21498OooOoo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static C21498OooOoo f62470OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long f62471OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f62472OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f62473OooO0OO;

    public final void OooO00o(long j, double d, double d2) {
        double d3 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + ((double) (Math.round(((double) (r2 - 9.0E-4f)) - r6) + 9.0E-4f)) + ((-d2) / 360.0d);
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d4 = 0.01745329238474369d * d;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d4))) / (Math.cos(dAsin) * Math.cos(d4));
        if (dSin3 >= 1.0d) {
            this.f62473OooO0OO = 1;
            this.f62471OooO00o = -1L;
            this.f62472OooO0O0 = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f62473OooO0OO = 0;
                this.f62471OooO00o = -1L;
                this.f62472OooO0O0 = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f62471OooO00o = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f62472OooO0O0 = jRound;
            if (jRound >= j || this.f62471OooO00o <= j) {
                this.f62473OooO0OO = 1;
            } else {
                this.f62473OooO0OO = 0;
            }
        }
    }
}
