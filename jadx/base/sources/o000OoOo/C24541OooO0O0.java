package o000OoOo;

import java.util.Locale;

/* JADX INFO: renamed from: o000OoOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24541OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o000Ooo0.OooO0O0 f83005OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o000Ooo0.OooO0O0 f83006OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o000Ooo0.OooO0O0 f83007OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o000Ooo0.OooO0O0 f83008OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o000Ooo0.OooO0O0 f83009OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o000Ooo0.OooO0O0 f83010OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o000Ooo0.OooO0O0 f83011OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o000Ooo0.OooO0O0 f83012OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o000Ooo0.OooO0O0 f83013OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public o000Ooo0.OooO0O0 f83014OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o000Ooo0.OooO0O0 f83015OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public o000Ooo0.OooO0O0 f83016OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public o000Ooo0.OooO0O0 f83017OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public o000Ooo0.OooO0O0 f83018OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public o000Ooo0.OooO0O0 f83019OooOOOO;

    public final void OooO00o() {
        o000Ooo0.OooO0O0 oooO0O0 = this.f83006OooO00o;
        o000Ooo0.OooO0O0 oooO0O02 = this.f83011OooO0o0;
        o000Ooo0.OooO0O0 oooO0O03 = this.f83012OooO0oO;
        oooO0O02.OooO00o(oooO0O0, oooO0O03);
        this.f83006OooO00o = oooO0O03;
        this.f83012OooO0oO = oooO0O0;
        o000Ooo0.OooO0O0 oooO0O04 = this.f83011OooO0o0;
        o000Ooo0.OooO0O0 oooO0O05 = this.f83007OooO0O0;
        o000Ooo0.OooO0O0 oooO0O06 = this.f83013OooO0oo;
        oooO0O04.OooO00o(oooO0O05, oooO0O06);
        oooO0O06.OooO0O0(this.f83011OooO0o0, oooO0O05);
        oooO0O05.OooO0o0(this.f83008OooO0OO);
    }

    public final void OooO0O0(o000Ooo0.OooO0O0 oooO0O0) {
        o000Ooo0.OooO0O0 oooO0O02 = this.f83010OooO0o;
        o000Ooo0.OooO0O0 oooO0O03 = this.f83006OooO00o;
        o000Ooo0.OooO0O0 oooO0O04 = this.f83016OooOO0o;
        oooO0O02.OooO00o(oooO0O03, oooO0O04);
        oooO0O0.OooO0Oo(oooO0O04);
        o000Ooo0.OooO0O0 oooO0O05 = this.f83010OooO0o;
        o000Ooo0.OooO0O0 oooO0O06 = this.f83007OooO0O0;
        o000Ooo0.OooO0O0 oooO0O07 = this.f83018OooOOO0;
        oooO0O05.OooO00o(oooO0O06, oooO0O07);
        o000Ooo0.OooO0O0 oooO0O08 = this.f83010OooO0o;
        o000Ooo0.OooO0O0 oooO0O09 = this.f83017OooOOO;
        oooO0O07.OooO0O0(oooO0O08, oooO0O09);
        oooO0O09.OooO0o0(this.f83009OooO0Oo);
        int i = oooO0O09.f83120OooO00o;
        int i2 = oooO0O09.f83121OooO0O0;
        if (i != i2) {
            Locale locale = Locale.ROOT;
            throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("The matrix is not square. this:", oooO0O09.OooO0oo()));
        }
        o000Ooo0.OooO0O0 oooO0O010 = this.f83019OooOOOO;
        if (oooO0O010.f83120OooO00o == i) {
            int i3 = i2 * 2;
            int i4 = oooO0O010.f83121OooO0O0;
            if (i4 == i3) {
                int i5 = 0;
                while (i5 < i) {
                    int i6 = 0;
                    while (i6 < i2) {
                        oooO0O010.OooO0o(oooO0O09.OooO0OO(i5, i6), i5, i6);
                        oooO0O010.OooO0o(i5 == i6 ? 1.0d : 0.0d, i5, i2 + i6);
                        i6++;
                    }
                    i5++;
                }
                int i7 = 0;
                while (i7 < i) {
                    double dAbs = Math.abs(oooO0O010.OooO0OO(i7, i7));
                    int i8 = i7 + 1;
                    int i9 = i7;
                    for (int i10 = i8; i10 < i; i10++) {
                        double dAbs2 = Math.abs(oooO0O010.OooO0OO(i10, i7));
                        if (dAbs2 > dAbs) {
                            i9 = i10;
                            dAbs = dAbs2;
                        }
                    }
                    if (i9 != i7) {
                        int i11 = 0;
                        while (i11 < i4) {
                            double dOooO0OO = oooO0O010.OooO0OO(i7, i11);
                            oooO0O010.OooO0o(oooO0O010.OooO0OO(i9, i11), i7, i11);
                            oooO0O010.OooO0o(dOooO0OO, i9, i11);
                            i11++;
                            i8 = i8;
                        }
                    }
                    int i12 = i8;
                    double dOooO0OO2 = oooO0O010.OooO0OO(i7, i7);
                    if (dOooO0OO2 == 0.0d) {
                        throw new ArithmeticException("Singular matrix");
                    }
                    for (int i13 = 0; i13 < i4; i13++) {
                        oooO0O010.OooO0o(oooO0O010.OooO0OO(i7, i13) / dOooO0OO2, i7, i13);
                    }
                    for (int i14 = i12; i14 < i; i14++) {
                        double dOooO0OO3 = oooO0O010.OooO0OO(i14, i7);
                        for (int i15 = 0; i15 < i4; i15++) {
                            oooO0O010.OooO0o(oooO0O010.OooO0OO(i14, i15) - (oooO0O010.OooO0OO(i7, i15) * dOooO0OO3), i14, i15);
                        }
                    }
                    i7 = i12;
                }
                for (int i16 = i - 1; i16 >= 0; i16--) {
                    for (int i17 = 0; i17 < i16; i17++) {
                        double dOooO0OO4 = oooO0O010.OooO0OO(i17, i16);
                        for (int i18 = 0; i18 < i4; i18++) {
                            oooO0O010.OooO0o(oooO0O010.OooO0OO(i17, i18) - (oooO0O010.OooO0OO(i16, i18) * dOooO0OO4), i17, i18);
                        }
                    }
                }
                for (int i19 = 0; i19 < i; i19++) {
                    for (int i20 = 0; i20 < i2; i20++) {
                        oooO0O09.OooO0o(oooO0O010.OooO0OO(i19, i2 + i20), i19, i20);
                    }
                }
                o000Ooo0.OooO0O0 oooO0O011 = this.f83010OooO0o;
                o000Ooo0.OooO0O0 oooO0O012 = this.f83015OooOO0O;
                oooO0O06.OooO0O0(oooO0O011, oooO0O012);
                o000Ooo0.OooO0O0 oooO0O013 = this.f83014OooOO0;
                oooO0O012.OooO00o(oooO0O09, oooO0O013);
                o000Ooo0.OooO0O0 oooO0O014 = this.f83006OooO00o;
                o000Ooo0.OooO0O0 oooO0O015 = this.f83012OooO0oO;
                oooO0O013.OooO00o(oooO0O0, oooO0O015);
                oooO0O014.OooO0o0(oooO0O015);
                o000Ooo0.OooO0O0 oooO0O016 = this.f83010OooO0o;
                o000Ooo0.OooO0O0 oooO0O017 = this.f83013OooO0oo;
                oooO0O013.OooO00o(oooO0O016, oooO0O017);
                o000Ooo0.OooO0O0 oooO0O018 = this.f83005OooO;
                oooO0O017.OooO00o(oooO0O06, oooO0O018);
                oooO0O06.OooO0Oo(oooO0O018);
                return;
            }
        }
        Locale locale2 = Locale.ROOT;
        throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("The scratch matrix size is not correct. this:", oooO0O010.OooO0oo()));
    }
}
