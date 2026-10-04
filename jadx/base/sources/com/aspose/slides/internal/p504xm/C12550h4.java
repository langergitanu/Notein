package com.aspose.slides.internal.p504xm;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p505xn.C12557du;
import com.aspose.slides.internal.p505xn.C12564kk;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.xm.h4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12550h4 {

    /* JADX INFO: renamed from: c5 */
    private int f42030c5;

    /* JADX INFO: renamed from: ck */
    private int f42031ck;

    /* JADX INFO: renamed from: du */
    private double f42032du;

    /* JADX INFO: renamed from: dy */
    private int f42033dy;

    /* JADX INFO: renamed from: fa */
    private int f42034fa;

    /* JADX INFO: renamed from: h4 */
    private int f42035h4;

    /* JADX INFO: renamed from: jd */
    private int f42036jd;

    /* JADX INFO: renamed from: k4 */
    private final long f42037k4;

    /* JADX INFO: renamed from: kk */
    private long f42038kk;

    /* JADX INFO: renamed from: m9 */
    private int f42039m9;

    /* JADX INFO: renamed from: to */
    private double f42040to;

    /* JADX INFO: renamed from: up */
    private int[] f42041up;

    /* JADX INFO: renamed from: x1 */
    private long f42042x1;

    public C12550h4(C12564kk c12564kk) {
        this.f42035h4 = 32767;
        this.f42039m9 = 2;
        this.f42033dy = 1;
        this.f42030c5 = 1;
        this.f42036jd = 1;
        this.f42031ck = 1;
        this.f42034fa = 4;
        this.f42041up = new int[]{0};
        this.f42037k4 = c12564kk.m58602k4().getPosition();
        m58527k4(c12564kk);
    }

    /* JADX INFO: renamed from: c5 */
    private boolean m58521c5() {
        if (this.f42035h4 != 2 || this.f42030c5 != 1 || this.f42041up.length != (this.f42031ck & 65535) || !m58522ck()) {
            return false;
        }
        int i = this.f42033dy;
        return i == 1 || i == 5 || i == 6 || i == 32773;
    }

    /* JADX INFO: renamed from: ck */
    private boolean m58522ck() {
        int i = this.f42041up[0];
        boolean z = (i & 65535) == 8 || (i & 65535) == 16;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f42041up;
            if (i2 >= iArr.length) {
                return z;
            }
            z = z && iArr[i2] == iArr[0];
            i2++;
        }
    }

    /* JADX INFO: renamed from: dy */
    private boolean m58523dy() {
        int i;
        if (this.f42035h4 == 3) {
            int i2 = this.f42041up[0];
            if (((i2 & 65535) == 1 || (i2 & 65535) == 4 || (i2 & 65535) == 8) && ((i = this.f42033dy) == 1 || i == 5 || i == 32773)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h4 */
    private boolean m58524h4() {
        int i;
        int i2 = this.f42035h4;
        return (i2 == 0 || i2 == 1) && (this.f42041up[0] & 65535) == 0 && ((i = this.f42033dy) == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 32773);
    }

    /* JADX INFO: renamed from: jd */
    private boolean m58525jd() {
        if (this.f42035h4 != 5 || this.f42030c5 != 1 || this.f42036jd != 1 || this.f42034fa != 4 || this.f42041up.length != (this.f42031ck & 65535) || !m58522ck()) {
            return false;
        }
        int i = this.f42033dy;
        return i == 1 || i == 5 || i == 6 || i == 32773;
    }

    /* JADX INFO: renamed from: m9 */
    private boolean m58531m9() {
        int i;
        int i2 = this.f42035h4;
        if (i2 == 0 || i2 == 1) {
            int i3 = this.f42041up[0];
            if (((i3 & 65535) == 4 || (i3 & 65535) == 8 || (i3 & 65535) == 16) && ((i = this.f42033dy) == 1 || i == 2 || i == 32773)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m58533du() {
        int i = this.f42039m9;
        if (i == 1 || i == 2 || i == 3) {
            return m58524h4() || m58531m9() || m58523dy() || m58521c5() || m58525jd();
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m58534k4() {
        long j = this.f42042x1;
        if ((4294967295L & j) != 0) {
            return (int) j;
        }
        return 100;
    }

    /* JADX INFO: renamed from: kk */
    public final double m58535kk() {
        return this.f42040to;
    }

    /* JADX INFO: renamed from: to */
    public final double m58536to() {
        return this.f42032du;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m58537x1() {
        long j = this.f42038kk;
        if ((4294967295L & j) != 0) {
            return (int) j;
        }
        return 100;
    }

    public C12550h4(byte[] bArr) {
        this(new C12564kk(new C3152yj(bArr)));
    }

    /* JADX INFO: renamed from: k4 */
    private static int m58526k4(C12564kk c12564kk, boolean z) {
        int iM58600du = c12564kk.m58600du();
        return !z ? C12557du.m58576x1(iM58600du) : iM58600du;
    }

    /* JADX INFO: renamed from: kk */
    private static double m58530kk(C12564kk c12564kk, boolean z) {
        long jM58532x1 = m58532x1(c12564kk, z);
        return ((m58532x1(c12564kk, z) & 4294967295L) != 0 ? ((jM58532x1 & 4294967295L) / r7) & 4294967295L : 0L) & 4294967295L;
    }

    /* JADX INFO: renamed from: x1 */
    private static long m58532x1(C12564kk c12564kk, boolean z) {
        long jM58604kk = c12564kk.m58604kk();
        return !z ? C12557du.m58574k4(jM58604kk) : jM58604kk;
    }

    /* JADX INFO: renamed from: k4 */
    private void m58527k4(C12564kk c12564kk) {
        long j;
        int i;
        int i2 = 0;
        int i3 = 1;
        boolean z = c12564kk.m58605to() == 19789;
        int i4 = 65535;
        if ((m58526k4(c12564kk, z) & 65535) != 42) {
            return;
        }
        c12564kk.m58602k4().setPosition(this.f42037k4 + (m58532x1(c12564kk, z) & 4294967295L));
        int iM58526k4 = m58526k4(c12564kk, z);
        long position = c12564kk.m58602k4().getPosition();
        while (i2 < (iM58526k4 & i4)) {
            c12564kk.m58602k4().setPosition(position);
            long j2 = position + 12;
            int iM58526k42 = m58526k4(c12564kk, z);
            int iM58526k43 = m58526k4(c12564kk, z);
            long jM58532x1 = m58532x1(c12564kk, z);
            int i5 = iM58526k43 & i4;
            if (((i5 == i3 || i5 == 2) && (jM58532x1 & 4294967295L) > 4) || ((i5 == 3 && (jM58532x1 & 4294967295L) > 2) || ((i5 == 4 && (jM58532x1 & 4294967295L) > 1) || i5 == 5))) {
                i = i4;
                j = j2;
                c12564kk.m58602k4().setPosition(this.f42037k4 + (m58532x1(c12564kk, z) & 4294967295L));
            } else {
                i = i4;
                j = j2;
            }
            if (iM58526k42 == 262) {
                this.f42035h4 = m58526k4(c12564kk, z) & i;
            } else if (iM58526k42 == 277) {
                this.f42031ck = m58526k4(c12564kk, z);
            } else if (iM58526k42 == 296) {
                this.f42039m9 = m58526k4(c12564kk, z) & i;
            } else if (iM58526k42 == 332) {
                this.f42036jd = m58526k4(c12564kk, z) & i;
            } else if (iM58526k42 != 334) {
                switch (iM58526k42) {
                    case 256:
                        this.f42042x1 = i5 == 3 ? m58526k4(c12564kk, z) & i : m58532x1(c12564kk, z);
                        break;
                    case 257:
                        this.f42038kk = i5 == 3 ? m58526k4(c12564kk, z) & i : m58532x1(c12564kk, z);
                        break;
                    case StyleIdentifier.COLORFUL_LIST_ACCENT_6 /* 258 */:
                        this.f42041up = m58529k4(c12564kk, z, jM58532x1);
                        break;
                    case StyleIdentifier.COLORFUL_GRID_ACCENT_6 /* 259 */:
                        this.f42033dy = m58526k4(c12564kk, z) & i;
                        break;
                    default:
                        switch (iM58526k42) {
                            case StyleIdentifier.GRID_TABLE_3_ACCENT_1 /* 282 */:
                                this.f42040to = m58530kk(c12564kk, z);
                                break;
                            case StyleIdentifier.GRID_TABLE_4_ACCENT_1 /* 283 */:
                                this.f42032du = m58530kk(c12564kk, z);
                                break;
                            case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_1 /* 284 */:
                                this.f42030c5 = m58526k4(c12564kk, z) & i;
                                break;
                        }
                        break;
                }
            } else {
                this.f42034fa = m58526k4(c12564kk, z);
            }
            i2++;
            i4 = i;
            position = j;
            i3 = 1;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m58528k4(byte[] bArr) {
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            short sM13381rv = new C3134k4(c3152yj).m13381rv();
            return sM13381rv == 18761 || sM13381rv == 19789;
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int[] m58529k4(C12564kk c12564kk, boolean z, long j) {
        int i = (int) j;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = m58526k4(c12564kk, z);
        }
        return iArr;
    }
}
