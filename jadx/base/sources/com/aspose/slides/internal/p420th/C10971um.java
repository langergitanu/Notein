package com.aspose.slides.internal.p420th;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p151gj.C4318fa;
import com.aspose.slides.internal.p151gj.C4320jd;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p353q7.C9771gi;
import com.aspose.slides.internal.p353q7.C9786ss;
import com.aspose.slides.internal.p353q7.C9787sv;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.internal.p505xn.C12576x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.th.um */
/* JADX INFO: loaded from: classes4.dex */
public class C10971um extends AbstractC10957fa implements InterfaceC10954dq {

    /* JADX INFO: renamed from: h4 */
    private C10959ix f38253h4;

    /* JADX INFO: renamed from: k4 */
    private C4320jd f38254k4;

    /* JADX INFO: renamed from: kk */
    private C10971um f38255kk;

    /* JADX INFO: renamed from: to */
    private C4317dy f38257to;

    /* JADX INFO: renamed from: x1 */
    private C4328x1 f38258x1;

    /* JADX INFO: renamed from: du */
    private int f38252du = 0;

    /* JADX INFO: renamed from: m9 */
    private int f38256m9 = 13;

    public C10971um() {
    }

    /* JADX INFO: renamed from: ck */
    public final C10959ix m53095ck() {
        return this.f38253h4;
    }

    @Override // com.aspose.slides.internal.p420th.InterfaceC10954dq
    /* JADX INFO: renamed from: du */
    public final C10971um mo52902du() {
        return this.f38255kk;
    }

    /* JADX INFO: renamed from: fa */
    public final C10971um m53096fa() {
        C10971um c10971um = new C10971um();
        c10971um.f38254k4 = this.f38254k4;
        c10971um.f38258x1 = this.f38258x1;
        c10971um.f38255kk = this.f38255kk;
        c10971um.f38257to = this.f38257to;
        c10971um.m53105kk(this.f38252du);
        for (int i = 0; i < m52927c5(); i++) {
            c10971um.m52930k4(((C10950bv) m52931k4(i)).m52898x1());
        }
        return c10971um;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m53097h4() {
        return this.f38252du;
    }

    /* JADX INFO: renamed from: k4 */
    public final C4320jd m53098k4() {
        return this.f38254k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m53104kk() {
        return this.f38256m9;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m53106m9() {
        if (m52927c5() == 0) {
            return false;
        }
        AbstractC10973uz abstractC10973uzM52931k4 = m52931k4(m52927c5() - 1);
        C10950bv c10950bv = (C10950bv) C7019kk.m27452k4((Object) abstractC10973uzM52931k4, C10950bv.class);
        if (c10950bv != null) {
            return c10950bv.m52896k4();
        }
        C10971um c10971um = (C10971um) C7019kk.m27452k4((Object) abstractC10973uzM52931k4, C10971um.class);
        if (c10971um != null) {
            return c10971um.m53106m9();
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p420th.InterfaceC10954dq
    /* JADX INFO: renamed from: to */
    public final C4317dy mo52909to() {
        return this.f38257to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C4328x1 m53107x1() {
        return this.f38258x1;
    }

    public C10971um(C4320jd c4320jd) {
        this.f38254k4 = c4320jd;
    }

    /* JADX INFO: renamed from: k4 */
    private static C10950bv m53084k4(C10950bv c10950bv, C10971um c10971um) {
        c10950bv.m52895k4(true);
        c10971um.m52930k4(c10950bv);
        return new C10950bv();
    }

    /* JADX INFO: renamed from: x1 */
    public static C5659x1 m53094x1(C5659x1 c5659x1, String str) {
        String[] strArr = {"Arial Unicode MS", "Arial", "Calibri", "MS PGothic", "MS Gothic", "Times New Roman", "Cambria Math", "SimSun", "Segoe UI", "Microsoft YaHei", "Gulim", "Helvetica", "Helv", "DejaVu Sans", "Liberation Serif", "FreeSans"};
        for (int i = 0; i < 16; i++) {
            String str2 = strArr[i];
            C5659x1 c5659x1M48331k4 = C9763ck.m48030to().m48331k4(str2, c5659x1.m23114dy(), c5659x1.m23125x1());
            if (c5659x1M48331k4 != null && c5659x1M48331k4.m23120k4().m48228to().contains(str2)) {
                if (m53093k4(c5659x1M48331k4, str)) {
                    return c5659x1M48331k4;
                }
            }
        }
        return C9763ck.m48030to().m48331k4(C9763ck.m48030to().m48035kk().m48202k4(), c5659x1.m23114dy(), c5659x1.m23125x1());
    }

    /* JADX INFO: renamed from: kk */
    public final void m53105kk(int i) {
        this.f38252du = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0198 A[PHI: r2
      0x0198: PHI (r2v2 com.aspose.slides.internal.th.bv) = (r2v1 com.aspose.slides.internal.th.bv), (r2v4 com.aspose.slides.internal.th.bv) binds: [B:30:0x017f, B:32:0x018d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C10971um m53085k4(C9786ss c9786ss) {
        C10971um c10971um = new C10971um();
        C10950bv c10950bv = new C10950bv();
        c9786ss.m48142k4(c9786ss.m48138du().m48135k4(0));
        c9786ss.m48139h4().m48080k4(true);
        C9771gi c9771giM48139h4 = c9786ss.m48139h4();
        c10950bv.m52930k4(new C10974v4(new float[]{c9786ss.m48139h4().m48079k4(), -c9786ss.m48139h4().m48083x1()}));
        int i = 1;
        while (i <= c9786ss.m48138du().m48134k4()) {
            C9771gi c9771giM48148x1 = (i >= c9786ss.m48138du().m48134k4() || c9771giM48139h4.m48082to()) ? c9786ss.m48148x1(c9786ss.m48138du().m48135k4(i)) : c9786ss.m48138du().m48135k4(i);
            if (c9771giM48148x1.m48081kk() || c9771giM48148x1.m48078du()) {
                c10950bv.m52930k4(new C10974v4(new float[]{c9771giM48148x1.m48079k4(), -c9771giM48148x1.m48083x1()}));
            } else {
                int i2 = i + 1;
                C9771gi c9771giM48148x12 = (i2 >= c9786ss.m48138du().m48134k4() || c9771giM48148x1.m48082to()) ? c9786ss.m48148x1(c9786ss.m48138du().m48135k4(i2)) : c9786ss.m48138du().m48135k4(i2);
                if (c9771giM48148x12.m48081kk()) {
                    c10950bv.m52930k4(new C10955du(new C12025x6(c9771giM48139h4.m48079k4(), -c9771giM48139h4.m48083x1()), new C12025x6(c9771giM48148x1.m48079k4(), -c9771giM48148x1.m48083x1()), new C12025x6(c9771giM48148x12.m48079k4(), -c9771giM48148x12.m48083x1())));
                    c9771giM48139h4 = c9771giM48148x1;
                    i = i2;
                    c9771giM48148x1 = c9771giM48148x12;
                } else {
                    int iM58608k4 = C12565ks.m58608k4((c9771giM48148x12.m48079k4() - c9771giM48148x1.m48079k4()) / 2.0f);
                    int iM58608k42 = C12565ks.m58608k4((c9771giM48148x12.m48083x1() - c9771giM48148x1.m48083x1()) / 2.0f);
                    C9771gi c9771gi = new C9771gi(iM58608k4, iM58608k42, c9771giM48148x1.m48079k4() + iM58608k4, c9771giM48148x1.m48083x1() + iM58608k42, true, false);
                    c10950bv.m52930k4(new C10955du(new C12025x6(c9771giM48139h4.m48079k4(), -c9771giM48139h4.m48083x1()), new C12025x6(c9771giM48148x1.m48079k4(), -c9771giM48148x1.m48083x1()), new C12025x6(c9771gi.m48079k4(), -c9771gi.m48083x1())));
                    c9771giM48139h4 = c9771giM48148x1;
                    c9771giM48148x1 = c9771gi;
                }
            }
            if (c9771giM48139h4.m48082to()) {
                c10950bv = m53084k4(c10950bv, c10971um);
                c9771giM48139h4 = i < c9786ss.m48138du().m48134k4() ? c9786ss.m48138du().m48135k4(i) : c9771giM48148x1;
            }
            i++;
        }
        if (c9786ss.m48139h4() != null) {
            c10950bv.m52930k4(new C10974v4(new float[]{c9786ss.m48139h4().m48079k4(), -c9786ss.m48139h4().m48083x1()}));
        }
        m53084k4(c10950bv, c10971um);
        return c10971um;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53108x1(int i) {
        this.f38256m9 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public static C10971um m53086k4(C10963ks c10963ks) {
        return m53089k4(c10963ks.m52977ck(), c10963ks.m53005x1(), c10963ks.m52980h4(), c10963ks.m52978dy(), c10963ks.m53007x6());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53109x1(C4317dy c4317dy) {
        for (int i = 0; i < m52927c5(); i++) {
            ((C10950bv) m52931k4(i)).m52893k4(c4317dy);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C10971um m53087k4(C12007ix c12007ix) {
        C10971um c10971um = new C10971um();
        c10971um.m52930k4(C10950bv.m52889k4(c12007ix.Clone()));
        return c10971um;
    }

    /* JADX INFO: renamed from: k4 */
    public static C10971um m53088k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        C10971um c10971um = new C10971um();
        c10971um.m52930k4(C10950bv.m52890k4(c12025x6.Clone(), c12025x62.Clone()));
        return c10971um;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012b  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C10971um m53089k4(String str, C5659x1 c5659x1, C4328x1 c4328x1, C4320jd c4320jd, float f) {
        float f2;
        C9787sv c9787sv;
        int i;
        C5659x1 c5659x1M53094x1 = c5659x1;
        if (!m53093k4(c5659x1M53094x1, str) || (C12576x6.m58708k4() == 2 && c5659x1M53094x1.m23120k4().m48187h4().contains(".ttc"))) {
            c5659x1M53094x1 = m53094x1(c5659x1M53094x1, str);
        }
        float f3 = 20480.0f;
        float fM23114dy = c5659x1M53094x1.m23114dy() / 20480.0f;
        C4320jd c4320jd2 = (c4320jd != null && C7019kk.m27469x1(c4320jd.m17362h4(), C4318fa.class) && ((C4318fa) c4320jd.m17362h4()).m17352x1().m23100h4()) ? null : c4320jd;
        if (c4320jd2 != null && c4320jd2.m17375x1() != 1.0f) {
            c4320jd2.m17366k4(c4320jd2.m17375x1() / fM23114dy);
        }
        C9790ts c9790tsM23120k4 = c5659x1M53094x1.m23120k4();
        int i2 = 0;
        C9787sv c9787sv2 = new C9787sv(c9790tsM23120k4, false);
        c9787sv2.m48155k4(str);
        Dictionary<Integer, C9786ss> dictionaryM48153k4 = c9787sv2.m48153k4();
        C10971um c10971um = new C10971um();
        C10971um c10971um2 = new C10971um();
        c10971um2.m53099k4(new C4317dy());
        c10971um2.mo52909to().m17336k4(fM23114dy, fM23114dy, 0);
        float fM48193k4 = 0.0f;
        c10971um2.mo52909to().m17349x1(0.0f, 20480.0f, 0);
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (m53092k4(cCharAt)) {
                f2 = f3;
            } else {
                int iM48151k4 = c9787sv2.m48151k4(cCharAt);
                f2 = f3;
                if (iM48151k4 != -1) {
                    int iM48287x1 = c9790tsM23120k4.m48221m9().m48107x1(cCharAt).m48287x1();
                    if (i4 != i3) {
                        c9787sv = c9787sv2;
                        i = i2;
                        fM48193k4 = ((((float) c9790tsM23120k4.m48193k4(((long) i4) & 4294967295L, ((long) iM48287x1) & 4294967295L)) * f2) / c9790tsM23120k4.m48175c5()) + fM48193k4;
                    } else {
                        c9787sv = c9787sv2;
                        i = i2;
                    }
                    m53091k4(c10971um2, dictionaryM48153k4.get_Item(Integer.valueOf(iM48151k4)), fM48193k4);
                    i4 = iM48287x1;
                }
                float fM48285kk = ((c9790tsM23120k4.m48221m9().m48107x1(cCharAt).m48285kk() * f2) / c9790tsM23120k4.m48175c5()) + fM48193k4;
                fM48193k4 = ((double) C14116yg.m67480k4(f)) <= 0.005d ? (f / fM23114dy) + fM48285kk : fM48285kk;
                i2 = i + 1;
                f3 = f2;
                c9787sv2 = c9787sv;
                i3 = Integer.MIN_VALUE;
            }
            c9787sv = c9787sv2;
            i = i2;
            fM48193k4 = fM48193k4;
            float fM48285kk2 = ((c9790tsM23120k4.m48221m9().m48107x1(cCharAt).m48285kk() * f2) / c9790tsM23120k4.m48175c5()) + fM48193k4;
            if (((double) C14116yg.m67480k4(f)) <= 0.005d) {
            }
            i2 = i + 1;
            f3 = f2;
            c9787sv2 = c9787sv;
            i3 = Integer.MIN_VALUE;
        }
        c10971um2.m53101k4(c4328x1);
        c10971um2.m53100k4(c4320jd2);
        c10971um.m52930k4((AbstractC10973uz) c10971um2);
        c10971um.m53101k4(c4328x1);
        c10971um.m53100k4(c4320jd2);
        return c10971um;
    }

    /* JADX INFO: renamed from: k4 */
    public static C10971um m53090k4(C12025x6[] c12025x6Arr, boolean z) {
        C10971um c10971um = new C10971um();
        c10971um.m52930k4(C10950bv.m52892k4(c12025x6Arr, z));
        return c10971um;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53099k4(C4317dy c4317dy) {
        this.f38257to = c4317dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53100k4(C4320jd c4320jd) {
        this.f38254k4 = c4320jd;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53101k4(C4328x1 c4328x1) {
        this.f38258x1 = c4328x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53102k4(C10959ix c10959ix) {
        this.f38253h4 = c10959ix;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53103k4(C10971um c10971um) {
        this.f38255kk = c10971um;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01a5 A[PHI: r2
      0x01a5: PHI (r2v2 com.aspose.slides.internal.th.bv) = (r2v1 com.aspose.slides.internal.th.bv), (r2v4 com.aspose.slides.internal.th.bv) binds: [B:30:0x018c, B:32:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m53091k4(C10971um c10971um, C9786ss c9786ss, float f) {
        C10950bv c10950bv = new C10950bv();
        c9786ss.m48142k4(c9786ss.m48138du().m48135k4(0));
        c9786ss.m48139h4().m48080k4(true);
        C9771gi c9771giM48139h4 = c9786ss.m48139h4();
        c10950bv.m52930k4(new C10974v4(new float[]{c9786ss.m48139h4().m48079k4() + f, -c9786ss.m48139h4().m48083x1()}));
        int i = 1;
        while (i <= c9786ss.m48138du().m48134k4()) {
            C9771gi c9771giM48148x1 = (i >= c9786ss.m48138du().m48134k4() || c9771giM48139h4.m48082to()) ? c9786ss.m48148x1(c9786ss.m48138du().m48135k4(i)) : c9786ss.m48138du().m48135k4(i);
            if (c9771giM48148x1.m48081kk() || c9771giM48148x1.m48078du()) {
                c10950bv.m52930k4(new C10974v4(new float[]{c9771giM48148x1.m48079k4() + f, -c9771giM48148x1.m48083x1()}));
            } else {
                int i2 = i + 1;
                C9771gi c9771giM48148x12 = (i2 >= c9786ss.m48138du().m48134k4() || c9771giM48148x1.m48082to()) ? c9786ss.m48148x1(c9786ss.m48138du().m48135k4(i2)) : c9786ss.m48138du().m48135k4(i2);
                if (c9771giM48148x12.m48081kk()) {
                    c10950bv.m52930k4(new C10955du(new C12025x6(c9771giM48139h4.m48079k4() + f, -c9771giM48139h4.m48083x1()), new C12025x6(c9771giM48148x1.m48079k4() + f, -c9771giM48148x1.m48083x1()), new C12025x6(c9771giM48148x12.m48079k4() + f, -c9771giM48148x12.m48083x1())));
                    c9771giM48139h4 = c9771giM48148x1;
                    i = i2;
                    c9771giM48148x1 = c9771giM48148x12;
                } else {
                    int iM58608k4 = C12565ks.m58608k4((c9771giM48148x12.m48079k4() - c9771giM48148x1.m48079k4()) / 2.0f);
                    int iM58608k42 = C12565ks.m58608k4((c9771giM48148x12.m48083x1() - c9771giM48148x1.m48083x1()) / 2.0f);
                    C9771gi c9771gi = new C9771gi(iM58608k4, iM58608k42, c9771giM48148x1.m48079k4() + iM58608k4, c9771giM48148x1.m48083x1() + iM58608k42, true, false);
                    c10950bv.m52930k4(new C10955du(new C12025x6(c9771giM48139h4.m48079k4() + f, -c9771giM48139h4.m48083x1()), new C12025x6(c9771giM48148x1.m48079k4() + f, -c9771giM48148x1.m48083x1()), new C12025x6(c9771gi.m48079k4() + f, -c9771gi.m48083x1())));
                    c9771giM48139h4 = c9771giM48148x1;
                    c9771giM48148x1 = c9771gi;
                }
            }
            if (c9771giM48139h4.m48082to()) {
                c10950bv = m53084k4(c10950bv, c10971um);
                c9771giM48139h4 = i < c9786ss.m48138du().m48134k4() ? c9786ss.m48138du().m48135k4(i) : c9771giM48148x1;
            }
            i++;
        }
        if (c9786ss.m48139h4() != null) {
            c10950bv.m52930k4(new C10974v4(new float[]{c9786ss.m48139h4().m48079k4() + f, -c9786ss.m48139h4().m48083x1()}));
        }
        m53084k4(c10950bv, c10971um);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m53092k4(char c) {
        return c == ' ' || c == 8203 || c == 8204 || c == 8205 || c == 65279;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m53093k4(C5659x1 c5659x1, String str) {
        for (int i = 0; i < str.length(); i++) {
            if (c5659x1.m23120k4().m48221m9().m48107x1(str.charAt(i)).equals(c5659x1.m23120k4().m48221m9().m48106x1())) {
                return false;
            }
        }
        return true;
    }
}
