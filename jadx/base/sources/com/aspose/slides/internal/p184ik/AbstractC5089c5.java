package com.aspose.slides.internal.p184ik;

import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.C10931x1;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ik.c5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5089c5 {
    /* JADX INFO: renamed from: du */
    public static boolean m21748du(C5092dy[][] c5092dyArr, int[] iArr) {
        C5092dy[] c5092dyArr2 = c5092dyArr[0];
        C5092dy[][] c5092dyArr3 = {c5092dyArr2};
        int iM21805x1 = c5092dyArr3[0][iArr[0]].m21805x1(c5092dyArr3);
        C5092dy[] c5092dyArr4 = c5092dyArr3[0];
        if (iM21805x1 == 0) {
            return false;
        }
        c5092dyArr[0] = c5092dyArr4;
        iArr[0] = iM21805x1;
        return true;
    }

    /* JADX INFO: renamed from: h4 */
    public static boolean m21749h4(C5092dy[][] c5092dyArr, int[] iArr) {
        C5092dy[] c5092dyArr2 = c5092dyArr[0];
        int iM21805x1 = iArr[0];
        while (!c5092dyArr2[iM21805x1].m21802up()) {
            C5092dy[][] c5092dyArr3 = {c5092dyArr2};
            iM21805x1 = c5092dyArr3[0][iM21805x1].m21805x1(c5092dyArr3);
            c5092dyArr2 = c5092dyArr3[0];
            if (iM21805x1 == 0) {
                return false;
            }
        }
        c5092dyArr[0] = c5092dyArr2;
        iArr[0] = c5092dyArr2[iM21805x1].m21792kk(c5092dyArr);
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m21750k4(C5092dy[] c5092dyArr, int i) {
        return (c5092dyArr[0].m21774ck().m21814k4() << 16) | i;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m21758kk(C5092dy[][] c5092dyArr, int[] iArr) {
        C5092dy[] c5092dyArr2 = c5092dyArr[0];
        int i = iArr[0];
        if (!c5092dyArr2[i].m21798rv()) {
            return false;
        }
        C5092dy[][] c5092dyArr3 = {c5092dyArr2};
        int[] iArr2 = {i};
        m21760m9(c5092dyArr3, iArr2);
        C5092dy[] c5092dyArr4 = c5092dyArr3[0];
        int iM21792kk = iArr2[0];
        while (c5092dyArr4[iM21792kk].m21781k4() == 2) {
            c5092dyArr3[0] = c5092dyArr4;
            iM21792kk = c5092dyArr4[iM21792kk].m21792kk(c5092dyArr3);
            c5092dyArr4 = c5092dyArr3[0];
        }
        c5092dyArr[0] = c5092dyArr4;
        iArr[0] = iM21792kk;
        return true;
    }

    /* JADX INFO: renamed from: m9 */
    private static void m21760m9(C5092dy[][] c5092dyArr, int[] iArr) {
        int i = iArr[0] + 1;
        iArr[0] = i;
        C5092dy[] c5092dyArr2 = c5092dyArr[0];
        if (i >= c5092dyArr2.length) {
            c5092dyArr[0] = c5092dyArr2[0].m21774ck().m21817kk();
            iArr[0] = 1;
        }
    }

    /* JADX INFO: renamed from: to */
    public static boolean m21761to(C5092dy[][] c5092dyArr, int[] iArr) {
        C5092dy[] c5092dyArr2 = c5092dyArr[0];
        int i = iArr[0];
        if (!c5092dyArr2[i].m21796ne()) {
            C5092dy[][] c5092dyArr3 = {c5092dyArr2};
            int iM21792kk = c5092dyArr3[0][i].m21792kk(c5092dyArr3);
            C5092dy[] c5092dyArr4 = c5092dyArr3[0];
            if (iM21792kk != 0) {
                c5092dyArr[0] = c5092dyArr4;
                iArr[0] = iM21792kk;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m21762x1(C5092dy[] c5092dyArr, int i, C5092dy[][] c5092dyArr2) {
        if (c5092dyArr[i].m21781k4() != 1) {
            c5092dyArr2[0] = null;
            return 0;
        }
        C10931x1 c10931x1M21778h4 = c5092dyArr[i].m21778h4();
        while (!c5092dyArr[i].m21801u4()) {
            C5092dy[][] c5092dyArr3 = {c5092dyArr};
            i = c5092dyArr3[0][i].m21805x1(c5092dyArr3);
            c5092dyArr = c5092dyArr3[0];
            if (i == 0) {
                return c10931x1M21778h4.m52713kk(c5092dyArr2);
            }
        }
        return c10931x1M21778h4.m52705k4(c5092dyArr, i, c5092dyArr2);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m21751k4(C5092dy[] c5092dyArr, int i, C5092dy[][] c5092dyArr2) {
        if (c5092dyArr[i].m21801u4()) {
            return c5092dyArr[i].m21778h4().m52705k4(c5092dyArr, i, c5092dyArr2);
        }
        c5092dyArr2[0] = null;
        return 0;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m21759kk(C5092dy[][] c5092dyArr, int[] iArr, String str, String str2) {
        C5092dy[] c5092dyArr2 = c5092dyArr[0];
        int i = iArr[0];
        if (c5092dyArr2[i].m21794ks()) {
            C5092dy[][] c5092dyArr3 = {c5092dyArr2};
            int[] iArr2 = {i};
            m21760m9(c5092dyArr3, iArr2);
            C5092dy[] c5092dyArr4 = c5092dyArr3[0];
            int iM21792kk = iArr2[0];
            while (!c5092dyArr4[iM21792kk].m21791k4(str, str2)) {
                c5092dyArr3[0] = c5092dyArr4;
                iM21792kk = c5092dyArr4[iM21792kk].m21792kk(c5092dyArr3);
                c5092dyArr4 = c5092dyArr3[0];
                if (iM21792kk == 0 || c5092dyArr4[iM21792kk].m21781k4() != 2) {
                }
            }
            c5092dyArr[0] = c5092dyArr4;
            iArr[0] = iM21792kk;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m21763x1(C5092dy[][] c5092dyArr, int[] iArr) {
        C5092dy[][] c5092dyArr2 = {null};
        int iM21792kk = c5092dyArr[0][iArr[0]].m21792kk(c5092dyArr2);
        C5092dy[] c5092dyArr3 = c5092dyArr2[0];
        if (iM21792kk == 0 || c5092dyArr3[iM21792kk].m21781k4() != 2) {
            return false;
        }
        c5092dyArr[0] = c5092dyArr3;
        iArr[0] = iM21792kk;
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m21752k4(C5092dy[][] c5092dyArr, int[] iArr) {
        if (!c5092dyArr[0][iArr[0]].m21794ks()) {
            return false;
        }
        m21760m9(c5092dyArr, iArr);
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m21764x1(C5092dy[][] c5092dyArr, int[] iArr, int i) {
        C5092dy[] c5092dyArr2 = c5092dyArr[0];
        int iM21792kk = iArr[0];
        int iM52684m9 = AbstractC10925du.m52684m9(i);
        if (c5092dyArr2[iM21792kk].m21781k4() != 2) {
            do {
                C5092dy[][] c5092dyArr3 = {c5092dyArr2};
                iM21792kk = c5092dyArr3[0][iM21792kk].m21792kk(c5092dyArr3);
                c5092dyArr2 = c5092dyArr3[0];
                if (iM21792kk == 0) {
                }
            } while (((1 << c5092dyArr2[iM21792kk].m21781k4()) & iM52684m9) == 0);
            c5092dyArr[0] = c5092dyArr2;
            iArr[0] = iM21792kk;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m21753k4(C5092dy[][] c5092dyArr, int[] iArr, int i) {
        C5092dy[] c5092dyArr2 = c5092dyArr[0];
        int i2 = iArr[0];
        if (c5092dyArr2[i2].m21798rv()) {
            int iM52684m9 = AbstractC10925du.m52684m9(i);
            C5092dy[][] c5092dyArr3 = {c5092dyArr2};
            int[] iArr2 = {i2};
            m21760m9(c5092dyArr3, iArr2);
            C5092dy[] c5092dyArr4 = c5092dyArr3[0];
            int iM21792kk = iArr2[0];
            while (((1 << c5092dyArr4[iM21792kk].m21781k4()) & iM52684m9) == 0) {
                c5092dyArr3[0] = c5092dyArr4;
                iM21792kk = c5092dyArr4[iM21792kk].m21792kk(c5092dyArr3);
                c5092dyArr4 = c5092dyArr3[0];
                if (iM21792kk == 0) {
                }
            }
            if (i == 2) {
                return false;
            }
            c5092dyArr[0] = c5092dyArr4;
            iArr[0] = iM21792kk;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m21765x1(C5092dy[][] c5092dyArr, int[] iArr, String str, String str2) {
        C5092dy[] c5092dyArr2 = c5092dyArr[0];
        int iM21792kk = iArr[0];
        if (c5092dyArr2[iM21792kk].m21781k4() != 2) {
            do {
                C5092dy[][] c5092dyArr3 = {c5092dyArr2};
                iM21792kk = c5092dyArr3[0][iM21792kk].m21792kk(c5092dyArr3);
                c5092dyArr2 = c5092dyArr3[0];
                if (iM21792kk == 0) {
                }
            } while (!c5092dyArr2[iM21792kk].m21811x1(str, str2));
            c5092dyArr[0] = c5092dyArr2;
            iArr[0] = iM21792kk;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m21754k4(C5092dy[][] c5092dyArr, int[] iArr, String str, String str2) {
        C5092dy[] c5092dyArr2 = c5092dyArr[0];
        int i = iArr[0];
        if (c5092dyArr2[i].m21812x6()) {
            C5092dy[][] c5092dyArr3 = {c5092dyArr2};
            int[] iArr2 = {i};
            m21760m9(c5092dyArr3, iArr2);
            C5092dy[] c5092dyArr4 = c5092dyArr3[0];
            int iM21792kk = iArr2[0];
            while (!c5092dyArr4[iM21792kk].m21811x1(str, str2)) {
                c5092dyArr3[0] = c5092dyArr4;
                iM21792kk = c5092dyArr4[iM21792kk].m21792kk(c5092dyArr3);
                c5092dyArr4 = c5092dyArr3[0];
                if (iM21792kk == 0) {
                }
            }
            c5092dyArr[0] = c5092dyArr4;
            iArr[0] = iM21792kk;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        r5[0] = r1;
        r6[0] = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m21755k4(C5092dy[][] c5092dyArr, int[] iArr, C5092dy[] c5092dyArr2, int i) {
        C5092dy[] c5092dyArrM21817kk = c5092dyArr[0];
        int i2 = iArr[0] + 1;
        loop0: while (true) {
            if (c5092dyArrM21817kk != c5092dyArr2 || i2 > i) {
                while (i2 < c5092dyArrM21817kk[0].m21774ck().m21818x1()) {
                    if (c5092dyArrM21817kk[i2].m21779ix() || (c5092dyArrM21817kk[i2].m21781k4() == 1 && c5092dyArrM21817kk[i2].m21813yj())) {
                        break loop0;
                    }
                    i2++;
                }
                c5092dyArrM21817kk = c5092dyArrM21817kk[0].m21774ck().m21817kk();
                if (c5092dyArrM21817kk == null) {
                    break;
                }
                i2 = 1;
            } else {
                while (i2 != i) {
                    if (c5092dyArrM21817kk[i2].m21779ix() || (c5092dyArrM21817kk[i2].m21781k4() == 1 && c5092dyArrM21817kk[i2].m21813yj())) {
                        c5092dyArr[0] = c5092dyArrM21817kk;
                        iArr[0] = i2;
                        return true;
                    }
                    i2++;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m21756k4(C5092dy[][] c5092dyArr, int[] iArr, C5092dy[] c5092dyArr2, int i, int i2) {
        C5092dy[] c5092dyArrM21817kk = c5092dyArr[0];
        int i3 = iArr[0];
        int iM52684m9 = AbstractC10925du.m52684m9(i2);
        int i4 = i3 + 1;
        while (true) {
            if (c5092dyArrM21817kk != c5092dyArr2 || i4 > i) {
                while (i4 < c5092dyArrM21817kk[0].m21774ck().m21818x1()) {
                    if (((1 << c5092dyArrM21817kk[i4].m21781k4()) & iM52684m9) != 0) {
                        c5092dyArr[0] = c5092dyArrM21817kk;
                        iArr[0] = i4;
                        return true;
                    }
                    i4++;
                }
                c5092dyArrM21817kk = c5092dyArrM21817kk[0].m21774ck().m21817kk();
                if (c5092dyArrM21817kk == null) {
                    break;
                }
                i4 = 1;
            } else {
                while (i4 != i) {
                    if (((1 << c5092dyArrM21817kk[i4].m21781k4()) & iM52684m9) != 0) {
                        c5092dyArr[0] = c5092dyArrM21817kk;
                        iArr[0] = i4;
                        return true;
                    }
                    i4++;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m21757k4(C5092dy[][] c5092dyArr, int[] iArr, C5092dy[] c5092dyArr2, int i, String str, String str2) {
        int iM21814k4;
        int iM21814k42;
        C5092dy[] c5092dyArrM21817kk = c5092dyArr[0];
        int iM21799to = iArr[0];
        if (c5092dyArrM21817kk[iM21799to].m21781k4() != 1 || c5092dyArrM21817kk[iM21799to].m21793kk() != str) {
            int i2 = iM21799to + 1;
            while (true) {
                if (c5092dyArrM21817kk != c5092dyArr2 || i2 > i) {
                    while (i2 < c5092dyArrM21817kk[0].m21774ck().m21818x1()) {
                        if (c5092dyArrM21817kk[i2].m21811x1(str, str2)) {
                            c5092dyArr[0] = c5092dyArrM21817kk;
                            iArr[0] = i2;
                            return true;
                        }
                        i2++;
                    }
                    c5092dyArrM21817kk = c5092dyArrM21817kk[0].m21774ck().m21817kk();
                    if (c5092dyArrM21817kk == null) {
                        break;
                    }
                    i2 = 1;
                } else {
                    while (i2 != i) {
                        if (c5092dyArrM21817kk[i2].m21811x1(str, str2)) {
                            c5092dyArr[0] = c5092dyArrM21817kk;
                            iArr[0] = i2;
                            return true;
                        }
                        i2++;
                    }
                }
            }
            return false;
        }
        if (c5092dyArr2 != null) {
            iM21814k4 = c5092dyArr2[0].m21774ck().m21814k4();
            int iM21814k43 = c5092dyArrM21817kk[0].m21774ck().m21814k4();
            if (iM21814k43 > iM21814k4 || (iM21814k43 == iM21814k4 && iM21799to >= i)) {
                c5092dyArr2 = null;
            }
        } else {
            iM21814k4 = 0;
        }
        while (true) {
            C5092dy[][] c5092dyArr3 = {c5092dyArrM21817kk};
            iM21799to = c5092dyArr3[0][iM21799to].m21799to(c5092dyArr3);
            c5092dyArrM21817kk = c5092dyArr3[0];
            if (iM21799to == 0 || (c5092dyArr2 != null && ((iM21814k42 = c5092dyArrM21817kk[0].m21774ck().m21814k4()) > iM21814k4 || (iM21814k42 == iM21814k4 && iM21799to >= i)))) {
                break;
            }
            if (c5092dyArrM21817kk[iM21799to].m21793kk() == str && C14113y2.m67363du(c5092dyArrM21817kk[iM21799to].m21775du(), str2)) {
                c5092dyArr[0] = c5092dyArrM21817kk;
                iArr[0] = iM21799to;
                return true;
            }
        }
    }
}
