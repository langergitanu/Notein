package com.aspose.slides.internal.p217k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.k4.ck */
/* JADX INFO: loaded from: classes.dex */
public class C5581ck {

    /* JADX INFO: renamed from: c5 */
    protected AbstractC5596to f15375c5;

    /* JADX INFO: renamed from: du */
    protected short[] f15376du;

    /* JADX INFO: renamed from: dy */
    protected int f15377dy;

    /* JADX INFO: renamed from: h4 */
    protected short[] f15378h4;

    /* JADX INFO: renamed from: k4 */
    protected short[] f15379k4;

    /* JADX INFO: renamed from: kk */
    protected char[] f15380kk;

    /* JADX INFO: renamed from: m9 */
    protected short[][] f15381m9;

    /* JADX INFO: renamed from: to */
    protected char[] f15382to;

    /* JADX INFO: renamed from: x1 */
    protected short[] f15383x1;

    /* JADX INFO: renamed from: k4 */
    public int m22928k4(InterfaceC5607yj interfaceC5607yj) throws C5598um {
        short s;
        int iMo22956to = interfaceC5607yj.mo22956to();
        int iMo22422x1 = 0;
        while (true) {
            try {
                short s2 = this.f15378h4[iMo22422x1];
                if (s2 >= 0) {
                    iMo22422x1 = mo22422x1(s2, interfaceC5607yj);
                    if (iMo22422x1 == -1) {
                        m22929k4(iMo22422x1, interfaceC5607yj);
                        return 0;
                    }
                    interfaceC5607yj.mo22952k4();
                } else {
                    short s3 = this.f15376du[iMo22422x1];
                    if (s3 >= 1) {
                        return s3;
                    }
                    char cMo22951k4 = (char) interfaceC5607yj.mo22951k4(1);
                    char c = this.f15380kk[iMo22422x1];
                    if (cMo22951k4 < c || cMo22951k4 > this.f15382to[iMo22422x1]) {
                        short s4 = this.f15379k4[iMo22422x1];
                        if (s4 < 0) {
                            if (cMo22951k4 == 65535 && (s = this.f15383x1[iMo22422x1]) >= 0) {
                                return this.f15376du[s];
                            }
                            m22929k4(iMo22422x1, interfaceC5607yj);
                            return 0;
                        }
                        interfaceC5607yj.mo22952k4();
                        iMo22422x1 = s4;
                    } else {
                        short s5 = this.f15381m9[iMo22422x1][cMo22951k4 - c];
                        if (s5 < 0 && (s5 = this.f15379k4[iMo22422x1]) < 0) {
                            m22929k4(iMo22422x1, interfaceC5607yj);
                            return 0;
                        }
                        interfaceC5607yj.mo22952k4();
                        iMo22422x1 = s5;
                    }
                }
            } finally {
                interfaceC5607yj.mo22959x1(iMo22956to);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public int mo22422x1(int i, InterfaceC5607yj interfaceC5607yj) throws C5602wl {
        return -1;
    }

    /* JADX INFO: renamed from: x1 */
    public static char[] m22927x1(String str) {
        int iCharAt = 0;
        for (int i = 0; i < str.length(); i += 2) {
            iCharAt += str.charAt(i);
        }
        char[] cArr = new char[iCharAt];
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3 += 2) {
            char cCharAt = str.charAt(i3);
            char cCharAt2 = str.charAt(i3 + 1);
            int i4 = 1;
            while (i4 <= cCharAt) {
                cArr[i2] = cCharAt2;
                i4++;
                i2++;
            }
        }
        return cArr;
    }

    /* JADX INFO: renamed from: k4 */
    public String mo22421k4() {
        return "n/a";
    }

    /* JADX INFO: renamed from: k4 */
    public void m22929k4(int i, InterfaceC5607yj interfaceC5607yj) throws C5602wl {
        C5579bv c5579bv = this.f15375c5.f15418k4;
        if (c5579bv.f15361m9 > 0) {
            c5579bv.f15353du = true;
        } else {
            C5602wl c5602wl = new C5602wl(mo22421k4(), this.f15377dy, i, interfaceC5607yj);
            m22930k4(c5602wl);
            throw c5602wl;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m22930k4(C5602wl c5602wl) {
    }

    /* JADX INFO: renamed from: k4 */
    public static short[] m22926k4(String str) {
        int iCharAt = 0;
        for (int i = 0; i < str.length(); i += 2) {
            iCharAt += str.charAt(i);
        }
        short[] sArr = new short[iCharAt];
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3 += 2) {
            char cCharAt = str.charAt(i3);
            char cCharAt2 = str.charAt(i3 + 1);
            int i4 = 1;
            while (i4 <= cCharAt) {
                sArr[i2] = (short) cCharAt2;
                i4++;
                i2++;
            }
        }
        return sArr;
    }
}
