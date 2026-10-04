package com.aspose.slides.internal.p504xm;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p505xn.C12557du;
import com.aspose.slides.internal.p505xn.C12563k4;
import com.aspose.slides.internal.p505xn.C12564kk;
import com.aspose.slides.internal.p505xn.C12566m9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.xm.du */
/* JADX INFO: loaded from: classes5.dex */
public class C12549du {

    /* JADX INFO: renamed from: k4 */
    private static final byte[] f42028k4 = {71, 73, 70, 56, 57, 97};

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f42029x1 = new C7017h4("bmp", "emf", "jpg", "jpeg", "png", "wmf", "pict", "pct", "gif", "tif", "tiff", "IHDR", "pHYs", "IEND");

    /* JADX INFO: renamed from: c5 */
    public static boolean m58484c5(byte[] bArr) {
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            C3134k4 c3134k4 = new C3134k4(c3152yj);
            short sM13381rv = c3134k4.m13381rv();
            if (sM13381rv != 0 && sM13381rv != 1) {
                return false;
            }
            if (c3134k4.m13381rv() != 9) {
                return false;
            }
            c3134k4.m13381rv();
            c3134k4.m13386x6();
            c3134k4.m13381rv();
            c3134k4.m13386x6();
            return c3134k4.m13381rv() == 0;
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: ck */
    public static boolean m58485ck(byte[] bArr) {
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            return m58506kk(c3152yj);
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: du */
    public static int m58486du(AbstractC3150x6 abstractC3150x6) {
        if (m58500k4(abstractC3150x6)) {
            return 1;
        }
        if (m58518x1(abstractC3150x6)) {
            return 2;
        }
        return m58512to(abstractC3150x6);
    }

    /* JADX INFO: renamed from: dy */
    public static boolean m58488dy(byte[] bArr) {
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            C3134k4 c3134k4 = new C3134k4(c3152yj);
            c3134k4.m13382u4();
            c3134k4.m13382u4();
            c3134k4.m13382u4();
            c3134k4.m13382u4();
            c3134k4.m13382u4();
            int iM58576x1 = C12557du.m58576x1(c3134k4.m13382u4()) & 65535;
            if (iM58576x1 == 273) {
                return true;
            }
            if (iM58576x1 == 17) {
                if ((C12557du.m58576x1(c3134k4.m13382u4()) & 65535) == 767) {
                    return true;
                }
            }
            c3152yj.dispose();
            return false;
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: fa */
    public static C12553to m58489fa(byte[] bArr) {
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            c3152yj.setPosition(14L);
            C3134k4 c3134k4 = new C3134k4(c3152yj);
            C12554x1 c12554x1 = new C12554x1();
            c12554x1.m58549k4(c3134k4);
            return C12553to.m58540k4(c12554x1.f42063kk, C14116yg.m67482k4(c12554x1.f42065to), m58505kk(c12554x1.f42055c5), m58505kk(c12554x1.f42061jd));
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: h4 */
    public static int m58490h4(AbstractC3150x6 abstractC3150x6) {
        abstractC3150x6.setPosition(0L);
        return m58486du(abstractC3150x6);
    }

    /* JADX INFO: renamed from: ix */
    public static C12553to m58492ix(byte[] bArr) {
        return m58496k4(bArr, m58515x1(bArr));
    }

    /* JADX INFO: renamed from: jd */
    public static boolean m58493jd(byte[] bArr) {
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            C3134k4 c3134k4 = new C3134k4(c3152yj);
            if ((c3134k4.m13384uz() & 4294967295L) != 2596720087L) {
                return false;
            }
            return c3134k4.m13381rv() == 0;
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC12008jd m58494k4(AbstractC12002ck abstractC12002ck) {
        return AbstractC12008jd.m56582k4(abstractC12002ck);
    }

    /* JADX INFO: renamed from: kk */
    public static double m58505kk(int i) {
        return ((double) i) / 39.37007874015748d;
    }

    /* JADX INFO: renamed from: ks */
    public static C12553to m58508ks(byte[] bArr) {
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            C12564kk c12564kk = new C12564kk(c3152yj);
            c12564kk.m58600du();
            int iM58600du = c12564kk.m58600du();
            C12025x6 c12025x6Clone = C12025x6.f40591k4.Clone();
            while (true) {
                int i = iM58600du & 65535;
                if ((65520 & iM58600du) == 65472 && i != 65476 && i != 65484) {
                    c3152yj.seek(3L, 1);
                    C12553to c12553toM58540k4 = C12553to.m58540k4(c12564kk.m58600du() & 65535, c12564kk.m58600du() & 65535, c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk());
                    c3152yj.dispose();
                    return c12553toM58540k4;
                }
                C12025x6[] c12025x6Arr = {c12025x6Clone};
                boolean zM58499k4 = m58499k4(iM58600du, c12564kk, c12025x6Arr);
                c12025x6Arr[0].CloneTo(c12025x6Clone);
                if (!zM58499k4) {
                    c3152yj.seek((c12564kk.m58600du() & 65535) - 2, 1);
                }
                iM58600du = c12564kk.m58600du();
            }
        } catch (Throwable th) {
            c3152yj.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: m9 */
    public static boolean m58509m9(byte[] bArr) {
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            return (new C3134k4(c3152yj).m13386x6() & 16777215) == 4606279;
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: ne */
    public static boolean m58510ne(byte[] bArr) {
        if (bArr.length < 4) {
            return false;
        }
        byte b = bArr[0];
        if ((b & 255) == 215 && (bArr[1] & 255) == 205 && (bArr[2] & 255) == 198 && (bArr[3] & 255) == 154) {
            return true;
        }
        if (b == 1 && bArr[1] == 0 && bArr[2] == 9 && bArr[3] == 0) {
            return true;
        }
        return bArr.length >= 48 && bArr[40] == 32 && bArr[41] == 69 && bArr[42] == 77 && bArr[43] == 70 && bArr[44] == 0 && bArr[45] == 0 && bArr[46] == 1 && bArr[47] == 0;
    }

    /* JADX INFO: renamed from: rv */
    public static C12553to m58511rv(byte[] bArr) {
        C12550h4 c12550h4 = new C12550h4(bArr);
        return C12553to.m58540k4(c12550h4.m58534k4(), c12550h4.m58537x1(), c12550h4.m58535kk(), c12550h4.m58536to());
    }

    /* JADX INFO: renamed from: to */
    public static int m58512to(AbstractC3150x6 abstractC3150x6) {
        if (!m58506kk(abstractC3150x6)) {
            return 0;
        }
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        c3134k4.m13384uz();
        c3134k4.m13371ck().setPosition(c3134k4.m13384uz() & 4294967295L);
        if ((c3134k4.m13384uz() & 4294967295L) != 70) {
            return 3;
        }
        c3134k4.m13386x6();
        c3134k4.m13386x6();
        if (c3134k4.m13386x6() == 726027589 && (c3134k4.m13382u4() & 65535) == 16385) {
            return (c3134k4.m13382u4() & 1) == 1 ? 5 : 4;
        }
        return 3;
    }

    /* JADX INFO: renamed from: up */
    public static C12553to m58514up(byte[] bArr) {
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            c3152yj.setPosition(6L);
            C3134k4 c3134k4 = new C3134k4(c3152yj);
            return C12553to.m58540k4(c3134k4.m13382u4() & 65535, c3134k4.m13382u4() & 65535, 0.0d, 0.0d);
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static int m58515x1(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                if (m58484c5(bArr) || m58493jd(bArr)) {
                    return 2;
                }
                if (m58485ck(bArr)) {
                    return 1;
                }
                if (m58513to(bArr)) {
                    return 4;
                }
                if (m58487du(bArr)) {
                    return 5;
                }
                if (m58491h4(bArr)) {
                    return 6;
                }
                if (m58488dy(bArr)) {
                    return 3;
                }
                if (m58509m9(bArr)) {
                    return 7;
                }
                if (m58507kk(bArr)) {
                    return 8;
                }
            } catch (RuntimeException unused) {
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: x6 */
    public static C12553to m58519x6(byte[] bArr) {
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            C3134k4 c3134k4 = new C3134k4(c3152yj);
            c3134k4.m13382u4();
            int iM58576x1 = C12557du.m58576x1(c3134k4.m13382u4()) & 65535;
            int iM58576x12 = C12557du.m58576x1(c3134k4.m13382u4()) & 65535;
            int iM58576x13 = C12557du.m58576x1(c3134k4.m13382u4()) & 65535;
            return C12553to.m58541k4(iM58576x12, iM58576x1, C12557du.m58576x1(c3134k4.m13382u4()) & 65535, iM58576x13, C12566m9.m58643jd(r5 - iM58576x12), C12566m9.m58643jd(iM58576x13 - iM58576x1));
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: yj */
    public static C12553to m58520yj(byte[] bArr) {
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            C12564kk c12564kk = new C12564kk(c3152yj);
            c3152yj.setPosition(8L);
            boolean z = false;
            double dM58505kk = 0.0d;
            double dM58505kk2 = 0.0d;
            int iM58606x1 = 0;
            int iM58606x12 = 0;
            while (!z && c3152yj.getPosition() < c3152yj.getLength()) {
                long jM58604kk = c12564kk.m58604kk();
                switch (f42029x1.m27428k4(C14113y2.m67405k4(c12564kk.m58607x1(4)))) {
                    case 11:
                        iM58606x1 = c12564kk.m58606x1();
                        iM58606x12 = c12564kk.m58606x1();
                        c3152yj.seek(-8L, 1);
                        continue;
                        c3152yj.seek(((jM58604kk & 4294967295L) + 4) & 4294967295L, 1);
                        break;
                    case 12:
                        int iM58604kk = (int) c12564kk.m58604kk();
                        int iM58604kk2 = (int) c12564kk.m58604kk();
                        if (((short) (c12564kk.m58601h4() & 255)) == 1) {
                            dM58505kk = m58505kk(iM58604kk);
                            dM58505kk2 = m58505kk(iM58604kk2);
                        }
                        break;
                    case 13:
                        break;
                    default:
                        continue;
                        c3152yj.seek(((jM58604kk & 4294967295L) + 4) & 4294967295L, 1);
                        break;
                }
                z = true;
                c3152yj.seek(((jM58604kk & 4294967295L) + 4) & 4294967295L, 1);
            }
            C12553to c12553toM58540k4 = C12553to.m58540k4(iM58606x1, iM58606x12, dM58505kk, dM58505kk2);
            c3152yj.dispose();
            return c12553toM58540k4;
        } catch (Throwable th) {
            c3152yj.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: du */
    public static boolean m58487du(byte[] bArr) {
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            C3134k4 c3134k4 = new C3134k4(c3152yj);
            if ((c3134k4.m13384uz() & 4294967295L) != 1196314761) {
                return false;
            }
            return (4294967295L & c3134k4.m13384uz()) == 169478669;
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: h4 */
    public static boolean m58491h4(byte[] bArr) {
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            C3134k4 c3134k4 = new C3134k4(c3152yj);
            if ((((long) (c3134k4.m13382u4() & 65535)) & 4294967295L) != 19778) {
                c3152yj.dispose();
                return false;
            }
            long jM13384uz = c3134k4.m13384uz();
            c3134k4.m13384uz();
            long jM13384uz2 = c3134k4.m13384uz();
            long j = jM13384uz & 4294967295L;
            if (j != 0 && (jM13384uz2 & 4294967295L) > j) {
                c3152yj.dispose();
                return false;
            }
            long jM13384uz3 = c3134k4.m13384uz();
            boolean z = jM13384uz3 == 12;
            if (!z && (jM13384uz3 & 4294967295L) < 16) {
                c3152yj.dispose();
                return false;
            }
            if (z) {
                c3134k4.m13384uz();
            } else {
                c3134k4.m13386x6();
                c3134k4.m13386x6();
            }
            if ((((long) (c3134k4.m13382u4() & 65535)) & 4294967295L) != 1) {
                c3152yj.dispose();
                return false;
            }
            long jM13382u4 = ((long) (c3134k4.m13382u4() & 65535)) & 4294967295L;
            if (jM13382u4 == 1 || jM13382u4 == 4 || jM13382u4 == 8 || jM13382u4 == 16 || jM13382u4 == 24 || jM13382u4 == 32) {
                c3152yj.dispose();
                return true;
            }
            c3152yj.dispose();
            return false;
        } catch (Throwable th) {
            c3152yj.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C12015qq m58495k4(float f, float f2) {
        if (f * f2 <= 8388608.0f) {
            return new C12015qq(f, f2);
        }
        C12015qq c12015qq = new C12015qq();
        double d = f / f2;
        c12015qq.m56695k4((float) (C14116yg.m67496rv(8388608.0d * d) + 0.5d));
        c12015qq.m56700x1((float) ((((double) c12015qq.m56699x1()) / d) + 0.5d));
        return c12015qq;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m58506kk(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6.getLength() < 88) {
            return false;
        }
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        boolean z = (c3134k4.m13384uz() & 4294967295L) == 1;
        c3134k4.m13371ck().setPosition(40L);
        boolean z2 = (c3134k4.m13384uz() & 4294967295L) == 1179469088 ? z : false;
        abstractC3150x6.setPosition(0L);
        return z2;
    }

    /* JADX INFO: renamed from: to */
    public static boolean m58513to(byte[] bArr) {
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            return (((long) (new C3134k4(c3152yj).m13382u4() & 65535)) & 4294967295L) == 55551;
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m58516x1(C12564kk c12564kk, C12025x6[] c12025x6Arr) {
        long position = c12564kk.m58602k4().getPosition();
        int iM58600du = c12564kk.m58600du();
        if (C14113y2.m67448x1(C14113y2.m67405k4(c12564kk.m58607x1(6)), "Exif")) {
            C12550h4 c12550h4 = new C12550h4(c12564kk);
            if (c12550h4.m58535kk() > 0.0d && c12550h4.m58536to() > 0.0d) {
                c12025x6Arr[0] = new C12025x6((float) c12550h4.m58535kk(), (float) c12550h4.m58536to());
            }
        }
        c12564kk.m58602k4().setPosition(position + ((long) (65535 & iM58600du)));
    }

    /* JADX INFO: renamed from: k4 */
    public static C12553to m58496k4(byte[] bArr, int i) {
        switch (i) {
            case 3:
                return m58519x6(bArr);
            case 4:
                return m58508ks(bArr);
            case 5:
                return m58520yj(bArr);
            case 6:
                return m58489fa(bArr);
            case 7:
                return m58514up(bArr);
            case 8:
                return m58511rv(bArr);
            default:
                return C12553to.m58540k4(100, 100, 96.0d, 96.0d);
        }
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m58507kk(byte[] bArr) {
        return C12550h4.m58528k4(bArr);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m58517x1(int i) {
        return i == 2 || i == 1;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m58497k4(int i) {
        switch (i) {
            case 1:
                return "emf";
            case 2:
                return "wmf";
            case 3:
                return "pict";
            case 4:
                return "jpeg";
            case 5:
                return "png";
            case 6:
                return "bmp";
            case 7:
                return "gif";
            case 8:
                return "tif";
            default:
                throw new InvalidOperationException("Cannot convert image type to string.");
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m58518x1(AbstractC3150x6 abstractC3150x6) {
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        boolean z = c3134k4.m13381rv() == 0 ? (c3134k4.m13384uz() & 4294967295L) == 2596720087L : false;
        abstractC3150x6.setPosition(0L);
        return z;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m58498k4(C12564kk c12564kk, C12025x6[] c12025x6Arr) {
        int iM58600du = c12564kk.m58600du();
        c12564kk.m58602k4().seek(7L, 1);
        short sM58601h4 = (short) (c12564kk.m58601h4() & 255);
        int iM58600du2 = c12564kk.m58600du();
        int iM58600du3 = c12564kk.m58600du();
        if (sM58601h4 == 1) {
            c12025x6Arr[0] = new C12025x6(iM58600du2 & 65535, iM58600du3 & 65535);
        } else if (sM58601h4 == 2) {
            c12025x6Arr[0] = new C12025x6((float) (((double) (iM58600du2 & 65535)) * 2.54d), (float) (((double) (iM58600du3 & 65535)) * 2.54d));
        }
        c12564kk.m58602k4().seek((iM58600du & 65535) - 14, 1);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m58499k4(int i, C12564kk c12564kk, C12025x6[] c12025x6Arr) {
        int i2 = i & 65535;
        if (i2 == 65504) {
            m58498k4(c12564kk, c12025x6Arr);
            return true;
        }
        if (i2 != 65505) {
            return false;
        }
        m58516x1(c12564kk, c12025x6Arr);
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m58500k4(AbstractC3150x6 abstractC3150x6) {
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        short sM13381rv = c3134k4.m13381rv();
        boolean z = true;
        if (sM13381rv != 0 && sM13381rv != 1) {
            z = false;
        }
        if (c3134k4.m13381rv() != 9) {
            z = false;
        }
        c3134k4.m13381rv();
        c3134k4.m13386x6();
        c3134k4.m13381rv();
        c3134k4.m13386x6();
        boolean z2 = c3134k4.m13381rv() == 0 ? z : false;
        abstractC3150x6.setPosition(0L);
        return z2;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m58501k4(byte[] bArr) {
        return m58517x1(m58515x1(bArr));
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m58502k4(byte[] bArr, int[] iArr) {
        iArr[0] = -1;
        if (!m58487du(bArr)) {
            return false;
        }
        int iM58595k4 = C12563k4.m58595k4(bArr, 0, bArr.length, f42028k4);
        iArr[0] = iM58595k4;
        return iM58595k4 != -1;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m58503k4(C3134k4 c3134k4, int i) {
        int position = (int) c3134k4.m13371ck().getPosition();
        C12554x1 c12554x1 = new C12554x1();
        c12554x1.m58549k4(c3134k4);
        c3134k4.m13371ck().setPosition(position);
        int i2 = i + 14;
        byte[] bArr = new byte[i2];
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            C3149x1 c3149x1 = new C3149x1(c3152yj);
            C12551k4 c12551k4 = new C12551k4();
            c12551k4.f42047x1 = ((long) i2) & 4294967295L;
            c12551k4.f42043du = ((long) (c12554x1.m58548k4() + 54)) & 4294967295L;
            c12551k4.m58538k4(c3149x1);
            c3149x1.m13452kk();
            c3134k4.m13375k4(bArr, 14, i);
            return bArr;
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m58504k4(C3134k4 c3134k4, int i, int i2) {
        int position = (int) c3134k4.m13371ck().getPosition();
        C12554x1 c12554x1 = new C12554x1();
        c12554x1.m58549k4(c3134k4);
        boolean z = c12554x1.f42062k4;
        int iM58548k4 = c12554x1.m58548k4();
        byte[] bArrM13372dy = c3134k4.m13372dy(c12554x1.m58548k4());
        c3134k4.m13371ck().setPosition(position + i);
        int i3 = iM58548k4 + 54;
        int i4 = i3 + i2;
        byte[] bArr = new byte[i4];
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            C3149x1 c3149x1 = new C3149x1(c3152yj);
            C12551k4 c12551k4 = new C12551k4();
            c12551k4.f42047x1 = ((long) i4) & 4294967295L;
            c12551k4.f42043du = ((long) i3) & 4294967295L;
            c12551k4.m58538k4(c3149x1);
            c12554x1.m58550k4(c3149x1);
            c3149x1.m13450k4(bArrM13372dy);
            c3149x1.m13452kk();
            c3134k4.m13375k4(bArr, i3, i2);
            if (z) {
                bArr = new byte[0];
            }
            return bArr;
        } finally {
            c3152yj.dispose();
        }
    }
}
