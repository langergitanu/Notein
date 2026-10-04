package com.aspose.slides.internal.p168hj;

import com.aspose.slides.internal.p039be.AbstractC1689x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p416tb.C10912u4;
import com.aspose.slides.internal.p416tb.C10921yd;
import com.aspose.slides.internal.p416tb.C10922yj;
import com.aspose.slides.internal.p420th.C10947ak;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.internal.hj.du */
/* JADX INFO: loaded from: classes.dex */
public class C4588du extends AbstractC4593x1 {

    /* JADX INFO: renamed from: jd */
    private static final char[] f12811jd = {'\n', ControlChar.PARAGRAPH_BREAK_CHAR};

    /* JADX INFO: renamed from: c5 */
    private C4589h4 f12812c5;

    /* JADX INFO: renamed from: du */
    private final C5659x1 f12813du;

    /* JADX INFO: renamed from: dy */
    private final String f12814dy;

    /* JADX INFO: renamed from: h4 */
    private final C5656k4 f12815h4;

    /* JADX INFO: renamed from: kk */
    private final boolean f12816kk;

    /* JADX INFO: renamed from: m9 */
    private final int f12817m9;

    /* JADX INFO: renamed from: to */
    private final String f12818to;

    public C4588du(C10912u4 c10912u4, C10947ak c10947ak) {
        super(c10912u4, c10947ak);
        this.f12816kk = c10947ak.m52865k4();
        this.f12818to = c10947ak.m52866kk();
        this.f12813du = c10947ak.m52861jd();
        this.f12815h4 = c10947ak.m52860fa();
        this.f12817m9 = c10947ak.m52869x1();
        this.f12814dy = c10947ak.m52859du();
        m18951ks();
    }

    /* JADX INFO: renamed from: ks */
    private void m18951ks() {
        C4589h4 c4589h4 = new C4589h4(this.f37962x1);
        this.f12812c5 = c4589h4;
        c4589h4.m18961k4(new C12007ix(0.0f, 0.0f, m18989to().m56550c5(), m18989to().m56575x1()));
        this.f12812c5.m18960k4(m18952rv());
    }

    /* JADX INFO: renamed from: rv */
    private C3152yj m18952rv() {
        C3152yj c3152yj = new C3152yj();
        C10921yd c10921yd = new C10921yd(c3152yj);
        AbstractC4593x1.m18975k4(c10921yd);
        AbstractC4593x1.m18978k4(c10921yd, this.f12815h4);
        AbstractC1689x1 abstractC1689x1M18985k4 = m18985k4(c10921yd, this.f12813du);
        AbstractC4593x1.m18976k4(c10921yd, (m18989to().m56575x1() - this.f12813du.m23114dy()) - 1.0f);
        String[] strArrM67369h4 = C14113y2.m67369h4(this.f12814dy, f12811jd);
        float fM23114dy = 0.0f;
        for (int i = 0; i < strArrM67369h4.length && fM23114dy <= m18989to().m56575x1(); i++) {
            if (C12565ks.m58630x1(strArrM67369h4[i])) {
                AbstractC4593x1.m18977k4(c10921yd, 0.0f, fM23114dy);
                AbstractC4593x1.m18982k4(c10921yd, strArrM67369h4[i], abstractC1689x1M18985k4);
            }
            fM23114dy -= this.f12813du.m23114dy();
        }
        AbstractC4593x1.m18983x1(c10921yd);
        return c3152yj;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m18953h4() {
        return this.f12816kk ? this.f12814dy : this.f12818to;
    }

    @Override // com.aspose.slides.internal.p168hj.AbstractC4593x1
    /* JADX INFO: renamed from: k4 */
    public int mo18954k4() {
        return 1;
    }

    @Override // com.aspose.slides.internal.p168hj.AbstractC4593x1
    /* JADX INFO: renamed from: kk */
    public void mo18955kk(C10922yj c10922yj) {
        this.f12812c5.mo9082k4(c10922yj);
    }

    @Override // com.aspose.slides.internal.p168hj.AbstractC4593x1
    /* JADX INFO: renamed from: x1 */
    public int mo18956x1() {
        return ((this.f12816kk ? 1 : 0) << 25) | super.mo18956x1();
    }

    @Override // com.aspose.slides.internal.p168hj.AbstractC4593x1
    /* JADX INFO: renamed from: x1 */
    public void mo18957x1(C10922yj c10922yj) {
        String str;
        String str2;
        int i = this.f12817m9;
        if (i != 0) {
            c10922yj.m52652k4("/MaxLen", i);
        }
        if (!this.f12816kk) {
            c10922yj.m52659k4("/DA", m18986k4(this.f12813du, this.f12815h4), false);
            if (this.f12818to.length() != 0) {
                str = "/DV";
                str2 = this.f12818to;
                c10922yj.m52670to(str, str2);
            }
        } else if (this.f12818to.length() != 0) {
            c10922yj.m52670to("/RV", this.f12818to);
            str = "/DS";
            str2 = "font: 12pt Arial";
            c10922yj.m52670to(str, str2);
        }
        c10922yj.m52670to("/V", m18953h4());
        c10922yj.m52650k4("/AP");
        c10922yj.m52643dy();
        c10922yj.m52672x1("/N");
        c10922yj.m52650k4(this.f12812c5.m52565c5());
        c10922yj.m52640c5();
    }
}
