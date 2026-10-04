package com.aspose.slides.internal.p430tx;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p212jv.C5531k4;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.p559ms.System.Xml.C14004w6;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.g8 */
/* JADX INFO: loaded from: classes4.dex */
public class C11186g8 {

    /* JADX INFO: renamed from: du */
    private String f38511du;

    /* JADX INFO: renamed from: h4 */
    private C5531k4 f38512h4;

    /* JADX INFO: renamed from: k4 */
    private AbstractC10925du f38513k4;

    /* JADX INFO: renamed from: kk */
    private C11233xk f38514kk;

    /* JADX INFO: renamed from: to */
    private C11186g8 f38515to;

    /* JADX INFO: renamed from: x1 */
    private C14004w6 f38516x1;

    public C11186g8(AbstractC10925du abstractC10925du) {
        this(abstractC10925du, abstractC10925du.mo21839c5(), null);
    }

    /* JADX INFO: renamed from: ar */
    public final void m53729ar() {
    }

    /* JADX INFO: renamed from: c5 */
    public final void m53730c5() {
        this.f38513k4 = null;
        this.f38516x1 = null;
    }

    /* JADX INFO: renamed from: ck */
    public final int m53731ck() {
        return this.f38516x1.ai_();
    }

    /* JADX INFO: renamed from: du */
    public final C11233xk m53732du() {
        m53729ar();
        return this.f38514kk;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m53733dy() {
        m53729ar();
        return this.f38513k4.mo21864ne();
    }

    /* JADX INFO: renamed from: fa */
    public final int m53734fa() {
        m53729ar();
        return this.f38513k4.mo21857kk();
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m53735h4() {
        m53729ar();
        return this.f38513k4.mo21865rv();
    }

    /* JADX INFO: renamed from: ix */
    public final String m53736ix() {
        return this.f38513k4.mo21839c5();
    }

    /* JADX INFO: renamed from: jd */
    public final int m53737jd() {
        return this.f38516x1.ah_();
    }

    /* JADX INFO: renamed from: k4 */
    public final C11186g8 m53738k4() {
        return this.f38515to;
    }

    /* JADX INFO: renamed from: kk */
    public final C5531k4 m53740kk() {
        return this.f38512h4;
    }

    /* JADX INFO: renamed from: ks */
    public final String m53741ks() {
        m53729ar();
        return this.f38513k4.mo21841du();
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m53742m9() {
        m53729ar();
        return this.f38513k4.mo21878x6();
    }

    /* JADX INFO: renamed from: ne */
    public final boolean m53743ne() {
        m53729ar();
        return this.f38513k4.mo21849jd();
    }

    /* JADX INFO: renamed from: qq */
    public final boolean m53744qq() {
        m53729ar();
        return this.f38513k4.mo21858kk(1);
    }

    /* JADX INFO: renamed from: rv */
    public final String m53745rv() {
        m53729ar();
        return this.f38513k4.mo21863m9();
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC10925du m53746to() {
        m53729ar();
        return this.f38513k4;
    }

    /* JADX INFO: renamed from: u4 */
    public final boolean m53747u4() {
        m53729ar();
        return this.f38513k4.mo21879yj();
    }

    /* JADX INFO: renamed from: up */
    public final String m53748up() {
        m53729ar();
        return this.f38513k4.mo21846h4();
    }

    /* JADX INFO: renamed from: uz */
    public final boolean m53749uz() {
        m53729ar();
        return this.f38513k4.mo21861ks();
    }

    /* JADX INFO: renamed from: wl */
    public final boolean m53750wl() {
        m53729ar();
        return this.f38513k4.mo21875x1(1);
    }

    /* JADX INFO: renamed from: x1 */
    public final String m53751x1() {
        return this.f38511du;
    }

    /* JADX INFO: renamed from: x6 */
    public final String m53752x6() {
        m53729ar();
        return this.f38513k4.mo21843dy();
    }

    /* JADX INFO: renamed from: yj */
    public final String m53753yj() {
        m53729ar();
        return this.f38513k4.mo21867to();
    }

    public C11186g8(AbstractC10925du abstractC10925du, String str, C11179dq c11179dq) {
        if (abstractC10925du == null) {
            throw new ArgumentNullException("navigator");
        }
        if (str == null) {
            throw new ArgumentNullException("baseUri");
        }
        this.f38515to = null;
        this.f38511du = str;
        this.f38512h4 = new C5531k4(abstractC10925du.mo21874x1());
        this.f38513k4 = abstractC10925du;
        this.f38514kk = new C11233xk(abstractC10925du, c11179dq);
        this.f38516x1 = C14004w6.m66285k4(this.f38513k4);
        m53729ar();
        if (m53734fa() == 0) {
            this.f38513k4.mo21878x6();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53739k4(C11186g8 c11186g8) {
        this.f38515to = c11186g8;
    }
}
