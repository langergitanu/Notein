package com.aspose.slides.internal.p156gw;

import OooO0O0.C20395OooO0o0;
import OooO0O0.OooO0OO;
import androidx.datastore.preferences.protobuf.C21825OoooOO0;
import com.aspose.slides.internal.p031aw.InterfaceC1565x1;
import com.aspose.slides.internal.p472w8.C11913yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.lr */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4403lr implements InterfaceC1565x1, Cloneable {
    /* JADX INFO: renamed from: k4 */
    public static double m17949k4(double[] dArr, int i) {
        return AbstractC4409u4.m17985x1(dArr[i], dArr[i + 1], dArr[i + 4], dArr[i + 5], dArr[i + 2], dArr[i + 3]);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: du */
    public abstract double m17956du();

    /* JADX INFO: renamed from: h4 */
    public abstract double m17957h4();

    /* JADX INFO: renamed from: k4 */
    public abstract double m17958k4();

    /* JADX INFO: renamed from: kk */
    public abstract double m17959kk();

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: kk */
    public InterfaceC4413v4 mo8359kk(C11913yj c11913yj) {
        return new C4418yd(this, c11913yj);
    }

    /* JADX INFO: renamed from: to */
    public abstract double m17960to();

    /* JADX INFO: renamed from: x1 */
    public abstract double m17961x1();

    /* JADX INFO: renamed from: k4 */
    private static int m17950k4(double d, double d2, double d3) {
        if (d <= d2) {
            return d < d2 ? -2 : -1;
        }
        if (d >= d3) {
            return d > d3 ? 2 : 1;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int m17951k4(double[] dArr, int i, boolean z, boolean z2, double[] dArr2, double d, double d2, double d3) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            double d4 = dArr[i3];
            if (z) {
                if (d4 >= 0.0d) {
                    if (z2) {
                        if (d4 <= 1.0d) {
                            if (dArr2 != null) {
                                if (C20395OooO0o0.OooO00o(dArr2[2], 2.0d, d4, dArr2[1]) != 0.0d) {
                                    double d5 = 1.0d - d4;
                                    dArr[i2] = C20395OooO0o0.OooO00o(d3, d4, d4, (2.0d * d2 * d4 * d5) + (d * d5 * d5));
                                    i2++;
                                }
                            }
                        }
                    } else if (d4 < 1.0d) {
                    }
                }
            } else if (d4 > 0.0d) {
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m17952k4(double[] dArr, double[] dArr2) {
        double d = dArr[2];
        double d2 = dArr[1];
        double d3 = dArr[0];
        if (d == 0.0d) {
            if (d2 == 0.0d) {
                return -1;
            }
            dArr2[0] = (-d3) / d2;
            return 1;
        }
        double dOooO00o = C21825OoooOO0.OooO00o(d, 4.0d, d3, d2 * d2);
        if (dOooO00o < 0.0d) {
            return 0;
        }
        double dSqrt = Math.sqrt(dOooO00o);
        if (d2 < 0.0d) {
            dSqrt = -dSqrt;
        }
        double d4 = (d2 + dSqrt) / (-2.0d);
        dArr2[0] = d4 / d;
        if (d4 == 0.0d) {
            return 1;
        }
        dArr2[1] = d3 / d4;
        return 2;
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: k4 */
    public InterfaceC4413v4 mo8356k4(C11913yj c11913yj, double d) {
        return new C4407rv(mo8359kk(c11913yj), d);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m17953k4(double[] dArr, double d, double d2, double d3, double d4) {
        dArr[0] = d2 - d;
        dArr[1] = ((d3 + d3) - d2) - d2;
        dArr[2] = ((d2 - d3) - d3) + d4;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m17954k4(double[] dArr, int i, double[] dArr2, int i2, double[] dArr3, int i3) {
        double d = dArr[i];
        double d2 = dArr[i + 1];
        double d3 = dArr[i + 2];
        double d4 = dArr[i + 3];
        double d5 = dArr[i + 4];
        double d6 = dArr[i + 5];
        if (dArr2 != null) {
            dArr2[i2] = d;
            dArr2[i2 + 1] = d2;
        }
        if (dArr3 != null) {
            dArr3[i3 + 4] = d5;
            dArr3[i3 + 5] = d6;
        }
        double d7 = (d + d3) / 2.0d;
        double d8 = (d2 + d4) / 2.0d;
        double d9 = (d5 + d3) / 2.0d;
        double d10 = (d6 + d4) / 2.0d;
        double d11 = (d7 + d9) / 2.0d;
        double d12 = (d8 + d10) / 2.0d;
        if (dArr2 != null) {
            dArr2[i2 + 2] = d7;
            dArr2[i2 + 3] = d8;
            dArr2[i2 + 4] = d11;
            dArr2[i2 + 5] = d12;
        }
        if (dArr3 != null) {
            dArr3[i3] = d11;
            dArr3[i3 + 1] = d12;
            dArr3[i3 + 2] = d9;
            dArr3[i3 + 3] = d10;
        }
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: k4 */
    public boolean mo8357k4(double d, double d2) {
        double dM17958k4 = m17958k4();
        double dM17961x1 = m17961x1();
        double dM17959kk = m17959kk();
        double dM17960to = m17960to();
        double dM17956du = m17956du();
        double dM17957h4 = m17957h4();
        double d3 = (dM17958k4 - (dM17959kk * 2.0d)) + dM17956du;
        double d4 = (dM17961x1 - (dM17960to * 2.0d)) + dM17957h4;
        double d5 = dM17956du - dM17958k4;
        double d6 = dM17957h4 - dM17961x1;
        double d7 = (((d - dM17958k4) * d4) - ((d2 - dM17961x1) * d3)) / ((d5 * d4) - (d6 * d3));
        if (d7 >= 0.0d && d7 <= 1.0d && d7 == d7) {
            double d8 = ((dM17959kk - dM17958k4) * 2.0d * d7) + (d3 * d7 * d7) + dM17958k4;
            double d9 = ((dM17960to - dM17961x1) * 2.0d * d7) + (d4 * d7 * d7) + dM17961x1;
            double d10 = (d5 * d7) + dM17958k4;
            double d11 = (d6 * d7) + dM17961x1;
            if (d >= d8 && d < d10) {
                return true;
            }
            if (d >= d10 && d < d8) {
                return true;
            }
            if (d2 >= d9 && d2 < d11) {
                return true;
            }
            if (d2 >= d11 && d2 < d9) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: k4 */
    public boolean mo8358k4(double d, double d2, double d3, double d4) {
        int iM17950k4;
        if (d3 <= 0.0d || d4 <= 0.0d) {
            return false;
        }
        double dM17958k4 = m17958k4();
        double dM17961x1 = m17961x1();
        double d5 = d + d3;
        int iM17950k42 = m17950k4(dM17958k4, d, d5);
        double d6 = d2 + d4;
        int iM17950k43 = m17950k4(dM17961x1, d2, d6);
        if (iM17950k42 == 0 && iM17950k43 == 0) {
            return true;
        }
        double dM17956du = m17956du();
        double dM17957h4 = m17957h4();
        int iM17950k44 = m17950k4(dM17956du, d, d5);
        int iM17950k45 = m17950k4(dM17957h4, d2, d6);
        if (iM17950k44 == 0 && iM17950k45 == 0) {
            return true;
        }
        double dM17959kk = m17959kk();
        double dM17960to = m17960to();
        int iM17950k46 = m17950k4(dM17959kk, d, d5);
        int iM17950k47 = m17950k4(dM17960to, d2, d6);
        if (iM17950k42 < 0 && iM17950k44 < 0 && iM17950k46 < 0) {
            return false;
        }
        if (iM17950k43 < 0 && iM17950k45 < 0 && iM17950k47 < 0) {
            return false;
        }
        if (iM17950k42 > 0 && iM17950k44 > 0 && iM17950k46 > 0) {
            return false;
        }
        if (iM17950k43 > 0 && iM17950k45 > 0 && iM17950k47 > 0) {
            return false;
        }
        if (m17955k4(iM17950k42, iM17950k44, iM17950k46) && m17955k4(iM17950k43, iM17950k45, iM17950k47)) {
            return true;
        }
        if (m17955k4(iM17950k44, iM17950k42, iM17950k46) && m17955k4(iM17950k45, iM17950k43, iM17950k47)) {
            return true;
        }
        boolean z = iM17950k42 * iM17950k44 <= 0;
        boolean z2 = iM17950k43 * iM17950k45 <= 0;
        if (iM17950k42 == 0 && iM17950k44 == 0 && z2) {
            return true;
        }
        if (iM17950k43 == 0 && iM17950k45 == 0 && z) {
            return true;
        }
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        if (!z2) {
            m17953k4(dArr, iM17950k43 < 0 ? d2 : d6, dM17961x1, dM17960to, dM17957h4);
            return m17952k4(dArr, dArr2) == 2 && m17951k4(dArr2, 2, true, true, null, dM17958k4, dM17959kk, dM17956du) == 2 && m17950k4(dArr2[0], d, d5) * m17950k4(dArr2[1], d, d5) <= 0;
        }
        int iM17950k48 = iM17950k44;
        if (!z) {
            m17953k4(dArr, iM17950k42 < 0 ? d : d5, dM17958k4, dM17959kk, dM17956du);
            return m17952k4(dArr, dArr2) == 2 && m17951k4(dArr2, 2, true, true, null, dM17961x1, dM17960to, dM17957h4) == 2 && m17950k4(dArr2[0], d2, d6) * m17950k4(dArr2[1], d2, d6) <= 0;
        }
        double d7 = dM17956du - dM17958k4;
        double d8 = dM17957h4 - dM17961x1;
        double d9 = (dM17957h4 * dM17958k4) - (dM17956du * dM17961x1);
        if (iM17950k43 == 0) {
            iM17950k4 = iM17950k42;
        } else {
            iM17950k4 = m17950k4(OooO0OO.OooO00o(d7, iM17950k43 < 0 ? d2 : d6, d9, d8), d, d5);
        }
        if (iM17950k45 != 0) {
            iM17950k48 = m17950k4(OooO0OO.OooO00o(d7, iM17950k45 < 0 ? d2 : d6, d9, d8), d, d5);
        }
        if (iM17950k4 * iM17950k48 <= 0) {
            return true;
        }
        if (iM17950k4 * iM17950k42 > 0) {
            iM17950k43 = iM17950k45;
        }
        m17953k4(dArr, iM17950k48 < 0 ? d : d5, dM17958k4, dM17959kk, dM17956du);
        m17951k4(dArr2, m17952k4(dArr, dArr2), true, true, null, dM17961x1, dM17960to, dM17957h4);
        return iM17950k43 * m17950k4(dArr2[0], d2, d6) <= 0;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m17955k4(int i, int i2, int i3) {
        if (i == -1) {
            return i2 >= 0 || i3 >= 0;
        }
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            if (i2 > 0 && i3 > 0) {
                return false;
            }
        }
        return true;
    }
}
