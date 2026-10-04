package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3068ks;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p332p7.C7254aj;
import com.aspose.slides.internal.p332p7.C8646r2;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.it */
/* JADX INFO: loaded from: classes3.dex */
class C13659it extends AbstractC0910dq {

    /* JADX INFO: renamed from: up */
    private static final C3068ks f45361up = new C3068ks("auto", "bCtr", "bL", "bR", "ctr", "midL", "midR", "tCtr", "tL", "tR", "radial");

    /* JADX INFO: renamed from: c5 */
    private int f45362c5;

    /* JADX INFO: renamed from: ck */
    private String f45363ck;

    /* JADX INFO: renamed from: du */
    private int f45364du;

    /* JADX INFO: renamed from: dy */
    private boolean f45365dy;

    /* JADX INFO: renamed from: fa */
    private String f45366fa;

    /* JADX INFO: renamed from: h4 */
    private int f45367h4;

    /* JADX INFO: renamed from: jd */
    private boolean f45368jd;

    /* JADX INFO: renamed from: k4 */
    private String f45369k4;

    /* JADX INFO: renamed from: kk */
    private int[] f45370kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f45371m9;

    /* JADX INFO: renamed from: to */
    private int[] f45372to;

    /* JADX INFO: renamed from: x1 */
    private String f45373x1;

    public C13659it(C7254aj c7254aj) {
        this.f45371m9 = false;
        this.f45365dy = true;
        this.f45362c5 = 1;
        this.f45370kk = new int[]{1, 5, 6, 7};
        this.f45372to = new int[]{1, 5, 6, 7};
        this.f45364du = 0;
        for (C8646r2 c8646r2 : c7254aj.m28286x1()) {
            if (c8646r2.m39851k4() == 44) {
                this.f45369k4 = c8646r2.m39852x1();
            } else if (c8646r2.m39851k4() == 14) {
                this.f45373x1 = c8646r2.m39852x1();
            } else if (c8646r2.m39851k4() == 3) {
                this.f45370kk = C3085sv.m13103kk(m63097m9(c8646r2.m39852x1()));
            } else if (c8646r2.m39851k4() == 15) {
                this.f45372to = C3085sv.m13103kk(m63097m9(c8646r2.m39852x1()));
            } else if (c8646r2.m39851k4() == 10) {
                this.f45364du = m63095dy(c8646r2.m39852x1());
            } else if (c8646r2.m39851k4() == 4) {
                this.f45371m9 = m63098to(c8646r2.m39852x1());
            } else if (c8646r2.m39851k4() == 16) {
                this.f45365dy = m63098to(c8646r2.m39852x1());
            } else if (c8646r2.m39851k4() == 13) {
                this.f45362c5 = m63094du(c8646r2.m39852x1());
            } else if (c8646r2.m39851k4() == 0) {
                this.f45368jd = C14080ne.m66968k4(c8646r2.m39852x1());
            } else if (c8646r2.m39851k4() == 21) {
                this.f45363ck = c8646r2.m39852x1();
            } else if (c8646r2.m39851k4() == 54) {
                this.f45366fa = c8646r2.m39852x1();
            } else if (c8646r2.m39851k4() == 5) {
                this.f45367h4 = m63096h4(c8646r2.m39852x1());
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    private int m63096h4(String str) {
        if ("beg".equals(str)) {
            return 1;
        }
        return "end".equals(str) ? 2 : 0;
    }

    /* JADX INFO: renamed from: m9 */
    private List<Integer> m63097m9(String str) {
        List<Integer> list = new List<>();
        for (String str2 : C14113y2.m67414k4(C14113y2.m67393k4(str, ',', ControlChar.SPACE_CHAR), ControlChar.SPACE_CHAR)) {
            String strM67440x1 = C14113y2.m67440x1(str2);
            C3068ks c3068ks = f45361up;
            if (c3068ks.m12965x1(strM67440x1)) {
                list.addItem(Integer.valueOf(c3068ks.m12963k4(strM67440x1)));
            }
        }
        if (list.size() == 0) {
            list.addItem(0);
        }
        return list;
    }

    /* JADX INFO: renamed from: c5 */
    public final int m63099c5() {
        return this.f45367h4;
    }

    /* JADX INFO: renamed from: ck */
    public final boolean m63100ck() {
        return this.f45365dy;
    }

    /* JADX INFO: renamed from: du */
    public final int m63101du() {
        return this.f45362c5;
    }

    /* JADX INFO: renamed from: dy */
    public final int m63102dy() {
        return this.f45364du;
    }

    /* JADX INFO: renamed from: jd */
    public final boolean m63104jd() {
        return this.f45371m9;
    }

    /* JADX INFO: renamed from: kk */
    public final String m63105kk() {
        return this.f45369k4;
    }

    /* JADX INFO: renamed from: to */
    public final String m63107to() {
        return this.f45373x1;
    }

    /* JADX INFO: renamed from: du */
    private int m63094du(String str) {
        if ("1D".equals(str)) {
            return 0;
        }
        return (!"2D".equals(str) && "custom".equals(str)) ? 2 : 1;
    }

    /* JADX INFO: renamed from: dy */
    private int m63095dy(String str) {
        if ("bend".equals(str)) {
            return 1;
        }
        if ("curve".equals(str)) {
            return 2;
        }
        return "longCurve".equals(str) ? 3 : 0;
    }

    /* JADX INFO: renamed from: to */
    private boolean m63098to(String str) {
        return "arr".equals(str);
    }

    /* JADX INFO: renamed from: h4 */
    public final int[] m63103h4() {
        return this.f45370kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final int[] m63106m9() {
        return this.f45372to;
    }
}
