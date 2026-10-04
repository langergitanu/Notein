package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.mg */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC13836mg extends xhm {

    /* JADX INFO: renamed from: du */
    private boolean f46232du;

    /* JADX INFO: renamed from: kk */
    private String f46233kk;

    /* JADX INFO: renamed from: to */
    private char[] f46234to = {ControlChar.SPACE_CHAR, '-', ControlChar.PARAGRAPH_BREAK_CHAR, '\n'};

    /* JADX INFO: renamed from: x1 */
    private final C0852cf f46235x1;

    public AbstractC13836mg(C0852cf c0852cf) {
        this.f46235x1 = c0852cf;
    }

    /* JADX INFO: renamed from: k4 */
    private String m64874k4(oju ojuVar, float f, String str, float f2) {
        while (ojuVar.f47837x1 > f && str.length() > 1) {
            if (C14113y2.m67369h4(str, this.f46234to).length > 1) {
                int length = str.length() - 1;
                while (length > 0 && AbstractC14092to.m67252x1(AbstractC14092to.m67208k4((Object) this.f46234to), Character.valueOf(str.charAt(length))) < 0) {
                    length--;
                }
                str = C14113y2.m67443x1(str, 0, length);
            } else {
                str = OooO0OO.OooO00o(1, 0, str, str);
            }
            this.f46232du = true;
            m73363k4(str, f2, 1000.0f).CloneTo(ojuVar);
        }
        return str;
    }

    /* JADX INFO: renamed from: m9 */
    private pj5 m64875m9() {
        IChartTextBlockFormat textBlockFormat = this.f46235x1.m4570x1().getTextFormat().getTextBlockFormat();
        return new pj5(C14044b3.m66437kk(textBlockFormat.getMarginLeft()) ? 3.0f : (float) textBlockFormat.getMarginLeft(), C14044b3.m66437kk(textBlockFormat.getMarginTop()) ? 1.5f : (float) textBlockFormat.getMarginTop(), C14044b3.m66437kk(textBlockFormat.getMarginRight()) ? 3.0f : (float) textBlockFormat.getMarginRight(), C14044b3.m66437kk(textBlockFormat.getMarginBottom()) ? 1.5f : (float) textBlockFormat.getMarginBottom());
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: T_ */
    public boolean mo3221T_() {
        return this.f46235x1.m4569up();
    }

    /* JADX INFO: renamed from: c5 */
    public final float m64876c5() {
        return m64875m9().f48079kk;
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: du */
    public C12003du mo4317du() {
        return this.f46235x1.m4561h4();
    }

    /* JADX INFO: renamed from: dy */
    public final String m64877dy() {
        if (this.f46233kk == null) {
            String text = this.f46235x1.m4564kk().getText();
            if (C14113y2.m67411k4(text)) {
                text = mo3563kk();
            }
            this.f46233kk = text;
        }
        return this.f46233kk;
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: h4 */
    public float mo4318h4() {
        return this.f46235x1.m4566m9();
    }

    /* JADX INFO: renamed from: jd */
    public final C12013m9 m64878jd() {
        return mo4321to();
    }

    /* JADX INFO: renamed from: kk */
    public abstract String mo3563kk();

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: to */
    public C12013m9 mo4321to() {
        return this.f46235x1.m4568to();
    }

    /* JADX INFO: renamed from: x1 */
    public final String m64880x1(String str) {
        DataLabel dataLabelM4570x1 = this.f46235x1.m4570x1();
        String separator = dataLabelM4570x1.getDataLabelFormat().getSeparator();
        if (C14113y2.m67411k4(separator)) {
            separator = dataLabelM4570x1.m1294dy().getLabels().getDefaultDataLabelFormat().getSeparator();
        }
        return C14113y2.m67411k4(separator) ? str : separator;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
        if (C14113y2.m67411k4(m64877dy())) {
            m73217kk(0.0f);
            m73222to(0.0f);
            return;
        }
        if (C14064he.m66715kk(this.f46235x1.m4570x1().getWidth()) || C14064he.m66715kk(this.f46235x1.m4570x1().getHeight())) {
            m73214k4((C14113y2.m67411k4(m64877dy()) ? oju.f47834kk : m73363k4(m64877dy(), c14713vw.m72555k4(), c14713vw.m72556x1())).Clone());
            return;
        }
        Chart chartM69834fa = m73218lr().m7149to().m69834fa();
        float width = this.f46235x1.m4570x1().getWidth() * chartM69834fa.getWidth();
        float height = this.f46235x1.m4570x1().getHeight() * chartM69834fa.getHeight();
        String strM64877dy = m64877dy();
        oju ojuVarClone = (C14113y2.m67411k4(strM64877dy) ? oju.f47834kk : m73364k4(strM64877dy, width, 1000.0f, true)).Clone();
        if (ojuVarClone.f47837x1 > height && strM64877dy.length() > 1 && m73368yj().length > 1) {
            strM64877dy = m64874k4(ojuVarClone.Clone(), height, strM64877dy, width);
        }
        m73364k4(strM64877dy, width, height, false);
        m64879k4(strM64877dy);
        m73214k4(new oju(width, height));
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: k4 */
    public void mo4319k4(AutoShape autoShape) {
        m73365k4(this.f46235x1.m4570x1().getTextFormat());
        if (!C14113y2.m67411k4(this.f46235x1.m4564kk().getText())) {
            if (!this.f46232du) {
                autoShape.m288x1().m2930x1((ITextFrame) this.f46235x1.m4564kk());
            }
            autoShape.getTextFrame().getTextFrameFormat().setTextVerticalType((byte) -1);
        }
        pj5 pj5VarClone = m64875m9().Clone();
        TextFrameFormat textFrameFormat = (TextFrameFormat) autoShape.m288x1().getTextFrameFormat();
        xmh xmhVarClone = textFrameFormat.m2963to().m73500k4(pj5VarClone.m69114k4().Clone()).Clone();
        if (!C14064he.m66715kk(this.f46235x1.m4570x1().getWidth()) && !C14064he.m66715kk(this.f46235x1.m4570x1().getHeight())) {
            xmhVarClone.f50158kk = 0.0d;
            xmhVarClone.f50157du = 0.0d;
        }
        textFrameFormat.m2953k4(xmhVarClone.Clone());
        textFrameFormat.setAnchoringType((byte) 1);
        ((FillFormat) autoShape.getFillFormat()).m1456k4((IFillFormat) this.f46235x1.m4572yj());
        ((LineFormat) autoShape.getLineFormat()).m1896k4((ILineFormat) this.f46235x1.m4565ks());
        ((EffectFormat) autoShape.getEffectFormat()).m1387k4(this.f46235x1.m4567rv());
        IGenericEnumerator<IParagraph> it = ((xhm) this).f50079k4.getTextFrame().getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                IGenericEnumerator<IPortion> it2 = it.next().getPortions().iterator();
                while (it2.hasNext()) {
                    try {
                        IPortion next = it2.next();
                        if (!this.f46235x1.m4570x1().getTextFormat().getPortionFormat().getEffectFormat().isNoEffects()) {
                            ((EffectFormat) next.getPortionFormat().getEffectFormat()).m1387k4(this.f46235x1.m4570x1().getTextFormat().getPortionFormat().getEffectFormat());
                        }
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (this.f46235x1.m4570x1().getDataLabelFormat().getShowLabelAsDataCallout() && autoShape.getFillFormat().getFillType() == -1 && autoShape.getLineFormat().getFillFormat().getFillType() == -1) {
            autoShape.getFillFormat().setFillType((byte) 1);
            ((ColorFormat) autoShape.getFillFormat().getSolidFillColor()).m1080k4(C12003du.m56385i5().Clone());
            autoShape.getLineFormat().getFillFormat().setFillType((byte) 1);
            ((ColorFormat) autoShape.getLineFormat().getFillFormat().getSolidFillColor()).m1080k4(C12003du.m56398k4(255, 191, 191, 191).Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64879k4(String str) {
        this.f46233kk = str;
    }
}
